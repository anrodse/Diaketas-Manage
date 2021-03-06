/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paneles.Empresa;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author PLB
 */
public class PanelEmpresaBuscar extends javax.swing.JPanel {

    /**
     * Creates new form PanelEmpresaBuscar
     */
    public PanelEmpresaBuscar() {
        initComponents();
        jLabelError.setVisible(false);
    }
    
    public JLabel getLabelError() {
        return jLabelError;
    }
    
    public void setTextLabelError(String text){
        jLabelError.setText(text);
        jLabelError.setVisible(true);
    }
    
    public JTextField getBuscarEmpresa(){
        return JtextBuscarEmpresa;
    }
    
    public String getTextBusquedaEmpresa() {
        return JtextBuscarEmpresa.getText();
    }
    
    public String getTipoDatoBusquedaEmpresa() {
        return cbTipoBusquedaEmpresa.getSelectedItem().toString();
    }

    public JButton getBtConsultarEmpresa(){
        return btConsultarEmpresa;
    }
    
    public JButton getBtEliminarEmpresa(){
        return btEliminarEmpresa;
    }
    
    public JButton getBtBuscarEmpresa(){
        return btBuscarEmpresa;
    }
    
    public JTable getTbBuscadorEmpresas(){
        return tableBuscarEmpresa;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JtextBuscarEmpresa = new javax.swing.JTextField();
        jLabelBuscarPor = new javax.swing.JLabel();
        cbTipoBusquedaEmpresa = new javax.swing.JComboBox();
        btBuscarEmpresa = new javax.swing.JButton();
        jScrollPane20 = new javax.swing.JScrollPane();
        tableBuscarEmpresa = new javax.swing.JTable();
        btConsultarEmpresa = new javax.swing.JButton();
        btEliminarEmpresa = new javax.swing.JButton();
        jLabelError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        JtextBuscarEmpresa.setText("Buscar");

        jLabelBuscarPor.setText("Buscar por:");

        cbTipoBusquedaEmpresa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo de busqueda", " " }));

        btBuscarEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/buscar.png"))); // NOI18N

        tableBuscarEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CIF", "Nombre", "DireccionWeb", "Localidad", "Fax"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane20.setViewportView(tableBuscarEmpresa);

        btConsultarEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/modificar.png"))); // NOI18N

        btEliminarEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/borrar.png"))); // NOI18N

        jLabelError.setText("Mensaje de Error");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabelError)
                        .addGap(328, 328, 328)
                        .addComponent(btConsultarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btEliminarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelBuscarPor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipoBusquedaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JtextBuscarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btBuscarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtextBuscarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBuscarPor)
                    .addComponent(cbTipoBusquedaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btConsultarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEliminarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelError, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JtextBuscarEmpresa;
    private javax.swing.JButton btBuscarEmpresa;
    private javax.swing.JButton btConsultarEmpresa;
    private javax.swing.JButton btEliminarEmpresa;
    private javax.swing.JComboBox cbTipoBusquedaEmpresa;
    private javax.swing.JLabel jLabelBuscarPor;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JTable tableBuscarEmpresa;
    // End of variables declaration//GEN-END:variables
}
