/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author SOIB1A07
 */
public class ExpresionesRegulares {
    
    public static void comprobarDNI(String DNI) {
        
        Pattern pat= Pattern.compile("^\\d{8}[a-zA-Z]{1}$");
        
        Matcher mat=pat.matcher(DNI);
        
        if (mat.matches()) {
            System.out.println("Si");
        
    } else {   System.out.println("No");
           
        }
    }
    
     public static void comprobarNIE(String NIE) {
        
        if (NIE.matches("^[y-zY-Z]\\d{8}$"))
        
       {
            System.out.println("Si");
        
    } else {   System.out.println("No");
           
        }
    
    
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        comprobarDNI("430449193E");
        
    }
    
}
