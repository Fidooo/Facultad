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
public class Pajaro implements Ivolador {

    public Pajaro() {
    }

    @Override
    public void volar() {
        System.out.println("Abre las alas");
    }

    @Override
    public void aterrizar() {
        System.out.println("Apoya las garras");
    }

}
