
package vista;

import javax.swing.JOptionPane;


public class CrearUsuarios extends javax.swing.JFrame {

    CrearUsuarioAdministrador crearUsuarioAdministrador;
    OperacionAdministrativo operacionAdministrativo;
    
    public CrearUsuarios() {
        initComponents();
        setTitle("Usuarios");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        crearAdministrador = new javax.swing.JMenuItem();
        crearDocente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        consultarUsuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("     Menu De Usuarios");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 20, 300, 60);

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/previous.png"))); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar);
        botonRegresar.setBounds(280, 180, 120, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 80, 80, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul-oscuro.jpeg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 410, 230);

        jMenu1.setText("crear");

        crearAdministrador.setText("Administrador");
        crearAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearAdministradorActionPerformed(evt);
            }
        });
        jMenu1.add(crearAdministrador);

        crearDocente.setText("Docente");
        crearDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearDocenteActionPerformed(evt);
            }
        });
        jMenu1.add(crearDocente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("consultar");

        consultarUsuarios.setText("consultar Usuarios");
        consultarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarUsuariosActionPerformed(evt);
            }
        });
        jMenu2.add(consultarUsuarios);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(425, 285));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
       operacionAdministrativo =new OperacionAdministrativo();
       operacionAdministrativo.setVisible(true);
       dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void crearDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearDocenteActionPerformed
      iniciarDocente();
    }//GEN-LAST:event_crearDocenteActionPerformed

    private void iniciarDocente(){
        CrearUsuarioProfesor crearUsuarioProfesor=new CrearUsuarioProfesor();
        crearUsuarioProfesor.setVisible(true);
        dispose();
    }
    private void crearAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearAdministradorActionPerformed
        iniciarAdministrador();
    }//GEN-LAST:event_crearAdministradorActionPerformed

    private void consultarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarUsuariosActionPerformed
        ConsultarUsuarios   consultarUsuarios= new ConsultarUsuarios(); 
        consultarUsuarios.setVisible(true);
        dispose();
    }//GEN-LAST:event_consultarUsuariosActionPerformed

    private void iniciarAdministrador(){
        crearUsuarioAdministrador=new CrearUsuarioAdministrador();
        crearUsuarioAdministrador.setVisible(true);
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
            java.util.logging.Logger.getLogger(CrearUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JMenuItem consultarUsuarios;
    private javax.swing.JMenuItem crearAdministrador;
    private javax.swing.JMenuItem crearDocente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
