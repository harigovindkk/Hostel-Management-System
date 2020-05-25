/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hari;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author rr1
 */
public class ComplaintRegisterAdmin extends javax.swing.JFrame {

    /**
     * Creates new form ComplaintRegisterAdmin
     */
    public ComplaintRegisterAdmin() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        table_pendingcomplaints = new javax.swing.JTable();
        l_pendingcomplaints = new javax.swing.JLabel();
        l_solvedcomplaints = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_solvedcomplaints = new javax.swing.JTable();
        b_deletecomplaints = new javax.swing.JButton();
        b_changestatus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Complaint Register");
        setResizable(false);

        table_pendingcomplaints.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table_pendingcomplaints);

        l_pendingcomplaints.setText("Pending Complaints");

        l_solvedcomplaints.setText("Solved Complaints");

        table_solvedcomplaints.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(table_solvedcomplaints);
        try {    
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/?user=risal&password=risal");
                Statement st=con.createStatement();
                PreparedStatement pst=con.prepareStatement("SELECT C_NUM,USER_ID,RELATED_TO,DETAILS,DATE_TIME FROM proj.COMPLAINT_REG where STATUS='Pending';");
                //pst.setString(1,userid);
                ResultSet rs=pst.executeQuery();
                table_pendingcomplaints.setModel(DbUtils.resultSetToTableModel(rs));
                pst=con.prepareStatement("SELECT C_NUM,USER_ID,RELATED_TO,DETAILS,DATE_TIME FROM proj.COMPLAINT_REG where STATUS='Solved';");
                rs=pst.executeQuery();
                table_solvedcomplaints.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException ex) {
                System.out.println(ex.getSQLState());
            }
            
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        b_deletecomplaints.setText("Delete Complaints");
        b_deletecomplaints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_deletecomplaintsActionPerformed(evt);
            }
        });

        b_changestatus.setText("Change Status");
        b_changestatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_changestatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l_solvedcomplaints)
                    .addComponent(l_pendingcomplaints)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(b_deletecomplaints)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_changestatus)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(l_pendingcomplaints)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(l_solvedcomplaints)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_deletecomplaints)
                    .addComponent(b_changestatus))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_deletecomplaintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deletecomplaintsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_deletecomplaintsActionPerformed

    private void b_changestatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_changestatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_changestatusActionPerformed

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
            java.util.logging.Logger.getLogger(ComplaintRegisterAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComplaintRegisterAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComplaintRegisterAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComplaintRegisterAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComplaintRegisterAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_changestatus;
    private javax.swing.JButton b_deletecomplaints;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l_pendingcomplaints;
    private javax.swing.JLabel l_solvedcomplaints;
    private javax.swing.JTable table_pendingcomplaints;
    private javax.swing.JTable table_solvedcomplaints;
    // End of variables declaration//GEN-END:variables
}
