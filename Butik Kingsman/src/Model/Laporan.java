/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ainun
 */
public class Laporan {
    private String no_laporan;
    private String no_baju;
    private String no_transaksi;
    private int jumlah;
    private String nama_baju;

    /**
     * @return the idlaporan
     */
    public Laporan(String no_laporan, String no_baju, String no_transaksi, 
            int jumlah, String nama_baju){
        this.no_laporan = no_laporan;
        this.no_baju = no_baju;
        this.no_transaksi = no_transaksi;
        this.jumlah = jumlah;
        this.nama_baju= nama_baju;
    }
            
    public String getNo_laporan() {
        return no_laporan;
    }

    /**
     * @param idlaporan the idlaporan to set
     */
    public void setNo_laporan(String idlaporan) {
        this.no_laporan = no_laporan;
    }

    /**
     * @return the no_baju
     */
    public String getNo_baju() {
        return no_baju;
    }

    /**
     * @param no_baju the no_baju to set
     */
    public void setNo_baju(String no_baju) {
        this.no_baju = no_baju;
    }

    /**
     * @return the no_transaksi
     */
    public String getNo_transaksi() {
        return no_transaksi;
    }

    /**
     * @param no_transaksi the no_transaksi to set
     */
    public void setNo_transaksi(String no_transaksi) {
        this.no_transaksi = no_transaksi;
    }

    /**
     * @return the jumlah
     */
    public int getJumlah() {
        return jumlah;
    }

    /**
     * @param jumlah the jumlah to set
     */
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    /**
     * @return the nama_baju
     */
    public String getNama_baju() {
        return nama_baju;
    }

    /**
     * @param nama_baju the nama_baju to set
     */
    public void setNama_baju(String nama_baju) {
        this.nama_baju = nama_baju;
    }
   
    
}
