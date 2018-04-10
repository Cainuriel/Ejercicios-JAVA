/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.soib.escola;

import java.util.ArrayList;
import org.soib.escola.persones.Alumno;
import org.soib.escola.persones.Persona;
import org.soib.escola.persones.Profesor;

/**
 *
 * @author SOIB1A07
 */
public class GestiodeCentre {

    static ArrayList<Profesor> Profesores;
    static ArrayList<Alumno> Alumnos;

    public GestiodeCentre() {
        Profesores = new <Profesor> ArrayList();
        Alumnos = new <Alumno> ArrayList();

    }

    // Introduce tres alumnos y tres profesores en sus ArrayList's
    public void introduirDades() {

        Alumnos.add(new Alumno("Francisco","Hernández","24-12-1975","Informática"));
        Alumnos.add(new Alumno("Renancia","Hortega","05/08/1985", "Informática"));
        Alumnos.add(new Alumno("Sebastian","Marin","06/10/1980", "Informática"));
     Profesores.add(0, new Profesor("Guillem","Salom","23/04/1970","Informática"));
      Profesores.add(1, new Profesor("Maciá","Mut","16/11/1975","Informática"));
       Profesores.add(new Profesor("David","Gelpi","09/04/1978","Informática"));

    }
    
    private String mostrartoString(Persona peticion){
        
        return peticion.toString();
    }
    
    public void mostrarDades() {
        
        for (Profesor e: Profesores){
            System.out.println(e.toString(e));
            
        }
         for (Alumno e: Alumnos){
            System.out.println(e.toString(e)); }
        
        
        
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // GestiodeCentre prueba = new GestiodeCentre();
        

        GestiodeCentre gdc = new GestiodeCentre();
        
        gdc.introduirDades();
        gdc.mostrarDades();
        
        
    }

}
