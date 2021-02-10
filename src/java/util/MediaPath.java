/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Vu Ngoc Thinh
 */
public class MediaPath {

    public static String getMediaPath() {

        InitialContext init = null;
        String mediaPath = null;
        Context context = null;
        try {
            init = new InitialContext();
            context = ((Context) init.lookup("java:comp/env"));
            mediaPath = context.lookup("mediaPath").toString();
        } catch (NamingException ex) {
            Logger.getLogger(MediaPath.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return mediaPath;
    }
}
