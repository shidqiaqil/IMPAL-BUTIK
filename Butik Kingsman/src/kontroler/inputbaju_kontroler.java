/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import View.inputBajuJadi;
import database.database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Shidqiaqil
 */
public class inputbaju_kontroler implements ActionListener{
    private inputBajuJadi gui;
    private database db= new database();
    private ResultSet rs =null;
    public inputbaju_kontroler(){
        gui=new inputBajuJadi();
        gui.addListener(this);
        gui.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if(source.equals(gui.getstombollogout())){
            gui.dispose();
            new login_kontroler();
        }else if(source.equals(gui.getstombolback())){
            gui.dispose();
            new suplier_kontroler();
        }else{
            String nobaju=gui.getnobaju();
            String namabaju=gui.getnamabaju();
            int jumlah=gui.getjumlah();
            String model=gui.getmodel();
            if(!nobaju.equals("")&&!namabaju.equals("") && !model.equals("")){
                String query="insert into barang values('"+nobaju+"','"+namabaju+"',"+jumlah+",'"+model+"')";
                db.isidata(query);
                gui.reset();
                JOptionPane.showMessageDialog(gui,"data berhasil ditambahakan","berhasil",1);
            }else{
                JOptionPane.showMessageDialog(gui,"tidak boleh ada fild yang kosong","error",0);
            }
        }
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
