package proyecto;

import java.awt.Color;

/**
 *
 * @author 18PROGB0026
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        jButton3 = new javax.swing.JButton();
        btnDefinicion = new javax.swing.JButton();
        btnActividad = new javax.swing.JButton();
        btnAutores = new javax.swing.JButton();
        lblImagen1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnManual = new javax.swing.JMenu();
        jmiManual = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setText("Glosario");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos Respiracion Celular");
        setResizable(false);

        btnDefinicion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDefinicion.setText("Definicion");
        btnDefinicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefinicionActionPerformed(evt);
            }
        });

        btnActividad.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnActividad.setText("Actividad");
        btnActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividadActionPerformed(evt);
            }
        });

        btnAutores.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnAutores.setText("Autores");
        btnAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoresActionPerformed(evt);
            }
        });

        lblImagen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen10.jpg"))); // NOI18N
        lblImagen1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mnManual.setText("Ayuda");
        mnManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnManualActionPerformed(evt);
            }
        });

        jmiManual.setText("Manual de Uso");
        jmiManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManualActionPerformed(evt);
            }
        });
        mnManual.add(jmiManual);

        jMenuBar1.add(mnManual);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAutores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDefinicion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(lblImagen1)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblImagen1)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDefinicion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDefinicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefinicionActionPerformed
        Definicion def = new Definicion();
        def.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDefinicionActionPerformed

    private void mnManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnManualActionPerformed
              
        // TODO add your handling code here:
    }//GEN-LAST:event_mnManualActionPerformed

    private void btnActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadActionPerformed
       Actividad act =new Actividad();
       act.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnActividadActionPerformed

    private void btnAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoresActionPerformed
    Autores aut =new Autores();
       aut.setVisible(true);    
// TODO add your handling code here:
    }//GEN-LAST:event_btnAutoresActionPerformed

    private void jmiManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManualActionPerformed
        Procesos manual = new Procesos();
        manual.cargarArchivo();
    }//GEN-LAST:event_jmiManualActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividad;
    private javax.swing.JButton btnAutores;
    private javax.swing.JButton btnDefinicion;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiManual;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JMenu mnManual;
    // End of variables declaration//GEN-END:variables
}
