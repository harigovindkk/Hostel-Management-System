/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmsadmin;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author rr1
 */
public class SendMessage extends javax.swing.JFrame {

    /**
     * Creates new form SendMessage
     */
    Connection con=null;
    PreparedStatement stmt=null;
    ResultSet rs=null;
    String query;
    String adminid;
    public SendMessage(String adminid) {
        this.adminid=adminid;
    }
    public SendMessage() {
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

        l_sentmessages = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_sentmessages = new javax.swing.JTable();
        l_sendmessage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_message = new javax.swing.JTextArea();
        b_clearall = new javax.swing.JButton();
        l_to = new javax.swing.JLabel();
        tf_to = new javax.swing.JTextField();
        cb_toall = new javax.swing.JCheckBox();
        b_send = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Messenger");
        setResizable(false);

        l_sentmessages.setText("Sent Messages");

        t_sentmessages.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(t_sentmessages);

        l_sendmessage.setText("Send Message");

        ta_message.setColumns(20);
        ta_message.setRows(5);
        jScrollPane2.setViewportView(ta_message);

        b_clearall.setText("Clear All");
        b_clearall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_clearallActionPerformed(evt);
            }
        });

        l_to.setText("To");

        tf_to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_toActionPerformed(evt);
            }
        });

        cb_toall.setText("To All");
        cb_toall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_toallActionPerformed(evt);
            }
        });

        b_send.setText("Send");
        b_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_sendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_to)
                        .addGap(33, 33, 33)
                        .addComponent(tf_to)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_toall)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_sendmessage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b_clearall))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                            .addComponent(l_sentmessages)
                            .addComponent(b_send, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(50, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_sentmessages)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addComponent(b_clearall))
                .addGap(1, 1, 1)
                .addComponent(l_sendmessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_to)
                    .addComponent(tf_to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_toall))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_send)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_toActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void b_sendActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
         try {
                                              
        // TODO add your handling code here:
            query="INSERT INTO `proj`.`MESSAGES` (`MSG_FROM`, `MSG_TO`, `MESSAGE`) VALUES (?, ?, ?);";
            con=new Connector().getCon();
            stmt=con.prepareStatement("SELECT * FROM proj.STUDENTLIST WHERE REG_NO=?");
            stmt.setString(1,tf_to.getText());
            rs=stmt.executeQuery();
            if(rs.next()||tf_to.getText().equals("ALL")) {
                stmt=con.prepareStatement(query);
                stmt.setString(1, adminid);
                stmt.setString(2,tf_to.getText());
                stmt.setString(3,ta_message.getText());
                stmt.executeUpdate();
                this.printTable();
            }
            else
                JOptionPane.showMessageDialog(null,"Invalid Student number");
        }                                      
        catch (ClassNotFoundException ex) {
            Logger.getLogger(SendMessage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SendMessage.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                
            if(con!=null) con.close();
            if(stmt!=null) stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(SendMessage.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }                                      

    private void b_clearallActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
         try {
//GEN-FIRST:event_tf_toActionPerformed
        // TODO add your handling code here:
            query="TRUNCATE TABLE proj.MESSAGES;";
            con=new Connector().getCon();
            stmt=con.prepareStatement(query);
            stmt.executeUpdate();
            this.printTable();
        }//GEN-LAST:event_tf_toActionPerformed
        catch (ClassNotFoundException ex) {
            Logger.getLogger(SendMessage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SendMessage.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                
            if(con!=null) con.close();
            if(stmt!=null) stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(SendMessage.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }                                          

    private void cb_toallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_toallActionPerformed
        // TODO add your handling code here:
        if(cb_toall.isSelected()) {
            tf_to.setText("ALL");
            tf_to.setEnabled(false);
        }
        else {
            tf_to.setText("");
            tf_to.setEnabled(true);
        }
    }//GEN-LAST:event_cb_toallActionPerformed
private void printTable() {
        try {
            con=new Connector().getCon();
            String query="SELECT * FROM proj.MESSAGES;";
            stmt=con.prepareStatement(query);
            rs=stmt.executeQuery();
            t_sentmessages.setModel(DbUtils.resultSetToTableModel(rs));     
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SendMessage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SendMessage.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                if(con!=null) con.close();
                if(stmt!=null) stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(SendMessage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
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
//            java.util.logging.Logger.getLogger(SendMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SendMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SendMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SendMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SendMessage().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_clearall;
    private javax.swing.JButton b_send;
    private javax.swing.JCheckBox cb_toall;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l_sendmessage;
    private javax.swing.JLabel l_sentmessages;
    private javax.swing.JLabel l_to;
    private javax.swing.JTable t_sentmessages;
    private javax.swing.JTextArea ta_message;
    private javax.swing.JTextField tf_to;
    // End of variables declaration//GEN-END:variables
}
