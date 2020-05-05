package projecttemp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hari
 */
public class StudentDashboard extends javax.swing.JFrame {

    /**
     * Creates new form StudentDashboard
     */
    public StudentDashboard() {
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

        b_homegoingoutgoing = new javax.swing.JButton();
        b_complaintregister = new javax.swing.JButton();
        b_suggestions = new javax.swing.JButton();
        b_messbill = new javax.swing.JButton();
        b_messmenu = new javax.swing.JButton();
        b_messreduction = new javax.swing.JButton();
        b_hostelvacateroomchange = new javax.swing.JButton();
        b_studentslookup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Dashboard");

        b_homegoingoutgoing.setText("Homegoing/Outgoing Register");
        b_homegoingoutgoing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_homegoingoutgoingActionPerformed(evt);
            }
        });

        b_complaintregister.setText("Complaint Register");
        b_complaintregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_complaintregisterActionPerformed(evt);
            }
        });

        b_suggestions.setText("Suggestions");
        b_suggestions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_suggestionsActionPerformed(evt);
            }
        });

        b_messbill.setText("Mess Bill");
        b_messbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_messbillActionPerformed(evt);
            }
        });

        b_messmenu.setText("Mess Menu");
        b_messmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_messmenuActionPerformed(evt);
            }
        });

        b_messreduction.setText("Mess Reduction");
        b_messreduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_messreductionActionPerformed(evt);
            }
        });

        b_hostelvacateroomchange.setText("Hostel Vacate/Room Change ");
        b_hostelvacateroomchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_hostelvacateroomchangeActionPerformed(evt);
            }
        });

        b_studentslookup.setText("Students Lookup");
        b_studentslookup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_studentslookupActionPerformed(evt);
            }
        });

        jLabel1.setText("Welcome User ! Select any one of the below options to continue ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_suggestions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_complaintregister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_messmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_homegoingoutgoing, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_messbill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_hostelvacateroomchange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_studentslookup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_messreduction, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_hostelvacateroomchange, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_homegoingoutgoing, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_complaintregister, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_studentslookup, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_suggestions, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_messreduction, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_messbill, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_messmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_homegoingoutgoingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_homegoingoutgoingActionPerformed
        // TODO add your handling code here:
                  
    }//GEN-LAST:event_b_homegoingoutgoingActionPerformed

    private void b_complaintregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_complaintregisterActionPerformed
        // TODO add your handling code here:
        new ComplaintRegister();
    }//GEN-LAST:event_b_complaintregisterActionPerformed

    private void b_suggestionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_suggestionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_suggestionsActionPerformed

    private void b_messmenuActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_b_messmenuActionPerformed
        // TODO add your handling code here:
        new MessMenu();
    }//GEN-LAST:event_b_messmenuActionPerformed

    private void b_hostelvacateroomchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_hostelvacateroomchangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_hostelvacateroomchangeActionPerformed

    private void b_studentslookupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_studentslookupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_studentslookupActionPerformed

    private void b_messreductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_messreductionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_messreductionActionPerformed

    private void b_messbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_messbillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_messbillActionPerformed

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
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_complaintregister;
    private javax.swing.JButton b_homegoingoutgoing;
    private javax.swing.JButton b_hostelvacateroomchange;
    private javax.swing.JButton b_messbill;
    private javax.swing.JButton b_messmenu;
    private javax.swing.JButton b_messreduction;
    private javax.swing.JButton b_studentslookup;
    private javax.swing.JButton b_suggestions;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
