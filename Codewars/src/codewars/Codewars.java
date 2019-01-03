/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

/**
 *
 * @author DGarcia
 */
public class Codewars {

    public static String getMiddle(String word) {
        //Code goes here!
        int length = 0;
        int mod;
        int startmedia;
        int finishmedia;
        String middle = "";
        length = word.length();
        mod = length % 2;

        if (mod == 0) {
            //con esta operación, sacamos la posición del primer caracter central
            startmedia = (length / 2) - 1;
            // con esta operación, sacamos la posición del segundo caracter central
            finishmedia = startmedia + 2;
            System.out.println(finishmedia);
            middle = word.substring(startmedia, finishmedia);

            return "The Solution is: " + middle;
        }
        // posición inicial del caracter central
        startmedia = length / 2;
        // posición final del caracter central
        finishmedia = startmedia + 1;
        middle = word.substring(startmedia, finishmedia);
        System.out.println(middle);
        return "The solution is: " + middle;

    }
    
    
     public static String getMiddle2(String word) {
  
    if (word.length() > 2)
      return getMiddle(word.substring(1,word.length()-1));
    
    return word;
  }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // getMiddle2("X");
    //   getMiddle2("XX");
     // getMiddle2("1X3");
      getMiddle2("1XX4");
    //   getMiddle2("12X45");
   //    getMiddle2("12XX56");

    }

}
