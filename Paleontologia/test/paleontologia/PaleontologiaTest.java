/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paleontologia;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.lang.*;
import static org.junit.Assert.*;


/**
 *
 * @author cainu
 */
public class PaleontologiaTest {

    public PaleontologiaTest() {
    }

    /**
     * Test of <error> method, of class Paleontologia.
     */
    @Test
    public void testfood() {
        String diet[] = {"_C", "iii", "|||", "..."};
        String zoo[] = {"uuuuu", "uuVuu", "vvvvv",  "VvvvV"};
        Paleontologia prueba = new Paleontologia();
        Paleontologia prueba5 = new Paleontologia();
        String T_Rex = "_CVvvvVC}>";
        Paleontologia prueba2 = new Paleontologia();
        Paleontologia prueba6 = new Paleontologia();
        String brachiosaurus = "iiiuuuuuiii";
        Paleontologia prueba3 = new Paleontologia();
        Paleontologia prueba7 = new Paleontologia();
        String triceratops = "|||uuVuu|||";
        Paleontologia prueba4 = new Paleontologia();
        Paleontologia prueba8 = new Paleontologia();
        String velociraptor = "...vvvvv...";
        String desconocido = "|||vvCvv...";
        Paleontologia prueba9 = new Paleontologia();
       assertEquals("A T-Rex is eating a dead dino.", "A T-Rex is eating a dead dino.", prueba5.lunchTime(T_Rex));
        assertEquals("A brachiosaurus is eating flowers.", "A brachiosaurus is eating flowers.", prueba6.lunchTime(brachiosaurus));
        assertEquals("A triceratops is eating leaves.", "Something is eating leaves.", prueba7.lunchTime(triceratops));
        assertEquals("A velociraptor is eating something.", "A velociraptor is eating something.", prueba8.lunchTime(velociraptor));
        assertEquals("Something is eating something.", 
                "Something is eating something.", prueba9.lunchTime(desconocido));
       /* assertEquals("T-Rex is eating a dead dino", zoo[3], prueba.jurassicWord(T_Rex));
       assertEquals("A brachiosaurus is eating flowers.", zoo[0], prueba2.jurassicWord(brachiosaurus));
        assertEquals("A triceratops is eating flowers.", zoo[1], prueba3.jurassicWord(triceratops));
        assertEquals("velociraptor is eating unknow food", zoo[2], prueba4.jurassicWord(velociraptor));*/
   //     assertEquals("Unknow food", zoo[3], prueba4.jurassicWord(carnivoro));
       // String velociraptor = "_CvvvvvC}>";
       // System.out.println("A velociraptor is eating a dead dino.");
       // String triceratops = "iiiuuVuuiii";
       // System.out.println("A triceratops is eating flowers.");
        
    //   System.out.println("Something is eating leaves.");
        
   //     System.out.println("Something is eating a dead dino.");
    }
}
