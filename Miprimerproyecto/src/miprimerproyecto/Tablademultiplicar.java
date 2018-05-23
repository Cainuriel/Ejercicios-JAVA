/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerproyecto;

import java.util.Scanner;

public class Tablademultiplicar {

    public static void main(String[] args) {

        int num = 0;
        int mult = 1;
        int resul = 0;
        Scanner valor = new Scanner(System.in);
        System.out.print("Cuál es el número que desea multiplicar?  ");
        num=valor.nextInt();
        do {
            resul = num * mult;

            System.out.println(num + " por " + mult + " igual a: " + resul);
            mult++;
        } while (mult < 11);
    }
}

