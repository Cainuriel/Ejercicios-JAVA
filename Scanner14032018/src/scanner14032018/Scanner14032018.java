/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner14032018;

/**
 *
 * @author Fuji
 */
import java.util.Scanner;

public class Scanner14032018 {

    public static void area() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el radio, y te calcularé el área del círculo");

        double radio = sc.nextDouble();

        double resultado = Math.PI * (radio * radio);

// Esta instrucción recorta a dos decimales el resultado
        System.out.printf("%1.2f", resultado);
    }

    public static void multiplicar() {

        int multi = 1;
        int resultado = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Con cuál número desea realizar la tabla?");

        int numero = sc.nextInt();

        System.out.println("TABLA DE MULTIPLICAR DEL " + numero);
        do {
            resultado = numero * multi;

            System.out.println(numero + " por " + multi + " " + resultado);

            multi++;

        } while (multi < 11);
    }

    public static void centigradosfarengeit() {

        final double DV = 1.8;
        int c = 32;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame unos grados en Fahrenheit y te los convertiré en Celsius");

        int fah = sc.nextInt();

        int celsius = fah - c;

        double resultado = celsius / DV;

        System.out.println(fah + " grados Fahrenheit son " + resultado + " grados Celsius");
    }

    public static void main(String[] args) {

        System.out.print("MENU DE PROGRAMAS");
        System.out.println();
        System.out.println();
        System.out.println("1. Tabla de Multiplicar");
        System.out.println("2. Cálculo Área Círculo");
        System.out.println("3. Fahrenheit a Celsius");
        System.out.println("0. Salir");

        Scanner sc = new Scanner(System.in);

        System.out.println("Selecciona programa o salga");

        int menu = sc.nextInt();

        if (menu == 1) {
            multiplicar();
        } else if (menu == 2) {
            area();
        } else if (menu == 3) {
            centigradosfarengeit();
        }

        System.out.println("Que pase un buen día");

    }
}
