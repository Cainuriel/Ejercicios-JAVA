/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legislación;

import java.util.ArrayList;

/**
 *
 * @author SOIB1A07
 */
public class Legislación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Legislador> Legisladores = new ArrayList<Legislador>();

        Diputado D1 = new Diputado(23, "Pablo", "Iglesias", 49, false, 12, "Podemos", "Madrid");
        Legisladores.add(D1);

        Diputado D2 = new Diputado(100, "Mariano", "Rajoy", 55, true, 1, "Partido Popular", "Pontevedra");
        Legisladores.add(D2);

        Diputado D3 = new Diputado(45, "Pedro", "Sanchez", 42, true, 8, "PSOE", "Madrid");
        Legisladores.add(D3);

        // Hemos creado los objetos Senador directamente en el ArrayList
        // Ello es posible porque el nombre de un objeto es un puntero a el mismo
        // Como la posición en una ArrayList, es un pontero al objeto. 
       Legisladores.add(new Senador(65, "Ramon", "Bauza", 46, true, 26, "Partido Popular", "Baleares"));
       Legisladores.add( new Senador(102, "Xelo", 
               "Güertas", 59, true, 99, "Partido Mixto", "Baleares"));
        Legisladores.add(new Senador(13, "Jaume", "Matas", 60, true, 52, "Partido Popular", "Baleares"));

        for (Legislador e: Legisladores){
            
            e.getCamaraEnQueTrabaja();
           System.out.println(e.toString()); 
        }
        
            
        }
    

}
