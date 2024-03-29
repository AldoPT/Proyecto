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
public class Anaerobia extends javax.swing.JFrame {

    /**
     * Creates new form Anaerobia
     */
    public Anaerobia() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAnaerobia = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        lblAnaerobia = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnaerobia2 = new javax.swing.JTextArea();
        lblImagen3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Respiracion Anaerobia");
        setResizable(false);

        txtAnaerobia.setEditable(false);
        txtAnaerobia.setColumns(20);
        txtAnaerobia.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAnaerobia.setLineWrap(true);
        txtAnaerobia.setRows(5);
        txtAnaerobia.setText("Anaeróbica: Debido a que la glucólisis no utiliza oxígeno, el proceso se considera anaeróbico y para ciertos organismos anaerobios, como algunas bacterias y levaduras, la glucólisis es la única fuente de energía.\n\nCómo las células extraen energía de la glucosa en ausencia de oxígeno. En levaduras, las reacciones anaeróbicas producen alcohol, mientras que en tus músculos, forman ácido láctico.  ");
        txtAnaerobia.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtAnaerobia);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblAnaerobia.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblAnaerobia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnaerobia.setText("Anaerobia");

        txtAnaerobia2.setColumns(20);
        txtAnaerobia2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAnaerobia2.setLineWrap(true);
        txtAnaerobia2.setRows(5);
        txtAnaerobia2.setText("Hay dos tipos comunes de respiración celular anaeróbica: fermentación láctica y fermentación alcohólica .\n\nFermentación alcohólica \n\nEl ácido pirúvico formado en la glucólisis se convierte anaeróbicamente en etanol. En el primer caso se libera dióxido de carbono, y en el segundo se oxida el NADH y se reduce a acetaldehído.\n\nOtras células, como por ejemplo los glóbulos rojos, las células musculares y algunos microorganismos transforman el ácido Pirúvico en ácido láctico.\n\nEn el caso de las células musculares, la fermentación láctica, se produce como resultado de ejercicios extenuantes durante los cuales el aporte de oxígeno no alcanza a cubrir las necesidades del metabolismo celular. La acumulación del ácido láctico en estas células produce la sensación de cansancio muscular que muchas veces acompaña a esos ejercicios.\n\nFermentación láctica\n\nEn esta reacción el NADH se oxida y el ácido pirúvico se reduce transformándose en ácido lactico.\n\nLa fermentación sea esta alcohólica o\nláctica ocurre en el citoplasma.\n\n");
        txtAnaerobia2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtAnaerobia2);

        lblImagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen4.PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblImagen3))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAnaerobia, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAnaerobia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImagen3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Anaerobia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anaerobia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anaerobia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anaerobia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anaerobia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnaerobia;
    private javax.swing.JLabel lblImagen3;
    private javax.swing.JTextArea txtAnaerobia;
    private javax.swing.JTextArea txtAnaerobia2;
    // End of variables declaration//GEN-END:variables
}
