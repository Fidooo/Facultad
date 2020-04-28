/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej2;

import java.util.List;

/**
 *
 * @author Mariano
 */
public class ColeccionesEj2 {

    public static void main(String[] args) {
        List<Integer> numerosIngresados = Control.leerValores();
        int suma = Control.calcularSuma(numerosIngresados);
        int promedio = Control.promedio(numerosIngresados, suma);
        Control.mostrarResultados(numerosIngresados, suma, promedio);
    }

}
