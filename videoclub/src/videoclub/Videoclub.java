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
    
    ArrayList <Object> alquiler = new ArrayList <Object>();
    
    
        


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Serie S0001 =new Serie();
        Serie S0002 =new Serie("Con ocho basta", 6, "comedia", "Inglesa");
        Serie S0003 =new Serie("Como conocí a vuestra madre","Comedia");
        Serie  S0004 =new Serie("V",5,"Ciencia Ficción","Norteamericana");
        Videojuego V0001 =new Videojuego();
        Videojuego V0002 =new Videojuego("Assasin Creed",150);
        Videojuego V0003 =new Videojuego("Metal Gear",300,"Konami","Acción/Sigilo");
        Videojuego V0004 =new Videojuego("FIFA18",600,"EASports","Deportes");
        
    }
    
}
