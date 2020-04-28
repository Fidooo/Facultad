/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d;
        d = 0;
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int c = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
                
            }
            if (c < 3) {
                    System.out.print(" " + i + "");
                    d++;
                }
            
        }
        System.out.println("");
    }

}
