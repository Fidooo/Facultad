/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = sc.next();
        if ("a".equals(letra) || "A".equals(letra) || "e".equals(letra) || "E".equals(letra) || "i".equals(letra) || "I".equals(letra) || "o".equals(letra) || "O".equals(letra) || "u".equals(letra) || "U".equals(letra)) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
    }

}
