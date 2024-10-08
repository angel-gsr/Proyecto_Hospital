/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registropaciente;

import javax.swing.JOptionPane;

/**
 *
 * @author garci
 */
public class InicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form Hospital
     */
    public InicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        Continuar.setEnabled(false);
    }
public void Cerrar(){
    String Botones[] = {"Si","No"};
        int Opcion = JOptionPane.showOptionDialog(this, "¿Desea Salir?", "Salir", 0, 0, null, Botones, this);
        
        if(Opcion == JOptionPane.YES_OPTION){
        System.exit(0);
        }       
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        HospitalPCIcon = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JLabel();
        LblContraseña = new javax.swing.JLabel();
        ComboSelec = new javax.swing.JComboBox<>();
        TxtContraseña = new javax.swing.JPasswordField();
        Salir = new javax.swing.JButton();
        Continuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesión");
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitulo.setText("Iniciar Sesión");
        LblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Fondo.add(LblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 150, -1));

        HospitalPCIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Hospital.jpg"))); // NOI18N
        Fondo.add(HospitalPCIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 100, 100));

        TxtUsuario.setText("Usuario:");
        Fondo.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        LblContraseña.setText("Contraseña:");
        Fondo.add(LblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        ComboSelec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Doctor", "Médico" }));
        ComboSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboSelecActionPerformed(evt);
            }
        });
        Fondo.add(ComboSelec, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        TxtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtContraseñaActionPerformed(evt);
            }
        });
        Fondo.add(TxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 120, -1));

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Fondo.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        Continuar.setText("Continuar");
        Continuar.setEnabled(false);
        Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinuarActionPerformed(evt);
            }
        });
        Fondo.add(Continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        Cerrar();
    }//GEN-LAST:event_SalirActionPerformed

    private void ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinuarActionPerformed
        // TODO add your handling code here:
        if (ComboSelec.getSelectedItem() == "Doctor"){
        MenuDoctor Ingresar = new MenuDoctor();
        Ingresar.setVisible(true);
        this.setVisible(false);
        }
        if (ComboSelec.getSelectedItem() == "Médico"){
        MenuMedico Ingresar = new MenuMedico();
        Ingresar.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_ContinuarActionPerformed

    private void TxtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtContraseñaActionPerformed
        // TODO add your handling code here:   
        
        String C;  
        C = TxtContraseña.getText();
 
    
        if (ComboSelec.getSelectedItem() == "Seleccionar..."){
            TxtContraseña.setText("");
        }
        
        else if (ComboSelec.getSelectedItem() == "Doctor"){
            if (C.equals("drhouse")){
                Continuar.setEnabled(true);
            }
            else{
                Continuar.setEnabled(false);
            }
        }
        else if(ComboSelec.getSelectedItem() == "Médico"){
            if (C.equals("alexmarin")){
                Continuar.setEnabled(true);
            }
            else{
                Continuar.setEnabled(false);
            }
        }
        
    }//GEN-LAST:event_TxtContraseñaActionPerformed

    private void ComboSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboSelecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboSelecActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InicioSesion

.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion

.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion

.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion

.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboSelec;
    private javax.swing.JButton Continuar;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel HospitalPCIcon;
    private javax.swing.JLabel LblContraseña;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JButton Salir;
    private javax.swing.JPasswordField TxtContraseña;
    private javax.swing.JLabel TxtUsuario;
    // End of variables declaration//GEN-END:variables
}
