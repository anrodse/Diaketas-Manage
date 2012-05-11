/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author psylock, Raphael Colleau
 */
public class Raiz extends javax.swing.JFrame {

    /* identificador de los paneles en el CardLayout 
       anadir una linea aqui y poner, en el design el nombre en el parametro CardName*/ 
    public static String panelLogin = "login";
    public static String panelInicio = "inicio";
    public static String panelVoluntario = "voluntario";
    /**
     * Creates new form Raiz
     */
    public Raiz() {
        initComponents();
        setLocationRelativeTo(null);
        
        /** Inicializar los controladores */
        // Los controladores ne se pueden inicializarse en una vista
        //ControladorVistaBeneficiariosInicio cvBI = new ControladorVistaBeneficiariosInicio(vistaBeneficiarioInicio1);
        //ControladorVistaBeneficiarioBuscar cvBB = new ControladorVistaBeneficiarioBuscar(vistaBeneficiarioBuscar1);
        //ControladorVistaBeneficiarioDatos cvBD = new ControladorVistaBeneficiarioDatos(vistaBeneficiarioDatos1);
    }
    
    // mostrar un panel con el CardLayoud
    public void showPanel (String panel) {
        CardLayout cardLayout =  (CardLayout)getContentPane().getLayout();
        cardLayout.show(getContentPane(), panel);
    }
    
    // A borrar
    public static void mostrarVista(JPanel vistaOrigen, Class claseVista){
           // Se ocultan todos los demás 

        for (int i = 0; i < vistaOrigen.getParent().getComponentCount(); ++i){
                
                Component cComponent = vistaOrigen.getParent().getComponent(i);
                
                if (cComponent instanceof JPanel){
                    
                    try {
                        if  (!(Class.forName ( claseVista.getName() ).isInstance ( cComponent ))){
                            ((JPanel)cComponent).setVisible(false);
                        }
                        else{
                            ((JPanel)cComponent).setVisible(true);
                        }
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Raiz.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
           
    }
    
    // A borrar
    public static Component getVista(JPanel vistaOrigen, Class claseVista){
         for (int i = 0; i < vistaOrigen.getParent().getComponentCount(); ++i){
                
                Component cComponent = vistaOrigen.getParent().getComponent(i);
                
                if (cComponent instanceof JPanel){
                    
                    try {
                        if  ((Class.forName ( claseVista.getName() ).isInstance ( cComponent ))){
                            return cComponent;
                        }
                        
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Raiz.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
         return null;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vistaLogin = new Vistas.VistaLogin();
        vistaInicial = new Vistas.VistaInicial();
        vistaBeneficiarioInicio1 = new Vistas.VistaBeneficiarioInicio();
        vistaBeneficiarioBuscar1 = new Vistas.VistaBeneficiarioBuscar();
        vistaBeneficiarioDatos1 = new Vistas.VistaBeneficiarioDatos();
        vistaVoluntario = new Vistas.VistaVoluntario();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diaketas");
        setBackground(new java.awt.Color(135, 170, 235));
        setBounds(new java.awt.Rectangle(0, 0, 1000, 700));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setName("Diaketas");
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new java.awt.CardLayout());

        vistaLogin.setMaximumSize(new java.awt.Dimension(1000, 600));
        vistaLogin.setMinimumSize(new java.awt.Dimension(1000, 600));
        vistaLogin.setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().add(vistaLogin, "login");
        getContentPane().add(vistaInicial, "inicio");
        getContentPane().add(vistaBeneficiarioInicio1, "card4");
        getContentPane().add(vistaBeneficiarioBuscar1, "card5");
        getContentPane().add(vistaBeneficiarioDatos1, "card6");
        getContentPane().add(vistaVoluntario, "voluntario");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void initialize(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("default".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Raiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Raiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Raiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Raiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Raiz().setVisible(true);
            }
        });
    }

    // getter vista
    public VistaVoluntario getPanelVoluntario() {
        return vistaVoluntario;
    }

    public VistaInicial getVistaInicial() {
        return vistaInicial;
    }

    public VistaLogin getVistaLogin() {
        return vistaLogin;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vistas.VistaBeneficiarioBuscar vistaBeneficiarioBuscar1;
    private Vistas.VistaBeneficiarioDatos vistaBeneficiarioDatos1;
    private Vistas.VistaBeneficiarioInicio vistaBeneficiarioInicio1;
    private Vistas.VistaInicial vistaInicial;
    private Vistas.VistaLogin vistaLogin;
    private Vistas.VistaVoluntario vistaVoluntario;
    // End of variables declaration//GEN-END:variables
}