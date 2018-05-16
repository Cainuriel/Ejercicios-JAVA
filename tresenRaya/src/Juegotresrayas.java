/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando Lopez
 */
import javax.swing.*;

public class Juegotresrayas {

    // tresenRaya tablero=new tresenRaya();
    public Juegotresrayas() {

    }

    public String[][] inicializar() {

        String[][] matriz = {{"", "", ""},
        {"", "", ""}, {"", "", ""}};
        return matriz;
    }

    public static void imprimirmatriz(String[][] matriz) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(" | " + matriz[x][y] + " | ");
            }
            System.out.println("\n----------------------------------------");

        }

    }

    public static String[][] copiarmatriz(String[][] matriz) {
        String[][] matriz2 = new String[matriz.length][matriz[0].length];
        /* for (int j = 0; j < matriz.length; j++) {
        System.arraycopy(matriz[j], 0, matriz2[j], 0, matriz[j].length);
        }*/
        System.arraycopy(matriz, 0, matriz2, 0, matriz.length);
        return matriz2;

    }

    public boolean filas(String matriz[][]) {
        boolean[] respuesta = {false, false, false};
        /**
         * Bucle que recorre las filas de la matriz, comparando sus casillas si
         * encuentra tres coincidencias guarda un true para esa fila
         * posteriormente se revisan las respuestas y si hay un true se
         * devuelve.
         */
        for (int i = 0; i < 3; i++) {
            if (!matriz[i][1].equalsIgnoreCase("")) {
                if (matriz[i][1].equalsIgnoreCase(matriz[i][2])
                        && matriz[i][1].equalsIgnoreCase(matriz[i][0])) {
                    respuesta[i] = true;
                }

            }
        }
        for (boolean r : respuesta) {
            if (r) {
                return true;
            }
        }

        return false;
    }

    public boolean columnas(String matriz[][]) {
        boolean[] respuesta = {false, false, false};
        /**
         * Bucle que recorre las columnas de la matriz, comparando sus casillas
         * si encuentra tres coincidencias guarda un true para esa columna
         * posteriormente se revisan las respuestas y si hay un true se
         * devuelve.
         */
        for (int i = 0; i < matriz.length; i++) {
            if (!matriz[1][i].equalsIgnoreCase("")) {
                if (matriz[1][i].equalsIgnoreCase(matriz[2][i])
                        && matriz[1][i].equalsIgnoreCase(matriz[0][i])) {
                    respuesta[i] = true;
                }

            }

        }
        for (boolean r : respuesta) {
            if (r) {
                return true;
            }
        }

        return false;
    }

    public boolean diagonales(String matriz[][]) {

        if (!matriz[1][1].equalsIgnoreCase("")) {

            if (matriz[1][1].equalsIgnoreCase(matriz[2][2])
                    && matriz[1][1].equalsIgnoreCase(matriz[0][0])) {
                return true;
            } else {
                if (matriz[1][1].equalsIgnoreCase(matriz[0][2])
                        && matriz[1][1].equalsIgnoreCase(matriz[2][0])) {
                    return true;
                }
            }
        }
        return false;

    }

    public boolean quienGana(String matriz[][]) {

        if (columnas(matriz)) {
            return true;

        }
        if (filas(matriz)) {
            return true;
        }
        if (diagonales(matriz)) {
            return true;
        }

        return false;

    }

    public String[][] defensaDiagonal(String matriz[][]) {
        for (int x = 0; x < matriz.length; x = +2) {

            if (matriz[1][1].equals(matriz[2][x]) && matriz[1][1].equals("X")) {
                matriz[0][2 - x] = "O";
                return matriz;
            }
            if (matriz[1][1].equals(matriz[0][x]) && matriz[1][1].equals("X")) {
                matriz[2][2 - x] = "O";
                return matriz;
            }
        }
        return matriz;

    }

    public String[][] defensa(String matriz[][]) {

        for (int x = 0; x < matriz.length; x++) {

            if (matriz[0][x].equals(matriz[1][x]) && matriz[0][x].equals("X")) {
                matriz[2][x] = "O";
                return matriz;

            }
            if (matriz[2][x].equals(matriz[1][x]) && matriz[2][x].equals("X")) {
                matriz[0][x] = "O";
                return matriz;
            }
        }

        return defensaDiagonal(matriz);

    }

    public int[] colocarficha(String[][] matriz) {
        int posicion[] = new int[2];
        int randomx = 0;
        int randomy = 0;
        try {
            do {
                randomx = (int) ((Math.random()) * 3);
                randomy = (int) ((Math.random()) * 3);
            } while (!matriz[randomx][randomy].equalsIgnoreCase(""));
            matriz[randomx][randomy] = "O";
            posicion[0] = randomx;
            posicion[1] = randomy;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "TABLAS");
        }
        return posicion;
    }

}
