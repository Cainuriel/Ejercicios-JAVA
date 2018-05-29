/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import javax.swing.JOptionPane;

/**
 *
 * @author cainu
 */
public class Almacen {

    static Bebida almacen[][] = {{null, null, null, null}, {null, null, null, null},
    {null, null, null, null}, {null, null, null, null}};

    public static void veralmacen(Bebida[][] almacen) {
        for (int x = 0; x < almacen.length; x++) {
            for (int y = 0; y < almacen[x].length; y++) {
                if (almacen[x][y] == null) {
                    System.out.print(" | Vacio | ");
                } else {
                    System.out.print(" | " + almacen[x][y].getMarca() + " | ");
                }

            }
            System.out.println("\n----------------------------------------");
        }
    }

    public static void totaldeprecios(Bebida[][] matriz) {
        double total = 0;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matriz[x][y] != null) {
                    total = total + matriz[x][y].getPrecio();
                }
            }
        }
        System.out.println("Potencial de ventas: " + String.format("%.2f", total) + " Euros.");

    }

    public static void totaldemarca(Bebida[][] matriz) {
        double total = 0;
        String consulta = JOptionPane.showInputDialog("¿Qué marca quiere conocer su total?");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matriz[x][y].getMarca().equalsIgnoreCase(consulta)) {
                    total = total + matriz[x][y].getPrecio();
                }
            }
        }
        System.out.println("Potencial de ventas"
                + " de la marca: "+consulta +""+ String.format("%.2f", total) + " Euros.");

    }
    
    public static void calculodevalda(Bebida[][] matriz) {
        String consulta = JOptionPane.showInputDialog("¿Qué estanteria quiere calcular?");
        double total = 0;
        int x=Integer.parseInt(consulta);
        // restamos uno ya que el indice comienza en cero.
            for (int y = 0; y < matriz[x-1].length; y++) {
                if (matriz[x-1][y] != null) {
                    total = total + matriz[x-1][y].getPrecio();
                }
            } 
        System.out.println("Potencial de ventas: " + String.format("%.2f", total) + " Euros.");

    }
    
     public static void agregarproducto(Bebida bebida) {
          for (int x = 0; x < almacen.length; x++) {
            for (int y = 0; y < almacen[x].length; y++) {
                if (almacen[x][y]==null) {
                    almacen[x][y]=bebida;
                    System.out.println("Se ha guardado la "
                            + "bebida en la balda: "
                            +x+", en la "+y+" posicion");
                    x=3; y=3;
                    
                } else {System.out.println("balda ocupada");}
                
            }
          }
          
     }
     public static void quitarproducto(Bebida bebida) {
          for (int x = 0; x < almacen.length; x++) {
            for (int y = 0; y < almacen[x].length; y++) {
                if (almacen[x][y]==bebida) {
                    System.out.println("Ganancias: "+almacen[x][y].getPrecio());
                    almacen[x][y]=null;
                    System.out.println("Se ha quitado la "
                            + "bebida de la balda: "
                            +x+", en la "+y+" posicion");
                    x=3; y=3;
                    
                    
                } 
                
            }
          }
          
     }
        
        
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Agua agua = new Agua(2, 2, 0.8, "Fontbella", "Catalunya");
        Azucarada cocacola = new Azucarada(1, 1, 1, "Cocacola", 25);
        almacen[0][1] = cocacola;
        almacen[0][2] = agua;
        Azucarada redbull = new Azucarada(3, 0.5, 3, "Red Bull", 75);
        almacen[0][0] = redbull;
        almacen[0][3] = redbull;
        almacen[3][2] = redbull;
        almacen[3][3] = redbull;
        Agua lanjaron = new Agua(4, 2, 1.2, "Lanjaron", "Granada");
        almacen[1][0] = redbull;
        almacen[1][1] = redbull;
        almacen[1][2] = redbull;
        almacen[1][3] = redbull;
        Azucarada fanta = new Azucarada(1, 0.33, 0.3, "Fanta", 30);
        almacen[2][3] = fanta;
        almacen[2][0] = fanta;

     //   calculodevalda(almacen);
    // agregarproducto(cocacola);
   //  agregarproducto(cocacola);
   redbull.setPromocion(true);
   quitarproducto(redbull);
    veralmacen(almacen);
    }

}
