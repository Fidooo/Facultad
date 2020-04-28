/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodeinterface;

/**
 *
 * @author Mariano
 */
public class Avion implements Ivolador {

    public Avion() {
    }

    @Override
    public void volar() {
        System.out.println("Levanta el tren de aterrizaje y acelera");
    }

    @Override
    public void aterrizar() {
        System.out.println("Baja el tren de aterrizaje y saca las ruedas");
    }

}
