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
public class cekisnumber {
    private String x;
    public void setX(String x){
        this.x=x;
    }
    public cekisnumber(String x){
        this.x=x;
    }
    public boolean isnumber(){
        try{
            Integer.parseInt(x);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
