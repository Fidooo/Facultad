/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas = 0;
        int minutos = 0;
        int dia = 0;
        int var1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de minutos ");
        minutos = sc.nextInt();
        if (minutos >= 1440) {
            dia = minutos / 1440;
            minutos = minutos % 1440;
        }
        if (minutos >= 60) {
            horas = minutos & 60;
            minutos = minutos % 60;
        }

        System.out.println("Los minutos ingresados corresponden a " + " Dias:" + dia + " Horas: " + horas + " Minutos:" + minutos);
    }
    
}
