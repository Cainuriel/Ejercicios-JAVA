
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
    private ArrayList<Radar> tabla;
    public double velocidad;
    public double distancia;
    public double tiempo;
    public double multa;
// constructor
    public GestordeMultas(ArrayList<Radar> tabla) {
        this.tabla = tabla;

    }

// Metodo llamado cuando un coche entra en la autopista.
    public void entradaAutopista(Radar reg) {

        if (tabla.size() == TAMANO) {
            tabla.remove(0);
        }
        tabla.add(reg);
    }

    // Metodo llamado cuando un coche sale de la autopista.
    public void salidaAutopista(Radar reg) {

        if (tabla.contains(reg)) {
            distancia = salida.getKilometro() - entrada.getKilometro();
            tiempo = salida.getHora() - entrada.getHora();
            velocidad = distancia / tiempo;
            if (velocidad > MAX_VEL) {
                System.err.println("MULTA POR EXCESO DE VELOCIDAD\n"
                        + "MATRICULA: " + entrada.getMatricula() + "\n"
                        + "Velocidad: " + velocidad + "En Km: " + entrada.getKilometro() + "Hasta Km"
                        + salida.getKilometro() + "\n"
                        + "Entre las " + entrada.getHora() + " Horas, y las " + salida.getHora() + "Horas"+"\n"
                + "IMPORTE MULTA: "+ multa=((velocidad-MAX_VEL)*200));
            }
        } 
        tabla.remove(tabla.contains(reg));
    }

}
