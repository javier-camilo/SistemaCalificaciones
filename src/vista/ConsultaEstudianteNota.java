 
package vista;

import clases.Estudiante;
import clases.ManejoArchivo;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ConsultaEstudianteNota extends javax.swing.JFrame {


    String codigoUser;
    ManejoArchivo manejoArchivo=new ManejoArchivo();
    ArrayList<Estudiante> listadoEstudiante=new ArrayList<>();
    
    public ConsultaEstudianteNota() {
        initComponents();
        iniciar();
    }
    
    private void iniciar(){
        codigoUser=manejoArchivo.consultarUsuarioTemporal("userEstudiante.guardar");
        labelCodigo.setText(codigoUser);
        ver();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNotas = new javax.swing.JTable();
        botonRegresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelPromedio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tablaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaNotas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 270, 700, 140);

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/previous.png"))); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar);
        botonRegresar.setBounds(610, 490, 130, 30);

        jPanel1.setLayout(null);

        labelNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(labelNombre);
        labelNombre.setBounds(210, 30, 170, 40);

        labelCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(labelCodigo);
        labelCodigo.setBounds(40, 30, 160, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(150, 130, 420, 120);

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("                              Boletin de notas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 30, 440, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seo-report.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(540, 20, 80, 80);

        labelPromedio.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(labelPromedio);
        labelPromedio.setBounds(150, 450, 150, 40);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Promedio General");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 450, 110, 40);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul-oscuro.jpeg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 750, 530);

        setSize(new java.awt.Dimension(764, 569));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        regresar();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void regresar(){
        ConsultaEstudiante consultaEstudiante=new ConsultaEstudiante();
        consultaEstudiante.setVisible(true);
        dispose();
    }
    
    private void ver(){
        //agregar datos a la tabla
        DefaultTableModel modelo= new DefaultTableModel();
        String[] columnas={"Materia","1º periodo","2º periodo","3º perido","Definitiva"};
        modelo.setColumnIdentifiers(columnas);
        
        //para mostrar en la tabla la materia y su notas
        String[] filasIngles=new String[columnas.length];String[] filasEspañol=new String[columnas.length];
        String[] filasSociales=new String[columnas.length];String[] filasMatematicas=new String[columnas.length];
        String[] filasFisica=new String[columnas.length]; String[] filasReligion=new String[columnas.length];

        //inicio de la materia 
        filasIngles[0]="Ingles";filasEspañol[0]="Español";
        filasSociales[0]="Sociales";filasMatematicas[0]="Matematicas";
        filasFisica[0]="Educacion fisica";filasReligion[0]="religión";

        //vectores para cada nota individual por corte
        
        double[] notaIngles=new double[3];double[] notaEspañol=new double[3];double[] notaSociales=new double[3];
        double[] notaMatematicas=new double[3];double[] notaFisica=new double[3];double[] notaReligion=new double[3];

        
        //busqueda en el listado de alumnos 
        listadoEstudiante=manejoArchivo.verListaEstudiantes("estudiante.guardar");
        
        //inicio de los vectores
        
        for (Estudiante estudiante : listadoEstudiante) {
            if(estudiante.getCodigo().equals(codigoUser)){
                
               
                labelNombre.setText(estudiante.getNombre());
                
                 //incio de los vectores 
                notaIngles=estudiante.getNotaIngles();
                notaEspañol=estudiante.getNotaEspañol();
                notaSociales=estudiante.getNotaSociales();
                notaMatematicas=estudiante.getNotaMatematicas();
                notaFisica=estudiante.getNotaEducacionFisica();
                notaReligion=estudiante.getNotaReligion();
                
                //manda datos a las filas
                filasIngles[1]=""+notaIngles[0];filasIngles[2]=""+notaIngles[1];filasIngles[3]=""+notaIngles[2];
                
                filasEspañol[1]=""+notaEspañol[0];filasEspañol[2]=""+notaEspañol[1];filasEspañol[3]=""+notaEspañol[2];
                
                filasSociales[1]=""+notaSociales[0];filasSociales[2]=""+notaSociales[1];filasSociales[3]=""+notaSociales[2];
                
                filasMatematicas[1]=""+notaMatematicas[0];filasMatematicas[2]=""+notaMatematicas[1];filasMatematicas[3]=""+notaMatematicas[2];
                
                filasFisica[1]=""+notaFisica[0];filasFisica[2]=""+notaFisica[1];filasFisica[3]=""+notaFisica[2];
                
                filasReligion[1]=""+notaReligion[0];filasReligion[2]=""+notaReligion[1];filasReligion[3]=""+notaReligion[2];
                
                
                
                //mandar definitiva a cada definitiva
                filasIngles[4]=""+estudiante.getDefinitivaIngles();filasEspañol[4]=""+estudiante.getDefinitivaEspañol();
                filasSociales[4]=""+estudiante.getDefinitivaSociales();filasMatematicas[4]=""+estudiante.getDefinitivaMatematicas();
                filasFisica[4]=""+estudiante.getDefinitivaFisica();filasReligion[4]=""+estudiante.getDefinitivaReligion();
                
                //sacar el promedio
                promedioGeneral(estudiante);
            }
            
        }
        
        modelo.addRow(filasIngles);modelo.addRow(filasEspañol);modelo.addRow(filasSociales);modelo.addRow(filasMatematicas);
        modelo.addRow(filasFisica);modelo.addRow(filasReligion);
        
        tablaNotas.setModel(modelo);
    }
    
    private void promedioGeneral(Estudiante estudiante){
        double promedio=(estudiante.getDefinitivaEspañol()+estudiante.getDefinitivaFisica()+estudiante.getDefinitivaIngles()+estudiante.getDefinitivaMatematicas()+
                estudiante.getDefinitivaReligion()+estudiante.getDefinitivaSociales())/6;
        
        labelPromedio.setText(""+promedio);
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
            java.util.logging.Logger.getLogger(ConsultaEstudianteNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaEstudianteNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaEstudianteNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaEstudianteNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaEstudianteNota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPromedio;
    private javax.swing.JTable tablaNotas;
    // End of variables declaration//GEN-END:variables
}
