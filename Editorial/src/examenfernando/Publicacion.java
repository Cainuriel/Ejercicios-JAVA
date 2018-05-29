/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfernando;

/**
 *
 * @author Lopez Lopez Fernando
 */
public class Publicacion {

    private String titulo;
    private int numpag;
    private int precio;
    protected int stock;

    public Publicacion(String titulo, int numpag, int precio, int stock) {
        this.titulo = titulo;
        this.numpag = numpag;
        this.precio = precio;
        this.stock = stock;
    }

   

    public String darTitulo() {
        return titulo;
    }

    public void insertarTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int darNumpag() {
        return numpag;
    }

    public void insertarNumpag(int numpag) {
        this.numpag = numpag;
    }

    public int darPrecio() {
        return precio;
    }

    public void insertarPrecio(int precio) {
        this.precio = precio;
    }

    public int darStock() {
        return stock;
    }

    public void insertarStock(int stock) {
        this.stock = stock;
    }
    
   
        
        
        
    

}
