/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legislación;

/**
 *
 * @author SOIB1A07
 */
public class Diputado extends Legislador {

    int asientoCamaraBaja;

    /**
     *
     * @param asientoCamaraBaja
     * @param nombre
     * @param apellido
     * @param edad
     * @param casado
     * @param numeroDespacho
     * @param partidoPolitico
     * @param provinciaQueRepresenta
     */
    public Diputado(int asientoCamaraBaja, String nombre, String apellido,
            int edad, boolean casado, int numeroDespacho, String partidoPolitico,
            String provinciaQueRepresenta) {
        super(nombre, apellido, edad, casado, numeroDespacho, partidoPolitico, provinciaQueRepresenta);
        this.asientoCamaraBaja = asientoCamaraBaja;
    }

    /**
     *
     * @return
     */
    public int getAsientoCamaraBaja() {
        return asientoCamaraBaja;
    }

    /**
     *
     * @param asientoCamaraBaja
     */
    public void setAsientoCamaraBaja(int asientoCamaraBaja) {
        this.asientoCamaraBaja = asientoCamaraBaja;
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
    @Override
    public void getCamaraEnQueTrabaja() {

        System.out.println("El señor " + getNombre() + ", trabaja en la Camara Baja representando "
                + "al partido " + getPartidoPolitico());

    }

}
