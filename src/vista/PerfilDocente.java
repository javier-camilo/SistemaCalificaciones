
package vista;

import clases.Docente;
import clases.ManejoArchivo;
import clases.UsuarioDocente;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class PerfilDocente extends javax.swing.JFrame {

    ArrayList<UsuarioDocente> listaUsuario=new ArrayList<>();
    ArrayList<Docente> listaDocente=new ArrayList<>();
    String usuario;
    ManejoArchivo manejoArchivo=new ManejoArchivo();
    

    public PerfilDocente() {
        initComponents();
        iniciar();
    }
    
    private void iniciar(){
        verUsuario();
        panelContraseña.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelContraseña = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textoNueva = new javax.swing.JTextField();
        textoConfirmarNueva = new javax.swing.JTextField();
        botonCambiar = new javax.swing.JButton();
        botonNueva = new javax.swing.JButton();
        asignatura = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        identificacion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                          Docente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 0, 337, 47);

        jPanel1.setLayout(null);

        jLabel3.setText("Identificacion");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(12, 11, 79, 33);

        jLabel4.setText("Apellidos");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(12, 94, 79, 33);

        jLabel5.setText("Telefono");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(12, 145, 79, 33);

        jLabel6.setText("Nombre");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(12, 50, 79, 33);

        jLabel7.setText("Edad");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(12, 184, 79, 33);

        jLabel8.setText("Asignatura");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(12, 223, 79, 33);

        jLabel9.setText("Contraseña");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 267, 79, 33);

        panelContraseña.setLayout(null);

        jLabel10.setText("nueva");
        panelContraseña.add(jLabel10);
        jLabel10.setBounds(10, 10, 67, 33);

        jLabel11.setText("Confirma Nueva");
        panelContraseña.add(jLabel11);
        jLabel11.setBounds(10, 60, 90, 33);
        panelContraseña.add(textoNueva);
        textoNueva.setBounds(110, 10, 163, 32);
        panelContraseña.add(textoConfirmarNueva);
        textoConfirmarNueva.setBounds(110, 60, 163, 33);

        botonCambiar.setText("Cambiar");
        botonCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarActionPerformed(evt);
            }
        });
        panelContraseña.add(botonCambiar);
        botonCambiar.setBounds(191, 110, 90, 23);

        jPanel1.add(panelContraseña);
        panelContraseña.setBounds(95, 313, 290, 140);

        botonNueva.setText("Nueva");
        botonNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevaActionPerformed(evt);
            }
        });
        jPanel1.add(botonNueva);
        botonNueva.setBounds(300, 280, 75, 23);
        jPanel1.add(asignatura);
        asignatura.setBounds(101, 232, 160, 24);
        jPanel1.add(contraseña);
        contraseña.setBounds(107, 267, 160, 33);
        jPanel1.add(edad);
        edad.setBounds(101, 184, 160, 33);
        jPanel1.add(telefono);
        telefono.setBounds(97, 145, 160, 33);
        jPanel1.add(apellidos);
        apellidos.setBounds(97, 94, 160, 33);
        jPanel1.add(nombre);
        nombre.setBounds(97, 50, 160, 33);
        jPanel1.add(identificacion);
        identificacion.setBounds(97, 11, 160, 33);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 150, 430, 460);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 60, 74, 84);

        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar);
        botonRegresar.setBounds(410, 630, 90, 23);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul-oscuro.jpeg"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 510, 670);

        setSize(new java.awt.Dimension(526, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaActionPerformed
       iniciarNueva();
    }//GEN-LAST:event_botonNuevaActionPerformed

    private void iniciarNueva(){
        panelContraseña.setVisible(true);
    }
    private void botonCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarActionPerformed
       if(textoNueva.getText().equals(textoConfirmarNueva.getText())){
           if(textoNueva.getText().equals("")){
               JOptionPane.showMessageDialog(null,"debe llenar la nueva contraseña");
           }else{
                cambiar();
           }
       }else{
           JOptionPane.showMessageDialog(null,"las contraseñas no coinciden");
       }
        
    }//GEN-LAST:event_botonCambiarActionPerformed

    private void cambiar(){
        for (UsuarioDocente usuarioDocente : listaUsuario) {
            if(usuario.equals(usuarioDocente.getUser())){
                usuarioDocente.setPassword(textoNueva.getText());
            }
        }
        manejoArchivo.agregarUsuarioDocente(listaUsuario, "usuariosDocentes.guardar");
        verUsuario();
        panelContraseña.setVisible(false);
    }
    
    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        OperacionDocente operacionDocente=new OperacionDocente();
        operacionDocente.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void verUsuario(){
        usuario=manejoArchivo.consultarUsuarioTemporal("usuarioTemporal.guardar");
        listaDocente=manejoArchivo.verListadoDocente("docente.guardar");
        for (Docente docente : listaDocente) {
            if(usuario.equals(docente.getCodigo().toString())){
                identificacion.setText(""+docente.getCodigo());
                nombre.setText(""+docente.getNombre());
                apellidos.setText(""+docente.getApellido());
                telefono.setText(""+docente.getTelefono());
                edad.setText(""+docente.getEdad());
                asignatura.setText(""+docente.getAsignatura());
            }
        }
       
        listaUsuario=manejoArchivo.verUsuariosDocentes("usuariosDocentes.guardar");
        for (UsuarioDocente usuarioDocente : listaUsuario) {
            if(usuarioDocente.getUser().equals(usuario)){
               contraseña.setText(usuarioDocente.getPassword());
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
            java.util.logging.Logger.getLogger(PerfilDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidos;
    private javax.swing.JLabel asignatura;
    private javax.swing.JButton botonCambiar;
    private javax.swing.JButton botonNueva;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel edad;
    private javax.swing.JLabel identificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panelContraseña;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField textoConfirmarNueva;
    private javax.swing.JTextField textoNueva;
    // End of variables declaration//GEN-END:variables
}
