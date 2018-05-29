/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variaspruebas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 *
 * @author Superlopez
 */ 
public class Diezsegundos implements ActionListener  {
     
    
    @Override
    public void actionPerformed (ActionEvent e) {
        
        
        Date ahora= new Date();
        System.out.println("La hora cada diez segundos: "+ahora);
        
    }
    
}
