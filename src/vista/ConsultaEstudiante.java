
package vista;

import clases.Estudiante;
import clases.ManejoArchivo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConsultaEstudiante extends javax.swing.JFrame {

    ArrayList<Estudiante> listaEstudiantes=new ArrayList<>();;
    ManejoArchivo manejoArchivo=new ManejoArchivo();;
    Inicio inicio;

    public ConsultaEstudiante() {
        initComponents();
        
    }
    



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoCodigo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelApellidos = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelEdad = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        verNotas = new javax.swing.JButton();
        labelCodigo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonConsultar = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Earth", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                Consulta Estudiante");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 20, 450, 60);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Numero de identificacion");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 130, 160, 40);

        textoCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoCodigoKeyTyped(evt);
            }
        });
        getContentPane().add(textoCodigo);
        textoCodigo.setBounds(160, 130, 290, 40);

        jPanel1.setLayout(null);
        jPanel1.add(labelNombre);
        labelNombre.setBounds(160, 80, 210, 40);

        jLabel4.setText("Nombres");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 80, 130, 40);
        jPanel1.add(labelApellidos);
        labelApellidos.setBounds(160, 130, 210, 40);

        jLabel6.setText("Apellidos");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 130, 130, 40);
        jPanel1.add(labelTelefono);
        labelTelefono.setBounds(160, 180, 210, 40);

        jLabel8.setText("Telefono ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 180, 130, 40);
        jPanel1.add(labelEdad);
        labelEdad.setBounds(160, 240, 210, 40);

        jLabel10.setText("Edad");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 240, 130, 40);

        verNotas.setText("Ver Notas");
        verNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verNotasActionPerformed(evt);
            }
        });
        jPanel1.add(verNotas);
        verNotas.setBounds(460, 20, 90, 23);
        jPanel1.add(labelCodigo);
        labelCodigo.setBounds(160, 30, 210, 40);

        jLabel7.setText("Codigo");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 30, 70, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 200, 570, 320);

        botonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group.png"))); // NOI18N
        botonConsultar.setText("consultar");
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(botonConsultar);
        botonConsultar.setBounds(480, 130, 120, 40);

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        botonRegresar.setText("regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar);
        botonRegresar.setBounds(470, 530, 130, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/graduate-student-avatar.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(520, 10, 60, 70);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 640, 570);

        setSize(new java.awt.Dimension(630, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
       consultarEstudiante();
    }//GEN-LAST:event_botonConsultarActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
      regresar();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void textoCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoCodigoKeyTyped
        int validacion=textoCodigo.getText().length();
        String validacionDos=String.valueOf(evt.getKeyChar());
        if(validacion>=10){
            JOptionPane.showMessageDialog(null, "no se permitan mas de 10 caracteres");
        }
        if(validacionDos.matches("[0-9]")){  
        }else{
            evt.consume();
        }
        
    }//GEN-LAST:event_textoCodigoKeyTyped

    private void verNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verNotasActionPerformed
        if(labelNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe buscar el estudiante");
        }else{
          verNotas();  
        }
        
    }//GEN-LAST:event_verNotasActionPerformed

    private void verNotas(){
        manejoArchivo.usuarioTemporal(labelCodigo.getText().trim(), "userEstudiante.guardar");
        ConsultaEstudianteNota consultaEstudianteNota=new ConsultaEstudianteNota();
        consultaEstudianteNota.setVisible(true);
        dispose();
    }

    private void regresar(){
        inicio=new Inicio();
        inicio.setVisible(true);
        dispose();
    }
    //consultar estudiante
    private void consultarEstudiante(){
        listaEstudiantes=manejoArchivo.verListaEstudiantes("estudiante.guardar");
        int contador=0;
        for (Estudiante estudiante : listaEstudiantes) {
            if(estudiante.getCodigo().equals(textoCodigo.getText().trim())){
                labelCodigo.setText(""+estudiante.getCodigo());
                labelNombre.setText(String.valueOf(estudiante.getNombre()));
                labelApellidos.setText(""+estudiante.getApellido());
                labelTelefono.setText(""+estudiante.getTelefono());
                labelEdad.setText(""+estudiante.getEdad());
                contador=1;
            }
        }
        
        if(contador<1){
            JOptionPane.showMessageDialog(null,"no se encontro el estudiante con registro: "+textoCodigo.getText());
        }
        textoCodigo.setText("");
        
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
            java.util.logging.Logger.getLogger(ConsultaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JTextField textoCodigo;
    private javax.swing.JButton verNotas;
    // End of variables declaration//GEN-END:variables
}
