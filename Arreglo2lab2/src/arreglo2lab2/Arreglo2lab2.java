/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo2lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mariano
 */
public class Arreglo2lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int v[] = new int[10];
        BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese los elementos del vector: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println("Elemento " + (i + 1) + " del vector: ");
            v[i] = Integer.parseInt(dato.readLine());

        }
        int j, aux, mayor = 1, posMayor = -1;
        v[0] = 100;
        for (int i = 0; i < 10; i++) {
            j = 0;
            aux = 0;
            while (j < v[i]) {
                if (v[i] % j == 0) {
                    aux++;
                    j++;
                }

            }
            if (aux == 2) {
                v[i] = j;
                if (mayor < v[i]) {
                    mayor = v[i];
                    posMayor = 1;

                }

            }
        }
        if(mayor!= -1){
            System.out.println("El mayor elemento primo encontrado es: "+ mayor+ "Y esta en la posicion "+ posMayor);
        }
    }

}
