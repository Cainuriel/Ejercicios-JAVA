package ejercicios_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Fernando Lopez
 */
public class Ejercicios_2 {

    /*1.- En la teoria dels nombres, es considera "perfecte" a aquells nombres naturals que són
iguals que la suma dels seus divisors. Per exemple, 6 = 1 + 2 + 3 és un nombre natural
perfecte. Escriure un mètode que determini si un nombre enter és un natural perfecte.
El mètode retornarà true quan el nombre sigui perfecte, false en cas contrari.
I si el nombre no és natural escriurà “El nombre no és major igual que zero”*/
    // @param numero dado para conocer si es perfecto
    public static boolean nombreperfecte(int numero) {

        // establecemos las variables
        int[] divisores = new int[100];
        int divisor;
        int resto;
        int j = 0;
        divisor = numero;
        int contador = 0;

        // Guardamos en el Arrays los divisores
        do {
            divisor--;
            resto = (numero % divisor);
            if (resto == 0) {
                divisores[j] = divisor;
                j++;
                contador++;
            }

        } while (divisor != 1);

        // Sumamosw los divisores
        int suma = 0;

        for (int d : divisores) {
            suma = suma + d;

        }

        //Comprobamos la suma con el múmero entrado por parámetro
        if (suma == numero) {
            System.out.println("TRUE " + "El nombre es perfecte");
            return true;
        }
        System.out.println("FALSE " + "El nombre no és major igual que zero");

        return false;
    }


    /*2.- Realitza un programa Java que mostri per pantalla tots els anys bisiestos entre el any 2000 i
el 3000.*/
    public static void anysbisiestos() {

        int any = 1999;
        // Condiciones para que un año sea bisiesto y por tanto que sea elegido para imprimirse
        do {
            any++;
            if (any % 4 == 0 && any % 100 != 0 || any % 400 == 0) {
                System.out.println("Any bisiesto: " + any);
            }
        } while (any < 3001);
    }

    /* 3.- Realitza una funció recursiva que calculi la sèrie de fibonacci. Desprès crea una nova funció
que utilitzi un array per magatzemar (caché) els valors ja calculats d’aquesta funció on es van
guardant i s’utilitzant dins les cridades recursives.*/
    public static void fibonnacci(int limite) {
        int fibo1 = 0;
        int fibo2 = 1;

        //función recursiva
        if (limite >= 1) {
            do {
                fibo2 = fibo1 + fibo2;
                System.out.print(fibo1 + " " + fibo2 + " ");
                fibo1 = fibo1 + fibo2;
            } while (limite > fibo2);
        } else if (limite == 0 || limite < 0) {  // caso base
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");

        }

    }

    // fibonnacci con array
    public static int[] fibonnacciarray(int posiciones) {
        int fibo1 = 0;
        int fibo2 = 1;
        int[] array = new int[posiciones];
        array[0] = fibo2;
        for (int i = 1; i < array.length; i++) {
            array[i] = fibo2 = fibo1 + fibo2;
            fibo1 = fibo1 + fibo2;
        }
        return array;

    }

    /* Realizar un programa que per convertir un nombre romà a un nombre decimal. MCDXLIV ->
1444 */
    public static int fromRomatoDecimal(String numroma) {
        int acumulador = 0;
        int letranterior = 0;
        // array de numeros romanos
        char romanos[] = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        // array de valores decimales
        int[] arabes = {1, 5, 10, 50, 100, 500, 1000};
        // leemos el numero entrado por parametro hasta su final con un bucle
        for (int i = 0; i < numroma.length(); i++) {
            char letra = ' ';
            letra = numroma.charAt(i);
            // recorremos la array de numeros romanos.
            for (int j = 0; j < romanos.length; j++) {
                //si la letra es la misma que la del array, se suma.
                if (letra == romanos[j]) {
                    acumulador = acumulador + arabes[j];
                    //si el valor de letra anterior es menor que la letra presente
                    // se realiza la ecuación: valor-(letra anterior x 2). ya que
                    // el valor anterior, está sumado.
                    if (letranterior < arabes[j]) {
                        acumulador = acumulador - (letranterior * 2);

                        letranterior = arabes[j]; // valor anterior = valor letra actual

                    } else {//si no se cumple lo anterior  

                        letranterior = arabes[j];//el dato actual se guarda en anterior

                    }

                }

            }

        }

        return acumulador;

    }

    /* 5.- Tenim una matriu bidimensional de tamany 10 x 6 de booleans on cada posició indica si el
punt (x,y) és blanc (true) o el fons de color negre (false).
Exemple: 0000000000
         0011111100
         0001111100
         0000111100
         0000011100
         0000000000
Escriviu quatre mètodes per localitzar els cantons superior, inferior, esquerra i dret:
· getCantoSuperior (figura) = valor mínim de y on algun puntés TRUE
· getCantoInferior (figura) = valor màxim de y on algun puntés TRUE
· getCantoEsquerra (figura) = valor mínim de x on algun puntés TRUE
· getCantoDret (figura) = valor màxim de x on algun puntés TRUE */
    public static String getCantoSuperiorEsquerra(boolean[][] matriz) {
        // guardamos en dos variables, las filas y columnas de la matriz
        /*  int filas = matriz.length;
        int[] columnas = new int[filas];
        // con este bucle, podemos identificar las difedentes columnas de una matriz
        for (int i = 0; i < filas; i++) {
            columnas[i] = matriz[i].length;
        }*/
        // leemos por la parte superior, leyendo de izquierda a derecha
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = 0; j < matriz[i].length - 1; j++) {
                if (matriz[i][j] == false) {
                    return "Canto Superior Esquerra: "
                            + " Fila " + (i + 1) + " Columna " + (j + 1);
                }
            }
        }

        return "No se encontró la esquina";

    }

    public static String getCantoSuperiorDreta(boolean[][] matriz) {

        // guardamos en dos variables, las filas y columnas de la matriz
        int filas = matriz.length;
        int[] columnas = new int[filas];
        // con este bucle, podemos identificar las difedentes columnas de una matriz
        for (int i = 0; i < filas; i++) {
            columnas[i] = matriz[i].length;
        }
        // leemos por la parte superior, leyendo de derecha a izquierda
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = matriz[i].length - 1; j > 0; j--) {
                if (matriz[i][j] == false) {
                    return "Canto Superior Dreta:"
                            + " Fila " + (i + 1) + " Columna " + (j + 1);
                }
            }
        }

        return "No se encontró la esquina";
    }

    public static String getCantoInferiorEsquerra(boolean[][] matriz) {
        // guardamos en dos variables, las filas y columnas de la matriz
        int filas = matriz.length;
        int[] columnas = new int[filas];
        // con este bucle, podemos identificar las difedentes columnas de una matriz
        for (int i = 0; i < filas; i++) {
            columnas[i] = matriz[i].length;
        }
        // leemos por la parte inferior, leyendo de izquierda a derecha
        for (int i = matriz.length - 1; i > 0; i--) {
            for (int j = 0; j < matriz[i].length - 1; j++) {
                if (matriz[i][j] == false) {
                    return "Canto Inferior Esquerra: "
                            + " Fila " + (i + 1) + " Columna " + (j + 1);
                }
            }
        }

        return "No se encontró la esquina";

    }

    public static String getCantoInferiorDreta(boolean[][] matriz) {
        // guardamos en dos variables, las filas y columnas de la matriz
        int filas = matriz.length;
        int[] columnas = new int[filas];
        // con este bucle, podemos identificar las difedentes columnas de una matriz
        for (int i = 0; i < filas; i++) {
            columnas[i] = matriz[i].length;
        }
        // leemos por la parte inferior, leyendo de izquierda a derecha
        for (int i = matriz.length - 1; i > 0; i--) {
            for (int j = matriz[i].length - 1; j > 0; j--) {
                if (matriz[i][j] == false) {
                    return "Canto Inferior Dreta: "
                            + " Fila " + (i + 1) + " Columna " + (j + 1);
                }
            }
        }

        return "No se encontró la esquina";

    }

    /*  6.- Donats 2 nombres en forma d'array de caràcters, necessitem un mètode que generi l'array
suma.
Exemple:
Sigui A = {'2 ', '0', '1 ', '2'} 2 0 1 2
Sigui B = {'1 ', '9'} 1 set
suma (A, B) = {'2 ', '0', '3 ', '1'} 2 0 3 1
El mètode que es demana rep com arguments 2 arrays de caràcters, i torna com a resultat un
arrays de caràcters. L’array resultat tindrà la mínima grandària necessària per contenir el 
nombre, o sigui, sense "zeros a l'esquerra". */
    public static void deStringaEntero() {

        // creamos los arrays de carácteres
        char arraysB[] = {'1', '9'};
        char[] arraysA = {'2', '0', '1', '2'};

        // juntamos los carácteres en una única cadena String
        String stringB;
        String stringBB;
        int numeroB = 0;
        String stringfinalB = "";
        // el arrays de dos elementos es transformado a dos Strings
        stringB = (String.valueOf(arraysB[0]));
        stringBB = (String.valueOf(arraysB[1]));
        // Ahora los dos Strings se concatenan en uno. 
        stringfinalB = stringB.concat(stringBB);
        // pasamos la cadena a integer
        numeroB = Integer.parseInt(stringfinalB);

//El arrays de cuatro caracteres necesitará de un proceso más largo
        String stringA;
        String stringAA;

        int numeroA = 0;
        String stringfinalA = "";

        //juntamos los dos primeros caracteres
        stringA = (String.valueOf(arraysA[0]));
        stringAA = (String.valueOf(arraysA[1]));
        // Se concatenan
        stringfinalA = stringA.concat(stringAA);
        // nos quedan dos caracteres y realizamos el mismo proceso
        String stringAAA;
        String stringAAAA;
        String stringfinalAA = "";
        // se pasan a String
        stringAAA = (String.valueOf(arraysA[2]));
        stringAAAA = (String.valueOf(arraysA[3]));
        // Y finalmente, se concatenan
        stringfinalAA = stringAAA.concat(stringAAAA);

        // Finalmente, juntamos las dos cadenas, en una. 
        String cadenafinal = "";
        cadenafinal = stringfinalA.concat(stringfinalAA);

        // Y pasamos la cadena a integer
        numeroA = Integer.parseInt(cadenafinal);

        //Realizamos la sumatoria de los números
        int suma = 0;
        suma = numeroA + numeroB;

        // A continuación, transformamos el integer en un char array
        String resultado = "";
        char arrayssuma[] = new char[4];
        resultado = Integer.toString(suma);
        // el resultado como cadena String, es transmitido al char array
        int i = 0;
        for (i = 0; i < 4; i++) {
            arrayssuma[i] = resultado.charAt(i);

        }
        // imprimimos la array para comprobar que ha ido todo bien.
        for (i = 0; i < 4; i++) {
            System.out.println(arrayssuma[i]);
        }

    }

    /*7.- Donats 2 arrays que tenen una sèrie de nombres enters ordenats ascendentment, crear un
mètode que ens torni un array amb la fusió ordenada dels dos anteriors.*/
    public static void arraysAscendentes() {
        int i = 0;
        int control = 0;
        //creamos los arrays a ordenar con un array contenedor
        int[] array1 = {2, 4, 8, 9, 10};
        int[] array2 = {1, 3, 5, 6, 7};
        int array3[] = new int[10];
        //mezclamos los arrays en un tercero
        for (int e : array1) {
            array3[i] = e;
            i++;
        }
        for (int e : array2) {
            array3[i] = e;
            i++;
        }

        // Finalmente, ordenamos el arrays
        for (i = 0; i < array3.length - 1; i++) {
            for (int j = i + 1; j < array3.length; j++) {
                if (array3[j] < array3[i]) {
                    control = array3[i];
                    array3[i] = array3[j];
                    array3[j] = control;
                }
            }
        }
        for (int e : array3) {
            System.out.print(e + " ");
        }

    }

    /*  8.- Mostra la suma de cada columna i de cada fila 
    d’una matriu de sencers de tamany 10 x 10.*/
    public static void sumaEnterosenArray(int[][] matriz) {

        // guardamos en dos variables, las filas y columnas de la matriz
        int resultado = 0;
        int filas = matriz.length;
        // numero de columnas
        int columnas = matriz[0].length;

        // suma de filas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado = resultado + matriz[i][j];

            }
            System.out.println("Suma fila " + (i + 1) + ": " + resultado);
            resultado = 0;
        }
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                // cambiando de lugar los contadores realizamos las sumas de las columnas
                resultado = resultado + matriz[j][i];

            }
            System.out.println("Suma Columna " + (i + 1) + ": " + resultado);
            resultado = 0;
        }
    }

    /* 9 - Crear una funció anomenada calcular que calculi l’expressió que se li passa com a paràmetre. 
    La funció ha de tenir la següent definició:
public double calcular(String exp) {....}
i utilització: String expre=”2+3”;
System.out.println(“El resultat és: “+expre+’=’+ calcular(expre));
El resultat és: 2+3=5
La funció calcular ha d’utilitzar els següents operadors: +, -, /, * i % (per mòdul), 
    en cas que no pugui fer l’operació també ho ha de dir.
Ha de resoldre les següents operacions: “2+3”, “12-2”, “300*32”, “10%2”, etc.*/
    public static double calcular(String exp) {
        double resultado = 0;
        int[] arraycifras = new int[3];
        int i = 0;
        char caracter = ' ';
        char[] operador = {'+', '-', '%', '*', '/'};
        // con esta expresión regular sacamos los numeros del String
        String[] numeros = exp.split("\\D+");
        //A continuacion buscamos el operador en el String
        for (char o : operador) {
            for (i = 0; i < exp.length(); i++) {
                if (o == exp.charAt(i)) {
                    caracter = exp.charAt(i);
                }
            }

        }
        /* esta es una expresión regular que sacaba el operador
        se ha descartado porque dio problemas en la extracción
        String[] operador = exp.split("\\d+");*/
        //Se ha decidido por el siguiente método.
        //transformamos las cifras a int y las guardamos en una array
        int j = 0;
        for (String n : numeros) {
            int cifras = Integer.parseInt(n);
            arraycifras[j] = cifras;

            j++;
        }

        // con el operador identificado realizamos la operacion
        //@return resultado de la operacion aritmetica
        switch (caracter) {

            case '+':
                resultado = arraycifras[0] + arraycifras[1];
                return resultado;
            case '-':
                resultado = arraycifras[0] - arraycifras[1];
                return resultado;
            case '%':
                resultado = arraycifras[0] % arraycifras[1];
                return resultado;
            case '*':
                resultado = arraycifras[0] * arraycifras[1];
                return resultado;
            case '/':
                resultado = arraycifras[0] / arraycifras[1];
                return resultado;

            default:
                System.out.println("Error al introducir el operador");
        }

        return resultado;
    }

    /*10.- Donat un array de nombres enters, localitzeu sèries de nombres 
consecutius en què cada nombre és igual o major que l'anterior. 
Retornau un ArrayList amb les posicions on comencen aquestes sèries.
Exemple: Sigui A = {0, 4, 7, 3, 5, -1, 10, 10, 20} 
el mètode identifica tres sèries ascendents:
0 4 7 3 5 -1 10 10 20 de manera que retorna l'ArrayList d'inicis {0, 3, 5}
La funció ha de tenir la següent definició: public static ArrayList iniSeries(int[] llista)
i utilització: int[] llista = {0, 4, 7, 3, 5, -1, 10, 10, 20};
System.out.println(iniSeries (llista).toString());*/
    // Me creo un metodo para generar series
   /* public static int[] crearSeries(int[] serie) {

        int[] resultado = new int[10];
        for (int i = 0; i < serie.length - 1; i++) {
            resultado[i] = serie[i + 1];
            System.out.print(resultado[i] + " ");
        }
        System.out.println();
        return resultado;
    }*/
    
     public static ArrayList iniSeries(int[] llista) {
        int[] primerosnumeros=new int[2];
        int i;
        ArrayList<Object> iniseries = new ArrayList<Object>();
        
        
        for ( iniseries.add(i=0); i<llista.length-1; i++) {
             if (llista[i]>llista[i+1]) {
                 iniseries.add(i+1);
             }
        }
             for (Object x: iniseries){
                 System.out.println(x);
                 
             }
             
             return iniseries;
    }

  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ejercicio 1
        // nombreperfecte(6);
        // ejercicio 2
        // anysbisiestos();
        // ejercicio 3
        //@param limite de la serie fibonnacci para que no sea infinita
        // fibonnacci();
        // ejercicio 3a
        // @param posiciones de la array
        // System.out.println(fibonnacciarray(50));
        // ejercicio 4
        //    System.out.println(fromRomatoDecimal("MCM"));
        // ejercicio 5
        //creamos la matriz bidimensional del ejercicio
        /*  boolean[][] matriz = {{true, true, false, false, false, false, false, false, true, true},
        {true, true, true, false, false, false, false, false, true, true},
        {true, true, true, true, false, false, false, false, true, true},
        {true, true, true, true, true, false, false, false, true, true},
        {true, true, true, true, true, true, true, true, true, true}};
        System.out.println(getCantoSuperiorDreta(matriz));
         System.out.println(getCantoSuperiorEsquerra(matriz));
        System.out.println(getCantoInferiorEsquerra(matriz));
        System.out.println(getCantoInferiorDreta(matriz));*/
        // ejercicio 6
        //    deStringaEntero();
        // ejercicio 7
        //  arraysAscendentes();
        // ejercicio 8
        /* int[][] matriz = {{10, 125, 12, 2, 8, 9, 32, 11, 9, 15},
        {6, 21, 5, 8, 10, 19, 14, 25, 32, 34},
        {6, 21, 5, 8, 21, 19, 14, 25, 32, 34},
        {6, 0, 5, 8, 11, 19, 14, 25, 32, 34},
        {6, 21, 5, 8, 11, 119, 14, 25, 32, 34},
        {6, 21, 5, 8, 11, 19, 14, 9525, 32, 34},
        {60, 21, 5, 80, 11, 19, 14, 25, 32, 34},
        {6, 21, 5, 8, 11, 19, 78, 25, 32, 34},
        {6, 20, 5, 108, 16, 19, 18, 25, 32, 33},
        {8, 21, 5, 220, 55, 19, 14, 25, 32, 499}};
        sumaEnterosenArray(matriz);*/
        //ejercicio 9
        // String expre = "2+3";
        //String expre = "12-2";
        // String expre = "300*32";
        // String expre = "10%2";
        //  System.out.println("El resultado es: " + expre + "= " + calcular(expre));
        // ejercicio 10
       int[] llista = {0, 4, 7, 3, 5, -1, 10, 10, 20};
      //int[] llista={3, 6, 1, 4, 5, 3, 7, 9, 6};
        iniSeries(llista);

    }

}
