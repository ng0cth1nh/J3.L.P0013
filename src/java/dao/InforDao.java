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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Information;
import util.MediaPath;

/**
 *
 * @author Vu Ngoc Thinh
 */
public class InforDao extends DBContext {

    String mediaPath = MediaPath.getMediaPath();

    public Information getInformation() {
        String sql = "SELECT * FROM Information";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new Information(rs.getString(1),
                        rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5),
                        mediaPath + rs.getString(6));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InforDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
