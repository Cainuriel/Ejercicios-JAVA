/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.ArrayList;

/*
 * @author Superloez
 */

/**
 *
 * @author SOIB1A07
 */

public class Empresa {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Empleado> personal = new ArrayList <Empleado>();

        Repartidor rep1 = new Repartidor("Antonio López", 32, 7200, "Zona 2");
        personal.add(rep1);
        
        Repartidor rep2 = new Repartidor("Manuel Ocaña", 29, 7200, "Zona 3");
        personal.add(rep2);
        
        Repartidor rep3 = new Repartidor("Enrique Ortiz", 19, 7200, "Zona 1");
        personal.add(rep3);
        
        Repartidor rep4 = new Repartidor("Faimundo Cansado", 29, 7200, "Zona 3");
        personal.add(rep4);
        
        Repartidor rep5 = new Repartidor("Enrique Suárez", 22, 7200, "Zona 3");
        personal.add(rep5);
        
        Comercial com1 = new Comercial("Luisa López", 32, 9200, 250);
        personal.add(com1);
        

        Comercial com2 = new Comercial("Mariano Trujillo", 40, 9700, 275);
        personal.add(com2);
        

        Comercial com3 = new Comercial("Anselmo Sánchez", 28, 9200, 150);
        personal.add(com3);
        

        Comercial com4 = new Comercial("Pascual Ribot", 49, 11200, 325);
        personal.add(com4);
       
        for (Empleado e: personal){
           
            System.out.println(e.toString());
            e.plus();
             System.out.println();
            
        }
        
      System.out.println("Fin");
    }

}
