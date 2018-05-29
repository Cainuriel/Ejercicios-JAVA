/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaelectrodomesticos;

/**
 *
 * @author Superlopez
 */
public class Lavadora extends Electrodomestico {
    
    private final int CARGAPORDEFECTO;
    private int carga;

    public Lavadora() {
        CARGAPORDEFECTO=5;
        
        
    }

    public Lavadora(int precioBase, String Color, int Peso, String consumoE, int carga) {
        super(precioBase, Color, Peso, consumoE);
        this.carga=carga;
        CARGAPORDEFECTO=5;
    }

    public Lavadora(int precioBase, int Peso) {
        super(precioBase, Peso);
        CARGAPORDEFECTO=5;
    }

    public int getCARGAPORDEFECTO() {
        return CARGAPORDEFECTO;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public int getPrecioBase() {
        return precioBase;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getPeso() {
        return Peso;
    }

    @Override
    public String getConsumoE() {
        return consumoE;
    }
    public void precioFinal(Lavadora e) {
        if (e.carga+e.CARGAPORDEFECTO>=30) {
            e.setPrecioBase(precioBase+50);   
        }
 super.precioFinal(e);
    }

    
}