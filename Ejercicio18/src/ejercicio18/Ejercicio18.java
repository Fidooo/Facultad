/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int ent = sc.nextInt();
        int contador = 0;
        while (ent >= 1) {
            ent = ent / 10;
            contador = contador + 1;
        }
        System.out.println("Los digitos que lo componen son: " + contador);
    }

}
