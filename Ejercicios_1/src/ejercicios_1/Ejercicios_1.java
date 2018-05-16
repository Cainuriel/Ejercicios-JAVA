/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_1;

/**
 *
 * @author Fernando Lopez
 */
public class Ejercicios_1 {

    //1.- Realitza un programa que donades dues variables int a i b, intercanviïn els seus valors.
    public static String cambiarValores(int a, int b) {

        int atob = b;
        int btoa = a;

        return "El valor a, vale ahora: " + atob + " y el valor b vale ahora: " + btoa;
    }

    //2.- Realitza un programa que calculi l'àrea d’un quadrat donat un costat.
    public static void areaCuadrado(double lado) {
        double area;
        area = lado * lado;
        System.out.println("El area del cuadrado es: " + area);
    }

//3.- Realitza un programa que calculi l’àrea d’una circunsferència.
    public static void calcularCirculo(double radio) {
        double area;
        area = Math.PI * (radio * radio);
        // cortamos el exceso de decimales.
        System.out.println("El área del Circulo es: " + String.format("%.2f", area));

    }

    /*4.- Realitza un programa que generi 10 lletres aleatòriament i determini si son vocals o
consonants.*/
    public static void VocaloConsonante() {
        int random;
        // MAtrices progragonistas
        char[] vocales = {'A', 'E', 'I', 'O', 'U'};
        String abc = "ABCDEFGHIJKLMNÑOPQRSTUWYXZ";
        // Sacamos diez letras al azar
        for (int i = 0; i < 10; i++) {
            // si se convierte en true, es consonante
            Boolean control = false;
            System.out.print(i + 1 + "º Letra:");
            // Sorteamos la letra
            random = (int) (Math.random() * 26);
            char letra = abc.charAt(random);
            System.out.println(" " + letra);
            // Comprobamos si es vocal
            for (char v : vocales) {
                if (letra == v) {
                    System.out.println(" Vocal");
                    control = true;
                }
            }
            // Si no lo es, se imprime consonante.
            if (control == false) {
                System.out.println(" Consonante");
            }

        }

    }

    /* 5.- Realitza un programa que amb una variable int t que indica un temps en segons, calculi
aquest temps en hores, minuts i segons.*/
    public static int calcularMinutos(int segundos) {
        if (segundos < 60) {
            System.out.println(segundos + " segundos.");
        } else {
            int minutos = segundos / 60;
            segundos = segundos - (minutos * 60);
            System.out.println("Minutos: " + minutos + " Segundos: " + segundos);
        }
        return segundos;

    }

    public static int calcularHora(int segundos) {
        if (segundos < 3600) {
            System.out.println("Horas: 0");
            return segundos;
        } else if (segundos >= 3600) {
            int horas = segundos / 3600;
            segundos = segundos - (horas * 3600);
            System.out.println("Horas: " + horas);

        }
        return segundos;
    }

    public static void calcularSegundos(int segundos) {

        segundos = Ejercicios_1.calcularHora(segundos);
        segundos = Ejercicios_1.calcularMinutos(segundos);

    }

    /*6.- Realitza un programa que donat un import en euros ens indiqui el mínim nombre de billlets i
la quantitat sobrant.*/
    public static void calcularBilletes(int dinero) {
        int[] arraybilletes = new int[7];
        int[] valores = {500, 200, 100, 50, 20, 10, 5};
        int i = 0;
        /**
         * Bucle que elije los billetes, y los descuenta del montante entregado
         */
        do {
            arraybilletes[i] = dinero / valores[i];
            if (arraybilletes[i] >= 1) {
                dinero = dinero - (arraybilletes[i] * valores[i]);
                i++;
            } else {
                i++;
            }
        } while (dinero > 5);

        System.out.println("Estos son sus billetes:");

        for (i = 0; i < valores.length; i++) {
            if (arraybilletes[i] >= 1) {
                System.out.println(arraybilletes[i] + " billetes de " + valores[i]);
            }

        }
        System.out.println("Calderilla: " + dinero);

    }

    /**
     * 7.- Realitza un programa que transformi el bucle for (i=0; i<5; i++) en
     * un while.*
     */
    public static void transformarbucle() {
        int i = 0;
        do {
            System.out.println("Imprimiendo en un bucle WHILE.\n"
                    + "VEZ: " + (i + 1));
            i++;
        } while (i != 5);
        System.out.println("Imitacion del bucle: for (i=0; i<5; i++),"
                + "Finalizado ");

    }

    /**
     * /**8.- /*Realitza varis programes que mostrin per pantalla les figures
     * del pdf.
     */
    public static void primerdibujo(String[][] matriz) {
        int z = 7;
        String asterisco = "*";

        for (int i = 0; i < 9; i++) {

            for (int j = 6; j == 6; j--) {

                matriz[i][j] = asterisco;

                System.out.println(matriz[i][j]);
                asterisco = asterisco + "*";

            }
        }

    }

    public static void arboldenavidad(String[][] matriz) {

        int j = 6;
        matriz[0][6] = "     *     ";
        matriz[1][5] = "    ***    ";
        matriz[2][4] = "   *****   ";
        matriz[3][3] = "  *******  ";
        matriz[4][2] = " ********* ";
        matriz[5][1] = "    ||     ";

        for (int i = 0; i < 6; i++) {

            System.out.println(matriz[i][j]);
            j--;
        }

    }

    public static void rombo2(String[][] matriz) {

        int j = 6;
        matriz[0][6] = "     *     ";
        matriz[1][5] = "    * *    ";
        matriz[2][4] = "   *   *   ";
        matriz[3][3] = "    * *    ";
        matriz[4][2] = "     *     ";
        matriz[5][1] = "           ";

        for (int i = 0; i < 6; i++) {

            System.out.println(matriz[i][j]);
            j--;
        }

    }

    public static void rombo1(String[][] matriz) {

        int j = 6;
        matriz[0][6] = "     *     ";
        matriz[1][5] = "    ***    ";
        matriz[2][4] = "   *****   ";
        matriz[3][3] = "    ***    ";
        matriz[4][2] = "     *     ";
        matriz[5][1] = "           ";

        for (int i = 0; i < 6; i++) {

            System.out.println(matriz[i][j]);
            j--;
        }

    }

    /*
     9.- Realitza un programa que donat un nombre de tres cifres, digui si és
     * un nombre Armstrong. 153 = 13+ 53+ 33 */
    public static void ambstrong(int numero) {
        String stringnumero = Integer.toString(numero);
        int suma = 0;
        int resultado;
        // Comprobamos el tamaño del numero
        int tamano = stringnumero.length();

        int cifras[] = new int[tamano];
        char[] numeros = new char[tamano];
        // convertido en caracteres lo retornamos a integers
        for (int i = 0; i < tamano; i++) {
            numeros[i] = stringnumero.charAt(i);
            cifras[i] = Character.getNumericValue(numeros[i]);

        }
        //Finalmente comprobamos si es un numero amstrong
        for (int c : cifras) {

            suma += (int) Math.pow((double) c, (double) tamano);

        }
        if (suma == numero) {
            System.out.println("Es un número Amstrong");
        } else {
            System.out.println("No es un número Amstrong");
        }

    }

    /* 10.- Realitza un programa que
     * tengui un métode Java que rebi un argument o paràmetre: el dni d'un
     * usuari. El programa començarà imprimint una línia amb la cadena
     * "0123456789" i a continuació imprimir la codificació del DNI responent al
     * següent patró: es recorreran els dígits del DNI d'esquerra a dreta i cada
     * dígit del DNI es codifica en una línia com x espais seguits d'un asterisc
     * "*", sent x el valor del dígit. Exemple: 0123456789
     *
     * s*
     * ss* sss* ssss* sssss* ssssss* sssssss* S= espai en blanc */
    public static void espaciarDNI(int dni) {
        String stringdni = Integer.toString(dni);
        int tamano = stringdni.length();
        if (tamano != 8) {
            System.out.println("El dni tiene que tener ocho digitos");
        } else {
            int espacios[] = new int[tamano];
            // pasamos de String a char, y finalmente a int
            char[] numeros = new char[tamano];
            for (int i = 0; i < tamano; i++) {
                numeros[i] = stringdni.charAt(i);
                espacios[i] = Character.getNumericValue(numeros[i]);

            }
            for (int e : espacios) {
                for (int i = 0; i < e; i++) {
                    System.out.print(" ");
                }
                System.out.println("*");

            }

        }

    }

    /* 11.- Realitza un
     * programa que mostri per pantalla les taules de multiplicar del 1 al 10
     * amb el següent format: Taula del 1 ********** 1 x 1 = 1 1 x 2 = 2 ….. 1 x
     * 10 = 10 */
    public static void tablasdemultiplicar() {

        int numero;
        int multiplo;
        for (multiplo = 1; multiplo < 11; multiplo++) {
            System.out.println("");
            for (numero = 1; numero < 11; numero++) {

                System.out.println(multiplo + " X " + numero + " = " + multiplo * numero);

            }

        }
    }

    /* 12.- Realitza un programa que mostri per pantalla els nombres del
     * 1 al 100 sense mostrar aquells que són múltiples de 5. */
    public static void noquieromultiplosdecinco() {
        int numeros = 1;
        int control = 1;
        for (int i = 1; i < 100; i++) {
            if (control == 5) {
                control = 1;
                numeros++;
            } else {
                System.out.print(numeros + " ");
                numeros++;
                control++;
            }
        }

    }

    /* 13.- Realitza un
     * programa que mostri per pantalla els 50 primers nombres parells. */
    public static void primersnombresparells() {
        for (int i = 2; i < 51; i++) {
            System.out.print(i + " ");
            i++;
        }
    }

    /* 14.-
     * Realitza un programa que digui si un nombre és vampir o no. 2187 = 27 x
     * 81 o 1260 = 21 x 60 */
    public static void numerosVampiros(int numero) {
        String stringnumero = Integer.toString(numero);
        int suma = 0;
        int resultado;
        int digitospares;
        int tamano = stringnumero.length();
        digitospares = tamano % 2;
        String[] arraycombinacion = new String[16];

        if (digitospares != 0) {
            System.out.println("El número ha de tener, digitos pares");
        } else {
            int cifras[] = new int[tamano];
            char[] numeros = new char[tamano];
            // convertido en caracteres lo retornamos a integers
            for (int i = 0; i < tamano; i++) {
                numeros[i] = stringnumero.charAt(i);
                cifras[i] = Character.getNumericValue(numeros[i]);

            }
            int i = 0;
            for (int c : cifras) {

                for (int s : cifras) {

                    String combinaciones = String.valueOf(c) + String.valueOf(s);
                    arraycombinacion[i] = combinaciones;
                    i++;
                }
            }
            for (int j = 0; j < arraycombinacion.length; j++) {
                {
                    for (int z = 0; z < arraycombinacion.length; z++) {
                        resultado = Integer.parseInt(arraycombinacion[j]) * Integer.parseInt(arraycombinacion[z]);
                        if (resultado == numero) {
                            System.out.println("Es número Vampiro: " + arraycombinacion[j] + " X " + arraycombinacion[z] + " = " + numero);
                        }
                    }

                }

            }

        }

    }

    /* 15.- Realitza un programa que indiqui si un nombre és
     * primer i també si al invertir els seus dígits dona un altre nombre
     * primer. 7951 i 1597*/
    public static void numerosprimos(int numero) {
        String stringnumero = Integer.toString(numero);
        int control = 0;
        int resultado;
        int tamano = stringnumero.length();
        int cifras[] = new int[tamano];
        char[] numeros = new char[tamano];
        for (int i = 0; i < tamano; i++) {
            numeros[i] = stringnumero.charAt(i);
            cifras[i] = Character.getNumericValue(numeros[i]);
                    
        }
        for (int i = 1; i <= numero; i++) {
            if ((numero % i) == 0) {
                control++;
            }
        }

        if (control <= 2) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
        
        String numeroinvertido="";
         for (int i = tamano-1; i >= 0; i--) {
            numeroinvertido=numeroinvertido+numeros[i];
             System.out.println(numeroinvertido);

        }
         int alreves;
         alreves=Integer.parseInt(numeroinvertido);
         control=0;
         
        for (int i = 1; i <= alreves; i++) {
            if ((numero % i) == 0) {
                control++;
            }
        }

        if (control <= 2) {
            System.out.println("También, su número invertido es primo");
        } else {
            System.out.println("El numero invertido, no es primo");
        }
        
        
        
    }


private static void Permutar(String[] elem, String act, int n, int r) {
        if (n == 0) {
            System.out.println(act);
        } else {
            for (int i = 0; i < r; i++) {
                if (!act.contains(elem[i])) { // Controla que no haya repeticiones
                    Permutar(elem, act + elem[i] + ", ", n - 1, r);
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercicio 1
        //System.out.println(cambiarValores(12, 25));
        // Ejercicio 2
        //areaCuadrado(251);
        // Ejercicio 3
        //  calcularCirculo(12);
        // Ejercicio 4
        // VocaloConsonante();
        // Ejercicio 5
        // calcularSegundos(345456);
        // Ejercicio 6
        //transformarbucle();
        // Ejercicio 7
        //calcularBilletes(11);

        /* String[][] matriz = {{" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                             {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                             {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                             {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                             {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                             {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                             {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                             {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                             {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                             {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "}};
        // primerdibujo(matriz);
       // arboldenavidad(matriz);
       // rombo1(matriz);
       // rombo2(matriz);*/
        // ambstrong(4210818);
        // espaciarDNI(43089193);
        // tablasdemultiplicar();
        //noquieromultiplosdecinco();
        // primersnombresparells();
        // numerosVampiros(2187);
        numerosprimos(7951);
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*String[] elementos = "1,2,3,4,5,6".split(",");
        int n = 4;                  //Tipos para escoger
        int r = elementos.length;   //Elementos elegidos
        Permutar(elementos, "", n, r);*/
    }

}
