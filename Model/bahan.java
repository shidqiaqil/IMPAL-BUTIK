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
public class bahan {
    private String idbahan;
    private String namabahan;

    public bahan(String idbahan, String namabahan) {
        this.idbahan = idbahan;
        this.namabahan = namabahan;
    }

    public String getIdbahan() {
        return idbahan;
    }

    public void setIdbahan(String idbahan) {
        this.idbahan = idbahan;
    }

    public String getNamabahan() {
        return namabahan;
    }

    public void setNamabahan(String namabahan) {
        this.namabahan = namabahan;
    }
    
    
}
