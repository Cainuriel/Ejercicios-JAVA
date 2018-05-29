/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletarusa;

import javax.swing.JOptionPane;

/**
 *
 * @author cainu
 */
public class Jugador {
    
    private int id=1;
    private String nombre;
    private boolean alive=true;

    public Jugador(String nombre) {
        
        this.nombre = nombre;
    }
    public Jugador() {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        if (isAlive()) {
        return "Jugador " + "" + id + ": " + nombre ;
    } else {
            return "Jugador " + "" + id+ ": está muerto.";
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
    public void apuntarse(Revolver r) {
        
        if (r.disparar()) {
           JOptionPane.showMessageDialog(null, "BANGG!!!");
            setAlive(false);
        } else {
            JOptionPane.showMessageDialog(null, "CLICK...");}
            
        
    }
    
}

