/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legislación;

/**
 *
 * @author Superlopez
 */
public class Senador extends Legislador {
    
    int sientoCamaraAlta;

    /**
     *
     * @param sientoCamaraAlta
     * @param nombre
     * @param apellido
     * @param edad
     * @param casado
     * @param numeroDespacho
     * @param partidoPolitico
     * @param provinciaQueRepresenta
     */
    public Senador(int sientoCamaraAlta, String nombre, String apellido, int edad, 
            boolean casado, int numeroDespacho, String partidoPolitico, 
            String provinciaQueRepresenta) {
        super(nombre, apellido, edad, casado, numeroDespacho, 
                partidoPolitico, provinciaQueRepresenta);
        this.sientoCamaraAlta = sientoCamaraAlta;
    }
    
    /**
     *
     */
    @Override
     public void getCamaraEnQueTrabaja(){
         
         System.out.println("El señor "+getNombre()+", trabaja en la Camara Alta representando "
                 + "al partido "+getPartidoPolitico());
         
         
         
     }
    
}
