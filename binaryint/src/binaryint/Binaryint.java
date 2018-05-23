/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryint;

import java.util.*;

/**
 *
 * @author SOIB1A07
 */
public class Binaryint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        int binary[] = {0, 1, 1, 0};

        int suma = 0;
        int i = 0;
        for (i = 0; i < 4; i++) {
            if (binary[0] == 1) {
                suma = 1;
                System.out.println(suma);
            }
            if (binary[1] == 1) {
                suma = suma + 2;
                System.out.println(suma);
            }
            if (binary[2] == 1) {
                suma = suma + 4;
                System.out.println(suma);
            }
            if (binary[3] == 1) {
                System.out.println(suma);
                 suma = suma + 8;
            }
            
               
            
        }
        System.out.println("El resultado es: " + suma);

    }

}


