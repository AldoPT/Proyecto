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
public class Productos extends javax.swing.JFrame {

    /**
     * Creates new form Productos
     */
    public Productos() {
        initComponents();

        this.getContentPane().setBackground(Color.DARK_GRAY);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblProcesos = new javax.swing.JLabel();
        btnAerobia = new javax.swing.JButton();
        btnAnaerobia = new javax.swing.JButton();
        btnAtp = new javax.swing.JButton();
        btnRegreso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Procesos para los productos ");
        setFocusTraversalPolicyProvider(true);
        setFocusable(false);
        setResizable(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Tipos de respiración celular\n\n· Respiración aeróbica ocurre en las mitocondrias. El aceptor final de electrones es el oxígeno molecular, que se reduce a agua. La realizan la inmensa mayoría de organismos, incluidos los humanos. Los organismos que llevan a cabo este tipo de respiración reciben el nombre de organismos aeróbicos.\n\n· Respiración anaeróbica (fermentación) y ocurre en el citoplasma.  El aceptor final de electrones es una molécula inorgánica distinta del oxígeno, más raramente una molécula orgánica. Es un tipo de metabolismo muy común en muchos microorganismos, especialmente procariotas. No debe confundirse con la fermentación, proceso también anaeróbico, pero en el que no interviene nada parecido a una cadena transportadora de electrones. \n\n");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        lblProcesos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblProcesos.setForeground(new java.awt.Color(255, 255, 255));
        lblProcesos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProcesos.setText("PROCESO PARA LOS PRODUCTOS");

        btnAerobia.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAerobia.setText("Aerobia");
        btnAerobia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAerobiaActionPerformed(evt);
            }
        });

        btnAnaerobia.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAnaerobia.setText("Anaerobia");
        btnAnaerobia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnaerobiaActionPerformed(evt);
            }
        });

        btnAtp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAtp.setText("ATP");
        btnAtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtpActionPerformed(evt);
            }
        });

        btnRegreso.setText("Regreso");
        btnRegreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnAerobia, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnAnaerobia, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtp, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegreso)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblProcesos, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProcesos, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnRegreso))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAnaerobia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAerobia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAerobiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAerobiaActionPerformed
        Aerobia aer = new Aerobia();
        aer.setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_btnAerobiaActionPerformed

    private void btnAnaerobiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnaerobiaActionPerformed
      Anaerobia ana = new Anaerobia();
        ana.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_btnAnaerobiaActionPerformed

    private void btnAtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtpActionPerformed
        ATP at = new ATP();
        at.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnAtpActionPerformed

    private void btnRegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresoActionPerformed
 dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresoActionPerformed

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAerobia;
    private javax.swing.JButton btnAnaerobia;
    private javax.swing.JButton btnAtp;
    private javax.swing.JButton btnRegreso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblProcesos;
    // End of variables declaration//GEN-END:variables
}
