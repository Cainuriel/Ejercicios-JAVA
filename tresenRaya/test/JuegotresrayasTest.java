     /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cainu                    
 */
public class JuegotresrayasTest {
    
    public JuegotresrayasTest() {
    }
    
      @Test
    public void testdefensadiagonal() {
        
        Juegotresrayas partida=new Juegotresrayas();
        String[][] matriz={{"","",""},
        {"","X",""},{"X","",""}};
         String[][] matriz2={{"","","O"},
        {"","X",""},{"X","",""}};
        Assert.assertArrayEquals("Fallo de bloqueo",matriz2, partida.defensaDiagonal(matriz));
      // Juegotresrayas.imprimirmatriz(matriz);
        Juegotresrayas partida2=new Juegotresrayas();
        String[][] matriz3={{"","",""},
        {"","X",""},{"","","X"}};
         String[][] matriz4={{"O","",""},
        {"","X",""},{"","","X"}};
        Assert.assertArrayEquals("Fallo de bloqueo",matriz4, partida2.defensaDiagonal(matriz3));
     //  Juegotresrayas.imprimirmatriz(matriz3);
       Juegotresrayas partida3=new Juegotresrayas();
        String[][] matriz5={{"X","",""},
        {"","X",""},{"","",""}};
         String[][] matriz6={{"X","",""},
        {"","X",""},{"","","O"}};
        Assert.assertArrayEquals("Fallo de bloqueo",matriz6, partida3.defensaDiagonal(matriz5));
      //  Juegotresrayas.imprimirmatriz(matriz5);
        Juegotresrayas partida4=new Juegotresrayas();
        String[][] matriz7={{"","","X"},
        {"","X",""},{"","",""}};
         String[][] matriz8={{"","","X"},
        {"","X",""},{"O","",""}};
        Assert.assertArrayEquals("Fallo de bloqueo",matriz8, partida4.defensaDiagonal(matriz7));
      //  Juegotresrayas.imprimirmatriz(matriz7);
        
    
    }
    
     @Test
    public void testdefensasuperior() {
        
          Juegotresrayas partida=new Juegotresrayas();
        String[][] matriz={{"","",""},
        {"X","",""},{"X","",""}};
         String[][] matriz2={{"O","",""},
        {"X","",""},{"X","",""}};
        Assert.assertArrayEquals("Fallo de bloqueo",matriz2, partida.defensa(matriz));
       // Juegotresrayas.imprimirmatriz(matriz);
        Juegotresrayas partida2=new Juegotresrayas();
        String[][] matriz3={{"","",""},
        {"","X",""},{"","X",""}};
         String[][] matriz4={{"","O",""},
        {"","X",""},{"","X",""}};
        Assert.assertArrayEquals("Fallo de bloqueo",matriz4, partida2.defensa(matriz3));
       // Juegotresrayas.imprimirmatriz(partida2.defensa(matriz3));
       Juegotresrayas partida3=new Juegotresrayas();
        String[][] matriz5={{"","",""},
        {"","","X"},{"","","X"}};
         String[][] matriz6={{"","","O"},
        {"","","X"},{"","","X"}};
        Assert.assertArrayEquals("Fallo de bloqueo",matriz6, partida3.defensa(matriz5));
  //      Juegotresrayas.imprimirmatriz(partida2.defensa(matriz5));
        
    
    }
    
     @Test
    public void testdefensainferior() {
        
          Juegotresrayas partida=new Juegotresrayas();
        String[][] matriz={{"X","",""},
        {"X","",""},{"","",""}};
         String[][] matriz2={{"X","",""},
        {"X","",""},{"O","",""}};
        Assert.assertArrayEquals("Fallo de bloqueo",matriz2, partida.defensa(matriz));
       // Juegotresrayas.imprimirmatriz(matriz);
        Juegotresrayas partida2=new Juegotresrayas();
        String[][] matriz3={{"","X",""},
        {"","X",""},{"","",""}};
         String[][] matriz4={{"","X",""},
        {"","X",""},{"","O",""}};
        Assert.assertArrayEquals("Fallo de bloqueo",matriz4, partida2.defensa(matriz3));
       // Juegotresrayas.imprimirmatriz(partida2.defensa(matriz3));
       Juegotresrayas partida3=new Juegotresrayas();
        String[][] matriz5={{"","","X"},
        {"","","X"},{"","",""}};
         String[][] matriz6={{"","","X"},
        {"","","X"},{"","","O"}};
        Assert.assertArrayEquals("Fallo de bloqueo",matriz6, partida3.defensa(matriz5));
       // Juegotresrayas.imprimirmatriz(partida2.defensa(matriz5));
        
    
    }
    
       @Test
    public void testcopiarmatrices() {
        Juegotresrayas partida=new Juegotresrayas();
        String[][] matriz={{"X","",""},
        {"","",""},{"","",""}};
        String[][] matriz2={{"X","",""},
        {"","",""},{"","",""}};
        
        
        Assert.assertArrayEquals("No son iguales", Juegotresrayas.copiarmatriz(matriz), matriz2);
    }

    @Test
    public void testesganador() {
        Juegotresrayas partida=new Juegotresrayas();
         String[][] matriz={{"X","","O"},
        {"O","",""},{"O","O","O"}};
        Assert.assertTrue(partida.quienGana(matriz));
      Juegotresrayas.imprimirmatriz(matriz);
    }

    /**
     *
     */
    @Test
    public void testcolocarficha() {
        Juegotresrayas partida=new Juegotresrayas();
        String[][] matriz={{"X","",""},
        {"","",""},{"","",""}};
        String [][] matriz2={{"X","",""},
        {"","",""},{"","",""}};
       // Assert.assertNotEquals(partida.colocarficha(matriz), matriz2);
       
   //  Juegotresrayas.imprimirmatriz(matriz);
        
    }
     @Test
    public void testhaydiagonales() {
        String[][] matriz={{"X","","O"},
        {"","X",""},{"","O","X"}};
        
        String[][] matriz2={{"O","","X"},
        {"","X",""},{"X","","O"}};
      
        Juegotresrayas partida=new Juegotresrayas();
        Assert.assertTrue(partida.diagonales(matriz));
         Juegotresrayas partida2=new Juegotresrayas();
        Assert.assertTrue(partida2.diagonales(matriz2));
        
    }
    
    @Test
    public void testhayfilas() {
       String[][] matriz={{"X","X","X"},
        {"O","",""},{"","","O"}};
        String[][] matriz2={{"","","O"},
       {"","O",""},{"O","O","O"}};
        String[][] matriz3 = {{"", "X", "O"},
        {"X","X","X"},{"X","O","X"}};
      
        Juegotresrayas partida=new Juegotresrayas();
      Assert.assertTrue(partida.filas(matriz));
         Juegotresrayas partida2=new Juegotresrayas();
        Assert.assertTrue(partida2.filas(matriz2));
       Juegotresrayas partida3=new Juegotresrayas();
      Assert.assertTrue(partida3.filas(matriz3));
        
    }
    @Test
    public void testhaycolumnas() {
       String[][] matriz={{"X","","O"},
        {"X","O",""},{"X","O","O"}};
        String[][] matriz2={{"","X","O"},
       {"O","X",""},{"O","X","X"}};
        String[][] matriz3 = {{"", "O", "X"},
        {"O","X","X"},{"X","O","X"}};
      
        Juegotresrayas partida=new Juegotresrayas();
      Assert.assertTrue(partida.columnas(matriz));
         Juegotresrayas partida2=new Juegotresrayas();
        Assert.assertTrue(partida2.columnas(matriz2));
       Juegotresrayas partida3=new Juegotresrayas();
      Assert.assertTrue(partida3.columnas(matriz3));
        
    }
    
}
