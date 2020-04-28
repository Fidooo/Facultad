/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dividendo ");
        int dividendo = sc.nextInt();
        System.out.println("Ingrese el divisor ");
        int divisor = sc.nextInt();
        double coc = 0;
        double res = 0;
        int c = 0;
        if (dividendo >0 & divisor >0) {
            coc=0;
            res=dividendo;
            while (res >= divisor) {
                res= res-divisor;
                coc++;
            }
        }else{
            System.out.println("Ambos numeros deben ser mayor a 0");
        }
        System.out.println("El resudio es: "+res + " y el cociente es: " + coc);
    }

}
