/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kontroler;

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
        String username=gui.getuser();
        String pass=gui.getpass();
        try {
            rs=db.getdata("select * from login_supervisor where usupervisor='"+username+"' and psupervisor='"+pass+"'");
            if(rs.next()){
                gui.dispose();
                new menuAwalSupervisor_kontroler();
                if(rs.getString(2)=="supervisor"){
                    
                }else if(rs.getString(2)=="manager"){
                    
                }else if(rs.getString(2)=="kasir"){
                    
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
