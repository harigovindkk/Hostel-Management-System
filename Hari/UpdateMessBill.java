/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttemp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author hari
 */
public class UpdateMessBill extends javax.swing.JFrame {

    /**
     * Creates new form UpdateMessBill
     */
    PreparedStatement query;
    public UpdateMessBill() {
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

        jLabel5 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jMonthChooser2 = new com.toedter.calendar.JMonthChooser();
        jYearChooser2 = new com.toedter.calendar.JYearChooser();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mc_month1 = new com.toedter.calendar.JMonthChooser();
        yc_year1 = new com.toedter.calendar.JYearChooser();
        jLabel3 = new javax.swing.JLabel();
        tf_totalamount1 = new javax.swing.JFormattedTextField();
        b_addbill = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_totalamount2 = new javax.swing.JFormattedTextField();
        b_fetchbill = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        mc_month2 = new com.toedter.calendar.JMonthChooser();
        yc_year2 = new com.toedter.calendar.JYearChooser();
        jLabel9 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf_maintanence1 = new javax.swing.JTextField();
        tf_staff1 = new javax.swing.JTextField();
        tf_fixed1 = new javax.swing.JTextField();
        tf_electricity1 = new javax.swing.JTextField();
        tf_water1 = new javax.swing.JTextField();
        tf_misc1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tf_maintanence2 = new javax.swing.JTextField();
        tf_staff2 = new javax.swing.JTextField();
        tf_fixed2 = new javax.swing.JTextField();
        tf_electricity2 = new javax.swing.JTextField();
        tf_water2 = new javax.swing.JTextField();
        tf_misc2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        b_updatebill = new javax.swing.JButton();
        dc_duedate = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        b_total1 = new javax.swing.JButton();
        b_total2 = new javax.swing.JButton();

        jLabel5.setText("Enter Total Amount");

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jButton2.setText("Update New Bill");

        jLabel6.setText("Select Month and Year");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Mess Bill");
        setResizable(false);

        jLabel1.setText("Add A New Common Bill");

        jLabel2.setText("Select Month and Year");

        jLabel3.setText("Total Fee");

        tf_totalamount1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        tf_totalamount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_totalamount1ActionPerformed(evt);
            }
        });

        b_addbill.setText("Add Bill");
        b_addbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_addbillActionPerformed(evt);
            }
        });

        jLabel4.setText("Update Bill of a Particular Inmate");

        jLabel7.setText("New Updated Amount");

        tf_totalamount2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        b_fetchbill.setText("Fetch Bill");
        b_fetchbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_fetchbillActionPerformed(evt);
            }
        });

        jLabel8.setText("Select Month and Year");

        jLabel9.setText("Enter Inmate ID");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel10.setText("Maintanence Fee");

        jLabel11.setText("Staff Salary");

        jLabel12.setText("Fixed Charge");

        jLabel13.setText("Electricity Fee");

        jLabel14.setText("Water Fee");

        jLabel15.setText("Miscallenous Fee");

        tf_maintanence1.setText("0");

        tf_staff1.setText("0");

        tf_fixed1.setText("0");

        tf_electricity1.setText("0");

        tf_water1.setText("0");

        tf_misc1.setText("0");

        jLabel17.setText("Fixed Charge");

        jLabel18.setText("Electricity Fee");

        jLabel19.setText("Water Fee");

        jLabel20.setText("Miscallenous Fee");

        jLabel21.setText("Maintanence Fee");

        jLabel22.setText("Staff Salary");

        b_updatebill.setText("Update Bill");
        b_updatebill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_updatebillActionPerformed(evt);
            }
        });

        jLabel16.setText("Due Date");

        b_total1.setText("Calculate Total");
        b_total1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_total1ActionPerformed(evt);
            }
        });

        b_total2.setText("Calculate Total");
        b_total2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_total2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_totalamount1)
                            .addComponent(dc_duedate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addComponent(mc_month1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(yc_year1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(47, 47, 47)
                                                .addComponent(tf_fixed1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel11)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(tf_staff1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel10)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(tf_maintanence1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel15)
                                                    .addComponent(jLabel14))))
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_misc1)
                                            .addComponent(tf_water1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(278, 278, 278)
                                        .addComponent(jLabel13)
                                        .addGap(42, 42, 42)
                                        .addComponent(tf_electricity1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b_addbill, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b_total1)
                        .addGap(203, 203, 203)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(47, 47, 47)
                                        .addComponent(tf_fixed2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(tf_staff2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel21)
                                                .addGap(18, 18, 18)
                                                .addComponent(tf_maintanence2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addGap(21, 21, 21)
                                                .addComponent(tf_misc2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel19)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(278, 278, 278)
                                        .addComponent(jLabel18)
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_water2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_electricity2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jLabel4)))
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(76, 76, 76))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(189, 189, 189)
                                        .addComponent(tf_totalamount2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(73, 73, 73))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(b_total2)
                                .addGap(248, 248, 248))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(23, 23, 23)
                                        .addComponent(mc_month2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(yc_year2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(b_updatebill))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(b_fetchbill, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(mc_month1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yc_year1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_maintanence1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(tf_electricity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_staff1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(tf_water1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_fixed1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(tf_misc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(b_total1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_totalamount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dc_duedate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(b_addbill)
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addComponent(mc_month2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yc_year2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(b_fetchbill)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_maintanence2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel18)
                    .addComponent(tf_electricity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_staff2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel19)
                    .addComponent(tf_water2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_fixed2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20)
                    .addComponent(tf_misc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(b_total2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_totalamount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_updatebill)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_addbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_addbillActionPerformed
        // TODO add your handling code here:
        int m=mc_month1.getMonth();
        int year=yc_year1.getYear();
        String monthname[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        String month=monthname[m];
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");  
        String due = dateFormat.format(dc_duedate.getDate());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
        LocalDateTime now = LocalDateTime.now();  
        String today=dtf.format(now); 
         try
     {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost/?user=hari&password=ubuntupassword");
         PreparedStatement pst=con.prepareStatement("INSERT INTO `proj`.`COMMON_MESS_BILL` (`MONTH`, `YEAR`, `MAINTANENCE_FEE`, `STAFF_SALARY`, `FIXED_CHARGE`, `ELECTRICITY_FEE`, `WATER_FEE`, `MISCALLENOUS_FEE`, `FINAL_AMOUNT`, `BILL_DATE`, `DUE_DATE`) VALUES (?,?,?,?,?,?,?,?,?,?,?);");
         pst.setString(1, month);
         pst.setString(2, Integer.toString(year));
         pst.setString(3, tf_maintanence1.getText());
         pst.setString(4, tf_staff1.getText());
         pst.setString(5, tf_fixed1.getText());
         pst.setString(6, tf_electricity1.getText());
         pst.setString(7, tf_water1.getText());
         pst.setString(8, tf_misc1.getText());
         pst.setString(9, tf_totalamount1.getText());
         pst.setString(10, today);
         pst.setString(11, due);
        int flag2 = pst.executeUpdate();
        if(flag2==1)
            JOptionPane.showMessageDialog(null,"Bill added Succesfully");
        pst.close();
        con.close();
     }
          catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, e);
     }
        
        
    }//GEN-LAST:event_b_addbillActionPerformed

    private void b_fetchbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_fetchbillActionPerformed
        // TODO add your handling code here:
        String id=tf_id.getText();
        String newamount=tf_totalamount2.getText();
        int m=mc_month2.getMonth();
        int year=yc_year2.getYear();
        String monthname[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        String month=monthname[m];

         try
     {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost/?user=hari&password=ubuntupassword");
         PreparedStatement pst=con.prepareStatement("SELECT * FROM proj.SPECIAL_BILL_REG WHERE USERID=? AND MONTH=?;");
         pst.setString(1,id);
         pst.setString(2,month);
         ResultSet rs=pst.executeQuery();
         if(rs.next())
         {   
             
         }
         else
         {
         pst=con.prepareStatement("SELECT * FROM proj.COMMON_MESS_BILL WHERE MONTH=? AND YEAR=?;");
         pst.setString(1,month);
         pst.setString(2,Integer.toString(year));
         rs=pst.executeQuery();
         }
         rs.first();
         tf_maintanence2.setText(rs.getString("MAINTANENCE_FEE"));
         tf_staff2.setText(rs.getString("STAFF_SALARY"));
         tf_fixed2.setText(rs.getString("FIXED_CHARGE"));
         tf_electricity2.setText(rs.getString("ELECTRICITY_FEE"));
         tf_water2.setText(rs.getString("WATER_FEE"));
         tf_misc2.setText(rs.getString("MISCALLENOUS_FEE"));
         
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, e);
     }
        
    }//GEN-LAST:event_b_fetchbillActionPerformed

    private void b_updatebillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_updatebillActionPerformed
       int m=mc_month2.getMonth();
        int year=yc_year2.getYear();
        String monthname[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        String month=monthname[m];
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");  
        //String due = dateFormat.format(dc_duedate.getDate());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
        LocalDateTime now = LocalDateTime.now();  
        String today=dtf.format(now); 
         try
     {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost/?user=hari&password=ubuntupassword");
         PreparedStatement pst=con.prepareStatement("UPDATE `proj`.`COMMON_MESS_BILL` (`MONTH`, `YEAR`, `MAINTANENCE_FEE`, `STAFF_SALARY`, `FIXED_CHARGE`, `ELECTRICITY_FEE`, `WATER_FEE`, `MISCALLENOUS_FEE`, `FINAL_AMOUNT`, `BILL_DATE`, `DUE_DATE`) VALUES (?,?,?,?,?,?,?,?,?,?,?);");
         pst.setString(1, month);
         pst.setString(2, Integer.toString(year));
         pst.setString(3, tf_maintanence1.getText());
         pst.setString(4, tf_staff1.getText());
         pst.setString(5, tf_fixed1.getText());
         pst.setString(6, tf_electricity1.getText());
         pst.setString(7, tf_water1.getText());
         pst.setString(8, tf_misc1.getText());
         pst.setString(9, tf_totalamount1.getText());
         pst.setString(10, today);
         pst.setString(11, due);
        int flag2 = pst.executeUpdate();
        if(flag2==1)
            JOptionPane.showMessageDialog(null,"Bill added Succesfully");
        pst.close();
        con.close();
     }
          catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, e);
     }
    }//GEN-LAST:event_b_updatebillActionPerformed

    private void tf_totalamount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_totalamount1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_totalamount1ActionPerformed

    private void b_total1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_total1ActionPerformed
        // TODO add your handling code here:
        int finalamt=Integer.valueOf(tf_maintanence1.getText())+Integer.valueOf(tf_staff1.getText())+Integer.valueOf(tf_fixed1.getText())+Integer.valueOf(tf_electricity1.getText())+Integer.valueOf(tf_water1.getText())+Integer.valueOf(tf_misc1.getText());
        tf_totalamount1.setText(Integer.toString(finalamt));
    }//GEN-LAST:event_b_total1ActionPerformed

    private void b_total2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_total2ActionPerformed
        // TODO add your handling code here:
        int finalamt=Integer.valueOf(tf_maintanence2.getText())+Integer.valueOf(tf_staff2.getText())+Integer.valueOf(tf_fixed2.getText())+Integer.valueOf(tf_electricity2.getText())+Integer.valueOf(tf_water2.getText())+Integer.valueOf(tf_misc2.getText());
        tf_totalamount2.setText(Integer.toString(finalamt));
    }//GEN-LAST:event_b_total2ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateMessBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMessBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMessBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMessBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMessBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_addbill;
    private javax.swing.JButton b_fetchbill;
    private javax.swing.JButton b_total1;
    private javax.swing.JButton b_total2;
    private javax.swing.JButton b_updatebill;
    private com.toedter.calendar.JDateChooser dc_duedate;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMonthChooser2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JYearChooser jYearChooser2;
    private com.toedter.calendar.JMonthChooser mc_month1;
    private com.toedter.calendar.JMonthChooser mc_month2;
    private javax.swing.JTextField tf_electricity1;
    private javax.swing.JTextField tf_electricity2;
    private javax.swing.JTextField tf_fixed1;
    private javax.swing.JTextField tf_fixed2;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_maintanence1;
    private javax.swing.JTextField tf_maintanence2;
    private javax.swing.JTextField tf_misc1;
    private javax.swing.JTextField tf_misc2;
    private javax.swing.JTextField tf_staff1;
    private javax.swing.JTextField tf_staff2;
    private javax.swing.JFormattedTextField tf_totalamount1;
    private javax.swing.JFormattedTextField tf_totalamount2;
    private javax.swing.JTextField tf_water1;
    private javax.swing.JTextField tf_water2;
    private com.toedter.calendar.JYearChooser yc_year1;
    private com.toedter.calendar.JYearChooser yc_year2;
    // End of variables declaration//GEN-END:variables
}
