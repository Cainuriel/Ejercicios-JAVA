/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings16032018;

import javax.swing.JOptionPane;

/**
 *
 * @author SOIB1A07
 */
public class Strings16032018 {

    public static void password() {
        String password = "Fernando";

        String inputpass = "xxx";

        while (!inputpass.equals(password)) {
            
            inputpass = JOptionPane.showInputDialog("Introduce contraseña");

            if (!inputpass.equals(password)) {

                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");

            }
        }
        JOptionPane.showMessageDialog(null, "Contraseña correcta");

    }

    public static void buscarletras2(String dosletras) {

        String frase = "ab unad del ab aunad ab abc";
        int contador = 0;

        // el tamaño es menos uno para que pueda pararse el bucle
        for (int indice = 0; indice < frase.length() - 1; indice++) {
            if (frase.charAt(indice) == dosletras.charAt(0)) {
                if (frase.charAt(indice + 1) == dosletras.charAt(1)) {
                    contador++;
                }
            }
        }

        System.out.println("El número de coincidencias es: " + contador);

    }

    public static void buscarletras() {
// cadena de caracteres protagonista
        String frase = "aacccac";
// caracter a buscar
        char a = 'a';
        /* @param numeroletras extensión de la cadena
        @param numero de caracteres encontrados
        @param k contador
        @param letra: almacena cada caracter de la cadena
         */
        int numerodeletras = frase.length();
        int numerodeas = 0;
        int k = 0;
        char letra;
// bucle que registra la busqueda del caracter
        do {

            letra = frase.charAt(k);

            if (letra == a) {
                numerodeas++;

            }
            k++;
        } while (k < numerodeletras);

        System.out.println("El número de letras a es: " + numerodeas);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //buscarletras();
       buscarletras2("ab");
       // password();
    }

}
