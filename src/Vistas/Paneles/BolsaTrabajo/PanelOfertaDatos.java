
package Vistas.Paneles.BolsaTrabajo;

import Modelo.Sector;
import java.util.ArrayList;
import javax.swing.*;

public class PanelOfertaDatos extends javax.swing.JPanel {

	/**
		* Creates new form PanelBeneficiarioBuscar
		*/
	public PanelOfertaDatos() {
		initComponents();
	}

	/* Botones del panel */
	public JButton getBTGuardarSector(){
		return BTGuardarSector;
	}

	public JButton getBTEliminarSector(){
		return BTEliminarSector;
	}

	public JButton getBTGuardar(){
		return BTGuardar;
	}

	public JButton getBTLimpiar(){
        return BTLimpiar;
    }

	public JButton getBTModificar(){
		return BTModificar;
	}

	public JButton getBTGuardarCambios(){
		return BTGuardarCambios;
	}

	public JButton getBTEliminar(){
		return BTEliminar;
	}

	/* Campos del panel */
	public JLabel getlabelCIF(){
		return labelCIF;
	}
	public String getTextoCIF(){
		return textCIF.getText();
	}
	public JTextField getTextCIF(){
		return textCIF;
	}
	public void setTextoCIF(String texto){
		textCIF.setText(texto);
	}

	public JLabel getlabelSector(){
		return labelSector;
	}
	public String getTextoSector(){
		return cbSector.getSelectedItem().toString();
	}
	public JComboBox getcbSector(){
		return cbSector;
	}
	public void setTextoSector(String texto){
		cbSector.setSelectedItem(texto);
	}

	public String getTextoNuevoSector(){
		return textNuevoSector.getText();
	}
	public JTextField getTextNuevoSector(){
		return textNuevoSector;
	}
	public void setTextoNuevoSector(String texto){
		textNuevoSector.setText(texto);
	}

	public JLabel getlabelDescripcionOferta(){
		return labelDescripcionOferta;
	}
	public String getTextoDescripcionOferta(){
		return taDescripcionOferta.getText();
	}
	public JTextArea gettaDescripcionOferta(){
		return taDescripcionOferta;
	}
	public void setTextoDescripcionOferta(String texto){
		taDescripcionOferta.setText(texto);
	}

	public JLabel getlabelNPuestos(){
		return labelNPuestos;
	}
	public String getTextoNPuestos(){
		return textNPuestos.getText();
	}
	public JTextField gettextNPuestos(){
		return textNPuestos;
	}
	public void setTextoNPuestos(String texto){
		textNPuestos.setText(texto);
	}

	public JLabel getlabelTipoContrato(){
		return labelTipoContrato;
	}
	public String getTextoTipoContrato(){
		return cbTipoContrato.getSelectedItem().toString();
	}
	public JComboBox getcbTipoContrato(){
		return cbTipoContrato;
	}
	public void getTextoTipoContrato(String texto){
		cbTipoContrato.setSelectedItem(texto);
	}

	public JLabel getlabelDuracionContrato(){
		return labelDuracionContrato;
	}
	public String getTextoDuracionContrato(){
		return textDuracionContrato.getText();
	}
	public JTextField gettextDuracionContrato(){
		return textDuracionContrato;
	}
	public void setTextoDuracionContrato(String texto){
		textDuracionContrato.setText(texto);
	}

	public JLabel getlabelCualificacion(){
		return labelCualificacion;
	}
	public String getTextoCualificacion(){
		return taCualificacion.getText();
	}
	public JTextArea gettaCualificacion(){
		return taCualificacion;
	}
	public void setTextoCualificacion(String texto){
        taCualificacion.setText(texto);
    }

	public JLabel getlabelError(){
		return labelError;
	}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelDescripcionOferta = new javax.swing.JLabel();
        labelNPuestos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescripcionOferta = new javax.swing.JTextArea();
        labelTipoContrato = new javax.swing.JLabel();
        labelDuracionContrato = new javax.swing.JLabel();
        textNPuestos = new javax.swing.JTextField();
        cbTipoContrato = new javax.swing.JComboBox();
        labelMeses = new javax.swing.JLabel();
        textDuracionContrato = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        labelCIF = new javax.swing.JLabel();
        labelSector = new javax.swing.JLabel();
        textCIF = new javax.swing.JTextField();
        BTEliminarSector = new javax.swing.JButton();
        textNuevoSector = new javax.swing.JTextField();
        BTGuardarSector = new javax.swing.JButton();
        cbSector = new javax.swing.JComboBox();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taCualificacion = new javax.swing.JTextArea();
        labelCualificacion = new javax.swing.JLabel();
        BTGuardar = new javax.swing.JButton();
        BTLimpiar = new javax.swing.JButton();
        BTModificar = new javax.swing.JButton();
        BTGuardarCambios = new javax.swing.JButton();
        BTEliminar = new javax.swing.JButton();
        labelError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelDescripcionOferta.setText("Descripcion del puesto ofertado");

        labelNPuestos.setText("Nº de puestos");

        taDescripcionOferta.setColumns(20);
        taDescripcionOferta.setRows(5);
        taDescripcionOferta.setText("Descripción completa del puesto de trabajo");
        taDescripcionOferta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jScrollPane1.setViewportView(taDescripcionOferta);

        labelTipoContrato.setText("Tipo de contrato");

        labelDuracionContrato.setText("Duracion de contrato");

        textNPuestos.setText("Numero");

        cbTipoContrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fijo", "Temporal" }));

        labelMeses.setText("Meses");

        textDuracionContrato.setText("12");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDescripcionOferta)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelNPuestos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textNPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(labelTipoContrato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(labelDuracionContrato)
                                .addGap(18, 18, 18)
                                .addComponent(textDuracionContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelMeses)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDescripcionOferta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNPuestos)
                    .addComponent(labelTipoContrato)
                    .addComponent(labelDuracionContrato)
                    .addComponent(textNPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMeses)
                    .addComponent(textDuracionContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelCIF.setText("CIF");

        labelSector.setText("Sector");

        textCIF.setText("CIF/ NIF");

        BTEliminarSector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/borrar.png"))); // NOI18N

        textNuevoSector.setText("Nuevo Sector");

        BTGuardarSector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/guardar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(labelCIF)
                .addGap(18, 18, 18)
                .addComponent(textCIF, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(labelSector)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbSector, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTEliminarSector)
                .addGap(68, 68, 68)
                .addComponent(textNuevoSector, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTGuardarSector)
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTGuardarSector)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textCIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelCIF)
                                .addComponent(labelSector)
                                .addComponent(cbSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(BTEliminarSector))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(textNuevoSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel68.setForeground(java.awt.Color.red);
        jLabel68.setText("Datos Empresa");

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel69.setForeground(java.awt.Color.red);
        jLabel69.setText("Datos Oferta");

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel71.setForeground(java.awt.Color.red);
        jLabel71.setText("Cualificacion Requerida");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        taCualificacion.setColumns(20);
        taCualificacion.setRows(5);
        taCualificacion.setText("Descripción completa de la cualificacion necesria");
        taCualificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jScrollPane2.setViewportView(taCualificacion);

        labelCualificacion.setText("Cualificacion");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelCualificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(labelCualificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        BTGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/guardar.png"))); // NOI18N
        BTGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTGuardarActionPerformed(evt);
            }
        });

        BTLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/limpiar.png"))); // NOI18N
        BTLimpiar.setMaximumSize(new java.awt.Dimension(65, 41));
        BTLimpiar.setMinimumSize(new java.awt.Dimension(65, 41));
        BTLimpiar.setPreferredSize(new java.awt.Dimension(65, 41));

        BTModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/modificar.png"))); // NOI18N

        BTGuardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/guardar.png"))); // NOI18N

        BTEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/borrar.png"))); // NOI18N

        labelError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelError.setForeground(new java.awt.Color(255, 0, 0));
        labelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelError.setText("Error");
        labelError.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel71))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel69))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel68)))
                .addGap(0, 841, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTGuardarCambios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTEliminar)
                        .addGap(309, 309, 309))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTGuardar)
                    .addComponent(BTEliminar)
                    .addComponent(BTGuardarCambios)
                    .addComponent(BTLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTModificar))
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BTGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTEliminar;
    private javax.swing.JButton BTEliminarSector;
    private javax.swing.JButton BTGuardar;
    private javax.swing.JButton BTGuardarCambios;
    private javax.swing.JButton BTGuardarSector;
    private javax.swing.JButton BTLimpiar;
    private javax.swing.JButton BTModificar;
    private javax.swing.JComboBox cbSector;
    private javax.swing.JComboBox cbTipoContrato;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCIF;
    private javax.swing.JLabel labelCualificacion;
    private javax.swing.JLabel labelDescripcionOferta;
    private javax.swing.JLabel labelDuracionContrato;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelMeses;
    private javax.swing.JLabel labelNPuestos;
    private javax.swing.JLabel labelSector;
    private javax.swing.JLabel labelTipoContrato;
    private javax.swing.JTextArea taCualificacion;
    private javax.swing.JTextArea taDescripcionOferta;
    private javax.swing.JTextField textCIF;
    private javax.swing.JTextField textDuracionContrato;
    private javax.swing.JTextField textNPuestos;
    private javax.swing.JTextField textNuevoSector;
    // End of variables declaration//GEN-END:variables
}
