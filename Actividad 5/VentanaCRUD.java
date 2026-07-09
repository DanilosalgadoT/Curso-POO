package com.mycompany.ejerciciopagina_crud;

import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class VentanaCRUD extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(VentanaCRUD.class.getName());

    public VentanaCRUD() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName   = new javax.swing.JLabel();
        lblNumber = new javax.swing.JLabel();
        txtName   = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnRead   = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear  = new javax.swing.JButton();
        btnExit   = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Friends Contact CRUD");
        setResizable(false);

        lblName.setText("Name");
        lblNumber.setText("Number");

        btnCreate.setText("Create");
        btnCreate.addActionListener(this::btnCreateActionPerformed);

        btnRead.setText("Read");
        btnRead.addActionListener(this::btnReadActionPerformed);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(this::btnUpdateActionPerformed);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(this::btnDeleteActionPerformed);

        btnClear.setText("Clear");
        btnClear.addActionListener(this::btnClearActionPerformed);

        btnExit.setText("Exit");
        btnExit.addActionListener(this::btnExitActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    // Name row
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    // Number row
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18)
                        .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    // CRUD buttons row
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addGap(10)
                        .addComponent(btnRead)
                        .addGap(10)
                        .addComponent(btnUpdate)
                        .addGap(10)
                        .addComponent(btnDelete))
                    // Clear / Exit row (centered)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addGap(40)
                        .addComponent(btnClear)
                        .addGap(18)
                        .addComponent(btnExit)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30)
                // Name
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22)
                // Number
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumber)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28)
                // CRUD buttons
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnRead)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(12)
                // Clear / Exit
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnExit))
                .addGap(30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // ── CREATE ────────────────────────────────────────────────────────────────
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        try {
            String newName   = String.valueOf(txtName.getText()).trim();
            long   newNumber = Long.parseLong(txtNumber.getText().trim());

            if (newName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Name cannot be empty.", "Validation", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String nameNumberString;
            String name;
            long   number;

            File file = new File("friendsContact.txt");
            if (file.exists() == false) {
                file.createNewFile();
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;

            while (raf.getFilePointer() < raf.length()) {
                nameNumberString = raf.readLine();
                String[] lineSplit = nameNumberString.split("!");
                name   = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
                if (name.equals(newName) || number == newNumber) {
                    found = true;
                    break;
                }
            }

            if (found == false) {
                nameNumberString = newName + "!" + String.valueOf(newNumber);
                raf.writeBytes(nameNumberString);
                raf.writeBytes(System.lineSeparator());
                raf.close();
                JOptionPane.showMessageDialog(this, "Friend added successfully.", "Create", JOptionPane.INFORMATION_MESSAGE);
            } else {
                raf.close();
                JOptionPane.showMessageDialog(this, "Name or number already exists.", "Create", JOptionPane.WARNING_MESSAGE);
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Number must be a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(this, "IO Error: " + ioe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    // ── READ ──────────────────────────────────────────────────────────────────
    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        try {
            String nameNumberString;
            String name;
            long   number;

            File file = new File("friendsContact.txt");
            if (file.exists() == false) {
                file.createNewFile();
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            StringBuilder sb = new StringBuilder();

            while (raf.getFilePointer() < raf.length()) {
                nameNumberString = raf.readLine();
                String[] lineSplit = nameNumberString.split("!");
                name   = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
                sb.append("Friend Name: ").append(name)
                  .append("\nContact Number: ").append(number).append("\n\n");
            }

            raf.close();

            if (sb.length() == 0) {
                JOptionPane.showMessageDialog(this, "No contacts found.", "Read", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, sb.toString(), "All Contacts", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(this, "IO Error: " + ioe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnReadActionPerformed

    // ── UPDATE ────────────────────────────────────────────────────────────────
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            String inputName  = String.valueOf(txtName.getText()).trim();
            long   newNumber  = Long.parseLong(txtNumber.getText().trim());

            if (inputName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter the name to update.", "Validation", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String nameNumberString;
            String name;
            long   number;
            int    index;

            File file = new File("friendsContact.txt");
            if (file.exists() == false) {
                file.createNewFile();
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;

            while (raf.getFilePointer() < raf.length()) {
                nameNumberString = raf.readLine();
                String[] lineSplit = nameNumberString.split("!");
                name   = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
                if (name.equals(inputName)) {
                    found = true;
                    break;
                }
            }

            if (found == true) {
                File tmpFile = new File("temp.txt");
                RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");

                raf.seek(0);

                while (raf.getFilePointer() < raf.length()) {
                    nameNumberString = raf.readLine();
                    index = nameNumberString.indexOf('!');
                    name  = nameNumberString.substring(0, index);

                    if (name.equals(inputName)) {
                        nameNumberString = name + "!" + String.valueOf(newNumber);
                    }

                    tmpraf.writeBytes(nameNumberString);
                    tmpraf.writeBytes(System.lineSeparator());
                }

                raf.seek(0);
                tmpraf.seek(0);

                while (tmpraf.getFilePointer() < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }

                raf.setLength(tmpraf.length());
                tmpraf.close();
                raf.close();
                tmpFile.delete();

                JOptionPane.showMessageDialog(this, "Friend updated successfully.", "Update", JOptionPane.INFORMATION_MESSAGE);

            } else {
                raf.close();
                JOptionPane.showMessageDialog(this, "Name not found.", "Update", JOptionPane.WARNING_MESSAGE);
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Number must be a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(this, "IO Error: " + ioe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    // ── DELETE ────────────────────────────────────────────────────────────────
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String inputName = String.valueOf(txtName.getText()).trim();

            if (inputName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter the name to delete.", "Validation", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String nameNumberString;
            String name;
            long   number;
            int    index;

            File file = new File("friendsContact.txt");
            if (file.exists() == false) {
                file.createNewFile();
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;

            while (raf.getFilePointer() < raf.length()) {
                nameNumberString = raf.readLine();
                String[] lineSplit = nameNumberString.split("!");
                name   = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
                if (name.equals(inputName)) {
                    found = true;
                    break;
                }
            }

            if (found == true) {
                File tmpFile = new File("temp.txt");
                RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");

                raf.seek(0);

                while (raf.getFilePointer() < raf.length()) {
                    nameNumberString = raf.readLine();
                    index = nameNumberString.indexOf('!');
                    name  = nameNumberString.substring(0, index);

                    if (name.equals(inputName)) {
                        continue;
                    }

                    tmpraf.writeBytes(nameNumberString);
                    tmpraf.writeBytes(System.lineSeparator());
                }

                raf.seek(0);
                tmpraf.seek(0);

                while (tmpraf.getFilePointer() < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }

                raf.setLength(tmpraf.length());
                tmpraf.close();
                raf.close();
                tmpFile.delete();

                JOptionPane.showMessageDialog(this, "Friend deleted successfully.", "Delete", JOptionPane.INFORMATION_MESSAGE);

            } else {
                raf.close();
                JOptionPane.showMessageDialog(this, "Name not found.", "Delete", JOptionPane.WARNING_MESSAGE);
            }

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(this, "IO Error: " + ioe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    // ── CLEAR ─────────────────────────────────────────────────────────────────
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtName.setText("");
        txtNumber.setText("");
        txtName.requestFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    // ── EXIT ──────────────────────────────────────────────────────────────────
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new VentanaCRUD().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel  lblName;
    private javax.swing.JLabel  lblNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}
