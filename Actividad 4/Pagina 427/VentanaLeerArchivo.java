package com.mycompany.ejerciciopagina427;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.IOException;

public class VentanaLeerArchivo extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(VentanaLeerArchivo.class.getName());

    public VentanaLeerArchivo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRuta        = new javax.swing.JLabel();
        txtRuta        = new javax.swing.JTextField();
        btnExaminar    = new javax.swing.JButton();
        btnLeer        = new javax.swing.JButton();
        btnLimpiar     = new javax.swing.JButton();
        lblContenido   = new javax.swing.JLabel();
        scrollContenido = new javax.swing.JScrollPane();
        txtContenido   = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejercicio 6.8 - Leer Archivo");

        lblRuta.setText("Ruta del archivo");
        lblContenido.setText("Contenido del archivo:");

        txtContenido.setColumns(20);
        txtContenido.setRows(10);
        txtContenido.setEditable(false);
        txtContenido.setFont(new java.awt.Font("Monospaced", 0, 12));
        scrollContenido.setViewportView(txtContenido);

        btnExaminar.setText("Examinar...");
        btnExaminar.addActionListener(this::btnExaminarActionPerformed);

        btnLeer.setText("Leer");
        btnLeer.addActionListener(this::btnLeerActionPerformed);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12)
                        .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10)
                        .addComponent(btnExaminar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLeer)
                        .addGap(18)
                        .addComponent(btnLimpiar))
                    .addComponent(lblContenido)
                    .addComponent(scrollContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRuta)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExaminar))
                .addGap(18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLeer)
                    .addComponent(btnLimpiar))
                .addGap(18)
                .addComponent(lblContenido)
                .addGap(6)
                .addComponent(scrollContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos de texto (*.txt)", "txt"));
        int resultado = chooser.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            txtRuta.setText(chooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btnExaminarActionPerformed

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        String ruta = txtRuta.getText().trim();
        if (ruta.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Por favor ingrese o seleccione la ruta del archivo.",
                "Ruta vacía", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            String contenido = LeerArchivo.leer(ruta);
            txtContenido.setText(contenido);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,
                "No se pudo leer el archivo.",
                "Error de lectura", JOptionPane.ERROR_MESSAGE);
            txtContenido.setText("");
        }
    }//GEN-LAST:event_btnLeerActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtRuta.setText("");
        txtContenido.setText("");
        txtRuta.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new VentanaLeerArchivo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExaminar;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel lblContenido;
    private javax.swing.JLabel lblRuta;
    private javax.swing.JScrollPane scrollContenido;
    private javax.swing.JTextArea txtContenido;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
