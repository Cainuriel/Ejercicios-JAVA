
package dnieiban;


import java.util.Scanner;

import javax.swing.*;


public class DNIeIBAN {

    public static void DNI() {
 
                String DNI="xxx";
               String letradni[]={"T","R","W","A","G","M","Y","F",
                   "P","D","X","B","N","J","Z","S","Q","V",
                   "H","L","C","K","E"};
               String letra;
               String numerosdeldni;
               int comprobacion=0;
               int resto=0;
               System.out.println("Deme su DNI y lo comprobaremos:");
               Scanner entradaDNI= new Scanner(System.in);
               
                        DNI=entradaDNI.next();
                        
                          letra=DNI.substring(8,9);
                          
                          numerosdeldni=DNI.substring(0,8);
                          
                          // pasamos a entero el número para comprobarlo
                          comprobacion=Integer.parseInt(numerosdeldni);
                          
                       resto=Integer.remainderUnsigned(comprobacion, 23);
                       
                       if ( letra.equalsIgnoreCase(letradni[resto])){
                           System.out.println("DNI correco");
                       } else {
                       System.out.println("DNI INOCORRECTO VUELVA A INTRODUCIRLO");
                       }
                       
                       
                       
                       
                       
                       //System.out.println(resto);
                            
                        
                        
                        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DNI();
        
        
        // TODO code application logic here
    }
    
}
