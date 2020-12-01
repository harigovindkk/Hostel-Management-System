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
public class Home_OutgoingRegister extends javax.swing.JFrame {  
    public Home_OutgoingRegister(String id) {  
        initComponents(id);
        fetch();
    }
    
    public void fetch() {
        try
        {
           con=new Connector().getCon();
           stmt=con.prepareStatement("select DATE_TIME_OUT,HOME_OUT,PLACE from proj.HOME_OUT_REG where USER_ID= ? and DATE_TIME_IN= ? ;");
           stmt.setString(1,userid);
           stmt.setString(2, "0");
           ResultSet rs=stmt.executeQuery();
           t_register.setModel(DbUtils.resultSetToTableModel(rs));
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
            java.util.logging.Logger.getLogger(Home_OutgoingRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_OutgoingRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_OutgoingRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_OutgoingRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //Nimbus ending
        con=null;
        stmt=null;
        userid=id;
        dtf = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy ");
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_option = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tf_place = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_register = new javax.swing.JTable();
        b_checkout = new javax.swing.JButton();
        b_checkin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Home Going / Out Going Register");
        setResizable(false);

        jLabel1.setText("CHECK OUT FORM");

        jLabel2.setText("Select Option");

        cb_option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home Going", "Out Going" }));

        jLabel3.setText("Place Going To");

        jLabel4.setText("CHECK IN FORM");

        t_register.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(t_register);

        b_checkout.setText("Check Out Now");
        b_checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_checkoutActionPerformed(evt);
            }
        });

        b_checkin.setText("Check In Now");
        b_checkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_checkinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(b_checkin, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_option, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_place, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b_checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_place, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(b_checkout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_checkin)
                .addGap(25, 25, 25))
        );

        pack();
    }

    private void b_checkoutActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            now = LocalDateTime.now();  
            String today=dtf.format(now); 
            String opt=cb_option.getItemAt(cb_option.getSelectedIndex());
            String place=tf_place.getText();
            con=new Connector().getCon();
            stmt=con.prepareStatement("INSERT INTO `proj`.`HOME_OUT_REG` (`USER_ID`, `DATE_TIME_OUT`, `HOME_OUT`,`PLACE`,`DATE_TIME_IN`) VALUES (?, ?, ?, ?, ?);");
            stmt.setString(1,userid);
            stmt.setString(2,today);
            stmt.setString(3,opt);
            stmt.setString(4,place);
            stmt.setString(5,"0");
            int flag = stmt.executeUpdate();
            if(flag==1)
                JOptionPane.showMessageDialog(null,"Checked Out Succesfully");
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
        fetch();
    }

    private void b_checkinActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            now = LocalDateTime.now();  
            String today=dtf.format(now); 
            con=new Connector().getCon();
            stmt=con.prepareStatement("update proj.HOME_OUT_REG set DATE_TIME_IN = ? where USER_ID= ? and DATE_TIME_IN= ? ;");
            stmt.setString(1,today);
            stmt.setString(2,userid);
            stmt.setString(3, "0");
            int flag = stmt.executeUpdate();
            if(flag==1)
                JOptionPane.showMessageDialog(null,"Checked In successfully");
            stmt.close();
            con.close();

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
        fetch();
    }

    
    // Variables declaration - do not modify
    private javax.swing.JButton b_checkin;
    private javax.swing.JButton b_checkout;
    private javax.swing.JComboBox<String> cb_option;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable t_register;
    private javax.swing.JTextField tf_place;
    private Connection con;
    private PreparedStatement stmt;
    private String userid;
    private DateTimeFormatter dtf;
    private LocalDateTime now ;
    // End of variables declaration
}