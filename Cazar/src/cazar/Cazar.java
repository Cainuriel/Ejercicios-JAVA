/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cazar;

/**
 *
 * @author SOIB1A07
 */
public class Cazar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ca boxy=new Ca("boxy",Genere.MASCLE);
        
        boxy.envelleix();
        boxy.envelleix();
        boxy.envelleix();
        if (boxy.esFeliç()) {
            
            System.out.println("Guau Guau!!");
        }
            
           
        boxy.envelleix();boxy.envelleix();
        boxy.envelleix();
        
        
        if (boxy.estaViu()) {
            
            System.out.println("Guau Guau!!");
        } else {
            
            System.out.println("A mort");
        }
        
        
    }
    
}
