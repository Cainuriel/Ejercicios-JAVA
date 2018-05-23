/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteriscos;

import java.util.ArrayList;

/**
 *
 * @author Fuji
 */
public class Asteriscos {

   

    public static void main(String[] args) // TODO code application logic here
    {
        
       int binary[]={1,0,1,1};
        
        
        
        
        
 int resul=0;
 int potencia;
    int j = binary.length-1;
        for (int i=0; i<=3; i++) {
         
              potencia=(int)(Math.pow(2,j));
            resul = resul + (binary[i] * potencia ); 
           System.out.println(binary[i] * potencia ); 
            j--;    
           
             
        }
        
        return resul;      
     
        
    }

}
