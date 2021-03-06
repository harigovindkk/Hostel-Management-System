/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttemp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author hari
 */
public class WelcomeScreenFinal extends javax.swing.JFrame {

    /**
     * Creates new form WelcomeScreenFinal
     */
    public WelcomeScreenFinal() {
        initComponents();
    }

    private void initComponents() {

        con=null;
        stmt=null;
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_userid = new javax.swing.JTextField();
        pf_password = new javax.swing.JPasswordField();
        b_login = new javax.swing.JButton();
        b_forgotpassword = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        b_signup = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cb_loginas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hostel Management Application");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.gray);
        setResizable(false);

        try {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projecttemp/tkm_hostel.jpg"))); // NOI18N
            jLabel1.setText("jLabel1");

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projecttemp/tkm_hostel1.jpg"))); // NOI18N
            jLabel2.setText("jLabel2");
        } catch(NullPointerException e) {
            JOptionPane.showMessageDialog(null,"Could not load image");
        }
        jLabel3.setText("USER ID");

        jLabel4.setText("PASSWORD");

        b_login.setText("LOGIN");
        b_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_loginActionPerformed(evt);
            }
        });

        b_forgotpassword.setText("Forgot Password?");
        b_forgotpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_forgotpasswordActionPerformed(evt);
            }
        });

        jLabel5.setText("New User ?");

        b_signup.setText("Sign Up");
        b_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_signupActionPerformed(evt);
            }
        });

        jLabel6.setText("LOGIN AS");

        cb_loginas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STUDENT", "HOSTEL SEC", "ADMIN" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(b_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(74, 74, 74)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pf_password)
                                        .addComponent(tf_userid, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addComponent(b_forgotpassword))
                        .addComponent(b_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_loginas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_loginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(b_login, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(b_forgotpassword)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(b_signup))
                .addGap(36, 36, 36))
        );

        pack();
    }

        private void b_loginActionPerformed(java.awt.event.ActionEvent evt) {
        try
        {
            String userid=tf_userid.getText();
            String password=new String(pf_password.getPassword());
            String usertype=cb_loginas.getSelectedItem().toString();
            con=new Connector().getCon();
            if(usertype.equals("HOSTEL SEC"))
                stmt=con.prepareStatement("SELECT * FROM proj.STUDENTLIST WHERE REG_NO=? AND PASSWORD=?;");
            else
                if(usertype.equals("STUDENT"))
                {

                    stmt=con.prepareStatement("SELECT * from proj.STUDENTLIST WHERE REG_NO=? AND PASSWORD=?;");

                }
                else
                    stmt=con.prepareStatement("SELECT * FROM proj.ADMIN WHERE REG_NO=? AND PASSWORD=?;");
            
            stmt.setString(1,userid);
            stmt.setString(2,HashingPassword.generateHash(password));
            ResultSet rs=stmt.executeQuery();

            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Login Success");
                if(usertype.equals("Admin"))
                {
                    
                    //new WardenDashboard();
                }
                else if((usertype.equals("Student")))
                        {
                            java.awt.EventQueue.invokeLater(new Runnable() {
                                public void run() {
                                    new StudentDashboard(userid).setVisible(true);
                                    System.out.println(java.awt.EventQueue.getMostRecentEventTime());
                                }
                            });
                            
                        }
                else
                {
                    new StudentDashboard(userid);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid Credentials");
                tf_userid.setText("");
                pf_password.setText("");
                
            }
            
        } catch(ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Class Error. Contact System Admin");
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin");
        } finally {
            try {
                  if(con!=null) con.close();
                  
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin");
            }
            try {
                  if(stmt!=null) stmt.close();
                  
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin");
            }
            
        }
    }

    private void b_forgotpasswordActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null,"Please contact System Admin");
    }

    private void b_signupActionPerformed(java.awt.event.ActionEvent evt) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationWindow(false).setVisible(true);
            }
        });  
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreenFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreenFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreenFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreenFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeScreenFinal().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton b_forgotpassword;
    private javax.swing.JButton b_login;
    private javax.swing.JButton b_signup;
    private javax.swing.JComboBox<String> cb_loginas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JTextField tf_userid;
    private Connection con;
    private PreparedStatement stmt;
    // End of variables declaration
}
