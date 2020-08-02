/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author rr1
 */
public class RainbowTableChecker {
    public static boolean checkInRainbowTable(String password) {
        File file = new File("RainbowTable.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(password.equals(line)) { 
                    return true;
                }
            }
        } catch(Exception e) { 
            JOptionPane.showMessageDialog(null, "Security Error. Contact System admin");
        }
        return false;
    }
    public static void main(String args[]) {
        System.out.println(RainbowTableChecker.checkInRainbowTable("Hello"));
    }
    
}
