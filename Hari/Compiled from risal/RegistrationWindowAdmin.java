/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmsadmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 *
 * @author hari
 */
public class RegistrationWindowAdmin extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationWindowFinal
     */
    public RegistrationWindowAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tf_fullname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_collegeregno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ff_phonenumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        b_validateandsubmit = new javax.swing.JButton();
        pf_password = new javax.swing.JPasswordField();
        pf_reenterpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registration Window");
        setResizable(false);

        jLabel1.setText("Full Name");

        tf_fullname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_fullnameKeyPressed(evt);
            }
        });

        jLabel2.setText("Reg. Number");

        tf_collegeregno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_collegeregnoKeyPressed(evt);
            }
        });

        jLabel3.setText("Phone Number");

        ff_phonenumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ff_phonenumberKeyPressed(evt);
            }
        });

        jLabel4.setText("Email Address");

        jLabel5.setText("Password");

        jLabel6.setText("Re-enter Password");

        b_validateandsubmit.setText("Validate and Register");
        b_validateandsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_validateandsubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_fullname)
                            .addComponent(tf_collegeregno)
                            .addComponent(ff_phonenumber)
                            .addComponent(tf_email)
                            .addComponent(pf_password)
                            .addComponent(pf_reenterpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(b_validateandsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tf_collegeregno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(ff_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pf_reenterpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(b_validateandsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ff_phonenumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ff_phonenumberKeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
if(Character.isLetter(c))
{
    ff_phonenumber.setEditable(false);
}
else
{
    ff_phonenumber.setEditable(true);

}        
        
    }//GEN-LAST:event_ff_phonenumberKeyPressed

    private void tf_collegeregnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_collegeregnoKeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
if(Character.isLetter(c))
{
    tf_collegeregno.setEditable(false);
}
else
{
    tf_collegeregno.setEditable(true);

}        
    }//GEN-LAST:event_tf_collegeregnoKeyPressed

    private void b_validateandsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_validateandsubmitActionPerformed
        // TODO add your handling code here:
        
        try
        {
                String fullname=tf_fullname.getText();
                String collegeregno=tf_collegeregno.getText();
                String phonenumber=ff_phonenumber.getText();
                String email=tf_email.getText();
                String password=new String(pf_password.getPassword());
                String reenterpassword=new String(pf_reenterpassword.getPassword());
                if(phonenumber.length()!=10)
                    JOptionPane.showMessageDialog(null,"Provide a valid 10 digit mobile number","Invalid Phone Number",JOptionPane.ERROR_MESSAGE);
                if (fullname.equals("")||collegeregno.equals("")||password.equals("")||phonenumber.equals("")||reenterpassword.equals("") )
                   JOptionPane.showMessageDialog(null,"All fields are reuired","Insufficient data",JOptionPane.ERROR_MESSAGE);
                else {
                    if (password.equals(reenterpassword)) {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/?user=hari&password=ubuntupassword");
                        PreparedStatement stmt=con.prepareStatement("INSERT INTO `proj`.`ADMIN` (`NAME`, `REG_NO`, `PHONE_NUMBER`, `EMAIL`, `PASSWORD`) VALUES (?, ?, ?, ?, ?);");
                        stmt.setString(1,fullname);
                        stmt.setString(2,collegeregno);
                        stmt.setString(3,phonenumber);
                        stmt.setString(4,email);
                        stmt.setString(5,password);
                        int flag1 = stmt.executeUpdate();
                        if(flag1==1)
                        {
                                JOptionPane.showMessageDialog(null,"Registration Succesful");
                                tf_fullname.setText("");
                                tf_collegeregno.setText("");
                                ff_phonenumber.setText("");
                                tf_email.setText("");
                                pf_password.setText("");
                                pf_reenterpassword.setText("");
                        }
                        stmt.close();
                        con.close();
                    } 
                    else {
                        JOptionPane.showMessageDialog(null,"Passwords do not match!","Invalid Input",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null,"This Admin is already registered..Please Login ","Duplicate Data Found",JOptionPane.ERROR_MESSAGE);
                }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Exception "+e.toString());
            }
    }//GEN-LAST:event_b_validateandsubmitActionPerformed

    private void tf_fullnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_fullnameKeyPressed
        // TODO add your handling code here:
         char c=evt.getKeyChar();
if(Character.isDigit(c))
{
    tf_fullname.setEditable(false);
}
else
{
    tf_fullname.setEditable(true);

}        
    }//GEN-LAST:event_tf_fullnameKeyPressed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(RegistrationWindowAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RegistrationWindowAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RegistrationWindowAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RegistrationWindowAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegistrationWindowAdmin().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_validateandsubmit;
    private javax.swing.JTextField ff_phonenumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JPasswordField pf_reenterpassword;
    private javax.swing.JTextField tf_collegeregno;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_fullname;
    // End of variables declaration//GEN-END:variables
}