/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo1lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mariano
 */
public class Arreglo1Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int v[] = new int[10];

        BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese los elemntos del vector");

        for (int i = 0; i < v.length; i++) {
            System.out.println("Elemento " + (i + 1) + " del vector: ");
            v[i] = Integer.parseInt(dato.readLine());

        }
        int mayor = v[0];
        int posicion = 0;

        for (int i = 1; i < v.length; i++) {
            if (mayor < v[i]) {
                mayor = v[i];
                posicion = i;
            }

        }
        System.out.println("El mayor numero ingresado es: " + mayor + " y esta en la posicion: " + (posicion + 1));
    }

}
