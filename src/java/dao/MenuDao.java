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
import model.Menu;

/**
 *
 * @author Vu Ngoc Thinh
 */
public class MenuDao extends DBContext {

    public int getTotalMenu() {
        
        String sql = "SELECT COUNT(id) AS total FROM Menu";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    public ArrayList<Menu> getMenus(int pageIndex, int size) {
        ArrayList<Menu> list = new ArrayList<>();
        String sql = "select * from\n"
                + "(\n"
                + "	select ROW_NUMBER() over (order by id asc) as rs, *\n"
                + "	from Menu\n"
                + ") as x\n"
                + "\n"
                + "where rs between ?*?-2 and ?*?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, pageIndex);
            st.setInt(2, size);
            st.setInt(3, pageIndex);
            st.setInt(4, size);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Menu(rs.getInt(2), rs.getString(3), rs.getString(4), 
                        rs.getFloat(5), rs.getString(6)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
