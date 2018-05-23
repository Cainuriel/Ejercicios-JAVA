/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfernando;

/**
 *
 * @author MMUT
 */
public class Revista extends Publicacion {
    
    private Frecuencia tirada;
    private int issn;
    
    public Revista(String titulo, int numpag, int precio, int stock, Frecuencia tirada, int issn) {
        
        super(titulo, numpag, precio, stock);
        this.tirada=tirada;
        this.issn=issn;
    }

    public Frecuencia darTirada() {
        return tirada;
    }

    public void insertarTirada(Frecuencia tirada) {
        this.tirada = tirada;
    }

    public int darissn() {
        return issn;
    }

    public void setissn(int issn) {
        this.issn = issn;
    }

    
   
    @Override
    public String toString() {
        
        return "Titulo: "+this.darTitulo()+". Con tirada:  "+ this.darTirada() +
                " y el ISSN número: : "+ this.darissn()+" Precio: "+this.darPrecio()+" Euros.";
    
}
    }
    

