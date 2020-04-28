/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su clase de socio ");
        String clase = sc.next();
        System.out.println("Ingrese el valor de su tratamiento");
        Double tratamiento = sc.nextDouble();
        switch (clase) {
            case "A":
                tratamiento = tratamiento / 2;
                System.out.println("El valor de su tratamiento es de: " + tratamiento);
                break;
            case "B":
                tratamiento = tratamiento * 0.65;
                System.out.println("El valor de su tratamiento es de: " + tratamiento);
                break;
            case "C":

                System.out.println("Usted no tiene descuentos, el valor es de: "+tratamiento);
                break;
            default:
                System.out.println("Esa clase de socio no existe, vuelva pronto perra");
                break;
        }
    }

}
