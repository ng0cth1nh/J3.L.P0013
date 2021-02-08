/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import model.Media;

/**
 *
 * @author Vu Ngoc Thinh
 */
public class MediaDao extends DBContext {

    InitialContext init;
    Context context;
    String mediaPath;

    public ArrayList<Media> getMedia() {
        ArrayList<Media> list = new ArrayList<>();

        String sql = "select * from Media";

        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            init = new InitialContext();
            context = ((Context) init.lookup("java:comp/env"));
            mediaPath = context.lookup("mediaPath").toString();
            while (rs.next()) {
                list.add(new Media(rs.getInt("id"), rs.getString("name"), mediaPath + rs.getString("icon"), rs.getString("link")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MediaDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            Logger.getLogger(MediaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    
}
