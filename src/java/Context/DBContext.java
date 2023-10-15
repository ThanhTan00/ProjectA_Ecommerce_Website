/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tanle
 */
public class DBContext {
        public static Connection getConnection(){
            String url="jdbc:mysql://localhost:3306/project_a_db";
            String user ="root";
            String password = "admin";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                return DriverManager.getConnection(url,user,password);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
            }

            return null;
        }
        public static void main(String[] args) {
        Connection con = DBContext.getConnection();
            System.out.println(con);
    }
    }
