/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class Cubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        String CadenaNum;
        int Totalcubo = 1;
        int Totalcuarta = 1;

        for (int i = 1; i <= 10; i++) {
            CadenaNum = JOptionPane.showInputDialog("Ingrese un numero");
            numero = Integer.parseInt(CadenaNum);
            Totalcubo = (int) Math.pow(numero, 3);
            Totalcuarta = (int) Math.pow(numero, 4);

            System.out.println("El numero elevado al cubo es " + Totalcubo + "\n El numero elevado a la cuarta es " + Totalcuarta);
        }
    }

}
