/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import View.menuAwalKasir;
import database.database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

/**
 *
 * @author Shidqiaqil
 */
public class kasir_kontroler implements ActionListener{
    private menuAwalKasir gui;
    private database db;
    private ResultSet rs;


public kasir_kontroler(){
    gui = new menuAwalKasir();
    gui.addListener(this);
    gui.setVisible(true);
    db = new database();
}
public void actionPerformed(ActionEvent e){
    Object source= e.getSource();
    if (source.equals(gui.getstombolinputlaporan())){
        gui.dispose();
    } if (source.equals(gui.getstombolstokbaju())){
        gui.dispose();
        new stokbaju_kontroler();    
    }if (source.equals(gui.getstombolinputlaporan())){
        gui.dispose();
        new inputlaporan_kontroler(); 
    }if (source.equals(gui.getstombollogout())){
        gui.dispose();
        new login_kontroler(); 
    }

}
}