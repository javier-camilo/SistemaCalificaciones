
package vista;

import javax.swing.JOptionPane;

public class OperacionAdministrativo extends javax.swing.JFrame {
     
    
    Inicio inicio;
    FormularioDocente formularioDocente;
    FormularioEstudiante formularioEstudiante;
    CrearUsuarios crearUsuarios;


    
    public OperacionAdministrativo() {
        initComponents();

    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonDocente = new javax.swing.JButton();
        botonEstudiante = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelFormulario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonConsultar = new javax.swing.JButton();
        botonCrear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        botonCerrar.setBackground(new java.awt.Color(255, 255, 255));
        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit-to-app-button (1).png"))); // NOI18N
        botonCerrar.setText("Cerrar sesiòn");
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCerrar);
        botonCerrar.setBounds(660, 550, 140, 40);

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                Menu de operacion Administrador");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 30, 580, 40);

        botonDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man.png"))); // NOI18N
        botonDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDocenteActionPerformed(evt);
            }
        });
        getContentPane().add(botonDocente);
        botonDocente.setBounds(190, 450, 90, 73);

        botonEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personaUser.png"))); // NOI18N
        botonEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(botonEstudiante);
        botonEstudiante.setBounds(50, 450, 90, 70);

        jLabel14.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Estudiante");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(50, 410, 90, 30);

        jLabel15.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Docente");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(190, 410, 90, 30);

        labelFormulario.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        labelFormulario.setForeground(new java.awt.Color(255, 255, 255));
        labelFormulario.setText("                 llenar formulario ");
        getContentPane().add(labelFormulario);
        labelFormulario.setBounds(20, 250, 260, 40);

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Consulta Notas");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(500, 400, 110, 40);

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Crear Usuario");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(670, 230, 130, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crear usuario.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(680, 310, 80, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resgistrar.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 310, 90, 80);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consultar.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(440, 300, 80, 80);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Admin grande.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(390, 70, 128, 150);

        botonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/application-form.png"))); // NOI18N
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(botonConsultar);
        botonConsultar.setBounds(360, 440, 100, 80);

        botonCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/users.png"))); // NOI18N
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });
        getContentPane().add(botonCrear);
        botonCrear.setBounds(670, 440, 90, 80);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seo-report (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(500, 440, 100, 80);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Consulta");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(420, 240, 120, 40);

        jLabel9.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Consulta Formulario");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(340, 400, 140, 40);

        fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Camilo\\Documents\\NetBeansProjects\\SistemaCalificaciones\\src\\imagenes\\azul-oscuro.jpeg")); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 810, 600);

        setSize(new java.awt.Dimension(828, 641));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        cerrar();
    }//GEN-LAST:event_botonCerrarActionPerformed

    //cerrar sesiòn
    private void cerrar(){
       String[] botones={"Aceptar","cancelar"};
       int seleccion=JOptionPane.showOptionDialog(this,"¿desea cerrar sesiòn?","cierre de sesión", 0, 0, null, botones, this);
        if(seleccion==JOptionPane.YES_OPTION){
           inicioSesion(); 
        }
    }
    
    private void botonDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDocenteActionPerformed
        formularioDocente=new FormularioDocente();
        formularioDocente.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonDocenteActionPerformed

    private void botonEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEstudianteActionPerformed
       formularioEstudiante=new FormularioEstudiante();
       formularioEstudiante.setVisible(true);
       dispose();
    }//GEN-LAST:event_botonEstudianteActionPerformed

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        ConsultarFormulario consultarFormulario=new ConsultarFormulario();
        consultarFormulario.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonConsultarActionPerformed

    
    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
      crearUsuarios=new CrearUsuarios();
      crearUsuarios.setVisible(true);
      dispose();
    }//GEN-LAST:event_botonCrearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      ConsultarNotasPeriodo consultarNotasPeriodo=new ConsultarNotasPeriodo();
      consultarNotasPeriodo.setVisible(true);
      dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
       
       //regresar al inicio de sesion
       private void inicioSesion(){
           inicio=new Inicio();
           inicio.setVisible(true);
           dispose();
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
            java.util.logging.Logger.getLogger(OperacionAdministrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperacionAdministrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperacionAdministrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperacionAdministrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperacionAdministrativo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonCrear;
    private javax.swing.JButton botonDocente;
    private javax.swing.JButton botonEstudiante;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelFormulario;
    // End of variables declaration//GEN-END:variables
}
