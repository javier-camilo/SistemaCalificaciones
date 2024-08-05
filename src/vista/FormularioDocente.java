
package vista;

import clases.Docente;
import clases.ManejoArchivo;
import clases.UsuarioDocente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormularioDocente extends javax.swing.JFrame {

    OperacionAdministrativo operacionAdministrativo;
    ManejoArchivo manejoArchivo;
    ArrayList<Docente> listadoDocente;
    ArrayList<UsuarioDocente> listaUsuarios=new ArrayList<>();
    ArrayList<UsuarioDocente> listaUsuariosNueva;
    
    
    public FormularioDocente() {
        initComponents();
        iniciar();
    }
    
    private void iniciar(){
        listadoDocente= new ArrayList<>();
        manejoArchivo=new ManejoArchivo();
        verTabla();
        
        comboEdad.addItem("SELECCIONAR");
        for (int i = 1; i <=90; i++) {
           comboEdad.addItem(""+i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        textoIdentificacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textoApellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textoTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboEdad = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comboAsignatura = new javax.swing.JComboBox<>();
        botonRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDocente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Numero de Identificacion");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 120, 140, 40);

        textoIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoIdentificacionKeyTyped(evt);
            }
        });
        getContentPane().add(textoIdentificacion);
        textoIdentificacion.setBounds(200, 130, 150, 30);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombres");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 190, 80, 40);

        textoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoNombreKeyTyped(evt);
            }
        });
        getContentPane().add(textoNombre);
        textoNombre.setBounds(200, 190, 150, 30);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Apellidos");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 240, 80, 40);

        textoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(textoApellido);
        textoApellido.setBounds(200, 250, 150, 30);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Telefono");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 310, 80, 40);

        textoTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(textoTelefono);
        textoTelefono.setBounds(200, 310, 150, 30);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Edad");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 380, 80, 40);

        getContentPane().add(comboEdad);
        comboEdad.setBounds(200, 390, 130, 20);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("asignatura");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 440, 60, 30);

        comboAsignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "INGLES", "ESPAÑOL", "SOCIALES", "MATEMATICAS", "EDUCACION FISICA", "RELIGION" }));
        getContentPane().add(comboAsignatura);
        comboAsignatura.setBounds(200, 440, 130, 20);

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/previous.png"))); // NOI18N
        botonRegresar.setText("regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar);
        botonRegresar.setBounds(40, 550, 130, 30);

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("               Formulario Docente");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 20, 320, 50);

        tablaDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDocenteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDocente);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(370, 130, 452, 350);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(570, 20, 80, 60);

        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregar);
        botonAgregar.setBounds(370, 490, 107, 30);

        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(botonModificar);
        botonModificar.setBounds(490, 490, 120, 30);

        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconmonstr-trash-can-14-32.png"))); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminar);
        botonEliminar.setBounds(620, 490, 140, 30);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul-oscuro.jpeg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 840, 620);

        setSize(new java.awt.Dimension(852, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
       operacionAdministrativo=new OperacionAdministrativo();
       operacionAdministrativo.setVisible(true);
       dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void tablaDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDocenteMouseClicked
        textoIdentificacion.setText(""+tablaDocente.getValueAt(tablaDocente.getSelectedRow(), 0));
        textoNombre.setText(""+tablaDocente.getValueAt(tablaDocente.getSelectedRow(), 1));
        textoApellido.setText(""+tablaDocente.getValueAt(tablaDocente.getSelectedRow(), 2));
        textoTelefono.setText(""+tablaDocente.getValueAt(tablaDocente.getSelectedRow(), 3));
        comboEdad.setSelectedItem(""+tablaDocente.getValueAt(tablaDocente.getSelectedRow(), 4));
        comboAsignatura.setSelectedItem(""+tablaDocente.getValueAt(tablaDocente.getSelectedRow(), 5));
    }//GEN-LAST:event_tablaDocenteMouseClicked

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
   
        if(tablaDocente.getSelectedRow()<0){
           JOptionPane.showMessageDialog(null, "debe seleccionar una fila a modificar");
       }else{ 
           modificar();
       }
       
    }//GEN-LAST:event_botonModificarActionPerformed

    private void modificar(){
        String[] opciones={"SI","NO"};
        int confirmar=JOptionPane.showOptionDialog(null,"¿Desea modificar registro?","Modificar", 0, 0, null, opciones, this);
        if(confirmar==JOptionPane.YES_OPTION){
                        for (Docente docente : listadoDocente) {
                            if(docente.getCodigo().equals(textoIdentificacion.getText().trim())){
                                docente.setNombre(textoNombre.getText().trim());
                                docente.setApellido(textoApellido.getText().trim());
                                docente.setTelefono(textoTelefono.getText().trim());
                                docente.setEdad(comboEdad.getSelectedItem().toString());
                                docente.setAsignatura(comboAsignatura.getSelectedItem().toString());
                            }
                        }
                            manejoArchivo.agregarDocentesListado(listadoDocente,"docente.guardar");
                            verTabla();
        }
    }
   
   
    
    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
       if(tablaDocente.getSelectedRow()<0){
           JOptionPane.showMessageDialog(null, "debe seleccionar una fila a eliminar");
       }else{ 
           eliminar();
       }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void eliminar(){
        String[] opciones={"SI","NO"};
        int confirmar=JOptionPane.showOptionDialog(null,"¿Desea eliminar el registro?","Eliminar", 0, 0, null, opciones, this);
        if(confirmar==JOptionPane.YES_OPTION){
            

            //eliminar formulario
            listadoDocente.remove(tablaDocente.getSelectedRow());
            manejoArchivo.agregarDocentesListado(listadoDocente,"docente.guardar");
            
            try{
            //eliminar usuario
                listaUsuarios=manejoArchivo.verUsuariosDocentes("usuariosDocentes.guardar");
                listaUsuariosNueva=new ArrayList<>();
                for (UsuarioDocente usuarioDocente : listaUsuarios) {
                    if(usuarioDocente.getIdentidad().equals(textoIdentificacion.getText())){
                    }else{
                        listaUsuariosNueva.add(usuarioDocente);
                    }
                }
                manejoArchivo.agregarUsuarioDocente(listaUsuariosNueva, "usuariosDocentes.guardar");
            }catch(Exception error){
                JOptionPane.showMessageDialog(null, "Error al eliminar el usuario");
            }
            
            verTabla();
            limpiar();
        }
    }
    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
      validarGuardar();
    }//GEN-LAST:event_botonAgregarActionPerformed

    //validarCampos
    private void validarGuardar(){
        if(textoIdentificacion.getText().trim().equals("") || textoNombre.getText().trim().equals("") || textoApellido.getText().trim().equals("") || textoTelefono.getText().trim().equals("") || comboEdad.getSelectedItem().equals("SELECCIONAR") || comboAsignatura.getSelectedItem().equals("SELECCIONAR")){
            JOptionPane.showMessageDialog(null,"debe llenar todos los campos");
        }else{
            agregarDatosValidar();
        }
    }
    
    //agregar datos al registro 
        private void agregarDatosValidar(){
            
            int contadorCodigo=0, contadorMateria=0;
            
            for (int i = 0; i <tablaDocente.getRowCount(); i++) {
                if(textoIdentificacion.getText().trim().equals(tablaDocente.getValueAt(i, 0))){
                    contadorCodigo=1;
                }
                if(comboAsignatura.getSelectedItem().equals(tablaDocente.getValueAt(i, 5))){
                    contadorMateria=1;
                }
            }
            
            if(contadorCodigo==1){
                JOptionPane.showMessageDialog(null,"ya existe un registro con el codigo: "+textoIdentificacion.getText().trim());
            }
            if(contadorMateria==1){
                JOptionPane.showMessageDialog(null, "no se permiten mas de dos profesores por asignatura");
            }
            
            if(contadorCodigo==0 && contadorMateria==0){
                agregarListado();
            }

        }

        //agregar datos si se valido
            private void agregarListado(){
                Docente docente=new Docente(textoIdentificacion.getText().trim(),textoNombre.getText().trim(),textoApellido.getText().trim(),textoTelefono.getText().trim(),comboEdad.getSelectedItem().toString(),comboAsignatura.getSelectedItem().toString());
                listadoDocente.add(docente);
                manejoArchivo.agregarDocentesListado(listadoDocente,"docente.guardar");
                verTabla();
                limpiar();
            }
    
    private void textoIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoIdentificacionKeyTyped
       int validacion=textoIdentificacion.getText().length();
       String limitar=String.valueOf(evt.getKeyChar());
       if(limitar.matches("[0-9]")){ 
        }else{
            evt.consume();
        }
        if(validacion>=10){
            JOptionPane.showMessageDialog(null,"no se permiten mas de 10 caracteres");
            evt.consume();
        }
    }//GEN-LAST:event_textoIdentificacionKeyTyped

    private void textoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNombreKeyTyped
        int validacion=textoNombre.getText().length();
        String limitar=String.valueOf(evt.getKeyChar());
        if(limitar.matches("[a-zA-Z ]")){ 
        }else{
            evt.consume();
        }
        if(validacion>=15){
            JOptionPane.showMessageDialog(null,"no se permiten mas de 10 caracteres");
            evt.consume();
        }
    }//GEN-LAST:event_textoNombreKeyTyped

    private void textoApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoApellidoKeyTyped
        int validacion=textoApellido.getText().length();
        String limitar=String.valueOf(evt.getKeyChar());
        if(limitar.matches("[a-zA-Z ]")){ 
        }else{
            evt.consume();
        }
        if(validacion>15){
            JOptionPane.showMessageDialog(null,"no se permiten mas de 15 caracteres");
            evt.consume();
        }
    }//GEN-LAST:event_textoApellidoKeyTyped

    private void textoTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoTelefonoKeyTyped
        int validacion=textoTelefono.getText().length();
        String limitar=String.valueOf(evt.getKeyChar());
        if(limitar.matches("[0-9]")){ 
        }else{
            evt.consume();
        }
        if(validacion>10){
            JOptionPane.showMessageDialog(null,"no se permiten mas de 10 caracteres");
            evt.consume();
        }
    }//GEN-LAST:event_textoTelefonoKeyTyped

    private void verTabla(){
        listadoDocente=manejoArchivo.verListadoDocente("docente.guardar");
        String[]  columnas={"Identificacion", "Nombres","Apellidos", "Telefono","Edad","Asignatura"};
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        String[] fila;
        for (Docente docente : listadoDocente) {
            fila=new String[columnas.length];
            fila[0]=docente.getCodigo();
            fila[1]=docente.getNombre();
            fila[2]=docente.getApellido();
            fila[3]=docente.getTelefono();
            fila[4]=docente.getEdad();
            fila[5]=docente.getAsignatura();
            modelo.addRow(fila);
        }
        tablaDocente.setModel(modelo);     
    }
    private void limpiar(){
        textoIdentificacion.setText("");
        textoNombre.setText("");
        textoApellido.setText("");
        textoTelefono.setText("");
        comboEdad.setSelectedItem("SELECCIONAR");
        comboAsignatura.setSelectedItem("SELECCIONAR");
        
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
            java.util.logging.Logger.getLogger(FormularioDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JComboBox<String> comboAsignatura;
    private javax.swing.JComboBox<String> comboEdad;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDocente;
    private javax.swing.JTextField textoApellido;
    private javax.swing.JTextField textoIdentificacion;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoTelefono;
    // End of variables declaration//GEN-END:variables
}
