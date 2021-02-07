/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;


/**
 *
 * @author Vu Ngoc Thinh
 */
public class DBContext {

    protected Connection con;

    InitialContext init;
    Context context;
    String dbName, serverName, portNumber, username, password;

    public DBContext() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName= J3LP0013";
            String username = "sa";
            String password = "meomeo123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
    }
}
