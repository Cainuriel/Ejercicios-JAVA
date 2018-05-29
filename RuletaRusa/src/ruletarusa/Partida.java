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
public class Partida {

    private static ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

    private Revolver revolver = new Revolver();

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public Partida() {
        this.revolver = revolver;
    }

    public int randomizar() {
        int random = (int) (Math.random() * 6);
        return random;
    }

    public void start() {
        String numerodejugadores="";
      try { numerodejugadores = JOptionPane.showInputDialog(null, "Introduzca número de jugadores"); }
catch (Exception e) {
    System.exit(0);
}
        for (int i = 0; i <= Integer.parseInt(numerodejugadores) - 1; i++) {
            String jugador = JOptionPane.showInputDialog(null, "nombre del jugador " + (i + 1));
            Jugador tahur = new Jugador(jugador);
            tahur.setId(i + 1
            );
            jugadores.add(tahur);
        }
        JOptionPane.showMessageDialog(null, "Sorteamos los asientos y traemos el revolver");
        revolver.reiniciar(jugadores);
    }

    public void ronda() {

        for (Jugador j : jugadores) {
            if (j.isAlive()) {
                System.out.println("Tiene el revolver el jugador " + j.toString());
                JOptionPane.showMessageDialog(null, "jugador listo para disparar");
                j.apuntarse(revolver);
                if (!j.isAlive()) {
                    System.out.println("Jugador " + j.getId()
                            + ", ha sido eliminado");
                    int borrar = jugadores.indexOf(j);
                    jugadores.remove(borrar);
                    ganador();
                }

            }

        }
        System.out.println("Siguiente ronda");
        System.out.println(revolver.toString());
        ronda();
    }

    public void ganador() {
        int contador = 0;
        for (Jugador j : jugadores) {
            j.toString();
            contador++;
        }
        if (contador == 1) {
            JOptionPane.showMessageDialog(null, "Tenemos ganador");
            System.out.println(jugadores.get(contador - 1).toString());
            System.out.println("Se lleva toda la pasta");
        } else {
            System.out.println("Nueva ronda");
            revolver.reiniciar(jugadores);
            ronda();
        }
        int opcion = JOptionPane.showConfirmDialog(null, "¿Otra partida?", "GAME OVER", 0);
        if (opcion == 0) {
            start();
        } else {
            System.exit(0);
        }
    }
}
