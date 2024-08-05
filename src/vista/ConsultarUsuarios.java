
package vista;

import clases.ManejoArchivo;
import clases.UsuarioAdministrativo;
import clases.UsuarioDocente;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ConsultarUsuarios extends javax.swing.JFrame {

    ArrayList<UsuarioAdministrativo> usuariosAdministrador;
    ArrayList<UsuarioDocente> usuariosDocente;
    ManejoArchivo manejoArchivo;
    CrearUsuarios crearUsuarios;
    
    public ConsultarUsuarios() {
        initComponents();
        iniciar();
    }
    
    private void iniciar(){
        usuariosAdministrador= new ArrayList<>();
        usuariosDocente=new ArrayList<>();
        manejoArchivo=new ManejoArchivo();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboTipoCuenta = new javax.swing.JComboBox<>();
        botonBuscar = new javax.swing.JButton();
        textoCodigo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        mostrarUsuario = new javax.swing.JLabel();
        mostrarPassword = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Identificación");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 30, 100, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Tipo de Consulta ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 40, 130, 20);

        comboTipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "DOCENTE", "ADMINISTRADOR" }));
        jPanel1.add(comboTipoCuenta);
        comboTipoCuenta.setBounds(20, 70, 140, 30);

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscar);
        botonBuscar.setBounds(310, 130, 100, 23);
        jPanel1.add(textoCodigo);
        textoCodigo.setBounds(190, 70, 220, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 120, 430, 170);

        jPanel2.setLayout(null);

        mostrarUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(mostrarUsuario);
        mostrarUsuario.setBounds(110, 20, 210, 40);

        mostrarPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(mostrarPassword);
        mostrarPassword.setBounds(110, 80, 210, 40);

        jLabel6.setText("contraseña:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 80, 70, 50);

        jLabel7.setText("Ususario:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 20, 70, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(50, 310, 430, 150);

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/previous.png"))); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar);
        botonRegresar.setBounds(340, 490, 140, 30);

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("             Consulta Usuarios");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 40, 270, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consultar.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 20, 100, 70);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul-oscuro.jpeg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 500, 540);

        setSize(new java.awt.Dimension(516, 575));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        crearUsuarios=new CrearUsuarios();
        crearUsuarios.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
         operacionBuscar();
    }//GEN-LAST:event_botonBuscarActionPerformed

        //buscar en los datos 
    private void operacionBuscar(){
 
        if(comboTipoCuenta.getSelectedItem().equals("SELECCIONAR")){
            JOptionPane.showMessageDialog(null,"Debe seleccionar el tipo de cuenta a consultar");
        }else{
            if(comboTipoCuenta.getSelectedItem().equals("ADMINISTRADOR")){
               buscarAdministrador(); 
            }
            if(comboTipoCuenta.getSelectedItem().equals("DOCENTE")){
                buscarDocente();
            }
        }
    }
    
    //buscar administrador
        private void buscarAdministrador(){
           int contador=0;
           usuariosAdministrador=manejoArchivo.verUsuariosAdministrativos("usuariosAdministrativo.guardar");
            for (UsuarioAdministrativo usuarioAdministrativo : usuariosAdministrador) {
                if(usuarioAdministrativo.getIdentidad().equals(textoCodigo.getText().trim())){
                    mostrarUsuario.setText(""+usuarioAdministrativo.getUser());
                    mostrarPassword.setText(""+usuarioAdministrativo.getPassword());
                    contador=1;
                }
            }
            if(contador==0){
                JOptionPane.showMessageDialog(null, "No se encontro un usuario con el codigo: "+textoCodigo.getText().trim());
            }
            
        }

        private void buscarDocente(){
            usuariosDocente=manejoArchivo.verUsuariosDocentes("usuariosDocentes.guardar");
            for (UsuarioDocente usuarioDocente : usuariosDocente) {
                if(textoCodigo.getText().equals(usuarioDocente.getIdentidad())){
                    mostrarUsuario.setText(""+usuarioDocente.getIdentidad());
                    mostrarPassword.setText(""+usuarioDocente.getPassword());
                }
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
            java.util.logging.Logger.getLogger(ConsultarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JComboBox<String> comboTipoCuenta;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mostrarPassword;
    private javax.swing.JLabel mostrarUsuario;
    private javax.swing.JTextField textoCodigo;
    // End of variables declaration//GEN-END:variables
}
