/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Context.DBContext;
import Entity.Account;
import Entity.Category;
import Entity.Product;
import java.sql.*;
import java.util.*;
/**
 *
 * @author tanle
 */
public class DAO {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public ArrayList<Product> getAllProduct() {
        ArrayList<Product> list = new ArrayList<Product>();
        String query = "SELECT * FROM product_tb";
        try {
            con = DBContext.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery(query);
            //String imageLocation="resources\\uploadedIMG\\" + imgName + ".jpg";
            while (rs.next()) {
                Product product = new Product(rs.getString(1),
                        rs.getString(2),
                        "images\\ProductImages\\"+rs.getString(3)+".jpg",
                        rs.getDouble(4),
                        rs.getInt(5),
                        rs.getString(6)
                );
                list.add(product);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    public ArrayList<Category> getAllCategory() {
        ArrayList<Category> list = new ArrayList<Category>();
        String query = "SELECT * FROM categories";
        try {
            con = DBContext.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery(query);
            //String imageLocation="resources\\uploadedIMG\\" + imgName + ".jpg";
            while (rs.next()) {
                Category category = new Category(rs.getInt(1),
                        rs.getString(2)
                );
                list.add(category);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
     
     public ArrayList<Product> getNewestProduct() {
        ArrayList<Product> list = new ArrayList<Product>();
        String query = "SELECT * FROM product order by product_id desc";
        try {
            con = DBContext.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery(query);
            int count =0;
            //String imageLocation="resources\\uploadedIMG\\" + imgName + ".jpg";
            while (rs.next() && count <6){
                 Product product = new Product(rs.getString(1),
                            rs.getString(2),
                            "images\\ProductImages\\"+rs.getString(3)+".jpg",
                            rs.getDouble(4),
                            rs.getInt(5),
                            rs.getString(6)
                    );
                    list.add(product);
                    count++;
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
//    public static void main(String[] args) {
//        DAO dao = new DAO();
//        ArrayList<Product> list = dao.getAllProduct();
//        for (Product p : list){
//            System.out.println(p);
//        }
//    }
}
