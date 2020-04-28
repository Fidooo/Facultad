/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej4;

/**
 *
 * @author Mariano
 */
public class CantanteFamoso {

    String nombre;
    String discoConMasventas;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, String discoConMasventas) {
        this.nombre = nombre;
        this.discoConMasventas = discoConMasventas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoConMasventas() {
        return discoConMasventas;
    }

    public void setDiscoConMasventas(String discoConMasventas) {
        this.discoConMasventas = discoConMasventas;
    }

}
