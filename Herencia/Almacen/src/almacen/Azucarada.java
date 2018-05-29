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
public class Azucarada extends Bebida {

    private int porcentajeazucar;
    private boolean promocion = false;

    public Azucarada(int id, double capacidad,
            double precio, String marca, int porcentajeazucar) {
        super(id, capacidad, precio, marca);
        this.porcentajeazucar = porcentajeazucar;
    }

    public int getPorcentajeazucar() {
        return porcentajeazucar;
    }

    public void setPorcentajeazucar(int porcentajeazucar) {
        this.porcentajeazucar = porcentajeazucar;
    }

    public boolean isPromocion() {
        return promocion;
    }
    
   

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    @Override
    public String toString() {
        if (isPromocion()) {
            System.out.println("Marca promocionada con un "
                    + "diez por ciento de descuento.");

        }

        return super.toString() + "\n Bebida azucarada con el siguiente porcentaje de azucar: \n"
                + porcentajeazucar+"%."; 
    }

}
