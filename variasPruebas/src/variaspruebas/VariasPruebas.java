/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variaspruebas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Superlopez
 */
public class VariasPruebas {

    public static void Yourorder() {

        String charnumber = "";
        int j = 1;

        String frase = "prime1ro terc3ero cuar4to segun2do";

        //corta palabras - cutting words 
        String[] words = frase.split("\\s+");
        String[] orderwords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            //  System.out.println(words[i]);
            for (int x = 1; x < 10; x++) {
                charnumber = String.valueOf(x);
                j = words[i].indexOf(charnumber);

                if (j != -1) {
                    int a = x;
                    orderwords[a - 1] = words[i];
                }
            }
        }

        StringJoiner joiner = new StringJoiner(" ");
        for (String str : orderwords) {
            joiner.add(str);
        }
        System.out.println(joiner.toString());
        //  System.out.println(words[i].intern());
        /* for (int i = 0; i < words.length; i++) {
        for (int x =1; x==9; x++) {
        charnumber=String.valueOf(xz
        Pattern pat = Pattern.compile(charnumber);
        System.out.println(charnumber);
        Matcher mat = pat.matcher(words[i]);
        if (mat.matches()) {
        wordsorder[x]=words[i];
        }
        System.out.print("no encontro numero");
        }
        }*/
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*  System.out.print("Impresion de prueba");
        
        // se crea un objeto de la clase que tiene la interface del evento
        Diezsegundos oyente= new Diezsegundos();
        
        //temporizador en milisegundos, que llama al evento con el objeto creado anteriormente
        Timer temporizador=new Timer(10000, oyente);
        
        temporizador.start();
                
        JOptionPane.showMessageDialog(null, "A ver si se ve");
        
        System.exit(0);*/
        //Yourorder();
      

/*Map<Integer, String> treeMap = new TreeMap<Integer, String>();
treeMap.put(1, "Casillas");	treeMap.put(15, "Ramos");
treeMap.put(3, "Pique");	treeMap.put(5, "Puyol");
treeMap.put(11, "Capdevila");	treeMap.put(14, "Xabi Alonso");
treeMap.put(16, "Busquets");	treeMap.put(8, "Xavi Hernandez");
treeMap.put(18, "Pedrito");	treeMap.put(6, "Iniesta");
treeMap.put(7, "Villa");

// Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
it = treeMap.keySet().iterator();
while(it.hasNext()){
  Object key = it.next();
  System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));
}*/
int random=(int)((Math.random())*3);
        System.out.println(random);

}
}