/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hari;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author rr1
 */
public class AssignHSAdminDeep extends javax.swing.JFrame {

    /**
     * Creates new form AssignHSAdminDeep
     */
    static boolean flag=true;
    public AssignHSAdminDeep() {
        initComponents();
        if(flag==true) {
            flag=false;
            main();
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

        b_add = new javax.swing.JButton();
        l_addanHS = new javax.swing.JLabel();
        l_addregid = new javax.swing.JLabel();
        tf_addregid = new javax.swing.JTextField();
        l_removeanhs = new javax.swing.JLabel();
        l_removeregid = new javax.swing.JLabel();
        tf_removeregid = new javax.swing.JTextField();
        b_remove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b_add.setText("Add");
        b_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_addActionPerformed(evt);
            }
        });

        l_addanHS.setText("Add an HS:");

        l_addregid.setText("Enter Registration ID");

        l_removeanhs.setText("Remove an HS:");

        l_removeregid.setText("Enter Registration ID");

        tf_removeregid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_removeregidActionPerformed(evt);
            }
        });

        b_remove.setText("Remove");
        b_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_removeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_removeanhs)
                            .addComponent(l_addanHS))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(l_removeregid)
                                .addGap(18, 18, 18)
                                .addComponent(tf_removeregid, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_addregid)
                                .addGap(18, 18, 18)
                                .addComponent(tf_addregid, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_remove, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(l_addanHS)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_add)
                    .addComponent(l_addregid)
                    .addComponent(tf_addregid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_removeanhs)
                        .addGap(18, 18, 18)
                        .addComponent(l_removeregid))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_removeregid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b_remove)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_removeregidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_removeregidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_removeregidActionPerformed

    private void b_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_addActionPerformed
        // TODO add your handling code here:
        try {    
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost/?user=risal&password=risal");
            Statement st=con.createStatement();
            PreparedStatement pst=con.prepareStatement("SELECT REG_NO FROM proj.STUDENTLIST WHERE REG_NO=?;");
            pst.setString(1,tf_addregid.getText());
            ResultSet rs=pst.executeQuery();
            JFrame frame=new JFrame();
            if(rs.next()) {
                pst=con.prepareStatement("INSERT INTO `proj`.`HS` (`HS_REG_ID`) VALUES (?);");
                pst.setString(1,tf_addregid.getText());
                if(pst.executeUpdate()==1) {
                    JOptionPane.showMessageDialog(frame,"New HS Added");
                }
                else {
                    JOptionPane.showMessageDialog(frame,"New HS couldn't be added");
                }
            }
            else {
                JOptionPane.showMessageDialog(frame,"Entered ID is not an inmate");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_b_addActionPerformed

    private void b_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_removeActionPerformed
        // TODO add your handling code here:"DELETE FROM `proj`.`HS` WHERE (`HS_REG_ID` = ?);"
        try {    
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost/?user=risal&password=risal");
            Statement st=con.createStatement();
            PreparedStatement pst=con.prepareStatement("SELECT HS_REG_ID FROM proj.HS WHERE HS_REG_ID=?;");
            pst.setString(1,tf_removeregid.getText());
            ResultSet rs=pst.executeQuery();
            JFrame frame=new JFrame();
            if(rs.next()) {
                pst=con.prepareStatement("DELETE FROM `proj`.`HS` WHERE (`HS_REG_ID` = ?);");
                pst.setString(1,tf_removeregid.getText());
                if(pst.executeUpdate()==1) {
                    JOptionPane.showMessageDialog(frame,"HS removed");
                }
                else {
                    JOptionPane.showMessageDialog(frame,"HS couldn't be removed");
                }
            }
            else {
                JOptionPane.showMessageDialog(frame,"Entered ID is not an HS");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_b_removeActionPerformed

    
    static void main() {
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
            java.util.logging.Logger.getLogger(AssignHSAdminDeep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignHSAdminDeep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignHSAdminDeep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignHSAdminDeep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignHSAdminDeep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_add;
    private javax.swing.JButton b_remove;
    private javax.swing.JLabel l_addanHS;
    private javax.swing.JLabel l_addregid;
    private javax.swing.JLabel l_removeanhs;
    private javax.swing.JLabel l_removeregid;
    private javax.swing.JTextField tf_addregid;
    private javax.swing.JTextField tf_removeregid;
    // End of variables declaration//GEN-END:variables
}