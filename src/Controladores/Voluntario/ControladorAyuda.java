
package Controladores.Voluntario;

import JDBC.AyudaJDBC;
import Modelo.Ayuda;
import Modelo.TipoAyuda;
import Vistas.Paneles.Voluntario.PanelVoluntarioAyudas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 ** NOMBRE CLASE:
 **	  ControladorAyuda
 **
 ** DESCRIPCION:
 **
 **
 **
 ** DESARROLLADO POR:
 *          Raphael Colleau (RC)
 **
 **
 ** SUPERVISADO POR:
 **
 **
 ** HISTORIA:
 ** 	000 - 16 mai 2012 - RC - Creacion
 ** 	001 - 23 mai 2012 - RC - Adicion metodos relacionados con modelo
 **
 ** NOTAS:
 **
 **
 */
public class ControladorAyuda {

    /**
     * PATRON DE DISEÑO SINGLETON
     */
    private static ControladorAyuda instancia = null;

    public static ControladorAyuda getInstance(PanelVoluntarioAyudas pvista) {

        if (instancia == null) {
            instancia = new ControladorAyuda(pvista);
        }
        return instancia;
    }
    
    private PanelVoluntarioAyudas vista;
    private ArrayList<TipoAyuda> tiposAyuda;
    
    private String[] columnNamesTipoAyuda = {"Titulo", "Descripcion", "Monetaria"};

    public ControladorAyuda(PanelVoluntarioAyudas vista) {
        this.vista = vista;
     
        actualizarTablaTipoAyuda();

        this.vista.getBtnGuardarTipoAyuda().addActionListener(new BtGuardarTipoAyudaListener());
    }

    private void actualizarTablaTipoAyuda() {
        try {
            tiposAyuda = AyudaJDBC.getInstance().obtenerDatosTipoAyuda();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAyuda.class.getName()).log(Level.SEVERE, null, ex);
        }

        TableModel tableModel = new TableModel() {

            @Override
            public int getRowCount() {
                return tiposAyuda.size();
            }

            @Override
            public int getColumnCount() {
                return columnNamesTipoAyuda.length;
            }

            @Override
            public String getColumnName(int i) {
                return columnNamesTipoAyuda[i];
            }

            @Override
            public Class<?> getColumnClass(int i) {
                return String.class;
            }

            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }

            @Override
            public Object getValueAt(int row, int col) {
                switch (col) {
                    case 0:
                        return tiposAyuda.get(row).getTitulo();
                    case 1:
                        return tiposAyuda.get(row).getDescripcion();
                    case 2:
                        if (tiposAyuda.get(row).isMonetaria()) {
                            return "Si";
                        } else {
                            return "No";
                        }
                }
                return "";
            }

            @Override
            public void setValueAt(Object o, int row, int col) {
            }

            @Override
            public void addTableModelListener(TableModelListener tl) {
            }

            @Override
            public void removeTableModelListener(TableModelListener tl) {
            }
        };

        vista.getTableTiposAyuda().setModel(tableModel);

    }

    // TODO Metodos JDBC
    private boolean registrarAyuda(Ayuda ayuda) {
        boolean exito;
        
            // TODO test ayuda.getBeneficiarioDeAyuda().getNIF() exite
            // TODO test datos
        try {
            exito = AyudaJDBC.getInstance().registrarDatosAyuda(ayuda, ayuda.getBeneficiarioDeAyuda().getNIF(), ayuda.getVoluntarioQueOtorga().getNIF());
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAyuda.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        if (ayuda.getTipo_ayuda().isMonetaria()) {
            exito = ControladorContabilidad.getInstance(null).registrarGastoAyuda(ayuda.getImporte(), ayuda.getObservaciones(), ayuda);
        }
        
        return exito;
    }
    
    private boolean datosNuevoTipoAyuda (TipoAyuda tipoAyuda) {
        boolean exito = false;
        
        boolean tipoAyudaExiste = true;
        try {   
            tipoAyudaExiste = AyudaJDBC.getInstance().comprobarTipoAyuda(tipoAyuda.getTitulo());
        } catch (SQLException ex) {
            // TODO pop up error
            Logger.getLogger(ControladorAyuda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (!tipoAyudaExiste) {
            try {
                exito = AyudaJDBC.getInstance().insertarTipoAyuda(tipoAyuda);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorAyuda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return exito;
    }
    
    public ArrayList<TipoAyuda> obtenerTiposAyuda () {
        ArrayList<TipoAyuda> tiposAyuda;
        try {
            tiposAyuda = AyudaJDBC.getInstance().obtenerDatosTipoAyuda();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAyuda.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return tiposAyuda;
    }
    
    private boolean modificarAyuda (Ayuda ayuda) {
        boolean exito = false;
        
            // TODO test si tipoayuda existe
        try {   
            exito = AyudaJDBC.getInstance().modificarDatosAyuda(ayuda, ayuda.getVoluntarioQueOtorga());
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAyuda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return exito;
    }
    
    private boolean modificarTypoAyuda (TipoAyuda tipoAyuda) {
        boolean exito = false;
        
        try {    
            exito = AyudaJDBC.getInstance().modificarDatosTipoAyuda(tipoAyuda);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAyuda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return exito;
    }

    private boolean eliminarAyuda(Ayuda ayuda) {
        boolean exito = false;

        try {
            // TODO jdbc ayuda
            exito = AyudaJDBC.getInstance().eliminarDatosAyuda(ayuda.getOID());
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAyuda.class.getName()).log(Level.SEVERE, null, ex);
        }

        return exito;
    }

    private boolean eliminarTipoAyuda(TipoAyuda tipoAyuda) {
        boolean exito = false;
        try {
            exito = AyudaJDBC.getInstance().eliminarDatosTipoAyuda(tipoAyuda.getOID());
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAyuda.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exito;
    }
    // TODO Listeners de los botones
    
    class BtGuardarTipoAyudaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            boolean datosCorrectos = true;
            
            
            if (vista.getTextTipoAyuda().getText().equals("")) {
                datosCorrectos = false;
            }
            
            if (vista.getDescripcionTipoAyuda().getText().equals("")) {
                datosCorrectos = false;
            }
            
            if (datosCorrectos) {
                TipoAyuda tipoAyuda = new TipoAyuda();
                tipoAyuda.setTitulo(vista.getTextTipoAyuda().getText());
                tipoAyuda.setDescripcion(vista.getDescripcionTipoAyuda().getText());
                tipoAyuda.setMonetaria(vista.getIsMonetaria().isSelected());
                
                if (datosNuevoTipoAyuda(tipoAyuda)) {
                    System.out.println("tipoAyuda anadido");

                    actualizarTablaTipoAyuda();
                }
            }
        }
    }
    
    class BtGuardarAyudaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
        
    }
}
