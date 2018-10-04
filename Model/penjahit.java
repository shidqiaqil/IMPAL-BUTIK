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
public class penjahit {
    private String idpenjahit;
    private String PaswordPenjahit;
    
    public penjahit(String idpenjahit,String PaswordPenjahit){
        idpenjahit= this.idpenjahit;
        PaswordPenjahit = this.PaswordPenjahit;
    }

    public String getIdpenjahit() {
        return idpenjahit;
    }

    public String getPaswordPenjahit() {
        return PaswordPenjahit;
    }

    public void setIdpenjahit(String idpenjahit) {
        this.idpenjahit = idpenjahit;
    }

    public void setPaswordPenjahit(String PaswordPenjahit) {
        this.PaswordPenjahit = PaswordPenjahit;
    }
    
    
}
