/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cainu
 */
public class Ejercicios_1Test {
    
    public Ejercicios_1Test() {
    }
    
  

    /**
     * Test of cambiarValores method, of class Ejercicios_1.
     */
    @Test
    public void testCambiarValores() {
        System.out.println("cambiarValores");
        int a = 0;
        int b = 0;
        String expResult = "";
        String result = Ejercicios_1.cambiarValores(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of areaCuadrado method, of class Ejercicios_1.
     */
    @Test
    public void testAreaCuadrado() {
        System.out.println("areaCuadrado");
        double lado = 0.0;
        Ejercicios_1.areaCuadrado(lado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularCirculo method, of class Ejercicios_1.
     */
    @Test
    public void testCalcularCirculo() {
        System.out.println("calcularCirculo");
        double radio = 0.0;
        Ejercicios_1.calcularCirculo(radio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VocaloConsonante method, of class Ejercicios_1.
     */
    @Test
    public void testVocaloConsonante() {
        System.out.println("VocaloConsonante");
        Ejercicios_1.VocaloConsonante();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularMinutos method, of class Ejercicios_1.
     */
    @Test
    public void testCalcularMinutos() {
        System.out.println("calcularMinutos");
        int segundos = 0;
        int expResult = 0;
        int result = Ejercicios_1.calcularMinutos(segundos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularHora method, of class Ejercicios_1.
     */
    @Test
    public void testCalcularHora() {
        System.out.println("calcularHora");
        int segundos = 0;
        int expResult = 0;
        int result = Ejercicios_1.calcularHora(segundos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularSegundos method, of class Ejercicios_1.
     */
    @Test
    public void testCalcularSegundos() {
        System.out.println("calcularSegundos");
        int segundos = 0;
        Ejercicios_1.calcularSegundos(segundos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contadordeBilletes method, of class Ejercicios_1.
     */
    @Test
    public void testContadordeBilletes() {
        System.out.println("contadordeBilletes");
        Ejercicios_1 instance = new Ejercicios_1();
        instance.contadordeBilletes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularBilletes method, of class Ejercicios_1.
     */
    @Test
    public void testCalcularBilletes() {
        System.out.println("calcularBilletes");
        int dinero = 0;
        Ejercicios_1.calcularBilletes(dinero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transformarbucle method, of class Ejercicios_1.
     */
    @Test
    public void testTransformarbucle() {
        System.out.println("transformarbucle");
        Ejercicios_1.transformarbucle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Ejercicios_1.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Ejercicios_1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
