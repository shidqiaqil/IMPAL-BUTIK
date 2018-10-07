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
public class Supervisor {
    private String Idsupervisor;
    private String PasswordSupervisor;

    public Supervisor(String Idsupervisor, String PasswordSupervisor) {
        this.Idsupervisor = Idsupervisor;
        this.PasswordSupervisor = PasswordSupervisor;
    }

    public String getIdsupervisor() {
        return Idsupervisor;
    }

    public void setIdsupervisor(String Idsupervisor) {
        this.Idsupervisor = Idsupervisor;
    }

    public String getPasswordSupervisor() {
        return PasswordSupervisor;
    }

    public void setPasswordSupervisor(String PasswordSupervisor) {
        this.PasswordSupervisor = PasswordSupervisor;
    }
    
}
