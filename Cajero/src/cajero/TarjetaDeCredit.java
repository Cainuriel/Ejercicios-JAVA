package cajero;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SOIB1A07
 */
public class TarjetaDeCredit {

    /* Inicialitza els atributs privats de la clase.
*
* @param saldoInicial saldo inicial en la compte.
* @param clau clau d'acces.
     */
    int saldoInicial;
    int clau;
    boolean cerrada = true;
    boolean abierta = false;
    boolean bloqueada = false;
    int fallos = 0;

    public TarjetaDeCredit(int saldoInicial, int clau) {
        this.saldoInicial=saldoInicial;
        this.clau=clau;
        
    }

    public int getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(int saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public int getClau() {
        return clau;
    }

    public void setClau(int clau) {
        this.clau = clau;
    }

    public void setCerrar(boolean cerrar) {
        this.cerrada = cerrar;
    }

    public void setAbrir(boolean abrir) {
        this.abierta = abrir;
    }

    public void setBloquear(boolean bloquear) {
        this.bloqueada = bloquear;
    }

    public int getFallos() {
        return fallos;
    }

    public void setFallos(int fallos) {
        this.fallos = fallos;
    }

    /**
     * Getter.
     *
     * @return true si la tarjeta està tancada.
     */
    public boolean isTancada() {

        return cerrada;
    }

    /**
     *
     *
     * Getter.
     *
     * @return true si la tarjeta està oberta.
     */
    public boolean isOberta() {

        return this.abierta;
    }

    /**
     * Getter.
     *
     * @return true si la tarjeta està bloquejada.
     */
    public boolean isBloquejada() {

        return bloqueada;
    }

    /**
     * Mètode per autenticar la clau de la tarjeta. Si es crida 3 vegades
     * seguides aquest mètode amb clau no vàlida, la tarjeta queda bloqujeada.
     * La clase ha dur el compte del nombre d'intents consecutius han fallat.
     *
     * @param clau clau numèrica que l'usuariu tecleja per poder usar la seva
     * tarjeta.
     * @return true si la claue es vàlida; false si no ho és.
     * @throws TarjetaBloquejadaException Si la tarjeta estava o queda
     * bloquejada.
     *
     */
    public boolean obre(int clau) throws TarjetaBloqueadaException {

        if (this.getClau() != clau) {
            System.out.println("comprobación");
            this.setFallos(this.getFallos() + 1);
            System.out.println();

        } else {
            
            this.setAbrir(true);
            this.setCerrar(false);
            return true;
        }

        if (this.getFallos() > 3) {
             this.setBloquear(true);
             this.setAbrir(false);
            throw new TarjetaBloqueadaException("SUPERO LOS TRES INTENTOS. "
                    + "LA TARJETA SE BLOQUEARÁ INMEDIATAMENTE. " + "PONGASE "
                    + "EN CONTACTO CON SU SUCURSAL.");
           
        } else {

            System.out.println("CLAVE INCORRECTA. " + "VUELVA A INTENTARLO");
        }
        return false;
    }

    /**
     * /**
     * Mètode per 'anar-se': l'usuari tanca la tarjeta.
     */
    public void tanca() {
        this.setCerrar(true);

    }

    /**
     * Mètodo per treure doblers del compte associat a la tarjeta. Abans de
     * treure doblers, hi ha que autentificar la tarjeta.
     *
     * @param quantitat de doblers que volen treure.
     * @return el saldo total que queda en el compte associat desprès d'extreure
     * la quantitat sol.licitada.
     * @throws NohihaSaldoSuficientException Si hi ha menys saldo en el compte
     * que la quantitat a extreure.
     * @throws cajero.TarjetaBloqueadaException
     * @throws TarjetaBloquejadaException Si la tarjeta se troba bloquejada.
     */
    public int treure(int quantitat) throws NohihaSaldoSuficientException, TarjetaBloqueadaException {

        if ((this.isBloquejada())) {
            throw new TarjetaBloqueadaException("TARJETA BLOQUEADA. "
                    + "PONGASE EN CONTACTO CON SU SUCURSAL");
        }
        if (quantitat > this.getSaldoInicial()) {
            tanca();
            throw new NohihaSaldoSuficientException("SALDO INSUFICICIENTE");

        }System.out.println("Control 1 "+this.getSaldoInicial());
        this.setSaldoInicial(this.getSaldoInicial() - quantitat);
        System.out.println("No olvide recoger su dinero. "
                + "Su nuevo saldo es: " +this.getSaldoInicial());
        System.out.println("Control 2 "+this.getSaldoInicial());
        return this.getSaldoInicial();
    }
}
