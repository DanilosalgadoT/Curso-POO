package com.mycompany.ejercicio8p3;

/**
 * Esta clase denominada VentanaPrincipal define una interfaz grafica
 * que permite consultar un menu principal con tres figuras geometricas.
 * @version 1.2/2020
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
        java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        btnCilindro = new javax.swing.JButton();
        btnEsfera = new javax.swing.JButton();
        btnPiramide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Figuras");
        setResizable(false);

        btnCilindro.setText("Cilindro");
        btnCilindro.addActionListener(this::btnCilindroActionPerformed);

        btnEsfera.setText("Esfera");
        btnEsfera.addActionListener(this::btnEsferaActionPerformed);

        btnPiramide.setText("Piramide");
        btnPiramide.addActionListener(this::btnPiramideActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnCilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnEsfera, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnPiramide, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCilindro)
                    .addComponent(btnEsfera)
                    .addComponent(btnPiramide))
                .addGap(40, 40, 40))
        );

        pack();
    }
    // </editor-fold>

    private void btnCilindroActionPerformed(java.awt.event.ActionEvent evt) {
        VentanaCilindro cilindro = new VentanaCilindro(); /* Crea la ventana del cilindro */
        cilindro.setVisible(true); /* Establece que se visualice la ventana del cilindro */
    }

    private void btnEsferaActionPerformed(java.awt.event.ActionEvent evt) {
        VentanaEsfera esfera = new VentanaEsfera(); /* Crea la ventana de la esfera */
        esfera.setVisible(true); /* Establece que se visualice la ventana de la esfera */
    }

    private void btnPiramideActionPerformed(java.awt.event.ActionEvent evt) {
        VentanaPiramide piramide = new VentanaPiramide(); /* Crea la ventana de la piramide */
        piramide.setVisible(true); /* Establece que se visualice la ventana de la piramide */
    }

    // Variables declaration
    private javax.swing.JButton btnCilindro;
    private javax.swing.JButton btnEsfera;
    private javax.swing.JButton btnPiramide;
    // End of variables declaration
}
