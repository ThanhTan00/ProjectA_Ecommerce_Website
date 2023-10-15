/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author tanle
 */
public class Account {
    private int id;
    private String user;
    private String password;
    private int isSeller;
    private int isAdmin;

    public Account(int id, String user, String password, int isSeller, int isAdmin) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.isSeller = isSeller;
        this.isAdmin = isAdmin;
    }
    
    public void doPost() {
        
    }

    public int getIsSeller() {
        return isSeller;
    }

    public void setIsSeller(int isSeller) {
        this.isSeller = isSeller;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }
    
    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", user=" + user + ", password=" + password + ", isSeller=" + isSeller + ", isAdmin=" + isAdmin + '}';
    }

 
}