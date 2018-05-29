/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfernando;

import java.util.ArrayList;

/**
 *
 * @author MMUT
 */
public class ExamenFernando {

    static ArrayList<Publicacion> publicaciones = new ArrayList<>();

    /**
     *
     * @param arrays de enteros introducida como parametro
     * @return resultado de las medias positivas y negativas en una array
     */
    public static double[] duesMijanes(int[] llista) {
        // creamos dos variables contenedoras de datos y de medias
      
        // contadores
        int p = 0;
        int n = 0;
        // arrays de retorno.
        double[] resultado = new double[2];
        // generamos un bucle para sacar los datos
        for (int e : llista) {
            // Son sumados en sus correspondientes contenedores
            if (e < 0) {
                resultado[1] = resultado[1] + e;
                n++;
            } else {
                resultado[0] = resultado[0] + e;
                p++;
            }

        }
        // realizamos las medias y las devolvemos con la array de resultado.cal
        resultado[0] = resultado[0] / p;
        resultado[1] = resultado[1] / n;

        return resultado;

    }

    public static void imprimirStock() {
        for (Publicacion e : publicaciones) {
            System.out.println(e.toString());

        }
    }

    public static void buscarlibro(int isbn) {
        boolean encontrado = false;
        for (Publicacion e : publicaciones) {

            if (e instanceof Libro) {

                if (isbn == ((Libro) e).darIsbn()) {
                    encontrado = true;
                    ((Libro) e).vendido();;
                }

            }

        }
        if (encontrado) {
            System.out.println("Que disfrute de su Libro");
        } else {
            System.out.println("Libro no encontrado");

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PRIMER EJERCICIO 
/* creamos las array's

        double[] mitjes = new double[2];
        int[] llista = {0, 4, 7, 3, 5, -1, 10, 10, 20};
        // Invocación del método.
        mitjes = duesMijanes(llista);
        System.out.println("Mitjes Pos: " + mitjes[0]);
        System.out.println("Mitjes Neg: " + mitjes[1]);*/
        // SEGUNNDO EJERCICIO
        Libro quijote = new Libro("Miguel de Cervantes", 01,
                "Don Quijote de la Mancha", 785, 50, 10);
        publicaciones.add(quijote);
        Libro fernando = new Libro("Fernando Lopez", 02,
                "Dominando el JAVA", 32, 8, 125);
        publicaciones.add(fernando);
        Libro mascaro = new Libro("Joan Mascaró", 03,
                "El Bagavad Ghita", 1250, 140, 5);
        publicaciones.add(mascaro);
        Revista cocina = new Revista("Saber Cocinar", 85, 11, 32, Frecuencia.ANUAL, 556625);
        publicaciones.add(cocina);
        Revista vivir = new Revista("Saber Vivir", 75, 8, 40, Frecuencia.MENSUAL, 452581);
        publicaciones.add(vivir);
        Revista programas = new Revista("Saber Programar", 65, 6, 99, Frecuencia.SEMANAL, 695821);
        publicaciones.add(programas);

        imprimirStock();
        buscarlibro(03);
        imprimirStock();
    }

}
