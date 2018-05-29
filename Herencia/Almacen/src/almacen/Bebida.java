/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

/**
 *
 * @author cainu
 */
public class Bebida {

    private int id;
    private double capacidad;
    private double precio;
    private String marca;

    public Bebida(int id, double capacidad, double precio, String marca) {
        this.id = id;
        this.capacidad = capacidad;
        this.precio = precio;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Bebida con la clave: " + "" + id
                + ". Capacidad en litros: " + capacidad
                + ".\n Precio: " + precio
                + " Euros. Marca: " + marca;
    }


    
}
