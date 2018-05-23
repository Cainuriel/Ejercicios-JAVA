/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevaventana;

import java.awt.*;

/**
 *
 * @author SOIB1A07
 */
public class NuevaVentana extends Frame {

    public NuevaVentana() {
        
        
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize(); 
        int ancho=d.width/3;
        int alto=d.height/3;
        this.setSize(ancho, alto);
        this.setLocation(d.width/2-ancho/2,d.height/2-alto/2);
        
        this.setBackground(new Color(20,140,10));
        this.setForeground(Color.blue);
        Font fuente = new Font("Arial", Font.PLAIN, 20);
        this.setFont(fuente);
        this.setTitle("Ejemplo de ventana ");//
    }
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
