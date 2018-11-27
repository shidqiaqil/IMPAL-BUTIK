/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import View.login;
import View.menuAwalSupervisor;
import database.database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

/**
 *
 * @author Shidqiaqil
 */
public class menuAwalSupervisor_kontroler implements ActionListener {
    private menuAwalSupervisor gui;
    private database db;
    private ResultSet rs;
    public menuAwalSupervisor_kontroler(){
        gui=new menuAwalSupervisor();
        gui.addListener(this);
        gui.setVisible(true);
        db = new database();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
