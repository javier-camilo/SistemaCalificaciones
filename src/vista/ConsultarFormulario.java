
package vista;

import clases.Docente;
import clases.Estudiante;
import clases.ManejoArchivo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultarFormulario extends javax.swing.JFrame {


    ManejoArchivo manejoArchivo=new ManejoArchivo();
    ArrayList<Docente> listadoDocente=new ArrayList<>();
    ArrayList<Estudiante> listaEstudiante=new ArrayList<>();
    ArrayList<Docente> listaDocenteFiltrada;
    ArrayList<Estudiante> listadoEstudianteFiltrada;
     
    public ConsultarFormulario() {
        initComponents();
        iniciar();
    }
    
    private void iniciar(){
        //inicio de estudiante
        verTablaEstudiante(); 
        
        //inicio de la tabla docente

        verTablaDocente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelApellidos = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelEdad = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiante = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDocente = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        docenteNombre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        docenteApellido = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        docenteTelefono = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        docenteEdad = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        docenteAsignatura = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textoFiltroDocente = new javax.swing.JTextField();
        botonFiltrarDocente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonFiltrar = new javax.swing.JButton();
        textoFiltro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        botonRefrescar = new javax.swing.JButton();
        botonRegresarTabla = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estudiante", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.setLayout(null);
        jPanel1.add(labelNombre);
        labelNombre.setBounds(160, 20, 210, 40);

        jLabel4.setText("Nombres");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 20, 130, 40);
        jPanel1.add(labelApellidos);
        labelApellidos.setBounds(160, 70, 210, 40);

        jLabel6.setText("Apellidos");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 70, 130, 40);
        jPanel1.add(labelTelefono);
        labelTelefono.setBounds(160, 120, 210, 40);

        jLabel8.setText("Telefono ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 120, 130, 40);
        jPanel1.add(labelEdad);
        labelEdad.setBounds(160, 180, 210, 40);

        jLabel10.setText("Edad");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 180, 130, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 50, 420, 260);

        tablaEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEstudianteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEstudiante);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(500, 50, 580, 270);

        tablaDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDocenteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaDocente);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(500, 390, 580, 270);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Docente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel2.setLayout(null);
        jPanel2.add(docenteNombre);
        docenteNombre.setBounds(160, 20, 210, 40);

        jLabel5.setText("Nombres");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 20, 130, 40);
        jPanel2.add(docenteApellido);
        docenteApellido.setBounds(160, 70, 210, 40);

        jLabel7.setText("Apellidos");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 70, 130, 40);
        jPanel2.add(docenteTelefono);
        docenteTelefono.setBounds(160, 120, 210, 40);

        jLabel9.setText("Telefono ");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 120, 130, 40);
        jPanel2.add(docenteEdad);
        docenteEdad.setBounds(160, 180, 210, 40);

        jLabel11.setText("Edad");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 180, 130, 40);
        jPanel2.add(docenteAsignatura);
        docenteAsignatura.setBounds(160, 220, 210, 40);

        jLabel12.setText("Edad");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(20, 220, 130, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 390, 420, 270);

        textoFiltroDocente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoFiltroDocenteKeyTyped(evt);
            }
        });
        getContentPane().add(textoFiltroDocente);
        textoFiltroDocente.setBounds(670, 350, 150, 30);

        botonFiltrarDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/funnel (1).png"))); // NOI18N
        botonFiltrarDocente.setText("Filtrar");
        botonFiltrarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFiltrarDocenteActionPerformed(evt);
            }
        });
        getContentPane().add(botonFiltrarDocente);
        botonFiltrarDocente.setBounds(840, 350, 100, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtrar por codigo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(500, 350, 150, 30);

        botonFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/funnel (1).png"))); // NOI18N
        botonFiltrar.setText("Filtrar");
        botonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFiltrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonFiltrar);
        botonFiltrar.setBounds(810, 10, 110, 30);

        textoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoFiltroActionPerformed(evt);
            }
        });
        textoFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoFiltroKeyTyped(evt);
            }
        });
        getContentPane().add(textoFiltro);
        textoFiltro.setBounds(660, 10, 140, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filtrar por codigo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 20, 150, 20);

        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar);
        botonRegresar.setBounds(973, 680, 110, 23);

        botonRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh-icon.png"))); // NOI18N
        botonRefrescar.setText("Refrescar");
        botonRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRefrescarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRefrescar);
        botonRefrescar.setBounds(950, 350, 110, 30);

        botonRegresarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh-icon.png"))); // NOI18N
        botonRegresarTabla.setText("refresacar");
        botonRegresarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarTablaActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresarTabla);
        botonRegresarTabla.setBounds(930, 10, 111, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul-oscuro.jpeg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1100, 720);

        setBounds(0, 0, 1118, 752);
    }// </editor-fold>//GEN-END:initComponents

    private void textoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoFiltroActionPerformed
    
    }//GEN-LAST:event_textoFiltroActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        OperacionAdministrativo operacionAdministrativo=new OperacionAdministrativo();
        operacionAdministrativo.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonFiltrarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFiltrarDocenteActionPerformed
        filtrarDocente();
    }//GEN-LAST:event_botonFiltrarDocenteActionPerformed

    private void botonRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRefrescarActionPerformed
      verTablaDocente();
    }//GEN-LAST:event_botonRefrescarActionPerformed

    private void botonRegresarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarTablaActionPerformed
      verTablaEstudiante();
    }//GEN-LAST:event_botonRegresarTablaActionPerformed

    private void botonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFiltrarActionPerformed
        filtrarEstudiante();
    }//GEN-LAST:event_botonFiltrarActionPerformed

    private void tablaEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEstudianteMouseClicked
        labelNombre.setText(listaEstudiante.get(tablaEstudiante.getSelectedRow()).getNombre());
        labelApellidos.setText(listaEstudiante.get(tablaEstudiante.getSelectedRow()).getApellido());
        labelTelefono.setText(listaEstudiante.get(tablaEstudiante.getSelectedRow()).getTelefono());
        labelEdad.setText(listaEstudiante.get(tablaEstudiante.getSelectedRow()).getEdad());
    }//GEN-LAST:event_tablaEstudianteMouseClicked

    private void tablaDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDocenteMouseClicked

        docenteNombre.setText(""+tablaDocente.getValueAt(tablaDocente.getSelectedRow(), 1));
        docenteApellido.setText(""+tablaDocente.getValueAt(tablaDocente.getSelectedRow(), 2));
        docenteTelefono.setText(""+tablaDocente.getValueAt(tablaDocente.getSelectedRow(), 3));
        docenteEdad.setText(""+tablaDocente.getValueAt(tablaDocente.getSelectedRow(), 4));
        docenteAsignatura.setText(""+tablaDocente.getValueAt(tablaDocente.getSelectedRow(), 5));
    }//GEN-LAST:event_tablaDocenteMouseClicked

    private void textoFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoFiltroKeyTyped

       int validacion=textoFiltro.getText().length();
       String limitar=String.valueOf(evt.getKeyChar());
       if(limitar.matches("[0-9]")){ 
        }else{
            evt.consume();
        }
        if(validacion>=10){
            JOptionPane.showMessageDialog(null,"no se permiten mas de 10 caracteres");
            evt.consume();
        }
    }//GEN-LAST:event_textoFiltroKeyTyped

    private void textoFiltroDocenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoFiltroDocenteKeyTyped

       int validacion=textoFiltroDocente.getText().length();
       String limitar=String.valueOf(evt.getKeyChar());
       if(limitar.matches("[0-9]")){ 
        }else{
            evt.consume();
        }
        if(validacion>=10){
            JOptionPane.showMessageDialog(null,"no se permiten mas de 10 caracteres");
            evt.consume();
        }
    }//GEN-LAST:event_textoFiltroDocenteKeyTyped


    
    private void verTablaDocente(){
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
     private void filtrarDocente(){
        listaDocenteFiltrada= new ArrayList<>();
        String filtro=textoFiltroDocente.getText();
         for(Docente docente: listadoDocente){
            if(docente.getCodigo().toUpperCase().contains(filtro.toUpperCase())){
                listaDocenteFiltrada.add(docente);
            }
        }
        String[]  columnas={"Identificacion", "Nombres","Apellidos", "Telefono","Edad","Asignatura"};
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        String[] fila;
        for (Docente docente : listaDocenteFiltrada) {
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
        textoFiltroDocente.setText("");
     }
     
    private void verTablaEstudiante(){
        
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
      private void filtrarEstudiante(){
          
        listadoEstudianteFiltrada=new ArrayList<>();
        String filtro=textoFiltro.getText();
          for (Estudiante estudiante : listaEstudiante) {
              if(estudiante.getCodigo().toUpperCase().contains(filtro.toUpperCase())){
                  listadoEstudianteFiltrada.add(estudiante);
              }
          }
        String[] columnas={"CC","Nombres","Apellidos","telefono","edad"};
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        String[] fila;
        for (Estudiante estudiante: listadoEstudianteFiltrada) {
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
            java.util.logging.Logger.getLogger(ConsultarFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonFiltrar;
    private javax.swing.JButton botonFiltrarDocente;
    private javax.swing.JButton botonRefrescar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonRegresarTabla;
    private javax.swing.JLabel docenteApellido;
    private javax.swing.JLabel docenteAsignatura;
    private javax.swing.JLabel docenteEdad;
    private javax.swing.JLabel docenteNombre;
    private javax.swing.JLabel docenteTelefono;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JTable tablaDocente;
    private javax.swing.JTable tablaEstudiante;
    private javax.swing.JTextField textoFiltro;
    private javax.swing.JTextField textoFiltroDocente;
    // End of variables declaration//GEN-END:variables
}
