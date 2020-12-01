/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author hari
 */
public class MyProfileStudent extends javax.swing.JFrame {

    /**
     * Creates new form MyProfileStudent
     */

    public MyProfileStudent(String id) {
        userid=id;
        con=null;
        stmt=null;
        imglocation="none.jpeg";
        initComponents();
        initialise();       
        
    }

    private void initialise()
    {
        try {
            con = new Connector().getCon();
            stmt=con.prepareStatement("SELECT REG_NO, NAME, PHONE_NUMBER, EMAIL, ROOM_NO, STUDENTIMAGE FROM proj.STUDENTLIST WHERE REG_NO=?");                       
            stmt.setString(1,userid);
            ResultSet rs=stmt.executeQuery();
            while(rs.next())
            {
                tf_regno.setText(rs.getString(1));
                tf_name.setText(rs.getString(2));
                tf_phno.setText(rs.getString(3));
                tf_email.setText(rs.getString(4));
                tf_room.setText(rs.getString(5));
                BufferedImage im = ImageIO.read(rs.getBinaryStream("STUDENTIMAGE"));
                Image newimg=im.getScaledInstance(250, 250, Image.SCALE_DEFAULT);
                l_profilepicture.setIcon(new ImageIcon(newimg));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        } finally {
            try {
                if(con!=null) con.close();
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
            }
            
            try {
                if(stmt!=null) stmt.close();
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
            }
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

        jTextField6 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        tf_regno = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_room = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        b_update = new javax.swing.JButton();
        b_changepassword = new javax.swing.JButton();
        tf_phno = new javax.swing.JFormattedTextField();
        pf_old = new javax.swing.JPasswordField();
        pf_new = new javax.swing.JPasswordField();
        pf_confirmnew = new javax.swing.JPasswordField();
        b_changeprofilepic = new javax.swing.JButton();
        l_profilepicture = new javax.swing.JLabel();

        jTextField6.setText("jTextField6");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("My Profile");
        setResizable(false);

        jLabel1.setText("Name");

        jLabel2.setText("College Reg. No");

        jLabel3.setText("Phone Number");

        jLabel4.setText("E-Mail");

        jLabel5.setText("Edit Registration Details");

        tf_name.setEditable(false);

        tf_regno.setEditable(false);

        jLabel6.setText("Change Password");

        jLabel7.setText("Old Password");

        jLabel8.setText("New Password");

        jLabel9.setText("Confirm New Password");

        jLabel10.setText("Alloted Room");

        tf_room.setEditable(false);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        b_update.setText("Update Details");
        b_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_updateActionPerformed(evt);
            }
        });

        b_changepassword.setText("Change Password");
        b_changepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_changepasswordActionPerformed(evt);
            }
        });

        tf_phno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        b_changeprofilepic.setText("Change Profile Picture");
        b_changeprofilepic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_changeprofilepicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                    .addComponent(tf_regno, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel3))
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_room)
                                        .addComponent(tf_phno))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_name, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(tf_email)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(b_update, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(b_changepassword, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 169, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9))
                                        .addGap(38, 38, 38)
                                        .addComponent(pf_confirmnew))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addGap(97, 97, 97)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pf_new)
                                            .addComponent(pf_old))))
                                .addGap(26, 26, 26))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_profilepicture)
                            .addComponent(b_changeprofilepic))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_regno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel10))
                            .addComponent(tf_room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_phno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel4))
                            .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(b_update, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(pf_old, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(pf_new, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(pf_confirmnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(b_changepassword, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(b_changeprofilepic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_profilepicture)))
                .addContainerGap(232, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_updateActionPerformed
        // TODO add your handling code here:
        try
        {
            String phonenumber=tf_phno.getText();
            String email=tf_email.getText();
            if(phonenumber.length()==10) {
                con = new Connector().getCon();
                stmt=con.prepareStatement("UPDATE `proj`.`STUDENTLIST` SET `PHONE_NUMBER` = ?, `EMAIL` = ? WHERE (`REG_NO` = ?);");                       
                stmt.setString(1,phonenumber);
                stmt.setString(2,email);
                stmt.setString(3,userid);
                int flag = stmt.executeUpdate();
                if(flag==1)
                {
                    JOptionPane.showMessageDialog(null,"Updation Succesful");
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"Phone number should contain 10 digits");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        } finally {
            try {
                if(con!=null) con.close();
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
            }
            
            try {
                if(stmt!=null) stmt.close();
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
            }
        }
        
    }//GEN-LAST:event_b_updateActionPerformed

    private void b_changepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_changepasswordActionPerformed
        // TODO add your handling code here:
        try{
            String oldpswd=HashingPassword.generateHash(new String(pf_old.getPassword()));
            String newpswd=HashingPassword.generateHash(new String(pf_new.getPassword()));
            String reenternewpswd=HashingPassword.generateHash(new String(pf_confirmnew.getPassword()));       

            if (reenternewpswd.equals(newpswd)) 
            {
                con = new Connector().getCon();
                stmt=con.prepareStatement("SELECT `PASSWORD` FROM `proj`.`STUDENTLIST` where `REG_NO`=?");
                stmt.setString(1,userid);
                ResultSet rs=stmt.executeQuery();
                while(rs.next())
                {
                    if(rs.getString(1).equals(oldpswd))
                    {
                        if(rs.getString(1).equals(newpswd))
                        {
                            JOptionPane.showMessageDialog(null,"New and old Passwords cannot be the same");
                            pf_new.setText("");
                            pf_confirmnew.setText("");
                        }
                        else
                        {
                            if(!RainbowTableChecker.checkInRainbowTable(new String(pf_new.getPassword()))) { //excutes if password not in rainbow table
                                stmt=con.prepareStatement("UPDATE `proj`.`STUDENTLIST` SET `PASSWORD`=? where `REG_NO`=?");
                                stmt.setString(1,newpswd);
                                stmt.setString(2,userid);
                                int flag = stmt.executeUpdate();
                                if(flag==1)
                                {
                                    JOptionPane.showMessageDialog(null,"Password Changed");
                                    pf_old.setText("");
                                    pf_new.setText("");
                                    pf_confirmnew.setText("");
                                }
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "Avoid common passwords");
                            }
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Incorrect Password");
                        pf_old.setText("");
                    }
                 }
            }   
            else
            {
                JOptionPane.showMessageDialog(null,"Passwords dont match");
                pf_new.setText("");
                pf_confirmnew.setText("");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        } finally {
            try {
                if(con!=null) con.close();
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
            }
            
            try {
                if(stmt!=null) stmt.close();
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
            }
        }
           
        
    }//GEN-LAST:event_b_changepasswordActionPerformed

    private void b_changeprofilepicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_changeprofilepicActionPerformed
        try {
            // TODO add your handling code here:
            con=new Connector().getCon();
            JFileChooser filechooser=FileSelection.getFileChooser();
            ResultSet rs=null;
            
            if (filechooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                imglocation=filechooser.getSelectedFile().getAbsolutePath();
                
                int faceno=FaceDetector.faceCount(imglocation);
                if(faceno==1) {
                    setPicture(imglocation);
                    stmt=con.prepareStatement("UPDATE `proj`.`STUDENTLIST` SET `STUDENTIMAGE`=? where `REG_NO`=?");
                    InputStream in= new FileInputStream(imglocation);
                    stmt.setBlob(1, in);
                    stmt.setString(2,userid);
                    int flag = stmt.executeUpdate();
                    if(flag==1)
                    {
                        JOptionPane.showMessageDialog(null,"Profile Picture Updated");
                    }
                    else {
                        System.out.println("error"+flag);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"This image not enough. Upload Another Image");
                    stmt=con.prepareStatement("SELECT STUDENTIMAGE FROM proj.STUDENTLIST WHERE REG_NO=?");                       
                    stmt.setString(1,userid);
                    rs=stmt.executeQuery();
                    rs.next();
                    BufferedImage im = ImageIO.read(rs.getBinaryStream("STUDENTIMAGE"));
                    Image newimg=im.getScaledInstance(250, 250, Image.SCALE_DEFAULT);
                    l_profilepicture.setIcon(new ImageIcon(newimg));
                    
                }
                
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        } finally {
            try {
                if(con!=null) con.close();
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
            }
            
            try {
                if(stmt!=null) stmt.close();
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
            }
        }
    }//GEN-LAST:event_b_changeprofilepicActionPerformed
    private void setPicture(String filename) { // setting image icon
        try {
            File file=new File(filename);
            
            BufferedImage img = ImageIO.read(file);
            Image newimg=img.getScaledInstance(250, 250, Image.SCALE_DEFAULT);
            ImageIcon imgicon=new ImageIcon(newimg);
            l_profilepicture.setIcon(imgicon);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Couldn't get normal image. Contact system admin");
        }
    }   
       
    /**
     * @param args the command line arguments
     */
//    public void startrunning() {
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
//            java.util.logging.Logger.getLogger(MyProfileStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MyProfileStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MyProfileStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MyProfileStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MyProfileStudent(userid).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_changepassword;
    private javax.swing.JButton b_changeprofilepic;
    private javax.swing.JButton b_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel l_profilepicture;
    private javax.swing.JPasswordField pf_confirmnew;
    private javax.swing.JPasswordField pf_new;
    private javax.swing.JPasswordField pf_old;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_name;
    private javax.swing.JFormattedTextField tf_phno;
    private javax.swing.JTextField tf_regno;
    private javax.swing.JTextField tf_room;
    // End of variables declaration//GEN-END:variables
    private final String userid;
    private Connection con;
    private PreparedStatement stmt;
    private String imglocation;
}