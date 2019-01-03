/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_banco_threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cainu
 */
public class Ejercicio_Banco_Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Banco banco = new Banco();

        for (int i = 0; i < 100; i++) {

            // args: objeto con las cuentas, sucesion de cuentas en orden
            // y cantidad maxima: 2000 euros. 
            ActividadBancaria comenzar = new ActividadBancaria(banco, i);

            // creamos el objeto hilo.
            Thread runnable = new Thread(comenzar);
            runnable.start();

        }

    }

}

class Banco {

    // variable que nos sirve para bloquear el codigo que cada hilo
    // utiliza. Asi, secuencializaremos todo el proceso de transacciones.
    //private Lock bloqueo = new ReentrantLock();
    // array de cuentas
    private final double[] cuentas;
    // condicion por la cual un hilo se pondra a la espera. 
    // private Condition saldoInsuficiente;

    public Banco() {
        cuentas = new double[100];

        // cargamos con 2000 euros todas las cuentas.
        for (int i = 0; i < cuentas.length; i++) {

            cuentas[i] = 2000;

        }
        // condicion para bloquear sin usar la palabra reservada syncronized.
        // saldoInsuficiente = bloqueo.newCondition();
    }

    public double getsaldo(int cuenta) {
        return cuentas[cuenta];
    }

    /**
     *
     * @param cuentaorigen la que paga.
     * @param cuentadestino la que cobra.
     * @param cantidad la cantidad a desenvolsar
     * @throws InterruptedException en el metodo disponemos de un objeto
     * Condition que neesita lanzar esta excepcion con el metodo await.
     * synchronized sincronizamos la entrada de los hilos.
     */
    public synchronized void transferencias(int cuentaorigen, int cuentadestino,
            double cantidad) throws InterruptedException {
        // objeto para guardar el hilo bloqueado por falta de saldo.
        Thread operacionbloqueada = null;
        //  no necesitamos una variable de bloqueo si usamos el synchronized.
        // bloqueo.lock(); // tampoco necesitamos el try. 
        //try {
            while (cuentas[cuentaorigen] < cantidad) {
                // guardamos el hilo deudor.
                operacionbloqueada = Thread.currentThread();
                // lo nombramos con la cuenta que es deudora. 
                operacionbloqueada.setName("Deuda de la cuenta "+cuentaorigen);
                System.out.printf("Saldo insuficiente de la cuenta " + cuentaorigen
                        + " Solo tiene disponible %10.2f euros. \n", cuentas[cuentaorigen]);
                System.out.printf("La cantidad demandada es: %10.2f euros. \n", cantidad);
                System.out.println("La operación se pondrá a la espera hasta que \n"
                        + "disponga de saldo para pagar");

                // al usar syncronized no necesitamos un objeto Condicion. 
                // saldoInsuficiente.await();
                
                // usamos el wait de la clase Object. 
                wait();
                if(operacionbloqueada!=null) {
        System.out.println("--------------------La  "+operacionbloqueada.getName()+
                " puede ejecutarse------------------------");
        }
            }

            // impresion del hilo que realiza la transferencia.
            Thread operacion =Thread.currentThread();
            operacion.setName("Ingreso de la cuenta "+cuentaorigen);
            System.out.println(operacion.getName() + " nombre de la transaccion. ");
            // del array de cuentas descontamos el saldo a transferir
            cuentas[cuentaorigen] -= cantidad;
            // imprimimos usando el format.
            System.out.printf("%10.2f de la cuenta %d para la cuenta %d%n", cantidad,
                    cuentaorigen, cuentadestino);
            // y lo sumamos a la cuenta destino.
            cuentas[cuentadestino] += cantidad;

            System.out.printf(" Dinero en el banco: %10.2f%n ", getsaldototalcuentas());

            // informamos a todos los hilos a la espera de la operacion efectuada, para 
            // comprobar si pueden desbloquearse, o en caso contrario, seguir esperando.
            // saldoInsuficiente.signalAll();
            
            // notificamos a los hilos con el notifyAll de la clase Object
            notifyAll();

       // } // finally {
        // que desbloquee el codigo siempre. por eso lo encapsulamos en un try.
        //bloqueo.unlock();
        // }
        
    }

    public double getsaldototalcuentas() {
        double total = 0;

        for (Double c : cuentas) {
            total += c;
        }

        return total;

    }

}

class ActividadBancaria implements Runnable {

    private Banco b;
    private int co;
    private double max;

    public ActividadBancaria(Banco banco, int cuentaorigen) {
        b = banco;
        co = cuentaorigen;

    }

    @Override
    public void run() {

        // las transferencias seran aleatorias y en bucle infinito.
        try {
            while (true) {
                int cuentadestino = (int) (100 * Math.random());
                System.out.printf("Saldo de la cuenta %d: %10.2f%n", co, b.getsaldo(co));
                // establecemos un maximo de 2500 por transferencia.
                double cantidad = 2500 * (Math.random());
                System.out.printf("Cantidad establecida que debe transferir: %10.2f%n"
                        + " la cuenta %d%n", cantidad, co);
                b.transferencias(co, cuentadestino, cantidad);

                // dormiremos aleatoriamente el tiempo de los hilos.
                Thread.sleep((int) (Math.random() * 1000));

            }
        } catch (InterruptedException ex) {
            System.out.println("Fallo de interrupcion. Este proceso"
                    + " esta dormido.");
        }

    }

}
