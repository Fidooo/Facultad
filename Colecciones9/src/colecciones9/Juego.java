/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones9;

/**
 *
 * @author Mariano
 */
public class Juego {

    private Jugador jugadores;
    private Revolver revolver;

    public Juego() {

    }

    public boolean finJuego() {

        System.out.println("END GAME");
        return true;
    }

    public void ronda(Jugador jugadores) {
        revolver.disparar();
        revolver.toString();
        if (revolver.disparar() == true) {
           
        }
    }
}
