/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import View.inputLaporanTransaksi;
import database.database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Shidqiaqil
 */
public class inputlaporan_kontroler implements ActionListener{
    private inputLaporanTransaksi gui;
    private database db=new database();
    private ResultSet rs = null;
    public inputlaporan_kontroler(){
        gui=new inputLaporanTransaksi();
        gui.addListener(this);
        gui.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(gui.getstombollogout())){
            gui.dispose();
            new login_kontroler();
        }else if (source.equals(gui.getstombolback())){
            gui.dispose();
            new kasir_kontroler();
        } else {
            String nolaporan=gui.getno_laporan();
            String nobaju=gui.getno_baju();
            String notransaksi = gui.getno_transaksi();
            int jumlah = gui.getjumlah();
            String namabaju = gui.getnama_baju();
            if(!nolaporan.equals("")&& !nobaju.equals("")&& !notransaksi.equals("") && !namabaju.equals("")){
                String query = "insert into laporan values('"+nolaporan+"','"+nobaju+"','"+notransaksi+"',"+jumlah+",'"+namabaju+"')";
 
                db.isidata(query);
                gui.reset();
                JOptionPane.showMessageDialog(gui,"data berhasil ditambahakan","berhasil",1);        
            } else{
                 JOptionPane.showMessageDialog(gui,"tidak boleh ada fild yang kosong","error",0);
            }
        }
    }

  
}
