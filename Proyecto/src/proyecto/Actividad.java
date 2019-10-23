/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Color;

/**
 *
 * @author 18PROGB0026
 */
public class Actividad extends javax.swing.JFrame {

    /**
     * Creates new form Actividad
     */
    public Actividad() {
        initComponents();
         this.getContentPane().setBackground(Color.orange);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbP1r1 = new javax.swing.JRadioButton();
        rbP1r2 = new javax.swing.JRadioButton();
        rbP1r3 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPregunta1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPregunta2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPregunta3 = new javax.swing.JTextArea();
        rbP2r1 = new javax.swing.JRadioButton();
        rbP2r2 = new javax.swing.JRadioButton();
        rbP2r3 = new javax.swing.JRadioButton();
        chkP3r1 = new javax.swing.JCheckBox();
        chkP3r2 = new javax.swing.JCheckBox();
        chkP3r3 = new javax.swing.JCheckBox();
        btnRegresar = new javax.swing.JButton();
        lblImagen3 = new javax.swing.JLabel();
        lblRes = new javax.swing.JLabel();
        lblRes2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Actividad");
        setResizable(false);

        rbP1r1.setText("ATP");
        rbP1r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbP1r1ActionPerformed(evt);
            }
        });

        rbP1r2.setText("H2O");
        rbP1r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbP1r2ActionPerformed(evt);
            }
        });

        rbP1r3.setText("CO2");
        rbP1r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbP1r3ActionPerformed(evt);
            }
        });

        txtPregunta1.setEditable(false);
        txtPregunta1.setColumns(20);
        txtPregunta1.setLineWrap(true);
        txtPregunta1.setRows(2);
        txtPregunta1.setText("El principal producto de la respiración celular es");
        txtPregunta1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtPregunta1);

        txtPregunta2.setEditable(false);
        txtPregunta2.setColumns(20);
        txtPregunta2.setLineWrap(true);
        txtPregunta2.setRows(2);
        txtPregunta2.setText("En esta reaccion el NADH se oxida y el acido priruvico se reduce transformandose en ");
        txtPregunta2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtPregunta2);

        txtPregunta3.setColumns(20);
        txtPregunta3.setLineWrap(true);
        txtPregunta3.setRows(1);
        txtPregunta3.setText("Cuales son los tipos mas comunes de respiracion celular en los que no se utiliza el Oxigeno");
        txtPregunta3.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtPregunta3);

        rbP2r1.setText("Acido lactico");
        rbP2r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbP2r1ActionPerformed(evt);
            }
        });

        rbP2r2.setText("Acido priruvico");
        rbP2r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbP2r2ActionPerformed(evt);
            }
        });

        rbP2r3.setText("Acido suslfurico");
        rbP2r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbP2r3ActionPerformed(evt);
            }
        });

        chkP3r1.setText("Fermentacion lactica");

        chkP3r2.setText("Fermentacion alcholica");
        chkP3r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkP3r2ActionPerformed(evt);
            }
        });

        chkP3r3.setText("Fermentaciones");

        btnRegresar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lblImagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen5.jpg"))); // NOI18N

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rbP1r1)
                                .addGap(41, 41, 41)
                                .addComponent(rbP1r2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbP1r3)
                                .addGap(48, 48, 48)
                                .addComponent(lblRes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rbP2r1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbP2r2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbP2r3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblRes2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkP3r1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkP3r2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkP3r3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnRegresar))
                    .addComponent(lblImagen3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblImagen3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbP1r1)
                                .addComponent(rbP1r2)
                                .addComponent(rbP1r3))
                            .addComponent(lblRes, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbP2r1)
                                .addComponent(rbP2r2)
                                .addComponent(rbP2r3))
                            .addComponent(lblRes2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkP3r1)
                            .addComponent(chkP3r2)
                            .addComponent(chkP3r3))))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void rbP1r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbP1r1ActionPerformed
        rbP1r2.setSelected(false);
        rbP1r3.setSelected(false);
        lblRes.setText("Correcto");
    }//GEN-LAST:event_rbP1r1ActionPerformed

    private void rbP2r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbP2r1ActionPerformed
        rbP2r2.setSelected(false);
        rbP2r3.setSelected(false);
        lblRes2.setText("Correcto");        // TODO add your handling code here:
    }//GEN-LAST:event_rbP2r1ActionPerformed

    private void chkP3r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkP3r2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkP3r2ActionPerformed

    private void rbP1r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbP1r2ActionPerformed
        rbP1r1.setSelected(false);
        rbP1r3.setSelected(false);
        lblRes.setText("incorrecto");        // TODO add your handling code here:
    }//GEN-LAST:event_rbP1r2ActionPerformed

    private void rbP1r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbP1r3ActionPerformed
        rbP1r1.setSelected(false);
        rbP1r2.setSelected(false);
        lblRes.setText("Incorrecto");        // TODO add your handling code here:
    }//GEN-LAST:event_rbP1r3ActionPerformed

    private void rbP2r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbP2r2ActionPerformed
        rbP2r1.setSelected(false);
        rbP2r3.setSelected(false);
        lblRes2.setText("Incorrecto");        // TODO add your handling code here:
    }//GEN-LAST:event_rbP2r2ActionPerformed

    private void rbP2r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbP2r3ActionPerformed
        rbP2r1.setSelected(false);
        rbP2r2.setSelected(false);
        lblRes2.setText("Incorrecto");        // TODO add your handling code here:
    }//GEN-LAST:event_rbP2r3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JCheckBox chkP3r1;
    private javax.swing.JCheckBox chkP3r2;
    private javax.swing.JCheckBox chkP3r3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblImagen3;
    private javax.swing.JLabel lblRes;
    private javax.swing.JLabel lblRes2;
    private javax.swing.JRadioButton rbP1r1;
    private javax.swing.JRadioButton rbP1r2;
    private javax.swing.JRadioButton rbP1r3;
    private javax.swing.JRadioButton rbP2r1;
    private javax.swing.JRadioButton rbP2r2;
    private javax.swing.JRadioButton rbP2r3;
    private javax.swing.JTextArea txtPregunta1;
    private javax.swing.JTextArea txtPregunta2;
    private javax.swing.JTextArea txtPregunta3;
    // End of variables declaration//GEN-END:variables
}
