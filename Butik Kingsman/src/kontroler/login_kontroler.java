/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kontroler;

import Model.addslashes;
import View.login;
import database.database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Shidqiaqil
 */
public class login_kontroler implements ActionListener{
    private login gui;
    private database db;
    private ResultSet rs;
    public login_kontroler(){
        gui=new login();
        gui.addListener(this);
        gui.setVisible(true);
        db = new database();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        addslashes a=new addslashes();
        a.setX(gui.getuser());
        String username=a.addslash();
        a.setX(gui.getpass());
        String pass=a.addslash();
        System.out.println("select * from login_supervisor where usupervisor='"+username+"' and psupervisor='"+pass+"'");
        try {
            rs=db.getdata("select * from login_supervisor where usupervisor='"+username+"' and psupervisor='"+pass+"'");
            if(rs.next()){
                
                if(rs.getString(3).equals("supervisor")){
                    gui.dispose();
                    new menuAwalSupervisor_kontroler();
                }else if(rs.getString(3).equals("suplier")){
                    gui.dispose();
                    new suplier_kontroler();
                }else if(rs.getString(3).equals("kasir")){
                    gui.dispose();
                    new kasir_kontroler();
                } 
            }else{
                JOptionPane.showMessageDialog(gui, "maaf user tidak ada", "error", 0);
                gui.reset();
            }
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException ex) {
            Logger.getLogger(login_kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
