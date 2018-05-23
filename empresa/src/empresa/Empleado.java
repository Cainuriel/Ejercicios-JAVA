/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.ArrayList;

/**
 *
 * @author Superlopez
 */
public class Empleado {

    // @constante plus económico fijo. 
    final int PLUS = 300;
    String nombre;
     int edad;
     int salario;

    /**
     *
     * @param nombre
     * @param edad
     * @param salario
     */
    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    /**
     *
     */
    public void plus(){
        
        salario=salario+PLUS;
        
    }

    /**
     *
     * @return datos del objeto
     */
    @Override
    public String toString() {
        return "Empleado: {" + "Nombre= " + nombre + ", edad= " + edad + ", salario= " + salario + '}';
    }
    
    /**
     *
     * @return nombre del objeto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return edad
     * 
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @return salario
     */
    public int getSalario() {
        return salario;
    }

    /**
     *
     * @param salario
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }

  
    
}