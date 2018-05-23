/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerproyecto;

import java.util.Scanner;
/**
 *
 * @author SOIB1A07
 */
public class Miprimerproyecto {

    /**
     * @param args the command line arguments
     */
    public static void jmain(String[] args) {
        // TODO code application logic here
        
        Scanner valor = new Scanner (System.in);
        
        byte month = valor.nextByte(); 
        byte numDays = 1;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;

                break;
            case 2:
                numDays = 28;

            default:
                System.out.println("Mes no vàlid.");
                break;
        }
        System.out.println("El mes tiene los siguientes dias:" + numDays);
    }
}
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

