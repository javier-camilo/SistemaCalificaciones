
package vista;

import clases.ManejoArchivo;
import clases.UsuarioAdministrativo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InicioAdministrativo extends javax.swing.JFrame {
    
    Inicio inicio;
    OperacionAdministrativo operacionAdministrativo;
    ArrayList<UsuarioAdministrativo> listadoAdministrativos;
    ManejoArchivo manejoArchivo;
    
    String user="Administrador";
    String contraseña="sistema";
  
    public InicioAdministrativo() {
        initComponents();
        iniciar();
    }
    
    private void iniciar(){
        listadoAdministrativos=new  ArrayList<>();
        manejoArchivo=new ManejoArchivo();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoContraseña = new javax.swing.JPasswordField();
        botonRegresar = new javax.swing.JButton();
        labelIconoAdministrador = new javax.swing.JLabel();
        botonIniciar = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("inicio de sesion Administrativo");
        getContentPane().setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("                     Incio Administrador");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 10, 370, 60);
        getContentPane().add(textoUsuario);
        textoUsuario.setBounds(220, 170, 180, 40);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 170, 100, 40);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 230, 100, 30);
        getContentPane().add(textoContraseña);
        textoContraseña.setBounds(220, 220, 180, 40);

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/previous.png"))); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar);
        botonRegresar.setBounds(380, 380, 120, 50);

        labelIconoAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        getContentPane().add(labelIconoAdministrador);
        labelIconoAdministrador.setBounds(230, 60, 70, 90);

        botonIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(botonIniciar);
        botonIniciar.setBounds(110, 280, 290, 40);

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(labelFondo);
        labelFondo.setBounds(0, 0, 510, 440);

        setSize(new java.awt.Dimension(528, 478));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ingresar(){
        if(textoUsuario.getText().equals(user) && textoContraseña.getText().equals(contraseña)){
            operacionAdministrativo =new OperacionAdministrativo();
            operacionAdministrativo.setVisible(true);
            dispose(); 
        }else{
            consultarUsuariosCreados();
        }
    }
    
    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
      regresar();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        ingresar();
    }//GEN-LAST:event_botonIniciarActionPerformed

    
  private void regresar(){
      inicio=new Inicio();
      inicio.setVisible(true);
      dispose();
  }

      private void consultarUsuariosCreados(){
          int contador=0;
          listadoAdministrativos=manejoArchivo.verUsuariosAdministrativos("usuariosAdministrativo.guardar");
          for (UsuarioAdministrativo usuarioAdministrativo : listadoAdministrativos) {
              if(textoUsuario.getText().trim().equals(usuarioAdministrativo.getUser()) && textoContraseña.getText().equals(usuarioAdministrativo.getPassword()) ){
                 operacionAdministrativo=new OperacionAdministrativo();
                 operacionAdministrativo.setVisible(true);
                 dispose();
                 contador=1;
              }
          }
          
          if(contador==0){
             JOptionPane.showMessageDialog(null, "usuario o contraseña incorrectos");
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
            java.util.logging.Logger.getLogger(InicioAdministrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioAdministrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioAdministrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioAdministrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioAdministrativo().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelIconoAdministrador;
    private javax.swing.JPasswordField textoContraseña;
    private javax.swing.JTextField textoUsuario;
    // End of variables declaration//GEN-END:variables
}
