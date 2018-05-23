/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaelectrodomesticos;

/**
 *
 * @author SOIB1A07
 */
public class Electrodomestico {

    public int precioBase;
    public String color;
    public int Peso;
    String consumoE;

    enum Color {
        BLANCO, NEGRO, ROJO, AZUL, GRIS
    };

    public Electrodomestico() {
        precioBase = 100;
        color = "Blanco";
        Peso = 5;
        consumoE = "F";
    }

    public Electrodomestico(int precioBase, String Color, int Peso, String consumoE) {
        this.precioBase = precioBase;
        
        //Antes de dar el color, se comprueba si es correcto, y en caso contrario 
        // dará el color por defecto
        this.color =comprobarColor(Color);
        this.Peso = Peso;
        // lo mismo que el color pero con la letra de calidad
        this.consumoE =comprobarConsumoEnergetico(consumoE);
       
    }

    public Electrodomestico(int precioBase, int Peso) {
        this.precioBase = precioBase;
        this.Peso = Peso;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public int getPeso() {
        return Peso;
    }

    public void setConsumoE(String consumoE) {
        this.consumoE = consumoE;
    }

    public String getConsumoE() {
        return consumoE;
    }

    public String comprobarConsumoEnergetico(String letra) {
        // variable comparativa
        int igual;
        // la sentencia "consumoEnergetico.values, devuelve una Arrays
        // con todos los enumerados. Así se compara con la letra.
        for (consumoEnergetico e : consumoEnergetico.values()) {

            // Si es igual devuelve un valor 0.
            igual = letra.compareTo(e.toString());
            System.out.println(igual);
            if (igual == 0) {
                return e.toString();

            } else {
                System.out.println("Letra no es correcta."
                        + "se dará la Letra por defecto");
                return "F";
            }

        }
        return "F";

    }

    public String comprobarColor(String color) {
        // Creamos un objeto enum para comparar el color
        Color colores;

        // con el metodo Color.values generamos un Array con todos los enumerados
        // para ser comparados.
        for (Color e : Color.values()) {

            if (color.equalsIgnoreCase(e.toString())) {

                System.out.println("El color es correcto");
                        return e.toString();
            } else {

                System.out.println("Color incorrecto."
                        + "se dará el color por defecto");
                return "Blanco";
            }

        }
        return "Blanco";

    }

    public void precioFinal(Electrodomestico e) {
        int preciofinal = 0;

        // aumentando el precio segun su categoria
        switch (e.consumoE.charAt(0)) {
            case 'A':
                preciofinal = 100;
                break;
            case 'B':
                preciofinal = 80;
                break;
            case 'C':
                preciofinal = 60;
                break;
            case 'D':
                preciofinal = 50;
                break;
            case 'E':
                preciofinal = 30;
                break;
            case 'F':
                preciofinal = 10;
                break;
            default:
                System.out.println("Letra incorrecta");
        }
        // aumentaando el precio según su peso
        if (e.getPeso() <= 19) {

            preciofinal = (preciofinal + 10);
        }
        if (e.getPeso() >= 20 && e.getPeso() <= 49) {
            preciofinal = preciofinal + 50;
        }
        if (e.getPeso() >= 50 && e.getPeso() <= 79) {
            preciofinal = preciofinal + 80;
        }
        if (e.getPeso() <= 80) {
            preciofinal = preciofinal + 100;
        }

        // Calculamos el precio definitivo final añadiendo el precio base
        preciofinal = preciofinal + e.precioBase;
        
        // Imprimimos
        System.out.println("El precio final del Electrodmoestico es: "
                + preciofinal +" Euros");

    }

}
