/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paleontologia;

/**
 *
 * @author cainu
 */
public class Paleontologia {

    static String diet[] = {"_C", "iii", "|||", "..."};
    static String brachiosaurus = "uuuuu";
    static String velociraptor = "vvvvv";
    static String triceratops = "uuVuu";
    static String T_Rex = "VvvvV";
        String zoo[] = {brachiosaurus, velociraptor, triceratops, T_Rex};
    String dead_dino = "_C     C}>";   // When this case is included in your return string, use "a dead dino" instead of "dead_dino"
    String flowers = "iii     iii";
    String leaves = "|||     |||";
// When this case is included in your return string, 
// use "T-Rex" instead of "T_Rex"
    String something = "...     ...";  // for any other food you could encounter (dots being the food, in a regexp notation, all the characters in the middle being the bitemarks)

    public String lunchTime(String dino) {
        String samples ="";
        boolean option = false;
        int i=0;
        int j=0;
        
        
        

   do {
             
            option = dino.contains(diet[i]);
            System.out.println("numero de opcion: "+option);
            
            System.out.println(i+" "+diet[i]);
            
            if (option) {
                System.out.println("pasa: "+i);
                j=j+i;
                System.out.println("j vale: "+j);
            }
            i++;
        } while (!option);
     
        switch (j) {
            case 0:
                samples= "is eating a dead dino.";
                break;
            case 1:
                samples= "is eating flowers.";
                 break;
            case 2:
                samples="is eating leaves.";
                 break;
            case 3:    
                samples= "is eating something.";
                 break;
            default:
                samples= "is eating something.";
                 break;

        }
        System.out.println(samples);
        i=0;
        j=0;
          do {
             
            option = dino.contains(zoo[i]);
            System.out.println("numero de opcion: "+option);
            
            System.out.println(i+" "+zoo[i]);
            
            if (option) {
                System.out.println("pasaaaa");
                j=j+i;

            }
            i++;
        } while (i<4);
       if (!option) {
           j=5;
       }
        switch (j) {
            case 0:

                return "A brachiosaurus "+samples;
            case 1:

                return "A velociraptor "+samples;
            case 2:
if (samples.equals("is eating leaves.")) {
    return "Something "+samples;
}
                return "A triceratops "+samples;
            case 3:

                return "A T-Rex "+samples;
            default:
                System.out.println("Something "+samples);
                return "Something "+samples;

        }

        

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
