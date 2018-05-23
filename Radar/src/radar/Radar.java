/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radar;

/**
 *
 * @author Superlopèz
 */
public class Radar {
private String matricula; // matrícula del coche
private double hora; // instante de entrada o de salida
private double kilometro;

    public Radar(String matricula, double hora, double kilometro) {
        this.matricula = matricula;
        this.hora = hora;
        this.kilometro = kilometro;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getHora() {
        return hora;
    }

    public double getKilometro() {
        return kilometro;
    }

   
    
} 
