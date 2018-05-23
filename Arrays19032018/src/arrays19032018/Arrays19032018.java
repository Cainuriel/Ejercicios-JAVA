/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays19032018;

/**
 *
 * @author SOIB1A07
 */
public class Arrays19032018 {

    public static void euromillones() {

        int numero = 0;
        int estrella = 0;
        int i;

        int boleto[];
        boleto = new int[7];

        for (i = 0; i < 5; i++) {
            numero = (int) (Math.random() * 50);
            boleto[i] = numero;
            System.out.println(numero);
        }
        for (i = 5; i < 7; i++) {
            estrella = (int) (Math.random() * 13);
            boleto[i] = estrella;
            System.out.println(estrella);
        }
    }

    public static void contarvocales() {

        String frase = "En un lugar de la manchaaaaaaaaaAA";

        //int contVocales[];
        //contVocales = new int[5];

        
        int contVocales []= {0,0,0,0,0};
       
        for (int k = 0; k < frase.length(); k++) {

            switch (frase.toLowerCase().charAt(k)) {
                case 'a':
                    contVocales[0]++;
                    break;
                case 'e':
                    contVocales[1]++;
                    break;
                case 'i':
                    contVocales[2]++;
                    break;
                case 'o':
                    contVocales[3]++;
                    break;
                case 'u':
                    contVocales[4]++;
                    break;
            }

        }

        System.out.println("El recuento de vocales es el siguiente: ");
        System.out.println("Letras 'a': " + contVocales[0]);
        System.out.println("Letras 'e': " + contVocales[1]);
        System.out.println("Letras 'i': " + contVocales[2]);
        System.out.println("Letras 'o': " + contVocales[3]);
        System.out.println("Letras 'u': " + contVocales[4]);
    }

    public static void mediamaxmin() {

        double notas[];
        notas = new double[4];
        notas[0] = 6.0;
        notas[1] = 8.0;
        notas[2] = 9.5;
        notas[3] = 7.5;
        double media = 0;
        double maxima = 0;
        double minima = 10;
        int i;
        for (i = 0; i < notas.length; i++) {
            media = media + notas[i];
            if (maxima < notas[i]) {
                maxima = notas[i];
            }
            if (minima > notas[i]) {
                minima = notas[i];
            }
        }
        System.out.println("La media es: " + (media / notas.length));
        System.out.println("La mayor nota fue: " + maxima);
        System.out.println("La nota más baja fue: " + minima);

    }

    public static void medianotas() {
        double notas[];
        notas = new double[4];
        notas[0] = 6.0;
        notas[1] = 8.0;
        notas[2] = 9.5;
        notas[3] = 7.5;
        double media = 0;
        int i;
        for (i = 0; i < notas.length; i++) {
            media = media + notas[i];

        }

        System.out.println("La media es: " + (media / notas.length));

    }

    public static void main(String[] args) {
        // TODO code application logic here
        // medianotas();
        //mediamaxmin();
        contarvocales();
        //euromillones();

    }

}
