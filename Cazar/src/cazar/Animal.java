/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cazar;

/**
 *
 * @author SOIB1A07
 */
public class Animal {

    private String nom;
    protected int nivellAlimentacio;
    private int edat;
    private int edatMaxima;
    

    Animal(String nom, int edatMaxima) {
        this.nom = nom;
        this.nivellAlimentacio = 0;
        this.edat = 0;
        this.edatMaxima=edatMaxima;
    }

    public void menja(int aliment) {

        nivellAlimentacio += aliment;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNivellAlimentacio() {
        return nivellAlimentacio;
    }

    public void setNivellAlimentacio(int nivellAlimentacio) {
        this.nivellAlimentacio = nivellAlimentacio;
    }

    public int getEdatMaxima() {
        return edatMaxima;
    }

    public void setEdatMaxima(int edatMaxima) {
        this.edatMaxima = edatMaxima;
    }

    public boolean estaViu() {
        if (nivellAlimentacio >= 0 && edat <= edatMaxima) {
            return true;
        } else {
            return false;
        }
    }

    public void envelleix() {
        ++edat;
    }

    public int getEdat() {
        return edat;
    }
}
