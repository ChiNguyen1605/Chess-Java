/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chess.display;

/**
 *
 * @author Chi Nguyen
 */
public class SignupForm extends javax.swing.JFrame {

    private String dataContructor;

    /**
     * Creates new form ForgotPasswordForm
     */
    /**
     * Creates new form SignupForm
     */
    public SignupForm(String dataContructor) {
        initComponents();
        this.dataContructor = dataContructor;
    }

    SignupForm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnxoa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtyourname = new javax.swing.JPasswordField();
        txtcode = new javax.swing.JPasswordField();
        btnsignup = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnxoa.setText("Xoagame");
        getContentPane().add(btnxoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back Login");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        jLabel2.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SIGN UP");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/R.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        txtusername.setText("Username or Email");
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 330, 32));

        txtyourname.setText("Your Name");
        txtyourname.setEchoChar('\u0000');
        getContentPane().add(txtyourname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 330, 34));

        txtcode.setText("Password");
        txtcode.setEchoChar('\u0000');
        getContentPane().add(txtcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 330, 34));

        btnsignup.setBackground(new java.awt.Color(255, 204, 0));
        btnsignup.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnsignup.setText("SIGN UP");
        getContentPane().add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 492, -1));

        jLabel3.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/den.jpg"))); // NOI18N
        jLabel3.setText("LOG IN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        formLogin ft = new formLogin(txtusername.getText());
        ft.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsignup;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtcode;
    private javax.swing.JTextField txtusername;
    private javax.swing.JPasswordField txtyourname;
    // End of variables declaration//GEN-END:variables
}
