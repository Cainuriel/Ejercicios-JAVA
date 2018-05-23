package radar;

import java.util.ArrayList;
import radar.Radar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Superlopez
 */
public class GestordeMultas {

// Velocidad media máxima permitida.
    public static final double MAX_VEL = 120;
// Tamaño del array tabla.
    private static final int TAMANO = 100;
// ArrayList donde se guardan los objetos Registro
   static private ArrayList<Radar> tabla;
    static public double velocidad;
    static public double distancia;
    static public double tiempo;
    static public double multa;
// constructor

    public  GestordeMultas() {
        tabla = new ArrayList<Radar>();
        velocidad = 0;
        distancia = 0;
        tiempo = 0;
        multa = 0;
    }

// Metodo llamado cuando un coche entra en la autopista.
   static public void entradaAutopista(Radar reg) {

        if (tabla.size() == TAMANO) {
            tabla.remove(0);
        }
        tabla.add(reg);
    }

    // Metodo llamado cuando un coche sale de la autopista.
    public static void salidaAutopista(Radar entrada, Radar salida) {

        if (tabla.contains(entrada)) {
            distancia = salida.getKilometro() - entrada.getKilometro();
            tiempo = salida.getHora() - entrada.getHora();
            velocidad = distancia / tiempo;
            if (velocidad > MAX_VEL) {
                multa =(int) ((velocidad - MAX_VEL) * 200);
                System.err.println("MULTA POR EXCESO DE VELOCIDAD\n"
                        + "MATRICULA: " + entrada.getMatricula() + "\n"
                        + "Velocidad: " + velocidad + "En Km: " + entrada.getKilometro() + "Hasta Km"
                        + salida.getKilometro() + "\n"
                        + "Entre las " + entrada.getHora() + " Horas, y las " + salida.getHora() + "Horas" + "\n"
                        + "IMPORTE MULTA: " + multa);
            }
        }
        tabla.remove(tabla.contains(entrada));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestordeMultas registro= new GestordeMultas(); 
        
        Radar entrada = new Radar("IB 0198 FWB", 20.00, 100);
        Radar salida = new Radar("IB 0198 FWB", 20.30, 165);
        
        registro.entradaAutopista(entrada);
        registro.salidaAutopista(entrada, salida);

    }
}
