package com.mycompany.ejercicio8p3;

/**
 * Esta clase denominada VentanaCilindro define una ventana para
 * ingresar los datos de un cilindro y calcular su volumen y superficie.
 * @version 1.2/2020
 */
public class VentanaCilindro extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
        java.util.logging.Logger.getLogger(VentanaCilindro.class.getName());

    public VentanaCilindro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        labelRadio = new javax.swing.JLabel();
        labelAltura = new javax.swing.JLabel();
        labelVolumen = new javax.swing.JLabel();
        labelSuperficie = new javax.swing.JLabel();
        campoRadio = new javax.swing.JTextField();
        campoAltura = new javax.swing.JTextField();
        resultadoVolumen = new javax.swing.JLabel();
        resultadoSuperficie = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cilindro");
        setResizable(false);

        labelRadio.setText("Radio (cms):");
        labelAltura.setText("Altura (cms):");
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
                            .addComponent(labelAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(labelRadio, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoRadio, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(campoAltura)))
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
                    .addComponent(labelRadio)
                    .addComponent(campoRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAltura)
                    .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        double radio = 0;
        double altura = 0;
        try {
            radio = Double.parseDouble(campoRadio.getText());
            altura = Double.parseDouble(campoAltura.getText());
            Cilindro cilindro = new Cilindro(radio, altura);
            resultadoVolumen.setText("Volumen (cm3): " + String.format("%.2f", cilindro.calcularVolumen()));
            resultadoSuperficie.setText("Superficie (cm2): " + String.format("%.2f", cilindro.calcularSuperficie()));
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
        campoRadio.setText("");
        campoAltura.setText("");
        resultadoVolumen.setText(" ");
        resultadoSuperficie.setText(" ");
    }

    // Variables declaration
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextField campoAltura;
    private javax.swing.JTextField campoRadio;
    private javax.swing.JLabel labelAltura;
    private javax.swing.JLabel labelRadio;
    private javax.swing.JLabel labelSuperficie;
    private javax.swing.JLabel labelVolumen;
    private javax.swing.JLabel resultadoSuperficie;
    private javax.swing.JLabel resultadoVolumen;
    // End of variables declaration
}
