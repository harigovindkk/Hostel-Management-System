/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author rr1
 */
public class FileSelection {
    public static JFileChooser getFileChooser() {
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files","jpeg");
        JFileChooser filechooser=new JFileChooser();
        filechooser.setMultiSelectionEnabled(true);
        filechooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        filechooser.setFileFilter(filter);
        filechooser.setFileHidingEnabled(false);
        return filechooser;
    }
    
}
