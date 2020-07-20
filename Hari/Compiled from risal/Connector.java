/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmsadmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rr1
 */
public class Connector {
    Connection con=null;
    public Connector() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //con=DriverManager.getConnection("jdbc:mysql://localhost/?user=risal&password=risal");
        con=DriverManager.getConnection("jdbc:mysql://localhost/?user=hari&password=ubuntupassword");
    }
    Connection getCon() {
        return con;
    }
}
