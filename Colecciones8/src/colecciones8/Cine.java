/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones8;

/**
 *
 * @author Mariano
 */
public class Cine {

    private Peliculas pelicula;
    private int precio;

    public Cine(Peliculas pelicula) {
        this.pelicula = pelicula;
        this.precio = 135;
    }

    public Peliculas getPelicula() {
        return pelicula;
    }

    public void setPelicula(Peliculas pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Cine() {
    }

}
