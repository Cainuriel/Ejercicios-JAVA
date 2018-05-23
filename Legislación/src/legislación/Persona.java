package legislación;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SOIB1A07
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private boolean casado;

    /**
     *
     */
    public Persona() {
        nombre = "";
        apellido = "";
        edad = 0;
        casado = false;
    }

    /**
     *
     * @param nombre
     * @param apellido
     * @param edad
     * @param casado
     */
    public Persona(String nombre, String apellido, int edad, boolean casado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.casado = casado;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @param casado
     */
    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     *
     * @return
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return this.edad;
    }

    /**
     *
     * @return
     */
    public boolean getCasado() {
        return this.casado;
    }

    /**
     *
     * @return
     */
    public String toString() {
        String estadoCivil = " ";
        if (this.casado == false) {
            estadoCivil = " no ";
        } else {
        };
        Integer datoEdad = edad;
        return getNombre() + " " + getApellido() + " tiene "
                + datoEdad.toString() + " años, y" + estadoCivil + "está casado";
    }
    
}