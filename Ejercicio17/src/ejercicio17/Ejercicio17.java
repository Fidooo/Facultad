/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n1 = sc.nextInt();
        System.out.println("Ingrese un numero");
        int n2 = sc.nextInt();
        String salir = "";
        do {
            System.out.println("Menu");
            System.out.println("Elija la opción");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("La suma de los numeros ingresados es: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("La resta de los numeros ingresados es :" + (n1 - n2));
                    break;
                case 3:
                    System.out.println("La multiplicación de los numeros ingresados es :" + (n1 * n2));
                    break;
                case 4:
                    System.out.println("La division de los numeros ingresados es :" + (n1 / -n2));
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa (S/N)? ");
                    salir = sc.next();
                    break;
            }
        } while (!(salir.equals("S")));
    }

}
