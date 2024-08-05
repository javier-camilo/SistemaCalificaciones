
package vista;

import clases.Docente;
import clases.ManejoArchivo;
import clases.UsuarioDocente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CrearUsuarioProfesor extends javax.swing.JFrame {

    ArrayList<UsuarioDocente> listadoUsuarios;
    ArrayList<Docente> listaDocente;
    ManejoArchivo manejoArchivo;
    
    public CrearUsuarioProfesor() {
        initComponents();
        iniciar();
    }
    
    private void iniciar(){
        listadoUsuarios= new ArrayList<>();
        listaDocente=new ArrayList<>();
        manejoArchivo= new ManejoArchivo();
        verTabla();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        botonAgregar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textoCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textoClave = new javax.swing.JPasswordField();
        textoConfirmarClave = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/download-button.png"))); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh-icon.png"))); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel-button.png"))); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        jLabel2.setText("Indentificacion");

        jLabel4.setText("confirmar Clave");

        jLabel5.setText("clave");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoCodigo)
                    .addComponent(textoConfirmarClave, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(textoClave))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(textoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonModificar)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(38, 38, 38))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonEliminar)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(textoConfirmarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 90, 490, 150);

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("          Crear Usuario Docente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 20, 310, 40);

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/previous.png"))); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar);
        botonRegresar.setBounds(410, 540, 120, 30);

        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
        });
        tablaUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tablaUsuariosKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 260, 490, 260);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add-user (4).png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(410, 10, 80, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul-oscuro.jpeg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -6, 560, 590);

        setSize(new java.awt.Dimension(574, 617));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
       CrearUsuarios crearUsuarios=new CrearUsuarios();
       crearUsuarios.setVisible(true);
       dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
      iniciarValidacionAgregar();
    }//GEN-LAST:event_botonAgregarActionPerformed

    //validar todos los campos llenos uy que las contraseñas sean iguales
    private void iniciarValidacionAgregar(){
        if(textoCodigo.getText().equals("") || textoClave.getText().equals("") || textoConfirmarClave.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe llenar todos los campos");
        }else{
            if( textoClave.getText().equals(textoConfirmarClave.getText())){
                agregar(); 
            }else{
               JOptionPane.showMessageDialog(null,"las contraseñas no coinciden");
            }
            
        }
    }
    
    //VALIDAR SI EXISTE
        private void agregar(){
            int contador=0;
            listaDocente=manejoArchivo.verListadoDocente("docente.guardar");
            for (Docente docente : listaDocente) {
                if(docente.getCodigo().equals(textoCodigo.getText().trim())){
                    contador=1;
                }
            }
            if(contador==0){
                JOptionPane.showMessageDialog(null,"solo se pueden crear usuarios a profesores registrados");
            }else{
                AgregarUsuarioProfesor();
            }


        }

        //AGREGAR AL LISTADO 
        private void AgregarUsuarioProfesor(){
            
            //validar que no esten repetidos
            
            int contador=0;
            for (int i = 0; i < tablaUsuarios.getRowCount(); i++) {
                if(textoCodigo.getText().trim().equals(tablaUsuarios.getValueAt(i, 0))){
                   contador=1;
                } 
            }
          
            if(contador==1){
                JOptionPane.showMessageDialog(null, "ya existe un usuario con: "+textoCodigo.getText());
            }
            if(contador==0){
                UsuarioDocente usuarioDocente=new UsuarioDocente(textoCodigo.getText().trim(),textoCodigo.getText(),textoClave.getText());
                listadoUsuarios.add(usuarioDocente);
                manejoArchivo.agregarUsuarioDocente(listadoUsuarios, "usuariosDocentes.guardar");
                verTabla();
                limpiar();
            }
        }
        
        
    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
       if(tablaUsuarios.getSelectedRow()<0){
           JOptionPane.showMessageDialog(null, "Debe seleccionar una fila a modificar");
       }else{
          if(textoClave.getText().equals("")){
              JOptionPane.showMessageDialog(null, "debe llenar las contraseñas");
          }else{
             validarModificar();
          }
          
       }
    }//GEN-LAST:event_botonModificarActionPerformed

    //validacion
    private void validarModificar(){
        if(textoClave.getText().equals(textoConfirmarClave.getText())){
            modificar();
        }else{
            JOptionPane.showMessageDialog(null, "las contraseñas no coinciden");
        }
    }
    //AGREGAR SI SE CUMPLE LA VALIDACION XD
        private void modificar(){
            String[] opciones={"si","no"};
            int confirmacion=JOptionPane.showOptionDialog(this, "¿desea modificar?", "Modificar usuario", 0, 0, null, opciones, this);
            if (confirmacion==JOptionPane.YES_OPTION) {
                    for (UsuarioDocente usuarioDocente : listadoUsuarios) {
                        if(usuarioDocente.getIdentidad().equals(textoCodigo.getText().trim())){
                                usuarioDocente.setPassword(textoClave.getText());
                        }
                    }
                    manejoArchivo.agregarUsuarioDocente(listadoUsuarios, "usuariosDocentes.guardar");
                    verTabla();
                    limpiar();
            }
        }
        
    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        eliminarValidar();
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void eliminarValidar(){
        if(tablaUsuarios.getSelectedRow()>=0){
            String[] opciones={"si","no"};
            int confirmacion=JOptionPane.showOptionDialog(this, "¿desea eliminar el usuario?", "Eliminar usuario", 0, 0, null, opciones, this);
            if (confirmacion==JOptionPane.YES_OPTION) {
                listadoUsuarios.remove(tablaUsuarios.getSelectedRow());
                manejoArchivo.agregarUsuarioDocente(listadoUsuarios, "usuariosDocentes.guardar");
                verTabla();
                limpiar();
            }
        }else{
            JOptionPane.showMessageDialog(null, "debe seleccionar una fila a eliminar :3");
        }
    }
    private void tablaUsuariosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaUsuariosKeyTyped
      
    }//GEN-LAST:event_tablaUsuariosKeyTyped

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked
        textoCodigo.setText(""+tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(),0));
        textoClave.setText("");
        textoConfirmarClave.setText("");
    }//GEN-LAST:event_tablaUsuariosMouseClicked


    private void limpiar(){
        textoCodigo.setText("");
        textoClave.setText("");
        textoConfirmarClave.setText("");
    }
    private void verTabla(){
        listadoUsuarios=manejoArchivo.verUsuariosDocentes("usuariosDocentes.guardar");
        DefaultTableModel modelo=new DefaultTableModel();
        String[] columnas={"user","clave"};
        modelo.setColumnIdentifiers(columnas);
        String[] filas;
        for (UsuarioDocente usuarioDocente: listadoUsuarios) {
            filas=new String[columnas.length];
            filas[0]=usuarioDocente.getUser();
            filas[1]=usuarioDocente.getPassword();
            modelo.addRow(filas);
        }
        tablaUsuarios.setModel(modelo);
        
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
            java.util.logging.Logger.getLogger(CrearUsuarioProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarioProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarioProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarioProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuarioProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JPasswordField textoClave;
    private javax.swing.JTextField textoCodigo;
    private javax.swing.JPasswordField textoConfirmarClave;
    // End of variables declaration//GEN-END:variables
}
