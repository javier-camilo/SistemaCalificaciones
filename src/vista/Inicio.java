
package vista;

import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {


    InicioAdministrativo inicioAdministrativo;
    ConsultaEstudiante consultaEstudiante;
    
    public Inicio() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        iconoSesion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonEstudiante = new javax.swing.JButton();
        botonAdministrativo = new javax.swing.JButton();
        botonDocente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        botonSalir.setBackground(new java.awt.Color(255, 255, 255));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir-de-mi-perfil-icono-3964-32.png"))); // NOI18N
        botonSalir.setText("salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir);
        botonSalir.setBounds(340, 450, 130, 50);

        jLabel5.setFont(new java.awt.Font("2015 Cruiser", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de sesión");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 0, 190, 70);

        iconoSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/multiple-users-silhouette.png"))); // NOI18N
        getContentPane().add(iconoSesion);
        iconoSesion.setBounds(170, 90, 150, 150);

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estudiante");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 260, 90, 40);

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administrador");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 260, 100, 40);

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Docente");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 260, 90, 40);

        botonEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man.png"))); // NOI18N
        botonEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(botonEstudiante);
        botonEstudiante.setBounds(190, 310, 120, 90);

        botonAdministrativo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        botonAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdministrativoActionPerformed(evt);
            }
        });
        getContentPane().add(botonAdministrativo);
        botonAdministrativo.setBounds(20, 310, 120, 90);

        botonDocente.setBackground(new java.awt.Color(255, 255, 255));
        botonDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personaUser.png"))); // NOI18N
        botonDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDocenteActionPerformed(evt);
            }
        });
        getContentPane().add(botonDocente);
        botonDocente.setBounds(350, 310, 110, 90);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul-oscuro.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 480, 520);

        setSize(new java.awt.Dimension(495, 553));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdministrativoActionPerformed
        inicioAdministrativo=new InicioAdministrativo();
        inicioAdministrativo.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonAdministrativoActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
       salir();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void salir(){
        
        String[] botones={"Aceptar","cancelar"};
       int seleccion=JOptionPane.showOptionDialog(this,"¿desea salir?","salir", 0, 0, null, botones, this);
        if(seleccion==JOptionPane.YES_OPTION){
           System.exit(0);
        }
        
    }
    private void botonEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEstudianteActionPerformed
      consultaAlumno();
    }//GEN-LAST:event_botonEstudianteActionPerformed

      private void consultaAlumno(){
         consultaEstudiante=new ConsultaEstudiante();
         consultaEstudiante.setVisible(true);
         dispose();
    }
      
      
    private void botonDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDocenteActionPerformed
      iniciarDocente();
    }//GEN-LAST:event_botonDocenteActionPerformed

    private void iniciarDocente(){
        InicioDocente inicioDocente=new InicioDocente();
        inicioDocente.setVisible(true);
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdministrativo;
    private javax.swing.JButton botonDocente;
    private javax.swing.JButton botonEstudiante;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel iconoSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
