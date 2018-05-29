/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaelectrodomesticos;

/**
 *
 * @author cainu
 */
public class Television extends Electrodomestico {
    
    
    private int resolucion=20;
    private boolean sintonizador=false;

    public Television() {
    }

    public Television(int precioBase, int Peso) {
        super(precioBase, Peso);
    }

    public Television(int precioBase, String Color, int Peso, String consumoE,
            int resolucion, boolean sintonizador) {
        super(precioBase, Color, Peso, consumoE);
        this.resolucion=resolucion;
        this.sintonizador=sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }
    
    public void precioFinal(Television e) {
 
        if (e.getResolucion()>40) {
            e.setPrecioBase(precioBase=precioBase+((precioBase*30)/100));
        }
        if (e.isSintonizador()) {
            e.setPrecioBase(precioBase+50);
        }
        super.precioFinal(e);
    }
    
    
    
    
    
    
}
