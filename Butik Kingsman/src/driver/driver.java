/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import Model.addslashes;
import kontroler.login_kontroler;

/**
 *
 * @author Shidqiaqil
 */
public class driver {
    public static void main(String[] args) {
        //new login_kontroler();
        addslashes b=new addslashes();
        b.setX("fu\'an");
        System.out.println(b.addslash());
    }
}
