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
public class Perecedero extends Producto {

    private int caduca;

    public Perecedero(int caduca, String nombre, double precio) {
        super(nombre, precio);
        this.caduca = caduca;
    }

    public int getCaduca() {
        return caduca;
    }

    public void setCaduca(int caduca) {
        this.caduca = caduca;
    }

    @Override
    public double calcular(int cantidad) {
        int dias = 0;

        dias = this.getCaduca() - Colmado.AHORA;

        switch (dias) {

            case 1:
                System.out.println("Le queda un dia para caducar, 75% de descuento de " + this.getPrecio());
                this.setPrecio(this.getPrecio() / 4);

                break;
            case 2:
                System.out.println("Le queda dos dias para caducar, 66% de descuento de " + this.getPrecio());
                this.setPrecio(this.getPrecio() / 3);

                break;
            case 3:
                System.out.println("Le queda tres dias para caducar, 50% de descuento de " + this.getPrecio());
                this.setPrecio(this.getPrecio() / 2);

                break;
            default:
                System.out.println("Producto Fresco");

        }
        return cantidad * this.getPrecio();

    }

}
