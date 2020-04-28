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
public class Superman implements Ivolador {

    public Superman() {
    }

    @Override
    public void volar() {
        System.out.println("Levanta la mano y estira su capa");
    }

    @Override
    public void aterrizar() {
        System.out.println("Apoya los pies");
    }

}
