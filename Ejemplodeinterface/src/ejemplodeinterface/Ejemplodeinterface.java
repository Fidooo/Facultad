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
public class Ejemplodeinterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // de una interfaz de otra interfaz se puede HEREDAR
        Superman sup1 = new Superman();
        Pajaro paj1 = new Pajaro();
        Avion av1 = new Avion();

        sup1.volar();
        paj1.volar();
        av1.volar();
        sup1.aterrizar();
        paj1.aterrizar();
        av1.aterrizar();
    }

}
