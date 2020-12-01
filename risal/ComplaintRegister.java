package hari;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author hari
 */
public class ComplaintRegister extends javax.swing.JFrame {


    
    public ComplaintRegister(String id) {
        initComponents(id);
        fetch();
    }


    private void initComponents(String id) {

        //Nimbus begining
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ComplaintRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComplaintRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComplaintRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComplaintRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //Nimbus ending
        userid=id;
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_relatedto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_details = new javax.swing.JTextArea();
        b_submit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_previouscomplaints = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Complaint Register");
        setResizable(false);

        jLabel1.setText("REGISTER A NEW COMPLAINT");

        jLabel2.setText("Complaint Related To");

        cb_relatedto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mess/Food", "Maintanence", "Staff", "Other" }));

        jLabel3.setText("Complaint Details");

        ta_details.setColumns(20);
        ta_details.setLineWrap(true);
        ta_details.setRows(5);
        jScrollPane1.setViewportView(ta_details);

        b_submit.setText("Submit Complaint");
        b_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_submitActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setText("YOUR PREVIOUS COMPLAINTS");

        t_previouscomplaints.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(t_previouscomplaints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(cb_relatedto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(b_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cb_relatedto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel3)))
                        .addGap(55, 55, 55)
                        .addComponent(b_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }

    private void b_submitActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy ");  
            LocalDateTime now = LocalDateTime.now();  
            String today=dtf.format(now); 
            String relatedto=cb_relatedto.getItemAt(cb_relatedto.getSelectedIndex());
            String details=ta_details.getText();
            con=new Connector().getCon();
            stmt=con.prepareStatement("INSERT INTO `proj`.`COMPLAINT_REG` ( `USER_ID`, `RELATED_TO`, `DETAILS`,`DATE_TIME`,`STATUS`) VALUES (?, ?, ?, ?, ?);");
            stmt.setString(1,userid);
            stmt.setString(2,relatedto);
            stmt.setString(3,details);
            stmt.setString(4,today);
            stmt.setString(5,"Pending");
            int flag = stmt.executeUpdate();
            if(flag==1)
                JOptionPane.showMessageDialog(null,"Complaint Submitted");
            
            }catch (SQLException ex) {
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
        fetch();
    }

    public void fetch() {
        try {
            con=new Connector().getCon();
            stmt=con.prepareStatement("select C_NUM,RELATED_TO,DETAILS,DATE_TIME,STATUS from proj.COMPLAINT_REG where USER_ID= ? ");
            stmt.setString(1,userid);
            ResultSet rs=stmt.executeQuery();
            t_previouscomplaints.setModel(DbUtils.resultSetToTableModel(rs));

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
    
    // Variables declaration - do not modify
    private javax.swing.JComboBox<String> cb_relatedto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable t_previouscomplaints;
    private javax.swing.JTextArea ta_details;
    private javax.swing.JButton b_submit;
    private String userid;
    private Connection con;
    private PreparedStatement stmt;
    // End of variables declaration
}