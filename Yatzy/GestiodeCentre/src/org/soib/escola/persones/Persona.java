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
public class Persona {
   
   /* Dins creau una clase Persona amb els següents atributs amb els mètodes
necessaris per a recuperar-los i modificar-los(getters i setters): nom. Llinatges,
dataNaixement. Per a la data de naixement utilitzau un objecte de la classe
java.util.Date.*/
    String nom;
    String Apellidos;
    String fechanacer;
    

    public Persona(String nom, String Apellidos, String fechanacer) {
        this.nom = nom;
        this.Apellidos = Apellidos;
        this.fechanacer = fechanacer;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getFechanacer() {
        return fechanacer;
    }

    public void setFechanacer(String fechanacer) {
        this.fechanacer = fechanacer;
    }
    
    public  String toString (Persona persona)  {
 
        
        return "Persona: ( "+ " Nombre: "+persona.getNom()+" Apellidos: "+
                persona.getApellidos()+ " Fecha de nacimiento: "+persona.getFechanacer()+")";
        
                }
    
    /* PREGUNTA
¿Quin accés han de tenir els atributs i mètodes de Persona per poder-los utilitzar
directament des de Professor ?
    
    respuesta: pública o sin determinar*/
    
    

    
}

