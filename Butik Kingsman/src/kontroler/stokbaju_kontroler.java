/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import View.menuAwalSupervisor;
import View.stokBaju;
import database.database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import Model.barang;
import java.awt.event.MouseEvent;

public class stokbaju_kontroler implements ActionListener {
    private stokBaju gui;
    private database db =new database();
    private ResultSet rs = null;
    
    private ArrayList<barang> daftarbaju;
   /* private ArrayList<stok_baju> stok; */
    public stokbaju_kontroler(){
        db.konek();
        getstokfromdb();
        gui=new stokBaju();
        gui.addListener(this);
        gui.setVisible(true);
        gui.tampilstok(daftarbaju);
    }

    
    public void getstokfromdb(){
        daftarbaju = new ArrayList<barang>();
        String command ="select * from barang";
        try{
            rs = db.getdata(command);
            while (rs.next()){
                String no_baju = rs.getString("no_baju");
                String nama_baju= rs.getString("nama_baju");
                int jumlah_baju = rs.getInt("jumlah_baju");
                String model = rs.getString ("model");
                daftarbaju.add(new barang(no_baju, nama_baju, jumlah_baju, model));
            }
        } catch(Exception e){
            
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Object source= e.getSource();
        if (source.equals(gui.getsback())){
           new menuAwalSupervisor_kontroler();
           gui.dispose();
       }if (source.equals(gui.getstombollogout())){
           gui.dispose();
           new login_kontroler();
       }
    }
}

/**
 *
 * @author Shidqiaqil
 */

