/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmsadmin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author rr1
 */
public class ChangeStatusAdmin extends javax.swing.JFrame {

    /**
     * Creates new form ChangeStatusAdmin
     */
    private Connection con;
    public ChangeStatusAdmin() {
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

        cb_status = new javax.swing.JComboBox<>();
        l_entercomplaintname = new javax.swing.JLabel();
        tf_entercomplaintnumber = new javax.swing.JTextField();
        b_change = new javax.swing.JButton();
        l_status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Complaint Status");
        setResizable(false);

        cb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Solved" }));
        cb_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_statusActionPerformed(evt);
            }
        });

        l_entercomplaintname.setText("Enter Complaint Number ");

        b_change.setText("Change");
        b_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_changeActionPerformed(evt);
            }
        });

        l_status.setText("Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_entercomplaintname)
                .addGap(28, 28, 28)
                .addComponent(tf_entercomplaintnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(l_status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_change)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_entercomplaintname)
                    .addComponent(tf_entercomplaintnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_change)
                    .addComponent(l_status))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_changeActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame();
        try {
            con = new Connector().getCon();
            PreparedStatement pst=con.prepareStatement("SELECT * FROM proj.COMPLAINT_REG WHERE C_NUM=?;");
            pst.setString(1,tf_entercomplaintnumber.getText());
            ResultSet rs=pst.executeQuery();
            if(rs.next()) {
                pst=con.prepareStatement("UPDATE `proj`.`COMPLAINT_REG` SET `STATUS` = ? WHERE (`C_NUM` = ?);");
                pst.setString(1, (String) cb_status.getSelectedItem());
                pst.setString(2,tf_entercomplaintnumber.getText());
                if(pst.executeUpdate()!=1) {
                    JOptionPane.showMessageDialog(frame,"Status couldn't be changed");
                }
                else {
                    JOptionPane.showMessageDialog(frame,"Status changed");
                }

            }
            else {
                JOptionPane.showMessageDialog(frame,"No such complaint number");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_b_changeActionPerformed

    private void cb_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_statusActionPerformed

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
//            java.util.logging.Logger.getLogger(ChangeStatusAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ChangeStatusAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ChangeStatusAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ChangeStatusAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ChangeStatusAdmin().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_change;
    private javax.swing.JComboBox<String> cb_status;
    private javax.swing.JLabel l_entercomplaintname;
    private javax.swing.JLabel l_status;
    private javax.swing.JTextField tf_entercomplaintnumber;
    // End of variables declaration//GEN-END:variables
}
