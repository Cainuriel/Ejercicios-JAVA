/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

/**
 *
 * @author SOIB1A07
 */
public class Serie implements Entregable {
    
    String titulo;
    int ntemporadas;
    boolean entregado;
    String genero;
    String creador;

    /**
     *
     * @param titulo nombre de la serie
     * @param genero comedia, romántica, ecta...
     */
    public Serie(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        ntemporadas = 3;
        entregado = false;
        creador = null;
    }

    /**
     *
     */
    public Serie() {
        titulo = null;
        ntemporadas = 3;
        entregado = false;
        genero = null;
        creador = null;
    }

    /**
     *
     * @param titulo nombre de la serie
     * @param ntemporadas numero de temporadas que están disponibles
     * @param genero Romantica, acción, Comedia, ecta...
     * @param creador lugar de procedencia de la Serie
     */
    public Serie(String titulo, int ntemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.ntemporadas = ntemporadas;
        this.genero = genero;
        this.creador = creador;
        entregado = false;
    }

    /**
     *
     * @return nombre de la serie
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     *
     * @return numero de temporadas
     */
    public int getNtemporadas() {
        return ntemporadas;
    }

    /**
     *
     * @return Genero cinematográfico
     */
    public String getGenero() {
        return genero;
    }

    /**
     *
     * @return lugar de procedencia de la Serie ejem(España, Inglaterra, EEUU)
     */
    public String getCreador() {
        return creador;
    }

    /**
     *
     * @param ntemporadas se actualizan las temporadas
     */
    public void setNtemporadas(int ntemporadas) {
        this.ntemporadas = ntemporadas;
    }

    /**
     *
     * @param genero se actualiza el género
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     *
     * @param creador se actualiza el creador
     */
    public void setCreador(String creador) {
        this.creador = creador;
    }

    /**
     *
     * @return caracterísiicas de la serie que son imprimidas en pantalla
     */
    @Override
    public String toString() {
        
        return "DVD's de la serie: " + getTitulo()
                + " del creador: " + getCreador() + ". Que consta de "
                + getNtemporadas()+ " temporadas.";
    }

    //  Se activa true, cuando se alquila la Serie
    @Override
    public void entregar() {
        
        entregado = true;
        
    }

    // Al retornar al Videoclub, se coloca la Serie disponible. false significa "no entregada"
    @Override
    public void devolver() {
        
        entregado = false;
    }

    /**
     *
     * @return contesta a: ¿Dónde está la película, alquilada o en el Videoclub?
     */
    @Override
    public boolean isentregado() {
        
        return entregado;
        
    }
    
    public void comparador(Serie s) {
        
    }

    /**
     *
     * @param a primer objeto a comparar
     * @param b segundo objeto a comparar
     * @return devuelve un String, resultado de la ocmparación
     */
    @Override
    public String compareTo(Object a) {
        
        if (a instanceof Serie) {
            Serie auxiliar = (Serie) a;
            
            if (this.getNtemporadas() == auxiliar.getNtemporadas()) {
                return "Tiene las mismas temporadas que los ";
            }
            if (this.getNtemporadas() < auxiliar.getNtemporadas()) {
                
                return "Tiene más temporadas";
            } else {
                
                return "Tiene menos temporadas";
                
            }
            
        }
        
        return "No es una Serie, se trata de un Videojuego";
        
    }
    
}
