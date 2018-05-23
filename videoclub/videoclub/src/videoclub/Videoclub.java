/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

import java.util.ArrayList;

/**
 *
 * @author Supesrlopez
 */
public class Videoclub {
    
   
    
    
    
    
    /*public void addArtículo(Object arg){
        
        
   this.alquiler(arg);
}*/
        


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList <Object> alquiler = new ArrayList <Object>();
         
        Serie S0001 =new Serie();
        alquiler.add(S0001);
        Serie S0002 =new Serie("Con ocho basta", 6, "comedia", "Inglesa");
        alquiler.add(S0002);
        Serie S0003 =new Serie("Como conocí a vuestra madre","Comedia");
        alquiler.add(S0003);
        Serie  S0004 =new Serie("V",5,"Ciencia Ficción","Norteamericana");
        alquiler.add(S0004);
        Videojuego V0001 =new Videojuego();
        alquiler.add(V0001);
        Videojuego V0002 =new Videojuego("Assasin Creed",150);
        alquiler.add(V0002);
        Videojuego V0003 =new Videojuego("Metal Gear",300,"Konami","Acción/Sigilo");
        alquiler.add(V0003);
        Videojuego V0004 =new Videojuego("FIFA18",600,"EASports","Deportes");
        alquiler.add(V0004);
        
        for (Object e: alquiler) {
            
            System.out.println(V0001.toString());
            System.out.println(V0001.compareTo(e));
           System.out.println(e.toString());
           System.out.println();
        }
        
        
        
        
    }
    
}
