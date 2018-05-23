/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

/**
 *
 * @author SOIB1A07
 */
public class TarjetaBloqueadaException extends Exception {

    /**
     * Creates a new instance of <code>TarjetaBloqueadaException</code> without
     * detail message.
     */

    public TarjetaBloqueadaException() {
       
    }

    /**
     * Constructs an instance of <code>TarjetaBloqueadaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public TarjetaBloqueadaException(String msg) {
        
			super(msg);
        }
        
        
    }

