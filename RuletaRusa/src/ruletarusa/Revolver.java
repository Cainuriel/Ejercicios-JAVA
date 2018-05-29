/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletarusa;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author cainu
 */
public class Revolver {

    private Tambor tambor;
    public int posicion=0;
    private Bala bala;
    public int casquillo=0;
    public Tambor getTambor() {
        return tambor;
    }

    public void setTambor(Tambor tambor) {
        this.tambor = tambor;
    }

    public Bala getBala() {
        return bala;
    }

    public void setBala(Bala bala) {
        this.bala = bala;
    }

    public Revolver() {
        this.tambor = tambor;
        this.bala = bala;
    }

    public int randomizar() {
        int random = (int) (Math.random() * 6);
        return random;
    }

    public void cargar() {

        int azar = randomizar();
        casquillo=azar;
        System.out.println("la carga "+azar);
        switch (azar) {
            case 0:
                setBala(Bala.UNO);
                break;
            case 1:
                setBala(Bala.DOS);
                break;
            case 2:
                setBala(Bala.TRES);
                break;
            case 3:
                setBala(Bala.CUATRO);
                break;
            case 4:
                setBala(Bala.CINCO);
                break;
            case 5:
                setBala(Bala.SEIS);
                break;
        }
    }

    public void girar() {

        int azar = randomizar();
        System.out.println("giro "+azar);
        posicion=azar;
        switch (azar) {
            case 0:
                setTambor(Tambor.UNO);
                break;
            case 1:
                setTambor(Tambor.DOS);
                break;
            case 2:
                setTambor(Tambor.TRES);
                break;
            case 3:
                setTambor(Tambor.CUATRO);
                break;
            case 4:
                setTambor(Tambor.CINCO);
                break;
            case 5:
                setTambor(Tambor.SEIS);
                break;
        }

    }
    
    public boolean disparar() {
        
        if (posicion==casquillo) {
            siguienteposicion();
            return true;
        } else {
            siguienteposicion();
            return false;
        }
        
        
        
    }
    
    public void siguienteposicion() {
        
        if (posicion==5) {
            posicion=0;
        } else {
            posicion++;
        }
        
        
    }
    
    public void reiniciar(ArrayList<Jugador> jugadores){
        for (Jugador j : jugadores) {
            System.out.println(j.toString());
        }

        JOptionPane.showMessageDialog(null, "Preparamos el revolver");
       girar();
        cargar();
        toString();
    }

    @Override
    public String toString() {
        return "Posición inicial del " + "tambor: " + tambor + 
                ", posicion actual: \n" + (posicion+1) + 
                ", la bala se introdujo en la posición: " 
                + bala + ", y está en la posición: " + (casquillo+1) + '}';
    }

}
