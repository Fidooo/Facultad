/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ingrese una cantidad de grados ");
        n = sc.nextInt();
        int f = 32 + (9 * n / 5);
        System.out.println("Los grados ingresados en Fahrenheit son: " + f);
    }
    
}
