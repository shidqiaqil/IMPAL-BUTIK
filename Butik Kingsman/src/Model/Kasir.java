/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ASUS
 */
public class Kasir {
    private String idkasir;
    private String Passwordkasir;

    public void setIdkasir(String idkasir) {
        this.idkasir = idkasir;
    }

    public void setPasswordkasir(String Passwordkasir) {
        this.Passwordkasir = Passwordkasir;
    }

    public String getIdkasir() {
        return idkasir;
    }

    public String getPasswordkasir() {
        return Passwordkasir;
    }
    
public Kasir(String idkasir, String Passwordkasir){
    idkasir= this.idkasir;
    Passwordkasir = this.Passwordkasir;
}


}

