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
public class suplier {
    private String idSuplier;
    private String PaswordSuplier;
    private String idkirim;

    public suplier(String idSuplier, String PaswordSuplier) {
        this.idSuplier = idSuplier;
        this.PaswordSuplier = PaswordSuplier;
    }

    public String getIdSuplier() {
        return idSuplier;
    }

    public String getPaswordSuplier() {
        return PaswordSuplier;
    }

    public void setIdSuplier(String idSuplier) {
        this.idSuplier = idSuplier;
    }

    public void setPaswordSuplier(String PaswordSuplier) {
        this.PaswordSuplier = PaswordSuplier;
    }

    public void setIdkirim(String idkirim) {
        this.idkirim = idkirim;
    }

    public String getIdkirim() {
        return idkirim;
    }

    public suplier(String idSuplier, String PaswordSuplier, String idkirim) {
        this.idSuplier = idSuplier;
        this.PaswordSuplier = PaswordSuplier;
        this.idkirim = idkirim;
    }
    
}
