/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import View.menuAwalSupervisor;
import database.database;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import View.menuAwalSupplier;
import java.awt.event.ActionEvent;
/**
 *
 * @author Shidqiaqil
 */
public class suplier_kontroler implements ActionListener {
    private menuAwalSupplier gui;
    private database db;
    private ResultSet rs;
    

public suplier_kontroler(){
        gui=new menuAwalSupplier();
        gui.addListener(this);
        gui.setVisible(true);
        db = new database();
    }
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       Object source= e.getSource();
       if (source.equals(gui.getstombolinput())){
           gui.dispose();
           new inputbaju_kontroler();
       }if (source.equals(gui.getstombolcek())){
           gui.dispose();
           new stokbaju_kontroler();
       }if (source.equals(gui.getstombollogout())){
           gui.dispose();
           new login_kontroler();
       }
    } 

}