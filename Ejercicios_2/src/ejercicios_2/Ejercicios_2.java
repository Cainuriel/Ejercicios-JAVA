package ejercicios_2;

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
    public static void nombreperfecte(int numero) {

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
        } else {
            System.out.println("FALSE " + "El nombre no és major igual que zero");
        }
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

    public static int fromRomatoDecimal(String numroma) {
        int decimal = 0;

        return decimal;
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
    public void matriz() {

        //creamos la matriz bidimensional
        boolean[][] matriz = {{true, true, false, false, false, false, false, false, true, true},
        {true, true, true, false, false, false, false, false, true, true},
        {true, true, true, true, false, false, false, false, true, true},
        {true, true, true, true, true, false, false, false, true, true},
        {true, true, true, true, true, true, true, true, true, true}};
    }

    /*6.- Donats 2 nombres en forma d'array de caràcters, necessitem un mètode que generi l'array
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

        stringB = (String.valueOf(arraysB[0]));
        stringBB = (String.valueOf(arraysB[1]));

        stringfinalB = stringB.concat(stringBB);
        // pasamos la cadena a integer
        numeroB = Integer.parseInt(stringfinalB);

//Esta arrays de cuatro caracteres necesitará de un proceso más largo
        String stringA;
        String stringAA;

        int numeroA = 0;
        String stringfinalA = "";

        //juntamos los dos primeros caracteres
        stringA = (String.valueOf(arraysA[0]));
        stringAA = (String.valueOf(arraysA[1]));

        stringfinalA = stringA.concat(stringAA);

        String stringAAA;
        String stringAAAA;
        String stringfinalAA = "";
        // juntamos los dos últimos caracteres. Tendremos pues, dos cadenas String
        stringAAA = (String.valueOf(arraysA[2]));
        stringAAAA = (String.valueOf(arraysA[3]));

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
        int i=0;
        for (i=0; i<4; i++) {
            arrayssuma[i]=resultado.charAt(i);
            
        }
        // imprimimos la array para comprobar que ha ido todo bien.
        for (i=0; i<4; i++) {
System.out.println(arrayssuma[i]);            
        }
        
       
    }

    /*7.- Donats 2 arrays que tenen una sèrie de nombres enters ordenats ascendentment, crear un
mètode que ens torni un array amb la fusió ordenada dels dos anteriors.*/
    public static void arraysAscendentes() {

        //creamos los arrays a ordenar 
        int[] array1 = {2, 4, 8, 9, 10};
        int[] array2 = {1, 3, 5, 6, 7};

        //mezclamos los arrays
        int array3[] = new int[10];
        int primero = 0;
        int i = 0;
        int control = 0;
        for (int e : array1) {
            array3[i] = e;
            i++;
        }
        for (int e : array2) {
            array3[i] = e;
            i++;
        }

        // Finalmente, ordenamos el arrays
        int arrayfinal[] = new int[10];
        for (int e : array3) {
            if (control < e) {
                control = 0;

            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // nombreperfecte(8128);
        // anysbisiestos();
        // fromRomatoDecimal("XXVI");
        // matriz();
        deStringaEntero();
        //  arraysAscendentes();
    }

}
