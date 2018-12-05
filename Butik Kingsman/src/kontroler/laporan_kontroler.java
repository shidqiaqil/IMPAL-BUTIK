/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;


import View.laporanTransaksi;
import database.database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import View.menuAwalSupervisor;
import java.util.ArrayList;
import Model.Laporan;

/**
 *
 * @author Shidqiaqil
 */
public class laporan_kontroler implements ActionListener {
    private laporanTransaksi gui;
    private database db= new database();
    private ResultSet rs = null;
    
    private ArrayList <Laporan> daftarlaporan;
    public laporan_kontroler(){
        db.konek();
        getstokfromdb();
        gui=new laporanTransaksi();
        gui.addListener(this);
        gui.setVisible(true);
        db = new database();
        gui.tampilstok(daftarlaporan);
    }
        public void getstokfromdb(){
        daftarlaporan = new ArrayList<Laporan>();
        String command ="select * from laporan";
        try{
            rs = db.getdata(command);
            while (rs.next()){
                String no_laporan = rs.getString("no_laporan");
                String no_baju= rs.getString("no_baju");
                String no_transaksi = rs.getString("no_transaksi");
                int jumlah = rs.getInt("jumlah");
                String nama_baju = rs.getString("nama_baju");
                daftarlaporan.add(new Laporan(no_laporan, no_baju, no_transaksi, 
                        jumlah, nama_baju));
            }
        } catch(Exception e){
            
        }
    }
    
public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Object source= e.getSource();
        if (source.equals(gui.getsback())){
            gui.dispose();
           new menuAwalSupervisor_kontroler();
       }if (source.equals(gui.getstombollogout())){
           gui.dispose();
           new login_kontroler();
        }
}
}





