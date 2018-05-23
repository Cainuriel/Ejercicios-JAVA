/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javacontroldacces;



/**
 *
 * @author Superlopez
 */
public class JavaControldAcces {
    int personaint;
    String persona;
    String entrada;

    public static String gente() {

        int personaint = (int) (Math.random() * 400);
        String persona = Integer.toString(personaint);

        return persona;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        

       
        int asistents = 1;
        ControlDAcces ControlArena = new ControlDAcces();

        //Veta usuaris al azar;
        for (int i = 0; i < 15; i++) {
            ControlArena.vetaUsuari(gente());
        }

        // Entrada de Clients
        do {

            if (ControlArena.entraUsuari(gente())) {

                System.out.println("Client ha entrar al recinte.\n"
                        + "Asistent nº " + asistents);
                asistents++;
                

            } else {
                System.err.println("Client vetat. Asistent nº " + asistents);
                asistents++; }
            
        } 
        
        
        while (ControlDAcces.numusuaris < ControlDAcces.AFORO);
        
        
        
        
        System.out.println("Aforo: " + ControlDAcces.numusuaris);

        System.out.println(
                "Clients A Dins: " + ControlArena.usuarisDinsDelRecinte.size());

        System.err.println(
                "Clients Vetats: " + ControlArena.usuarisVetats.size());

    }

}
