/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Parking {

    private String matricula;
    private double hora;
   

    public Parking(String matricula, double hora) {
        this.matricula = matricula;
        this.hora = hora;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getHora() {
        return hora;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Parking> planta = new ArrayList();

        planta.ensureCapacity(15);
        Parking A0=new Parking("PM51266VB",20.21);
        
        
        planta.set(7, A0);
   
      
        System.out.print(planta.get(7).getMatricula());

    }

}
