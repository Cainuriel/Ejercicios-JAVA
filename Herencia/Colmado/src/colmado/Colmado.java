/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colmado;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author cainu
 */
public class Colmado {

    static public ArrayList<Producto> almacen = new ArrayList<Producto>();
    static final int AHORA = 20180526;
    
    static void ventas(){
        double preciofinal;
        String cantidad=JOptionPane.showInputDialog("Introduzca cantidad de productos para calcular");
        for (Producto p: almacen) {
            
            preciofinal=p.calcular(Integer.parseInt(cantidad));
            System.out.println(p.toString());
            if (p instanceof Noperecedero) {
                System.out.println(((Noperecedero) p).getTIPO());
            }
            System.out.println(cantidad+" articulos cuestan: "+preciofinal+" euros.");
            
        }
        
        
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Perecedero queso = new Perecedero(20180528, "Queso Mahones", 6);
        almacen.add(queso);
        Perecedero huevos = new Perecedero(20180529, "Docena de Huevos", 3);
        almacen.add(huevos);
        Perecedero yogurt = new Perecedero(20180601, "Yogurt", 1.5);
        almacen.add(yogurt);
        Perecedero pato = new Perecedero(20180527, "Pato confitado", 4.8);
        almacen.add(pato);

        Noperecedero fregona = new Noperecedero("Fregona", 2.7);
        Noperecedero escoba = new Noperecedero("Escoba", 1.7);
         Noperecedero valletas = new Noperecedero ("Valletas", 1);
         
         almacen.add(fregona);
         almacen.add(escoba);
         almacen.add(valletas);
         
         ventas();

    }

}
