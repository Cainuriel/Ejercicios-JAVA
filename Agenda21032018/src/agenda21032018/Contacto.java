/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda21032018;

/**
 *
 * @author SOIB1A07
 */
public class Contacto {

    private String nombre;
    private String apellidos;
    private String direccion;
    private int numerotel;
    private String email;
    private boolean disponible;

    public Contacto(String nombre, String apellidos, String direccion, int numerotel,
            String email, boolean disponible) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.numerotel = numerotel;
        this.email = email;
        this.disponible = disponible;
    }

    public void setnombre(String nombre) {

        this.nombre = nombre;
    }

    public void setapellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setnumerotel(int numerotel) {
        this.numerotel = numerotel;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public void setdisponibilidad(boolean disponilbe) {
        this.disponible = disponible;

    }
    public String getnombre(){
        return nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumerotel() {
        return numerotel;
    }

    public String getEmail() {
        return email;
    }

    public boolean isDisponible() {
        return disponible;
    }
 
     
        

}
