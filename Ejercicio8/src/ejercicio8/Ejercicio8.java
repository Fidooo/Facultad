/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de X, el valor tiene que ser distinto de 0");
        float x = sc.nextFloat();
        System.out.println("Ingrese el valor de Y, el valor tiene que ser distinto de 0");
        float y = sc.nextFloat();
        if (x > 0 && y > 0) {
            System.out.println("El punto (" + x + "," + y + ") esta en el primer cuadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto (" + x + "," + y + ") esta en el segundo cuadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto (" + x + "," + y + ") esta en el tercer cuadrante");
        } else if (x > 0 && y < 0) {
            System.out.println("El punto (" + x + "," + y + ") esta en el cuarto cuadrante");
        }
    }

}
