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
public class Libro extends Publicacion {
    
    private String autor;
    private int isbn;

    public Libro(String autor, int isbn, String titulo, int numpag, int precio, int stock) {
        super(titulo, numpag, precio, stock);
        this.autor = autor;
        this.isbn = isbn;
    }

    public int darStock() {
        return stock;
    }

    public void insertarStock(int stock) {
        this.stock = stock;
    }

    public String darAutor() {
        return autor;
    }

    public void insertarAutor(String autor) {
        this.autor = autor;
    }

    public int darIsbn() {
        return isbn;
    }

    public void insertarIsbn(int isbn) {
        this.isbn = isbn;
    }

    
    public void vendido() {
        if (this.darStock()==0) {
            System.out.println("No hay ejemplares");
            
        }
        this.insertarStock(this.darStock()-1);
        System.out.println("Quedan "+this.darStock()+" ejemplares.");
        
        
        
    }
    
    

    /**
     *
     * @return información sobre el libro
     */
    @Override
    public String toString() {
        
        return "Titulo: "+this.darTitulo()+" escrito por: "+ this.darAutor()+
                " ISBN: "+ this.darIsbn()+" y cuesta: "+this.darPrecio()+" Euros. "+
                "Hay "+this.darStock()+" ejemplares";
        
    }
    
 
}