/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String salir;
        double total = 0;
        double totalm = 0;
        double promtotal = 0;
        double promenor = 0;
        int menor = 0;
        int per = 0;
        do {
            System.out.println("Ingrese el tamaño de la persona");
            double tam = sc.nextDouble();
            total = tam + total;
            per++;
            if (tam <= 1.60) {
                totalm = tam + totalm;
                menor++;
            }
            System.out.println("Esta seguro que desea salir del programa (S/N)? ");
            salir = sc.next();
        } while (!(salir.equals("S")));
        promtotal = total / per;
        promenor = totalm / menor;
        System.out.println(promenor + "||" + promtotal);
    }

}
