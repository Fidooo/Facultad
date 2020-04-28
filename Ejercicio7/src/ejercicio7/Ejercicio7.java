/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Ejercicio7 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Ingrese un numero");
        a = sc.nextDouble();
        System.out.println("Ingrese un numero");
        b = sc.nextDouble();
        System.out.println("Ingrese un numero");
        c = sc.nextDouble();
        if (b * b < 4 * a * c) {
            System.out.println("Solucion perteneciente al campo de los numeros complejos");
        } else if (a != 0 && b * b < 4 * a * c) {
            System.out.println("La primera solucion es: " + (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
            System.out.println("La primera solucion es: " + (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
        } else {
            System.out.println("Esta ecuacion no es de segundo grado");
        }
        }
    
    
}
