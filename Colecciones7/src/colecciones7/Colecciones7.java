/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones7;

import java.util.List;

/**
 *
 * @author Mariano
 */
public class Colecciones7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Simulador> s1 = Metodos.CargarAlumnos();
        Metodos.mostrar(s1);
        System.out.println("***************************************************");        
        Metodos.ordenNatural(s1);
        System.out.println("***************************************************");
        Metodos.arbolito(s1);
    }

}
