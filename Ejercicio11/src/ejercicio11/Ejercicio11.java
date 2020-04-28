/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pago = 0;
        System.out.println("Ingrese la duración de llamada");
        Double minutos = sc.nextDouble();
        for (int i = 1; i <= minutos; i++) {
            if (i <= 5) {
                pago = pago + 1;
            }
            if (i > 5 & i <= 8) {
                pago = pago + 0.8;
            }
            if (i > 8 & i <= 10) {
                pago = pago + 0.7;
            }
            if (i > 10) {
                pago = pago + 0.5;
            }
        }

        System.out.println("Ingrese el dia en el que efectuo la llamada");
        String dia = sc.next();
        if (("Domingo".equals(dia)) || ("domingo".equals(dia))) {
            pago = pago + (pago * 0.3);
            System.out.println("El precio es: " + pago);

        } else {
            System.out.println("Ingrese el turno en el cual efectuo la llamada");
            String turno = sc.next();
            if ("Matutino".equals(turno) || "matutino".equals(turno)) {
                pago = pago + (pago * 0.15);
                System.out.println("El precio es: " + pago);
            }
            if ("Vispertino".equals(turno) || "vispertino".equals(turno)) {
                pago = pago + (pago * 0.10);
                System.out.println("El precio es: " + pago);
            }
        }
    }

}
