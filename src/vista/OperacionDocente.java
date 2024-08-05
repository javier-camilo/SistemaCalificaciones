
package vista;


import clases.ManejoArchivo;
import javax.swing.JOptionPane;

public class OperacionDocente extends javax.swing.JFrame {

    public OperacionDocente() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        digitarNota = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        perfil = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man (2).png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 130, 140, 150);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("            Menu Docente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 50, 240, 50);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul-oscuro.jpeg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, -26, 540, 450);

        jMenu1.setText("Notas");

        digitarNota.setText("Digitar Definitiva ");
        digitarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitarNotaActionPerformed(evt);
            }
        });
        jMenu1.add(digitarNota);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Perfil");

        perfil.setText("Perfil Docente");
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });
        jMenu3.add(perfil);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Salir");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(557, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       inicio();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        PerfilDocente perfilDocente=new PerfilDocente();
        perfilDocente.setVisible(true);
        dispose();
    }//GEN-LAST:event_perfilActionPerformed

    private void digitarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitarNotaActionPerformed
       DigitarNota digitarNota=new DigitarNota();
       digitarNota.setVisible(true);
       dispose();
    }//GEN-LAST:event_digitarNotaActionPerformed

    private void inicio(){
            String[] opciones={"si","no"};
            int confirmacion=JOptionPane.showOptionDialog(this, "¿desea Salir?", "Salir", 0, 0, null, opciones, this);
            if (confirmacion==JOptionPane.YES_OPTION) {
                Inicio inicio=new Inicio();
                inicio.setVisible(true);
                dispose();
            }
    }

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
            java.util.logging.Logger.getLogger(OperacionDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperacionDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperacionDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperacionDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperacionDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem digitarNota;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem perfil;
    // End of variables declaration//GEN-END:variables
}
