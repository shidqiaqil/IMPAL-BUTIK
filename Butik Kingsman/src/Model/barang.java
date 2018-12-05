/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Shidqiaqil
 */
public class barang {
    private String no_baju;
    private String nama_baju;
    private int jumlah_baju;
    private String model;

    /**
     * @return the no_baju
     */
    public barang(String no_baju, String nama_baju, int jumlah_baju, String model){
    this.no_baju=no_baju;
    this.nama_baju=nama_baju;
    this.jumlah_baju=jumlah_baju;
    this.model=model;
}
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

    /**
     * @return the jumlah_baju
     */
    public int getJumlah_baju() {
        return jumlah_baju;
    }

    /**
     * @param jumlah_baju the jumlah_baju to set
     */
    public void setJumlah_baju(int jumlah_baju) {
        this.jumlah_baju = jumlah_baju;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }
    
    
    
}
