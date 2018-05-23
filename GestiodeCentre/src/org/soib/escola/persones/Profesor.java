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
public class Profesor extends Persona {

    private String especialidad;

    public Profesor(String nom, String Apellidos, String fechanacer, String especialidad) {
        super(nom, Apellidos, fechanacer);
        this.especialidad = especialidad;

    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
    
    

    public String toString(Profesor profesor) {

        return "Persona: ( " + "Nombre: " + profesor.getNom() + "Apellidos: "
                + profesor.getApellidos() + "Fecha de nacimiento: " + profesor.getFechanacer() +
                "Su especialidad es: "+ profesor.getEspecialidad();
    }

}
