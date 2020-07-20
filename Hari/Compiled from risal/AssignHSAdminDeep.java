/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmsadmin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rr1
 */
public class AssignHSAdminDeep extends javax.swing.JFrame {

    /**
     * Creates new form AssignHSAdminDeep
     */
    private Connection con;
    public AssignHSAdminDeep() {
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

        b_add = new javax.swing.JButton();
        l_addanHS = new javax.swing.JLabel();
        l_addregid = new javax.swing.JLabel();
        tf_addregid = new javax.swing.JTextField();
        l_removeanhs = new javax.swing.JLabel();
        l_removeregid = new javax.swing.JLabel();
        tf_removeregid = new javax.swing.JTextField();
        b_remove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add/Remove HS");
        setResizable(false);

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
            String id=tf_addregid.getText();
            con = new Connector().getCon();
            try {
                PreparedStatement pst=con.prepareStatement(" INSERT INTO `proj`.`HS` (`HS_REG_ID`) VALUES (?);");
                pst.setString(1,id);
                ResultSet rs=pst.executeQuery();
                if(rs.first())
                    JOptionPane.showMessageDialog(null,"Added Hostel Secretary");
                
            } 
            catch (SQLException ex) {
                System.out.println(ex.getSQLState());
            }
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
       
        
    }//GEN-LAST:event_b_addActionPerformed

    private void b_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_removeActionPerformed
        // TODO add your handling code here:
        try {    
            String id=tf_removeregid.getText();
            
            con = new Connector().getCon();
            try {
                PreparedStatement pst=con.prepareStatement("DELETE FROM `proj`.`HS` WHERE (`HS_REG_ID` = ?);");
                pst.setString(1,id);
                ResultSet rs=pst.executeQuery();
                if(rs.first())
                    JOptionPane.showMessageDialog(null,"Removed Hostel Secretary");
                
            } 
            catch (SQLException ex) {
                System.out.println(ex.getSQLState());
            }
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        

    }//GEN-LAST:event_b_removeActionPerformed

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
//            java.util.logging.Logger.getLogger(AssignHSAdminDeep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AssignHSAdminDeep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AssignHSAdminDeep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AssignHSAdminDeep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AssignHSAdminDeep().setVisible(true);
//            }
//        });
//    }

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
