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
public class addslashes {
    public String x;
    public void setX(String x){
	this.x=x;
    }
    public String addslash(){
        int idx=0;
        String hasil="";
        while(idx<x.length()){
            if(x.charAt(idx)=='\\') {hasil = hasil+'\\'+'\\';}
            else if(x.charAt(idx)=='\'') {hasil = hasil+'\\'+x.charAt(idx);}
            else{
                hasil=hasil+x.charAt(idx);
            }
            idx++;
        }
        return hasil;
    }
}
