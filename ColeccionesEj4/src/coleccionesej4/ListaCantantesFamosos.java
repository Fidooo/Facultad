/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class ListaCantantesFamosos {

    public static List<CantanteFamoso> Añadir() {
        List<CantanteFamoso> canFam = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Desea añadir algún cantante? ");
        System.out.println("Ingrese 1 para la opción SI ");
        System.out.println("Ingrese 2 para la opción NO");
        int opcion = sc.nextInt();
        switch (opcion) {

            case 1:
                do {
                    System.out.println("Ingrese el nombre del cantante");
                    String cantante = sc.next();
                    sc.useDelimiter("\n");
                    System.out.println("Ingrese los discos con mas ventas");
                    String discventas = sc.next();
                    sc.useDelimiter("\n");
                    System.out.println("¿Desea ingresar otro cantante? \n1.Si \n2.No");
                    opcion = sc.nextInt();
                    if (opcion < 1 | opcion > 2) {
                        System.out.println("Esa opcion es incorrecta");
                        System.out.println("¿Desea ingresar otro cantante? \n1.Si \n2.No");
                        opcion = sc.nextInt();
                    }
                    CantanteFamoso cf = new CantanteFamoso(cantante, discventas);
                    canFam.add(cf);
                } while (opcion != 2);

            case 2:
                System.out.println("Ueno, ¿Entonces pa que verga entras al programa ?");
                break;
            default:
                System.out.println("Eso no se puede pendeja ");
        }
        return canFam;
    }

    ListaCantantesFamosos(CantanteFamoso cf1, CantanteFamoso cf2, CantanteFamoso cf3, CantanteFamoso cf4, CantanteFamoso cf5) {

    }

    public static void mostrar(List<CantanteFamoso> canFam) {
        System.out.println(canFam.iterator());
        System.out.println(canFam);

    }
}
