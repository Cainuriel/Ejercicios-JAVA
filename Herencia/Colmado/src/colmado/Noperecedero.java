/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colmado;

/**
 *
 * @author cainu
 */
public class Noperecedero extends Producto {
    
    private final String TIPO="No Perecedero";

    public Noperecedero(String nombre, double precio) {
        super(nombre, precio);
    }

    public String getTIPO() {
        return TIPO;
    }

 

   

    
}
