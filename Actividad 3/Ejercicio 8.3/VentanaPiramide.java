package com.mycompany.ejercicio8p3;

/**
 * Esta clase denominada VentanaPiramide define una ventana para
 * ingresar los datos de una piramide y calcular su volumen y superficie.
 * @version 1.2/2020
 */
public class VentanaPiramide extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
        java.util.logging.Logger.getLogger(VentanaPiramide.class.getName());

    public VentanaPiramide() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        labelBase = new javax.swing.JLabel();
        labelAltura = new javax.swing.JLabel();
        labelApotema = new javax.swing.JLabel();
        labelVolumen = new javax.swing.JLabel();
        labelSuperficie = new javax.swing.JLabel();
        campoBase = new javax.swing.JTextField();
        campoAltura = new javax.swing.JTextField();
        campoApotema = new javax.swing.JTextField();
        resultadoVolumen = new javax.swing.JLabel();
        resultadoSuperficie = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Piramide");
        setResizable(false);

        labelBase.setText("Base (cms):");
        labelAltura.setText("Altura (cms):");
        labelApotema.setText("Apotema (cms):");
        labelVolumen.setText("Volumen (cm3):");
        labelSuperficie.setText("Superficie (cm2):");

        resultadoVolumen.setText(" ");
        resultadoSuperficie.setText(" ");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(this::btnCalcularActionPerformed);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoVolumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultadoSuperficie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelApotema, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(labelAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(labelBase, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoBase, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(campoAltura)
                            .addComponent(campoApotema)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBase)
                    .addComponent(campoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAltura)
                    .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApotema)
                    .addComponent(campoApotema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnLimpiar))
                .addGap(20, 20, 20)
                .addComponent(resultadoVolumen)
                .addGap(15, 15, 15)
                .addComponent(resultadoSuperficie)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }
    // </editor-fold>

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {
        boolean error = false;
        double base = 0;
        double altura = 0;
        double apotema = 0;
        try {
            base = Double.parseDouble(campoBase.getText());
            altura = Double.parseDouble(campoAltura.getText());
            apotema = Double.parseDouble(campoApotema.getText());
            Piramide piramide = new Piramide(base, altura, apotema);
            resultadoVolumen.setText("Volumen (cm3): " + String.format("%.2f", piramide.calcularVolumen()));
            resultadoSuperficie.setText("Superficie (cm2): " + String.format("%.2f", piramide.calcularSuperficie()));
        } catch (Exception e) {
            error = true;
        } finally {
            if (error) {
                javax.swing.JOptionPane.showMessageDialog(null,
                    "Campo nulo o error en formato de numero",
                    "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        campoBase.setText("");
        campoAltura.setText("");
        campoApotema.setText("");
        resultadoVolumen.setText(" ");
        resultadoSuperficie.setText(" ");
    }

    // Variables declaration
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextField campoAltura;
    private javax.swing.JTextField campoApotema;
    private javax.swing.JTextField campoBase;
    private javax.swing.JLabel labelAltura;
    private javax.swing.JLabel labelApotema;
    private javax.swing.JLabel labelBase;
    private javax.swing.JLabel labelSuperficie;
    private javax.swing.JLabel labelVolumen;
    private javax.swing.JLabel resultadoSuperficie;
    private javax.swing.JLabel resultadoVolumen;
    // End of variables declaration
}
