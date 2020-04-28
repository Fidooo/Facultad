/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

/**
 *
 * @author Mariano
 */
public class Coche {

    private String marca;
    private String modelo;
    private int año;
    private int capacidad;
    private int precio;

    /**
     * Get the value of precio
     *
     * @return the value of precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Set the value of precio
     *
     * @param precio new value of precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Get the value of capacidad
     *
     * @return the value of capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Set the value of capacidad
     *
     * @param capacidad new value of capacidad
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Get the value of año
     *
     * @return the value of año
     */
    public int getAño() {
        return año;
    }

    /**
     * Set the value of año
     *
     * @param año new value of año
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * Get the value of modelo
     *
     * @return the value of modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Set the value of modelo
     *
     * @param modelo new value of modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Get the value of marca
     *
     * @return the value of marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Set the value of marca
     *
     * @param marca new value of marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Coche() {
    }

    public Coche(String marca, String modelo, int año, int capacidad, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.capacidad = capacidad;
        this.precio = precio;
    }

}
