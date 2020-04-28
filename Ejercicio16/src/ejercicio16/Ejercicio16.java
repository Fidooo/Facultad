/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de N");
        int n = sc.nextInt();
        System.out.println("Ingrese un numero : ");
        int n1 = sc.nextInt();
        int mayor = n1;
        int menor = n1;
        double prom = n1;
        if (n1 > 0) {
            do {
                System.out.println("Ingrese un numero ");
                int n2 = sc.nextInt();

                if (n2 > n1) {
                    mayor = n2;
                }
                if (n2 < n1) {
                    menor = n2;
                }
                prom = n2 / n;
            } while (n == 0);
            System.out.println("El mayor es : " + n1);
            System.out.println("El menor es : " + n1);
            System.out.println("El promedio es: " + n1);
        } else {
            System.out.println("El mayor es : " + n1);
            System.out.println("El menor es : " + n1);
            System.out.println("El promedio es: " + prom);
        }
        
    }

}
