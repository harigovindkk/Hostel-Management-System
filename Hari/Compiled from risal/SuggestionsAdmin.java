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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author rr1
 */
public class SuggestionsAdmin extends javax.swing.JFrame {

    /**
     * Creates new form SuggestionsAdmin
     */
     static boolean flag=true;
     Connection con;
    public SuggestionsAdmin() {
        initComponents();
        if(flag==true) {
            flag=false;
            
        }
        fetch();
    }
    
    public void fetch()
    {
        try {
            con = new Connector().getCon();
            PreparedStatement pst=con.prepareStatement("SELECT * FROM proj.SUGGESTIONS;");
                //pst.setString(1,userid);
            ResultSet rs=pst.executeQuery();
            t_suggestions.setModel(DbUtils.resultSetToTableModel(rs));
            con.close();
            
        } 
        catch (Exception e) {
            e.printStackTrace();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        t_suggestions = new javax.swing.JTable();
        l_suggestions = new javax.swing.JLabel();
        l_reply = new javax.swing.JLabel();
        l_entersuggestionnumber = new javax.swing.JLabel();
        tf_entersuggestionnumber = new javax.swing.JTextField();
        l_entersuggetion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_entersuggestion = new javax.swing.JTextArea();
        b_submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Suggestions Register");
        setResizable(false);

        t_suggestions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(t_suggestions);

        l_suggestions.setText("Suggestions");

        l_reply.setText("REPLY TO SUGGESTIONS");

        l_entersuggestionnumber.setText("Enter Suggestion Number ");

        tf_entersuggestionnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_entersuggestionnumberActionPerformed(evt);
            }
        });

        l_entersuggetion.setText("Enter Suggestion(in 300 characters)");

        ta_entersuggestion.setColumns(20);
        ta_entersuggestion.setRows(5);
        jScrollPane2.setViewportView(ta_entersuggestion);

        b_submit.setText("Submit");
        b_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_suggestions)
                            .addComponent(l_reply)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_entersuggestionnumber)
                                .addGap(29, 29, 29)
                                .addComponent(tf_entersuggestionnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(l_entersuggetion))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(b_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(l_suggestions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_reply)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_entersuggestionnumber)
                    .addComponent(tf_entersuggestionnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_entersuggetion)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_entersuggestionnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_entersuggestionnumberActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tf_entersuggestionnumberActionPerformed

    private void b_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_submitActionPerformed
        // TODO add your handling code here:
         Connection con=null;
        Statement st=null;
        try
        {
         JFrame frame=new JFrame();
         con = new Connector().getCon();
         st=con.createStatement();
         PreparedStatement pst=con.prepareStatement("SELECT * FROM proj.SUGGESTIONS WHERE S_ID=?;");
         pst.setString(1,tf_entersuggestionnumber.getText());
         ResultSet rs=pst.executeQuery();
         if(rs.next()) {
             if(ta_entersuggestion.getText().length()<=300&&ta_entersuggestion.getText().length()>0) {
                 //UPDATE `proj`.`SUGGESTIONS` SET `REPLY` = 'nmk' WHERE (`SUGGESTION_NUM` = '2');
                 pst=con.prepareStatement("UPDATE `proj`.`SUGGESTIONS` SET `REPLY` = ? WHERE (`S_ID` = ?);");
                 pst.setString(1,ta_entersuggestion.getText());
                 pst.setString(2,tf_entersuggestionnumber.getText());
                 if(pst.executeUpdate()==1) {
                     JOptionPane.showMessageDialog(frame,"Successfully updated");
                 }
                 else {
                     JOptionPane.showMessageDialog(frame,"Couldn't update");
                 }
             }
             else {
                 JOptionPane.showMessageDialog(frame,"Check the limit");
             }
         }
         else {
             JOptionPane.showMessageDialog(frame,"No such suggestion number");
         }
         
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, e);
     }
     finally {
            fetch();
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(SuggestionsAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(SuggestionsAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
     }
    }//GEN-LAST:event_b_submitActionPerformed

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
//            java.util.logging.Logger.getLogger(SuggestionsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SuggestionsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SuggestionsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SuggestionsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SuggestionsAdmin().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_submit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l_entersuggestionnumber;
    private javax.swing.JLabel l_entersuggetion;
    private javax.swing.JLabel l_reply;
    private javax.swing.JLabel l_suggestions;
    private javax.swing.JTable t_suggestions;
    private javax.swing.JTextArea ta_entersuggestion;
    private javax.swing.JTextField tf_entersuggestionnumber;
    // End of variables declaration//GEN-END:variables
}