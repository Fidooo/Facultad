/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14lab2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Mariano
 */
public class Ejercicio14lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archivo = null;
        FileWriter fr = null;
        BufferedWriter br = null;

        try {

            archivo = new File("C:\\download/archivo.txt");
            fr = new FileWriter(archivo);
            br = new BufferedWriter(fr);

            // Lectura del fichero
            String linea = "Hola";

            int numeros[] = {3, 8, 15, 20};

            for (int j = 1; j <= 20; j++) {
                
                for (int i = 0; i < numeros.length; i++) {
                    if(numeros[i]==j){}
                    int numero = numeros[i];
                    br.write(String.valueOf(numero));
                    br.newLine();
                }
            }

            br.close();

        } catch (Exception e) {
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {

            }
        }

    }

}
