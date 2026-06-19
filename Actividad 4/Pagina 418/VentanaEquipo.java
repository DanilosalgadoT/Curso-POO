package com.mycompany.ejerciciopagina418;

import javax.swing.JOptionPane;

public class VentanaEquipo extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(VentanaEquipo.class.getName());

    private EquipoMaraton equipo = null;

    public VentanaEquipo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombreEquipo  = new javax.swing.JLabel();
        lblUniversidad   = new javax.swing.JLabel();
        lblLenguaje      = new javax.swing.JLabel();
        txtNombreEquipo  = new javax.swing.JTextField();
        txtUniversidad   = new javax.swing.JTextField();
        txtLenguaje      = new javax.swing.JTextField();
        separador        = new javax.swing.JSeparator();
        lblNombreProg    = new javax.swing.JLabel();
        lblApellidosProg = new javax.swing.JLabel();
        txtNombreProg    = new javax.swing.JTextField();
        txtApellidosProg = new javax.swing.JTextField();
        btnCrearEquipo   = new javax.swing.JButton();
        btnAgregarProg   = new javax.swing.JButton();
        btnLimpiar       = new javax.swing.JButton();
        lblResumen       = new javax.swing.JLabel();
        scrollResumen    = new javax.swing.JScrollPane();
        txtResumen       = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejercicio 6.7 - Maratón de Programación");

        lblNombreEquipo.setText("Nombre del equipo");
        lblUniversidad.setText("Universidad");
        lblLenguaje.setText("Lenguaje");
        lblNombreProg.setText("Nombre del programador");
        lblApellidosProg.setText("Apellidos del programador");
        lblResumen.setText("Estado del equipo:");

        txtResumen.setColumns(20);
        txtResumen.setRows(6);
        txtResumen.setEditable(false);
        txtResumen.setFont(new java.awt.Font("Monospaced", 0, 12));
        scrollResumen.setViewportView(txtResumen);

        btnCrearEquipo.setText("Crear Equipo");
        btnCrearEquipo.addActionListener(this::btnCrearEquipoActionPerformed);

        btnAgregarProg.setText("Agregar Programador");
        btnAgregarProg.setEnabled(false);
        btnAgregarProg.addActionListener(this::btnAgregarProgActionPerformed);

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
                        .addComponent(lblNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18)
                        .addComponent(txtNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18)
                        .addComponent(txtUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLenguaje, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18)
                        .addComponent(txtLenguaje, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreProg, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18)
                        .addComponent(txtNombreProg, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblApellidosProg, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18)
                        .addComponent(txtApellidosProg, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCrearEquipo)
                        .addGap(18)
                        .addComponent(btnAgregarProg)
                        .addGap(18)
                        .addComponent(btnLimpiar))
                    .addComponent(lblResumen)
                    .addComponent(scrollResumen, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEquipo)
                    .addComponent(txtNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUniversidad)
                    .addComponent(txtUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLenguaje)
                    .addComponent(txtLenguaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreProg)
                    .addComponent(txtNombreProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidosProg)
                    .addComponent(txtApellidosProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearEquipo)
                    .addComponent(btnAgregarProg)
                    .addComponent(btnLimpiar))
                .addGap(18)
                .addComponent(lblResumen)
                .addGap(6)
                .addComponent(scrollResumen, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEquipoActionPerformed
        String nombreEquipo = txtNombreEquipo.getText().trim();
        String universidad  = txtUniversidad.getText().trim();
        String lenguaje     = txtLenguaje.getText().trim();

        if (nombreEquipo.isEmpty() || universidad.isEmpty() || lenguaje.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Todos los campos del equipo son obligatorios.",
                "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        equipo = new EquipoMaraton(nombreEquipo, universidad, lenguaje);
        btnAgregarProg.setEnabled(true);
        txtNombreEquipo.setEditable(false);
        txtUniversidad.setEditable(false);
        txtLenguaje.setEditable(false);
        btnCrearEquipo.setEnabled(false);
        actualizarResumen();

        JOptionPane.showMessageDialog(this,
            "Equipo \"" + nombreEquipo + "\" creado.\nAhora agregue entre 2 y 3 programadores.",
            "Equipo creado", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCrearEquipoActionPerformed

    private void btnAgregarProgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProgActionPerformed
        if (equipo == null) {
            JOptionPane.showMessageDialog(this,
                "Primero debe crear el equipo.",
                "Sin equipo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String nombre    = txtNombreProg.getText().trim();
        String apellidos = txtApellidosProg.getText().trim();

        try {
            EquipoMaraton.validarCampo(nombre);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                "Nombre inválido: " + e.getMessage(),
                "Error de validación", JOptionPane.ERROR_MESSAGE);
            txtNombreProg.requestFocus();
            return;
        }

        try {
            EquipoMaraton.validarCampo(apellidos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                "Apellidos inválidos: " + e.getMessage(),
                "Error de validación", JOptionPane.ERROR_MESSAGE);
            txtApellidosProg.requestFocus();
            return;
        }

        try {
            equipo.anadir(new Programador(nombre, apellidos));
            txtNombreProg.setText("");
            txtApellidosProg.setText("");
            txtNombreProg.requestFocus();
            actualizarResumen();

            if (equipo.estaLleno()) {
                JOptionPane.showMessageDialog(this,
                    "El equipo está completo (3 integrantes).",
                    "Equipo completo", JOptionPane.INFORMATION_MESSAGE);
                btnAgregarProg.setEnabled(false);
            } else if (equipo.tamanoEquipo == 2) {
                JOptionPane.showMessageDialog(this,
                    "Programador agregado. El equipo ya tiene el mínimo de 2 integrantes.\nPuede agregar 1 más (opcional).",
                    "Mínimo alcanzado", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                e.getMessage(), "Error al agregar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarProgActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        equipo = null;
        txtNombreEquipo.setText("");  txtNombreEquipo.setEditable(true);
        txtUniversidad.setText("");   txtUniversidad.setEditable(true);
        txtLenguaje.setText("");      txtLenguaje.setEditable(true);
        txtNombreProg.setText("");
        txtApellidosProg.setText("");
        txtResumen.setText("");
        btnCrearEquipo.setEnabled(true);
        btnAgregarProg.setEnabled(false);
        txtNombreEquipo.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void actualizarResumen() {
        if (equipo != null) txtResumen.setText(equipo.resumen());
    }

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
        java.awt.EventQueue.invokeLater(() -> new VentanaEquipo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProg;
    private javax.swing.JButton btnCrearEquipo;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel lblApellidosProg;
    private javax.swing.JLabel lblLenguaje;
    private javax.swing.JLabel lblNombreEquipo;
    private javax.swing.JLabel lblNombreProg;
    private javax.swing.JLabel lblResumen;
    private javax.swing.JLabel lblUniversidad;
    private javax.swing.JScrollPane scrollResumen;
    private javax.swing.JSeparator separador;
    private javax.swing.JTextArea txtResumen;
    private javax.swing.JTextField txtApellidosProg;
    private javax.swing.JTextField txtLenguaje;
    private javax.swing.JTextField txtNombreEquipo;
    private javax.swing.JTextField txtNombreProg;
    private javax.swing.JTextField txtUniversidad;
    // End of variables declaration//GEN-END:variables
}
