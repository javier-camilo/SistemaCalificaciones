
package vista;

import clases.ManejoArchivo;
import clases.UsuarioDocente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InicioDocente extends javax.swing.JFrame {

    ArrayList<UsuarioDocente> usuariosDocentes;
    ManejoArchivo manejoArchivo;
    
    public InicioDocente() {
        initComponents();
        usuariosDocentes=new ArrayList<>();
        manejoArchivo=new ManejoArchivo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textoPassword = new javax.swing.JPasswordField();
        botonIniciar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        textoCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                  Inicio Docente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(26, 0, 340, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 70, 72, 72);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 230, 90, 39);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codigo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 180, 100, 39);
        getContentPane().add(textoPassword);
        textoPassword.setBounds(130, 231, 250, 39);

        botonIniciar.setText("Login");
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(botonIniciar);
        botonIniciar.setBounds(290, 290, 90, 33);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/previous.png"))); // NOI18N
        jButton1.setText("regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 390, 120, 30);
        getContentPane().add(textoCodigo);
        textoCodigo.setBounds(130, 181, 250, 39);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 400, 430);

        setSize(new java.awt.Dimension(416, 463));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inicio inicio= new Inicio();
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
       iniciarDocente();
    }//GEN-LAST:event_botonIniciarActionPerformed
    
//inicio del ususario 
    private void iniciarDocente(){
        int contador=0;
        usuariosDocentes=manejoArchivo.verUsuariosDocentes("usuariosDocentes.guardar");
        for (UsuarioDocente usuariosDocente : usuariosDocentes) {
            if(usuariosDocente.getIdentidad().equals(textoCodigo.getText().trim()) && usuariosDocente.getPassword().equals(textoPassword.getText())){
                manejoArchivo.usuarioTemporal(textoCodigo.getText().trim(), "usuarioTemporal.guardar");
                OperacionDocente OperacionDocente =new OperacionDocente ();
                OperacionDocente.setVisible(true);
                dispose();
                contador=1;
            } 
        }
        
        if(contador==0){
            JOptionPane.showMessageDialog(null,"usuario o contraseñas incorrectos");
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
            java.util.logging.Logger.getLogger(InicioDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textoCodigo;
    private javax.swing.JPasswordField textoPassword;
    // End of variables declaration//GEN-END:variables
}
