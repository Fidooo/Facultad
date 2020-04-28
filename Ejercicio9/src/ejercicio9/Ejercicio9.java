/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero, desde 0 hasta 9999");
        int x = sc.nextInt();
        if (x < 0 || x > 9999) {
            System.out.println("El numero ingresado es incorrecto");
            System.out.println("Ingrese otro numero");
            x = sc.nextInt();
            if (x % 2 == 0) {
                System.out.println("El numero " + x + "es multiplo de 2");
            }
            if (x % 3 == 0) {
                System.out.println("El numero " + x + "es multiplo de 3");
            }
            if (x % 5 == 0) {
                System.out.println("El numero " + x + "es multiplo de 5");
            }
        } else if (x % 2 == 0) {
            System.out.println("El numero " + x + "es multiplo de 2");
        }
        if (x % 3 == 0) {
            System.out.println("El numero " + x + "es multiplo de 3");
        }
        if (x % 5 == 0) {
            System.out.println("El numero " + x + "es multiplo de 5");
        }
        else{
            System.out.println("El numero no es multiplo de ninguno");
        }
    }

}
