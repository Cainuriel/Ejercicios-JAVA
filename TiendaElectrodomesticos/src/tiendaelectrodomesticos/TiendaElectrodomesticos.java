/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaelectrodomesticos;

/**
 *
 * @author SOIB1A07
 */
public class TiendaElectrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Electrodomestico a=new Electrodomestico(200, "Negro", 30, "A");
        
       
        
        System.out.println( a.getConsumoE());
        
        
    }
    
}
