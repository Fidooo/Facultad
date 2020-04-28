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
public class Espectador {

    private String Nombre;
    private int Edad;
    private int Dinero;

    public Espectador() {
        String[] v1 = {"Agustina", "Fabiana", "Analia", "Panchita", "Lila", "Pedrito", "German", "Itachi", "Kakashi", "Naruto"};
        int a = (int) (Math.random() * 10);
        this.Nombre = v1[a];
        this.Edad = (int) (Math.random() * 77 + 4);
        this.Dinero = (int) (Math.random() * 500 + 10);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getDinero() {
        return Dinero;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }

}
