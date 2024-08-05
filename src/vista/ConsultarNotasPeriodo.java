
package vista;

import clases.Estudiante;
import clases.ManejoArchivo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConsultarNotasPeriodo extends javax.swing.JFrame {
    
   

     ManejoArchivo manejoArchivo=new ManejoArchivo();
     ArrayList<Estudiante> listaEstudiante=new ArrayList<>();
     ArrayList<Estudiante> listaEstudianteFiltrada=new ArrayList<>();
     
    public ConsultarNotasPeriodo() {
        initComponents();
        ver();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiante = new javax.swing.JTable();
        botonRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textoFiltrado = new javax.swing.JTextField();
        botonRefrescar = new javax.swing.JButton();
        botonFiltrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(tablaEstudiante);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 160, 730, 390);

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/previous.png"))); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar);
        botonRegresar.setBounds(620, 580, 140, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("       Notas del periodo academico");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 10, 370, 40);

        textoFiltrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoFiltradoKeyTyped(evt);
            }
        });
        getContentPane().add(textoFiltrado);
        textoFiltrado.setBounds(200, 100, 250, 40);

        botonRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh-icon.png"))); // NOI18N
        botonRefrescar.setText("Refrescar");
        botonRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRefrescarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRefrescar);
        botonRefrescar.setBounds(580, 100, 130, 40);

        botonFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/funnel (1).png"))); // NOI18N
        botonFiltrar.setText("Filtrar");
        botonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFiltrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonFiltrar);
        botonFiltrar.setBounds(460, 100, 110, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Identificación");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 100, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/black-graduation-cap-tool-of-university-student-for-head (2).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 0, 200, 80);

        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul-oscuro.jpeg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 780, 620);

        setSize(new java.awt.Dimension(796, 659));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
       OperacionAdministrativo operacionAdministrativo=new OperacionAdministrativo();
       operacionAdministrativo.setVisible(true);
       dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void textoFiltradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoFiltradoKeyTyped

        String validacion=""+evt.getKeyChar();
        if(!(validacion.matches("[0-9]"))){
            evt.consume();
        }
    }//GEN-LAST:event_textoFiltradoKeyTyped

    private void botonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFiltrarActionPerformed
        if(textoFiltrado.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Debe digitar el codigo a buscar");
        }else{
            filtrado();
        }
    }//GEN-LAST:event_botonFiltrarActionPerformed

    private void botonRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRefrescarActionPerformed
       ver();
    }//GEN-LAST:event_botonRefrescarActionPerformed

    private void ver(){

        listaEstudiante=manejoArchivo.verListaEstudiantes("estudiante.guardar");
        String[] columnas={"CC","Nombres","Apellidos","Ingles","Español","Sociales","Matematicas","Educacion Fisica","Religión"};
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        String[] fila;
        for (Estudiante estudiante: listaEstudiante) {
           fila=new String[columnas.length];
           fila[0]=estudiante.getCodigo();
           fila[1]=estudiante.getNombre();
           fila[2]=estudiante.getApellido();
           fila[3]=""+estudiante.getDefinitivaIngles();
           fila[4]=""+estudiante.getDefinitivaEspañol();
           fila[5]=""+estudiante.getDefinitivaSociales();
           fila[6]=""+estudiante.getDefinitivaMatematicas();
           fila[7]=""+estudiante.getDefinitivaFisica();
           fila[8]=""+estudiante.getDefinitivaReligion();
           modelo.addRow(fila);
        }
        tablaEstudiante.setModel(modelo);
    }
    
    private void filtrado(){
        for (Estudiante estudiante : listaEstudiante) {
            if(estudiante.getCodigo().contains(textoFiltrado.getText())){
                listaEstudianteFiltrada.add(estudiante);
            }
        }
        
        String[] columnas={"CC","Nombres","Apellidos","Ingles","Español","Sociales","Matematicas","Educacion Fisica","Religión"};
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        String[] fila;
        for (Estudiante estudiante: listaEstudianteFiltrada) {
           fila=new String[columnas.length];
           fila[0]=estudiante.getCodigo();
           fila[1]=estudiante.getNombre();
           fila[2]=estudiante.getApellido();
           fila[3]=""+estudiante.getDefinitivaIngles();
           fila[4]=""+estudiante.getDefinitivaEspañol();
           fila[5]=""+estudiante.getDefinitivaSociales();
           fila[6]=""+estudiante.getDefinitivaMatematicas();
           fila[7]=""+estudiante.getDefinitivaFisica();
           fila[8]=""+estudiante.getDefinitivaReligion();
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
            java.util.logging.Logger.getLogger(ConsultarNotasPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarNotasPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarNotasPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarNotasPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarNotasPeriodo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonFiltrar;
    private javax.swing.JButton botonRefrescar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEstudiante;
    private javax.swing.JTextField textoFiltrado;
    // End of variables declaration//GEN-END:variables
}
