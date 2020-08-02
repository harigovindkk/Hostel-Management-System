/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rr1
 */
public class HashingPassword {
    
    
    public static String generateHash(String data) {
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(HashingPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
        digest.reset();
        byte[] hash=digest.digest(data.getBytes());
        return bytesToStringHex(hash);
    }
    private final static char[] hexArray="0123456789ABCDEF".toCharArray();
    
    public static String bytesToStringHex(byte[] bytes) {
        char[] hexChars=new char[bytes.length*2];
        for(int j=0;j<bytes.length;j++) {
            int v=bytes[j]&0xFF;
            hexChars[j*2]=hexArray[v >>> 4];
            hexChars[j*2+1]=hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }
}
