/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;

/**
 *
 * @author anama
 */
public class CCuenta {

 

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacío
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros por defecto
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método asignar nombre
     * @param nom
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     * Método obtener nombre
     * @return
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método que nos devuelve el saldo
     * @return
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método ingresar una cantidad y actualiza el saldo
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método retirar una cantidad y actualiza el saldo
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método que nos devuelve el número de cuenta
     * @return
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    //Métodos getter y setter
    
    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
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
     * @return
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     *
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
      /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
