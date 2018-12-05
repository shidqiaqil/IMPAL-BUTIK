/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import Model.addslashes;
import Model.isempty;
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
            addslashes a=new addslashes();
            a.setX(gui.getnobaju());
            String nobaju=a.addslash();
            a.setX(gui.getnamabaju());
            String namabaju=a.addslash();
            int jumlah=gui.getjumlah();
            a.setX(gui.getmodel());
            String model=a.addslash();
            isempty b=new isempty();
            b.setNo(nobaju);
            b.setNama(namabaju);
            b.setModel(model);
            if(!b.iskosong()){
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
