/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Control {

    public static List<Integer> leerValores() {
        Scanner sc = new Scanner(System.in);
        int n;
        List<Integer> numerosIngresados = new ArrayList();
        System.out.println("Ingrese un numero");
        n = sc.nextInt();
        if (n == (-99)) {

        } else {
            do {
                numerosIngresados.add(n);
                System.out.println("Ingrese un numero");
                n = sc.nextInt();

            } while (n != -99);

        }
        return numerosIngresados;
    }

    public static int calcularSuma(List<Integer> numerosIngresados) {
        int suma = 0;
        for (Integer ie : numerosIngresados) {
            suma = suma + ie;
        }

        return suma;
    }

    public static int promedio(List<Integer> numerosIngresados, int suma) {
        int tamaño = numerosIngresados.size();
        int prom = suma / tamaño;
        return prom;
    }

    public static void mostrarResultados(List<Integer> numerosIngresados, int suma, int prom) {
        System.out.println("La lista de numeros ingresados es: " + numerosIngresados);
        System.out.println("La suma de los valores ingresados es de: " + suma);
        System.out.println("El promedio de los numeros ingresados es :" + prom);
        int c = 0;
        for (Integer ii : numerosIngresados) {
            if (ii > prom) {
                c++;
            }
        }
        System.out.println("Se encuentran " + c + " numeros ingresados mayores a la media");
    }

}
