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
public class AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Coche co1 = new Coche("Ford", "Mustang", 2017, 3, 500000);

        System.out.println("La marca del auto es: " + co1.getMarca() + "\nEl modelo del auto es: " + co1.getModelo() + "\nLa capacidad es de: " + co1.getCapacidad() + "\nEl precio es de: " + co1.getPrecio());
    }

}
