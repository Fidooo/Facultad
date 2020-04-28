/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese un numero");
        num1 = sc.nextInt();
        System.out.println("Ingrese un numero");
        num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("El numero mayor es el :" + num1);
        } else {
            System.out.println("El numero mayor es el : " + num2);
        }

    }
    
}
