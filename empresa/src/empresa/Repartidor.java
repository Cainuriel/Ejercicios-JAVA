/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author SOIB1A07
 */
public class Repartidor extends Empleado {

    public String zona = "";

    public Repartidor(String nombre, int edad, int salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {

        System.out.println(super.toString());
        return "Este Repartidor está trabajando en la " + "zona " + this.getZona() + '.';
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void plus() {

        if (getEdad() < 25
                && getZona().equalsIgnoreCase("Zona 3")) {
           // setSalario(getSalario() + PLUS);
            super.plus();;
            System.out.println("Salario aumentado: " + getSalario());
        } else {
            System.err.println("Este Repartidor no reune los requisitos para cobrar el Plus");
        }
    }

}
