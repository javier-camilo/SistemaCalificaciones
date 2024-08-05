
package vista;

import clases.ManejoArchivo;
import clases.UsuarioAdministrativo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CrearUsuarioAdministrador extends javax.swing.JFrame {


    ArrayList<UsuarioAdministrativo> listaAdministrador;
    ManejoArchivo manejoArchivo;
    
    public CrearUsuarioAdministrador() {
        initComponents();
        iniciar();
    }
    
    private void iniciar(){
        listaAdministrador=new ArrayList<>();
        manejoArchivo=new ManejoArchivo();
        verTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoIdentidad = new javax.swing.JTextField();
        textoUsuario = new javax.swing.JTextField();
        textoConfirmarClave = new javax.swing.JPasswordField();
        textoClave = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        botonEliminar = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Confirmar Clave");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 260, 130, 30);

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("        Crear  Usuario  Administrador");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 20, 320, 40);

        textoIdentidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoIdentidadKeyTyped(evt);
            }
        });
        getContentPane().add(textoIdentidad);
        textoIdentidad.setBounds(150, 110, 240, 30);

        textoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoUsuarioKeyTyped(evt);
            }
        });
        getContentPane().add(textoUsuario);
        textoUsuario.setBounds(150, 160, 240, 30);
        getContentPane().add(textoConfirmarClave);
        textoConfirmarClave.setBounds(150, 260, 240, 30);
        getContentPane().add(textoClave);
        textoClave.setBounds(150, 210, 240, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Identidad ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 110, 130, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 160, 130, 30);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Clave");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 210, 130, 30);

        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 330, 530, 260);

        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel-button.png"))); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminar);
        botonEliminar.setBounds(423, 210, 110, 30);

        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/download-button.png"))); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregar);
        botonAgregar.setBounds(420, 110, 110, 30);

        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh-icon.png"))); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(botonModificar);
        botonModificar.setBounds(423, 160, 110, 30);

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/previous.png"))); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar);
        botonRegresar.setBounds(430, 610, 130, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add-user (3).png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(420, 10, 80, 70);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul-oscuro.jpeg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 580, 650);

        setSize(new java.awt.Dimension(591, 691));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        if(textoClave.getText().equals(textoConfirmarClave.getText())){
            validarModificar();
        }else{
            JOptionPane.showMessageDialog(null,"las contraseñas no coinciden");
        }
        
    }//GEN-LAST:event_botonModificarActionPerformed

    private void validarModificar(){
        if(textoClave.getText().equals("") || textoConfirmarClave.getText().equals("")){
            JOptionPane.showMessageDialog(null, "debe digitar las calves");
        }else{
            modificar();
        }
        
    }
    private void modificar(){
        if(tabla.getSelectedRow()>=0){
            String[] opciones={"SI","NO"};
            int confirmar=JOptionPane.showOptionDialog(this,"¿Desea modificar el regisro?", "Modificar", 0, 0, null, opciones, this);
            if(confirmar==JOptionPane.YES_OPTION){
                for (UsuarioAdministrativo usuarioAdministrativo: listaAdministrador) {
                    if(textoIdentidad.getText().equals(usuarioAdministrativo.getIdentidad())){
                        usuarioAdministrativo.setIdentidad(textoIdentidad.getText().trim());
                        usuarioAdministrativo.setUser(textoUsuario.getText().trim());
                        usuarioAdministrativo.setPassword(textoClave.getText());
                    }
                    
                }
                manejoArchivo.agregarUsuario(listaAdministrador, "usuariosAdministrativo.guardar");
                verTabla();
            }
        }else{
            JOptionPane.showMessageDialog(null,"debe selecciona una fila a modificar");
        }
    }
    
    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        validarCampos();
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void validarCampos(){
        if(textoIdentidad.getText().trim().equals("") || textoUsuario.getText().trim().equals("") || textoClave.getText().equals("") || textoClave.getText().equals("") ){
            JOptionPane.showMessageDialog(null,"debe llenar todos los campos");
        }else{
            agregarUsuario();
        }
    }
    private void agregarUsuario(){

        int contador=0;
        for (int i=0; i <tabla.getRowCount(); i++) {
            if(textoIdentidad.getText().trim().equals(tabla.getValueAt(i, 0)) || textoUsuario.getText().trim().equals(tabla.getValueAt(i, 1))){
                contador=1;
            }
            
        }
        
        if(contador==0){
                if(textoClave.getText().equals(textoConfirmarClave.getText())){
                    UsuarioAdministrativo  usuarioAdministrativo=new   UsuarioAdministrativo(textoIdentidad.getText().trim(),textoUsuario.getText().trim(),textoClave.getText());
                    listaAdministrador.add(usuarioAdministrativo);
                     manejoArchivo.agregarUsuario(listaAdministrador, "usuariosAdministrativo.guardar");
                    verTabla();
                    limpiar();
                }else{
                    JOptionPane.showMessageDialog(null,"las contraseñas no son iguales");
                }
    
        }else{
            JOptionPane.showMessageDialog(null,"ya existe un registro con este codigo");
        }
        
        
    }
    
    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
       eliminar();
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void eliminar(){
        if(tabla.getSelectedRow()>=0){
            String[] opciones={"si","no"};
            int confirmacion=JOptionPane.showOptionDialog(this, "¿desea eliminar el usuario?", "Eliminar usuario", 0, 0, null, opciones, this);
            if (confirmacion==JOptionPane.YES_OPTION) {
                listaAdministrador.remove(tabla.getSelectedRow());
                manejoArchivo.agregarUsuario(listaAdministrador, "usuariosAdministrativo.guardar");
                verTabla();
                limpiar();
            }
        }else{
            JOptionPane.showMessageDialog(null, "debe seleccionar una fila a eliminar");
        }

    }
    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        CrearUsuarios crearUsuarios=new CrearUsuarios();
        crearUsuarios.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void textoIdentidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoIdentidadKeyTyped
       String validacionUno=String.valueOf(evt.getKeyChar());
       int validacionDos=textoIdentidad.getText().length();
       if(validacionUno.matches("[0-9]")){
       }else{
           evt.consume();
       }
       if(validacionDos>=10){
          JOptionPane.showMessageDialog(null, "no se permiten mas de 10 numeros");
       }
    }//GEN-LAST:event_textoIdentidadKeyTyped

    private void textoUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoUsuarioKeyTyped

       int validacionDos=textoIdentidad.getText().length();
       if(validacionDos>=20){
          JOptionPane.showMessageDialog(null, "no se permiten mas de 20 numeros");
       }        
    }//GEN-LAST:event_textoUsuarioKeyTyped

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
       textoIdentidad.setText(""+tabla.getValueAt(tabla.getSelectedRow(), 0));
       textoUsuario.setText(""+tabla.getValueAt(tabla.getSelectedRow(), 1));
    }//GEN-LAST:event_tablaMouseClicked

    private void verTabla(){
      listaAdministrador=manejoArchivo.verUsuariosAdministrativos("usuariosAdministrativo.guardar");
      DefaultTableModel modelo=new DefaultTableModel();
      String[] columnas={"codigo","Nombre"};
      modelo.setColumnIdentifiers(columnas);
      String[] filas;
        for (UsuarioAdministrativo usuarioAdministrador: listaAdministrador) {
            filas=new String[columnas.length];
            filas[0]=usuarioAdministrador.getIdentidad();
            filas[1]=usuarioAdministrador.getUser();
            modelo.addRow(filas);
        }
        tabla.setModel(modelo);
    }
    private void limpiar(){
        textoIdentidad.setText("");
        textoUsuario.setText("");
        textoClave.setText("");
        textoConfirmarClave.setText("");
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
            java.util.logging.Logger.getLogger(CrearUsuarioAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarioAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarioAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarioAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuarioAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JPasswordField textoClave;
    private javax.swing.JPasswordField textoConfirmarClave;
    private javax.swing.JTextField textoIdentidad;
    private javax.swing.JTextField textoUsuario;
    // End of variables declaration//GEN-END:variables
}
