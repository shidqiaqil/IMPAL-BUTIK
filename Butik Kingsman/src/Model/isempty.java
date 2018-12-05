package Model;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class isempty {
    private String no;
    private String nama;
    private String model;
    public boolean iskosong(){
        return no.equals("") || nama.equals("") || model.equals("") ;
    }
    public void setNo(String no){
        this.no=no;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setModel(String model){
        this.model=model;
    }
}
