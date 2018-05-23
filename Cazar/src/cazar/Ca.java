/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cazar;

/**
 *
 * @author SOIB1A07
 */
public class Ca extends Animal implements Caçador {

    Genere sexe;
    
    
    public Ca(String nom, Genere sexo) {
        super(nom, 14);
        this.nivellAlimentacio=2;
        this.sexe=sexo;
    }

    public int getNivellAlimentacio() {
        return nivellAlimentacio;
    }

    public void setNivellAlimentacio(int nivellAlimentacio) {
        this.nivellAlimentacio = nivellAlimentacio;
    }
public boolean esFeliç () {
if (nivellAlimentacio> 0) return true;
else return false;
} 
public void caça ()  {
    
    
}

    
    
    
    
    
}
