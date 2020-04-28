/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas;
        int valor;
        int salario;
        String nombre = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado");
        nombre = sc.nextLine();
        System.out.println("Ingrese las horas trabajadas");
        horas = sc.nextInt();
        System.out.println("Ingrese el valor por hora");
        valor = sc.nextInt();
        salario = horas * valor;
        System.out.println("El salario del empleado: " + nombre + " es de: " + salario);

    }
    
}
