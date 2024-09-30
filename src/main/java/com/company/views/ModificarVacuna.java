/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.company.views;

import com.company.forms.FormVacunarPaciente;
import com.company.models.ConexionPacVac;
import com.company.models.ConexionVacunasDisponibles;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class ModificarVacuna extends javax.swing.JPanel {

    /**
     * Creates new form Inicio_PersonalSalud
     */
    public ModificarVacuna() {
        initComponents();
        initStyle();
//        ConexionPacVac objetoPacVac=new ConexionPacVac();
//        objetoPacVac.mostrarPacVac(tbHistorialMedico);
    }
    public ModificarVacuna(ConexionVacunasDisponibles vacDis){
        initComponents();
        initStyle();
        txtKit.setText(vacDis.getKit());
        txtLote.setText(vacDis.getLote());
        txtEnfermedad.setText(vacDis.getEnfermedad());
        txtDosis.setText(vacDis.getDosis());
        txtFechaCad.setText(vacDis.getFechaCaducidad());
    }

    private void initStyle() {
        lblBienvenido.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
        lblBienvenido.setForeground(Color.BLACK);
        txtKit.setForeground(new Color(90,90,90));
        txtLote.setForeground(new Color(90,90,90));
        txtEnfermedad.setForeground(new Color(90,90,90));
        txtDosis.setForeground(new Color(90,90,90));
        txtFechaCad.setForeground(new Color(90,90,90));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        txtKit = new javax.swing.JTextField();
        txtLote = new javax.swing.JTextField();
        txtEnfermedad = new javax.swing.JTextField();
        txtDosis = new javax.swing.JTextField();
        txtFechaCad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        btnConfirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jCalendarFechaCad = new com.toedter.calendar.JCalendar();

        setPreferredSize(new java.awt.Dimension(1060, 524));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBienvenido.setText("Modifique los datos de la vacuna.");
        bg.add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1040, 32));

        txtKit.setEditable(false);
        txtKit.setBorder(null);
        txtKit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtKitMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtKitMousePressed(evt);
            }
        });
        txtKit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKitActionPerformed(evt);
            }
        });
        bg.add(txtKit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 410, 20));

        txtLote.setBorder(null);
        txtLote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtLoteMousePressed(evt);
            }
        });
        bg.add(txtLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 410, 20));

        txtEnfermedad.setBorder(null);
        txtEnfermedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEnfermedadMousePressed(evt);
            }
        });
        bg.add(txtEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 410, 20));

        txtDosis.setBorder(null);
        txtDosis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDosisMousePressed(evt);
            }
        });
        txtDosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDosisActionPerformed(evt);
            }
        });
        bg.add(txtDosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 410, 20));

        txtFechaCad.setEditable(false);
        txtFechaCad.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaCad.setBorder(null);
        txtFechaCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaCadActionPerformed(evt);
            }
        });
        bg.add(txtFechaCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 150, 20));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setText("Caducidad:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 410, 20));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setText("Enfermedad:");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 410, 20));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setText("Lote:");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 410, 20));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 410, 20));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel7.setText("Dosis:");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel8.setText("Kit:");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 150, 20));

        btnConfirmar.setBackground(new java.awt.Color(21, 101, 192));
        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Modificar");
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        bg.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 210, 43));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevaVac.jpg"))); // NOI18N
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 46, -1, 360));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 10, 330));

        jCalendarFechaCad.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarFechaCadPropertyChange(evt);
            }
        });
        bg.add(jCalendarFechaCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 260, 140));

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1062, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtKitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKitActionPerformed

    private void txtDosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDosisActionPerformed

    private void txtFechaCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaCadActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        if (!txtKit.getText().equals("Digiete el DNI del paciente")) {
            if (!txtLote.getText().equals("Digite el nombre(s) del paciente")) {
                if (!txtEnfermedad.getText().equals("Digite los apellidos del paciente")) {
                    if (!txtDosis.getText().equals("Digite la direccion del paciente")) {
                     
                            if (!txtFechaCad.getText().equals("Fecha de nacimeinto")) {
                                ConexionVacunasDisponibles nuevaVac = new ConexionVacunasDisponibles();
                                nuevaVac.modificarRegistro(txtKit, txtLote, txtEnfermedad, txtDosis, txtFechaCad);
                            } else {
                                JOptionPane.showMessageDialog(null, "Alguno de los campos aun no a sido rellenado");
                            }
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Alguno de los campos aun no a sido rellenado");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Alguno de los campos aun no a sido rellenado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Alguno de los campos aun no a sido rellenado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Alguno de los campos aun no a sido rellenado");
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void jCalendarFechaCadPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarFechaCadPropertyChange
        // TODO add your handling code here:
        if (evt.getOldValue() != null) {
            SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
            txtFechaCad.setText(fecha.format(jCalendarFechaCad.getCalendar().getTime()));
            txtFechaCad.setForeground(Color.black);
        }
    }//GEN-LAST:event_jCalendarFechaCadPropertyChange

    private void txtKitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtKitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKitMouseClicked

    private void txtKitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtKitMousePressed
        // TODO add your handling code here:
        if (txtKit.getText().equals("Digiete el DNI del paciente")) {
            txtKit.setText("");
            txtKit.setForeground(Color.BLACK);
        }
        if (txtLote.getText().isEmpty() || txtEnfermedad.getText().isEmpty() || txtDosis.getText().isEmpty()) {
            txtLote.setText("Digite el nombre(s) del paciente");
            txtLote.setForeground(new Color(90, 90, 90));
            txtEnfermedad.setText("Digite los apellidos del paciente");
            txtEnfermedad.setForeground(new Color(90, 90, 90));
            txtDosis.setText("Digite la direccion del paciente");
            txtDosis.setForeground(new Color(90, 90, 90));
        }
    }//GEN-LAST:event_txtKitMousePressed

    private void txtLoteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLoteMousePressed
        // TODO add your handling code here:
        if (txtLote.getText().equals("Digite el nombre(s) del paciente")) {
            txtLote.setText("");
            txtLote.setForeground(Color.BLACK);
        }
        if (txtKit.getText().isEmpty() || txtEnfermedad.getText().isEmpty() || txtDosis.getText().isEmpty()) {
            txtKit.setText("Digiete el DNI del paciente");
            txtKit.setForeground(new Color(90, 90, 90));
            txtEnfermedad.setText("Digite los apellidos del paciente");
            txtEnfermedad.setForeground(new Color(90, 90, 90));
            txtDosis.setText("Digite la direccion del paciente");
            txtDosis.setForeground(new Color(90, 90, 90));
        }
    }//GEN-LAST:event_txtLoteMousePressed

    private void txtEnfermedadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEnfermedadMousePressed
        // TODO add your handling code here:
        if (txtEnfermedad.getText().equals("Digite los apellidos del paciente")) {
            txtEnfermedad.setText("");
            txtEnfermedad.setForeground(Color.BLACK);
        }
        if (txtKit.getText().isEmpty() || txtLote.getText().isEmpty() || txtDosis.getText().isEmpty()) {
            txtKit.setText("Digiete el DNI del paciente");
            txtKit.setForeground(new Color(90, 90, 90));
            txtLote.setText("Digite el nombre(s) del paciente");
            txtLote.setForeground(new Color(90, 90, 90));
            txtDosis.setText("Digite la direccion del paciente");
            txtDosis.setForeground(new Color(90, 90, 90));
        }
    }//GEN-LAST:event_txtEnfermedadMousePressed

    private void txtDosisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDosisMousePressed
        // TODO add your handling code here:
        if (txtDosis.getText().equals("Digite la direccion del paciente")) {
            txtDosis.setText("");
            txtDosis.setForeground(Color.BLACK);
        }
        if (txtKit.getText().isEmpty() || txtLote.getText().isEmpty() || txtEnfermedad.getText().isEmpty()) {
            txtKit.setText("Digiete el DNI del paciente");
            txtKit.setForeground(new Color(90, 90, 90));
            txtLote.setText("Digite el nombre(s) del paciente");
            txtLote.setForeground(new Color(90, 90, 90));
            txtEnfermedad.setText("Digite los apellidos del paciente");
            txtEnfermedad.setForeground(new Color(90, 90, 90));
        }
    }//GEN-LAST:event_txtDosisMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnConfirmar;
    private com.toedter.calendar.JCalendar jCalendarFechaCad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JTextField txtDosis;
    private javax.swing.JTextField txtEnfermedad;
    private javax.swing.JTextField txtFechaCad;
    private javax.swing.JTextField txtKit;
    private javax.swing.JTextField txtLote;
    // End of variables declaration//GEN-END:variables
}
