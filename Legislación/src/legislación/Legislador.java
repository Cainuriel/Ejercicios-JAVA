package legislación;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Superlopez
 */
public abstract class Legislador extends Persona {

    String provinciaQueRepresenta;
    String partidoPolitico;
    int    numeroDespacho;

    /**
     *
     * @param nombre
     * @param apellido
     * @param edad
     * @param casado
     * @param numeroDespacho
     * @param partidoPolitico
     * @param provinciaQueRepresenta
     */
    public Legislador(String nombre, String apellido, int edad, boolean casado,
            int numeroDespacho, String partidoPolitico, String provinciaQueRepresenta) {
        super(nombre, apellido, edad, casado);
        this.numeroDespacho=numeroDespacho;
        this.partidoPolitico=partidoPolitico;
        this.numeroDespacho=numeroDespacho;
        
        
    }

    /**
     *
     * @return
     */
    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    /**
     *
     * @param provinciaQueRepresenta
     */
    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    /**
     *
     * @return
     */
    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    /**
     *
     * @param partidoPolitico
     */
    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    /**
     *
     * @return
     */
    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    /**
     *
     * @param numeroDespacho
     */
    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }
    
    /**
     *
     */
    public abstract void getCamaraEnQueTrabaja();

    
    
    
}
