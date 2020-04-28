/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A;
        int B;
        int C;
        int D;
        int aux;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        A = sc.nextInt();
        System.out.println("Ingrese un numero ");
        B = sc.nextInt();
        System.out.println("Ingrese un numero ");
        C = sc.nextInt();
        System.out.println("Ingrese un numero ");
        D = sc.nextInt();
        System.out.println("Los numeros iniciales son:" + "A:" + A + " B:" + B + " C:" + C + " D:" + D);
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("Los valores finales fueron: " + "A:" + A + " B:" + B + " C:" + C + " D:" + D);
        
    }
    
}
