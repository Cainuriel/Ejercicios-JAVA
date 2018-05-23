/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.soib.escola.persones;

import java.util.Date;

/**
 *
 * @author SOIB1A07
 */
public class Alumno extends Persona {
    
    
    String curso;

    // constructor herendado de clase Persona
    public Alumno(String nom, String Apellidos, String fechanacer, String curso) {
        super(nom, Apellidos, fechanacer);
        this.curso=curso;      
    }  
}
