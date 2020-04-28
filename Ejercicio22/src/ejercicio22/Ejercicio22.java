/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = (int) (Math.random() * 10 + 1);
        int n2 = (int) (Math.random() * 10 + 1);
        int c = n1 * n2;
        int lector;
        do {
            System.out.println("Ingrese un numero");
            lector = sc.nextInt();
            if (lector != c) {
                if (lector < c) {
                    System.out.println("Te falta ameo");
                }
                if (lector > c) {
                    System.out.println("Te fuiste a la verga wey");
                }
            } else {
                System.out.println("Le chuntaste aweonao");
            }
        } while (lector != c);

    }

}
