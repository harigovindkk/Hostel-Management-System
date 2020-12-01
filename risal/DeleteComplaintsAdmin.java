
package hari;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author rr1
 */
public class DeleteComplaintsAdmin extends javax.swing.JFrame {


    public DeleteComplaintsAdmin() {
        initComponents();
        
    }

    private void initComponents() {
        //Nimbus
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteComplaintsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        //End Nimbus
        
        
        
        jButton1 = new javax.swing.JButton();
        l_complaintnumber = new javax.swing.JLabel();
        tf_complaintnumber = new javax.swing.JTextField();
        b_deletecomplaintnumber = new javax.swing.JButton();
        l_solvedcomplaints = new javax.swing.JLabel();
        b_deletesolvedcomplaints = new javax.swing.JButton();
        l_pendingcomplaints = new javax.swing.JLabel();
        b_deletependingcomplaints = new javax.swing.JButton();
        l_allcomplaints = new javax.swing.JLabel();
        b_deleteallcomplaints = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l_complaintnumber.setText("Complaint Number to Delete");

        b_deletecomplaintnumber.setText("Delete");
        b_deletecomplaintnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_deletecomplaintnumberActionPerformed(evt);
            }
        });

        l_solvedcomplaints.setText("Delete all Solved Complaints");

        b_deletesolvedcomplaints.setText("Delete");
        b_deletesolvedcomplaints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_deletesolvedcomplaintsActionPerformed(evt);
            }
        });

        l_pendingcomplaints.setText("Delete all Pending Complaints");

        b_deletependingcomplaints.setText("Delete");
        b_deletependingcomplaints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_deletependingcomplaintsActionPerformed(evt);
            }
        });

        l_allcomplaints.setText("Delete All Complaints");

        b_deleteallcomplaints.setText("Delete");
        b_deleteallcomplaints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_deleteallcomplaintsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_complaintnumber)
                            .addComponent(l_solvedcomplaints))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_complaintnumber, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(b_deletecomplaintnumber)
                                .addGap(33, 33, 33))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b_deletesolvedcomplaints)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_pendingcomplaints)
                            .addComponent(l_allcomplaints))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_deleteallcomplaints)
                            .addComponent(b_deletependingcomplaints))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_complaintnumber)
                    .addComponent(tf_complaintnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_deletecomplaintnumber))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_solvedcomplaints)
                    .addComponent(b_deletesolvedcomplaints))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_pendingcomplaints)
                    .addComponent(b_deletependingcomplaints))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_allcomplaints)
                    .addComponent(b_deleteallcomplaints))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void b_deletecomplaintnumberActionPerformed(java.awt.event.ActionEvent evt) {
        
        try {
            
            con = new Connector().getCon();
            stmt=con.prepareStatement("DELETE FROM proj.COMPLAINT_REG WHERE C_NUM = ?;");
            stmt.setString(1,tf_complaintnumber.getText());
            if(stmt.executeUpdate()!=1) {
                JOptionPane.showMessageDialog(null,"Enter a valid complaint number");
            }
            else {
                JOptionPane.showMessageDialog(null,"Complaint deleted Successfully");
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
    }//GEN-LAST:event_b_deletecomplaintnumberActionPerformed

    private void b_deletesolvedcomplaintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deletesolvedcomplaintsActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost/?user=risal&password=risal");
            Statement st=con.createStatement();
            PreparedStatement pst=con.prepareStatement("DELETE FROM proj.COMPLAINT_REG WHERE STATUS = \"Solved\";");
            JOptionPane.showMessageDialog(frame,"Solved Complaints Deleted");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_b_deletesolvedcomplaintsActionPerformed

    private void b_deletependingcomplaintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deletependingcomplaintsActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost/?user=risal&password=risal");
            Statement st=con.createStatement();
            PreparedStatement pst=con.prepareStatement("DELETE FROM proj.COMPLAINT_REG WHERE STATUS = \"Pending\";");
            JOptionPane.showMessageDialog(frame,"Pending Complaints Deleted");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_b_deletependingcomplaintsActionPerformed

    private void b_deleteallcomplaintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deleteallcomplaintsActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost/?user=risal&password=risal");
            Statement st=con.createStatement();
            PreparedStatement pst=con.prepareStatement("DELETE FROM proj.COMPLAINT_REG;");
            JOptionPane.showMessageDialog(frame,"All Complaints Deleted");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_b_deleteallcomplaintsActionPerformed


    public static void main() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteComplaintsAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_deleteallcomplaints;
    private javax.swing.JButton b_deletecomplaintnumber;
    private javax.swing.JButton b_deletependingcomplaints;
    private javax.swing.JButton b_deletesolvedcomplaints;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel l_allcomplaints;
    private javax.swing.JLabel l_complaintnumber;
    private javax.swing.JLabel l_pendingcomplaints;
    private javax.swing.JLabel l_solvedcomplaints;
    private javax.swing.JTextField tf_complaintnumber;
    private Connection con;
    private PreparedStatement stmt;
    // End of variables declaration//GEN-END:variables
}
