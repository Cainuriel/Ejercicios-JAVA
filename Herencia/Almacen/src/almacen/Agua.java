/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

/**
 *
 * @author cainu
 */
public class Agua extends Bebida{
    
    private String manantial;

    public Agua(int id, double capacidad, 
            double precio, String marca, String manantial) {
        super(id, capacidad, precio, marca);
        this.manantial=manantial;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n Agua, proveniente del manantial de "+manantial;
    }
    
    
}
