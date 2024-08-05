
package vista;

import clases.Docente;
import clases.Estudiante;
import clases.ManejoArchivo;
import clases.UsuarioDocente;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DigitarNota extends javax.swing.JFrame {

  
   
    ManejoArchivo manejoArchivo=new ManejoArchivo();;
    ArrayList<Estudiante> listaEstudiante=new ArrayList<>();
    ArrayList<Docente> listaDocente=new ArrayList<>();
    String usuarioTemporal;double definitiva;
    DecimalFormat decimalFormat=new DecimalFormat("0.00");
    
   
    
    public DigitarNota() {
        initComponents();
        inicializar();
    }
    
    private void inicializar(){
   
        iniciarUsuario();
        ver();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiante = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        labelMateria = new javax.swing.JLabel();
        textoNotaUno = new javax.swing.JTextField();
        textoNotaTres = new javax.swing.JTextField();
        textoNotaDos = new javax.swing.JTextField();
        labelCodigo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tablaEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEstudianteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEstudiante);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(480, 90, 500, 300);

        jPanel2.setLayout(null);

        jLabel1.setText("Materia");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 114, 60, 30);

        jLabel2.setText("Nota");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 50, 70, 50);

        jLabel3.setText("Primer periodo");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(80, 20, 110, 30);

        jLabel4.setText("Segundo periodo");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(200, 20, 110, 30);

        jLabel5.setText("Tercer periodo");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(320, 20, 100, 30);

        botonAgregar.setText("Agregar o modificar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(botonAgregar);
        botonAgregar.setBounds(270, 270, 150, 23);
        jPanel2.add(labelMateria);
        labelMateria.setBounds(80, 110, 180, 40);

        textoNotaUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNotaUnoActionPerformed(evt);
            }
        });
        textoNotaUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoNotaUnoKeyTyped(evt);
            }
        });
        jPanel2.add(textoNotaUno);
        textoNotaUno.setBounds(80, 60, 110, 30);

        textoNotaTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNotaTresActionPerformed(evt);
            }
        });
        textoNotaTres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoNotaTresKeyTyped(evt);
            }
        });
        jPanel2.add(textoNotaTres);
        textoNotaTres.setBounds(320, 60, 100, 30);

        textoNotaDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNotaDosActionPerformed(evt);
            }
        });
        textoNotaDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoNotaDosKeyTyped(evt);
            }
        });
        jPanel2.add(textoNotaDos);
        textoNotaDos.setBounds(200, 60, 110, 30);
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(120, 150, 180, 40);

        jLabel6.setText("Codigo Alumno");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 160, 100, 30);

        jLabel7.setText("Nombre alumno");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 210, 100, 30);
        jPanel2.add(labelNombre);
        labelNombre.setBounds(120, 200, 180, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 90, 440, 300);

        botonRegresar.setText("regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar);
        botonRegresar.setBounds(900, 440, 90, 23);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("                                        Digitar Notas");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 10, 380, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul-oscuro.jpeg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 1000, 470);

        setSize(new java.awt.Dimension(1012, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textoNotaUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNotaUnoActionPerformed
        
    }//GEN-LAST:event_textoNotaUnoActionPerformed

    private void textoNotaTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNotaTresActionPerformed
        
    }//GEN-LAST:event_textoNotaTresActionPerformed

    private void textoNotaDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNotaDosActionPerformed
        
    }//GEN-LAST:event_textoNotaDosActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        OperacionDocente OperacionDocente=new OperacionDocente();
        OperacionDocente.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        if(tablaEstudiante.getSelectedRow()>=0){
            agregar();
            limpiar();
        } else{
            JOptionPane.showMessageDialog(null, "debe seleccionar una fila");
        }
        
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void agregar() {
        double[] vector;
        for (Estudiante estudiante : listaEstudiante) {
            if(labelCodigo.getText().equals(estudiante.getCodigo())){
                   if(labelMateria.getText().equals("INGLES")){
                       vector=getNota();
                       estudiante.setNotaIngles(vector);
                       estudiante.setDefinitivaIngles(definitiva);
                   }
                   if(labelMateria.getText().equals("ESPAÑOL")){
                       vector=getNota();
                       estudiante.setNotaEspañol(vector);
                       estudiante.setDefinitivaEspañol(definitiva);
                   }
                   if(labelMateria.getText().equals("SOCIALES")){
                       vector=getNota();
                      estudiante.setNotaSociales(vector);
                      estudiante.setDefinitivaSociales(definitiva);
                   }
                   if(labelMateria.getText().equals("MATEMATICAS")){
                       vector=getNota();
                       estudiante.setNotaMatematicas(vector);
                       estudiante.setDefinitivaMatematicas(definitiva);
                   }
                   if(labelMateria.getText().equals("EDUCACION FISICA")){
                       vector=getNota();
                       estudiante.setNotaEducacionFisica(vector);
                       estudiante.setDefinitivaFisica(definitiva);
                   }
                   if(labelMateria.getText().equals("RELIGION")){
                       vector=getNota();
                       estudiante.setNotaReligion(vector);
                       estudiante.setDefinitivaReligion(definitiva);
                   }
               
            }
        }
        manejoArchivo.agregarEstudianteListado(listaEstudiante, "estudiante.guardar");
        ver();

    }
    //traer el vector con las notas
     private double[] getNota(){
         double[] vector=new double[3];
         try{
             if(textoNotaUno.getText().trim().equals("") || textoNotaUno.getText().trim().equals(".")){
                 textoNotaUno.setText("0");
             }
              if(textoNotaDos.getText().trim().equals("") || textoNotaDos.getText().trim().equals(".")){
                 textoNotaDos.setText("0");
             }

            if(textoNotaTres.getText().trim().equals("") || textoNotaTres.getText().trim().equals(".")){
                 textoNotaTres.setText("0");
             }

               
               vector[0]=Double.parseDouble(textoNotaUno.getText());
               vector[1]=Double.parseDouble(textoNotaDos.getText());
               vector[2]=Double.parseDouble(textoNotaTres.getText());
               definitiva=(vector[0]*0.3)+(vector[1]*0.3)+(vector[2]*0.4);
               return vector;
         }catch(Exception error){
             JOptionPane.showMessageDialog(null, "debe digitar bien los valores");
         }
         return vector;
     }
     
     //validar cuadros de texto
    private void tablaEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEstudianteMouseClicked
        labelCodigo.setText(""+tablaEstudiante.getValueAt(tablaEstudiante.getSelectedRow(), 0));
        labelNombre.setText(""+tablaEstudiante.getValueAt(tablaEstudiante.getSelectedRow(), 1));
        textoNotaUno.setText(""+tablaEstudiante.getValueAt(tablaEstudiante.getSelectedRow(), 2));
        textoNotaDos.setText(""+tablaEstudiante.getValueAt(tablaEstudiante.getSelectedRow(), 3));
        textoNotaTres.setText(""+tablaEstudiante.getValueAt(tablaEstudiante.getSelectedRow(), 4));
    }//GEN-LAST:event_tablaEstudianteMouseClicked

    private void textoNotaUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNotaUnoKeyTyped
       limitar(evt);
       if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.'){
           evt.consume();
       }
        if (evt.getKeyChar()=='.' &&  textoNotaUno.getText().contains(".")) {
            evt.consume();
        }
        if(textoNotaUno.getText().length()>3){
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se permiten más de 4 caracteres");
        }

        
    }//GEN-LAST:event_textoNotaUnoKeyTyped

    private void textoNotaDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNotaDosKeyTyped
       limitar(evt);
       if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.'){
           evt.consume();
       }
        if (evt.getKeyChar()=='.' &&  textoNotaDos.getText().contains(".")) {
            evt.consume();
        }
        
        if(textoNotaDos.getText().length()>3){
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se permiten más de 3 caracteres");
        }

    }//GEN-LAST:event_textoNotaDosKeyTyped

    private void textoNotaTresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNotaTresKeyTyped
       limitar(evt);
        if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.'){
           evt.consume();
       }
        if (evt.getKeyChar()=='.' &&  textoNotaTres.getText().contains(".")) {
            evt.consume();
        }
        
        if(textoNotaTres.getText().length()>3){
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se permiten más de 4 caracteres");
        }

    }//GEN-LAST:event_textoNotaTresKeyTyped

    private void limitar(java.awt.event.KeyEvent evt){
            String limitar=String.valueOf(evt.getKeyChar());
            if(limitar.matches("[0-9.]")){ 
            }else{
                evt.consume();
            }
    }
     private void ver(){
         
        listaEstudiante=manejoArchivo.verListaEstudiantes("estudiante.guardar");
        String[] columnas={"CC","Nombres","primer Corte","segundo cote","Tercer Corte","Definitiva"};
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        String[] fila;
        double[] vector=new double[3];
        for (Estudiante estudiante: listaEstudiante) {
               fila=new String[columnas.length];
               if(labelMateria.getText().equals("INGLES")){
                   vector=estudiante.getNotaIngles();
                   fila[5]=decimalFormat.format(estudiante.getDefinitivaIngles());
               }
               if(labelMateria.getText().equals("ESPAÑOL")){
                    vector=estudiante.getNotaEspañol();
                    fila[5]=decimalFormat.format(estudiante.getDefinitivaEspañol());
               }
               if(labelMateria.getText().equals("SOCIALES")){
                   vector=estudiante.getNotaSociales();
                   fila[5]=decimalFormat.format(estudiante.getDefinitivaSociales());
               }
               if(labelMateria.getText().equals("MATEMATICAS")){
                  vector=estudiante.getNotaMatematicas();
                  fila[5]=decimalFormat.format(estudiante.getDefinitivaMatematicas());
               }
               if(labelMateria.getText().equals("EDUCACION FISICA")){
                   vector=estudiante.getNotaEducacionFisica();
                   fila[5]=decimalFormat.format(estudiante.getDefinitivaFisica());

               }
               if(labelMateria.getText().equals("RELIGION")){
                   vector=estudiante.getNotaReligion();
                   fila[5]=decimalFormat.format(estudiante.getDefinitivaReligion());

               }
               
               fila[0]=estudiante.getCodigo();
               fila[1]=estudiante.getNombre();
               fila[2]=""+vector[0];
               fila[3]=""+vector[1];
               fila[4]=""+vector[2];
 

               modelo.addRow(fila);
        }
        tablaEstudiante.setModel(modelo);
    }
     

    
     private void iniciarUsuario(){
         usuarioTemporal=manejoArchivo.consultarUsuarioTemporal("usuarioTemporal.guardar");
         listaDocente=manejoArchivo.verListadoDocente("docente.guardar");
         for (Docente docente : listaDocente) {
             if(usuarioTemporal.equals(docente.getCodigo())){
                 labelMateria.setText(""+docente.getAsignatura());
             }
         }
     }
     
    private void limpiar(){
         textoNotaUno.setText("");
           textoNotaDos.setText("");
           textoNotaTres.setText("");
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
            java.util.logging.Logger.getLogger(DigitarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DigitarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DigitarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DigitarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DigitarNota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelMateria;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JTable tablaEstudiante;
    private javax.swing.JTextField textoNotaDos;
    private javax.swing.JTextField textoNotaTres;
    private javax.swing.JTextField textoNotaUno;
    // End of variables declaration//GEN-END:variables
}
