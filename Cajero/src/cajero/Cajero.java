/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

/**
 *
 * @author SOIB1A07
 */
public class Cajero {
    
  private static TarjetaDeCredit VISA =new TarjetaDeCredit(2000,1234);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        try { VISA.obre(2314); 
        
        }
        catch (TarjetaBloqueadaException e) {
            System.out.println("Error: "+ e.getMessage()); 
            System.out.println(e.toString()); 
        }
        try { VISA.treure(500); 
        
        }
        catch (TarjetaBloqueadaException e) {
            System.out.println("Error: "+ e.getMessage()); 
            System.out.println(e.toString()); }
            
            catch (NohihaSaldoSuficientException e) {
            System.out.println("Error: "+ e.getMessage()); 
            System.out.println(e.toString()); 
            
    
    }
}
}