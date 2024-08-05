
package vista;

import clases.Estudiante;
import clases.ManejoArchivo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormularioEstudiante extends javax.swing.JFrame {

    OperacionAdministrativo operacionAdministrativo;
    ManejoArchivo manejoArchivo;
    ArrayList<Estudiante> listaEstudiante;
    
    public FormularioEstudiante() {
        initComponents();
        inicializar();
    }
    
    //inicializar para arrancar con el constructor
    
    private void inicializar(){
        for (int i = 1; i <=50; i++) {
            comboEdadEstudiante.addItem(""+i);
        }
        
        listaEstudiante=new ArrayList<>();
        manejoArchivo=new ManejoArchivo();
        ver();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoIdentificacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textoNombreEstudiante = new javax.swing.JTextField();
        textoApellidoEstudiante = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textoTelefonoEstudiante = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboEdadEstudiante = new javax.swing.JComboBox<>();
        botonRegresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiante = new javax.swing.JTable();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        textoIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoIdentificacionKeyTyped(evt);
            }
        });
        getContentPane().add(textoIdentificacion);
        textoIdentificacion.setBounds(200, 140, 150, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Numero de Identificacion");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 130, 150, 40);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombres");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 200, 80, 40);

        textoNombreEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoNombreEstudianteKeyTyped(evt);
            }
        });
        getContentPane().add(textoNombreEstudiante);
        textoNombreEstudiante.setBounds(200, 200, 150, 30);

        textoApellidoEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoApellidoEstudianteKeyTyped(evt);
            }
        });
        getContentPane().add(textoApellidoEstudiante);
        textoApellidoEstudiante.setBounds(200, 260, 150, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 250, 80, 40);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 320, 80, 40);

        textoTelefonoEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoTelefonoEstudianteKeyTyped(evt);
            }
        });
        getContentPane().add(textoTelefonoEstudiante);
        textoTelefonoEstudiante.setBounds(200, 320, 150, 30);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edad");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 400, 80, 40);

        getContentPane().add(comboEdadEstudiante);
        comboEdadEstudiante.setBounds(200, 400, 80, 30);

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/previous.png"))); // NOI18N
        botonRegresar.setText("regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar);
        botonRegresar.setBounds(10, 520, 150, 40);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("                    Formulario Estudiante");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(250, 20, 370, 70);

        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        botonGuardar.setText("guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardar);
        botonGuardar.setBounds(390, 510, 120, 30);

        tablaEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEstudianteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEstudiante);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(390, 130, 452, 350);

        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        botonModificar.setText("modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(botonModificar);
        botonModificar.setBounds(530, 510, 120, 30);

        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconmonstr-trash-can-14-32.png"))); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminar);
        botonEliminar.setBounds(670, 510, 110, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(580, 30, 100, 60);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul-oscuro.jpeg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, -30, 870, 630);

        setSize(new java.awt.Dimension(884, 611));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
       operacionAdministrativo=new OperacionAdministrativo();
       operacionAdministrativo.setVisible(true);
       dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        if(textoNombreEstudiante.getText().trim().equals("")|| textoIdentificacion.getText().trim().equals("") || textoApellidoEstudiante.getText().trim().equals("") || textoTelefonoEstudiante.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "debe llenar todos los datos :3");
        }else{
            agregar();
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void agregar(){
        //valida que no haya datos repetidos 
        int contador=0;
        for (int i = 0; i < tablaEstudiante.getRowCount(); i++) {
            if(textoIdentificacion.getText().trim().equals(tablaEstudiante.getValueAt(i, 0))){
                contador=1;
            }
        }
        if(contador==1){
            JOptionPane.showMessageDialog(null, "este registro ya existe");
        }else{
            //grabar datos
            
            Estudiante estudiante=new Estudiante(textoIdentificacion.getText().trim(),textoNombreEstudiante.getText().trim(),textoApellidoEstudiante.getText().trim(),textoTelefonoEstudiante.getText().trim(),comboEdadEstudiante.getSelectedItem().toString());
               //inciar notas en cero
               
                double[] vectorNotas=new double[3];
                vectorNotas[0]=0;
                vectorNotas[1]=0;
                vectorNotas[2]=0;
                
                //inicializar notas de materias parciales
                estudiante.setNotaIngles(vectorNotas); estudiante.setNotaEducacionFisica(vectorNotas); estudiante.setNotaEspañol(vectorNotas);
                estudiante.setNotaIngles(vectorNotas);estudiante.setNotaMatematicas(vectorNotas);estudiante.setNotaReligion(vectorNotas);
                //inicializar definitivas
                estudiante.setNotaSociales(vectorNotas);estudiante.setDefinitivaEspañol(0);estudiante.setDefinitivaFisica(0);
                estudiante.setDefinitivaIngles(0);estudiante.setDefinitivaMatematicas(0);estudiante.setDefinitivaReligion(0);
                
             //agregar el estudiante
            listaEstudiante.add(estudiante);
            manejoArchivo.agregarEstudianteListado(listaEstudiante, "estudiante.guardar");
            ver();
            limpiar();
        }
    }
    
    private void ver(){
        listaEstudiante=manejoArchivo.verListaEstudiantes("estudiante.guardar");
        String[] columnas={"CC","Nombres","Apellidos","telefono","edad"};
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        String[] fila;
        for (Estudiante estudiante: listaEstudiante) {
           fila=new String[columnas.length];
           fila[0]=estudiante.getCodigo();
           fila[1]=estudiante.getNombre();
           fila[2]=estudiante.getApellido();
           fila[3]=estudiante.getTelefono();
           fila[4]=estudiante.getEdad();
           modelo.addRow(fila);
        }
        tablaEstudiante.setModel(modelo);
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

    private void textoTelefonoEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoTelefonoEstudianteKeyTyped
            int validacion=textoTelefonoEstudiante.getText().length();
            String limitar=String.valueOf(evt.getKeyChar());
            if(limitar.matches("[0-9]")){ 
            }else{
                evt.consume();
            }
            if(validacion>=10){
                JOptionPane.showMessageDialog(null,"no se permiten mas de 10 caracteres");
                evt.consume();
            }
    }//GEN-LAST:event_textoTelefonoEstudianteKeyTyped

    private void textoNombreEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNombreEstudianteKeyTyped
            int validacion=textoNombreEstudiante.getText().length();
            String limitar=String.valueOf(evt.getKeyChar());
            if(limitar.matches("[a-zA-Z ]")){ 
            }else{
                evt.consume();
            }
            if(validacion>=16){
                JOptionPane.showMessageDialog(null,"no se permiten mas de 16 caracteres");
                evt.consume();
            }
    }//GEN-LAST:event_textoNombreEstudianteKeyTyped

    private void textoApellidoEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoApellidoEstudianteKeyTyped
            
            int validacion=textoApellidoEstudiante.getText().length();
            String limitar=String.valueOf(evt.getKeyChar());
            if(limitar.matches("[a-zA-Z ]")){ 
            }else{
                evt.consume();
            }
            if(validacion>=16){
                JOptionPane.showMessageDialog(null,"no se permiten mas de 16 caracteres");
                evt.consume();
            }
    }//GEN-LAST:event_textoApellidoEstudianteKeyTyped

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
         modificar(); 
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
         eliminar();
    }//GEN-LAST:event_botonEliminarActionPerformed

    
    private void tablaEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEstudianteMouseClicked

        textoIdentificacion.setText(listaEstudiante.get(tablaEstudiante.getSelectedRow()).getCodigo());
        textoNombreEstudiante.setText(listaEstudiante.get(tablaEstudiante.getSelectedRow()).getNombre());
        textoApellidoEstudiante.setText(listaEstudiante.get(tablaEstudiante.getSelectedRow()).getApellido());
        textoTelefonoEstudiante.setText(listaEstudiante.get(tablaEstudiante.getSelectedRow()).getTelefono());
        comboEdadEstudiante.setSelectedItem(listaEstudiante.get(tablaEstudiante.getSelectedRow()).getEdad()); 
    }//GEN-LAST:event_tablaEstudianteMouseClicked


    
    // modificar tabla
    private void modificar(){
        if(tablaEstudiante.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null, "debe seleccionar una fila");
        }else{
     
            String[] columnas={"SI","NO"};
            int seleccion=JOptionPane.showOptionDialog(this, "¿Esta seguro que desea modificar el registro?", "Modificar", 0, 0, null, columnas, this);
            if(seleccion==JOptionPane.YES_OPTION){
                    for (Estudiante estudiante : listaEstudiante) {
                        if(estudiante.getCodigo().equals(textoIdentificacion.getText())){
                            estudiante.setNombre(textoNombreEstudiante.getText().trim());
                            estudiante.setApellido(textoApellidoEstudiante.getText().trim());
                            estudiante.setTelefono(textoTelefonoEstudiante.getText().trim());
                            estudiante.setEdad(comboEdadEstudiante.getSelectedItem().toString());
                        }

                    }
                    manejoArchivo.agregarEstudianteListado(listaEstudiante, "estudiante.guardar");
                    ver();
                    limpiar();
            }
        }
        
    }
    //boton de eliminar
    private void eliminar(){
        if(tablaEstudiante.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null, "debe seleccionar el registro a elminar");
        }else{
            
            String[] botones={"Si","Cancelar"};
            int confirmar=JOptionPane.showOptionDialog(this, "¿esta seguro de eliminar el registro?", "Eliminar", 0, 0, null, botones, this);
            if(confirmar==JOptionPane.YES_OPTION){
                listaEstudiante.remove(tablaEstudiante.getSelectedRow());
                manejoArchivo.agregarEstudianteListado(listaEstudiante,"estudiante.guardar");
                ver();
                limpiar();
            }
        }
    }

    //borrar los datos de las cajas de texto
    private void limpiar(){
        textoIdentificacion.setText("");
        textoNombreEstudiante.setText("");
        textoApellidoEstudiante.setText("");
        textoTelefonoEstudiante.setText("");
        comboEdadEstudiante.setSelectedItem("1"); 
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
            java.util.logging.Logger.getLogger(FormularioEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JComboBox<String> comboEdadEstudiante;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEstudiante;
    private javax.swing.JTextField textoApellidoEstudiante;
    private javax.swing.JTextField textoIdentificacion;
    private javax.swing.JTextField textoNombreEstudiante;
    private javax.swing.JTextField textoTelefonoEstudiante;
    // End of variables declaration//GEN-END:variables
}
