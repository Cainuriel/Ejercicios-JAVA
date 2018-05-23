/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author Superlopez
 */
public class Comercial extends Empleado {

    public int comision = 0;

    public Comercial(String nombre, int edad, int salario, int comision) {
           
        super(nombre, edad, salario);
        this.comision = comision;

    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Éste comercial está cobrando la siguiente " + "comision: " + getComision() + '.';
    }

 

    @Override
    public void plus() {

        if (getComision() > 200
                && getEdad() > 30) {
          //  setSalario(getSalario() + PLUS);
            super.plus();
            System.out.println("Salario aumentado: " + getSalario());
        } else {

            System.err.println("No reune los requisitos para el aumento salarial");
        }
    }

}
