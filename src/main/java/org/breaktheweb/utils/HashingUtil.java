package org.breaktheweb.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author famous-five
 */
public class HashingUtil {
    public static String hashPassword(String password) 
    {
         StringBuffer sb=null;
        try
        {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte byteData[] = md.digest();
            sb= new StringBuffer();
            for (int i = 0; i < byteData.length; i++) 
            {
             sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }   
        }
        catch(NoSuchAlgorithmException e)
        {
            
        }
        return sb.toString();
    }
}