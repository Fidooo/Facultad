/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dia, mes y año a investigar");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int anio = sc.nextInt();
        if (mes >= 1 && mes <= 12) {
            switch (mes) {
                case 1:
                    if (dia >= 1 && dia <= 31) {
                        System.out.println("" + dia);
                        System.out.println("" + mes);
                        System.out.println("" + anio);
                    } else {
                    }
                    break;
                case 2:
                    if (anio % 400 == 0 | anio % 4 == 0 & anio % 100 == 0) {
                        if (dia >= 1 & dia <= 29) {
                            System.out.println("" + dia);
                            System.out.println("" + mes);
                            System.out.println("" + anio);
                        } else {
                            System.out.println("Fecha incorrecta");
                        }
                    } else {
                        if (dia >= 1 & dia <= 28) {
                            System.out.println("" + dia);
                            System.out.println("" + mes);
                            System.out.println("" + anio);
                        } else {
                            System.out.println("La fecha es incorrecta");
                        }
                    }
                    break;
                case 3:
                    if (dia >= 1 & dia <= 31) {
                        System.out.println("" + dia);
                        System.out.println("" + mes);
                        System.out.println("" + anio);
                    } else {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 4:
                    if (dia >= 1 & dia <= 30) {
                        System.out.println("" + dia);
                        System.out.println("" + mes);
                        System.out.println("" + anio);
                    } else {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 5:
                    if (dia >= 1 & dia <= 31) {
                        System.out.println("" + dia);
                        System.out.println("" + mes);
                        System.out.println("" + anio);
                    } else {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 6:
                    if (dia >= 1 & dia <= 30) {
                        System.out.println("" + dia);
                        System.out.println("" + mes);
                        System.out.println("" + anio);
                    } else {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 7:
                    if (dia >= 1 & dia <= 31) {
                        System.out.println("" + dia);
                        System.out.println("" + mes);
                        System.out.println("" + anio);
                    } else {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 8:
                    if (dia >= 1 & dia <= 31) {
                        System.out.println("" + dia);
                        System.out.println("" + mes);
                        System.out.println("" + anio);
                    } else {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 9:
                    if (dia >= 1 & dia <= 30) {
                        System.out.println("" + dia);
                        System.out.println("" + mes);
                        System.out.println("" + anio);
                    } else {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 10:
                    if (dia >= 1 & dia <= 31) {
                        System.out.println("" + dia);
                        System.out.println("" + mes);
                        System.out.println("" + anio);
                    } else {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 11:
                    if (dia >= 1 & dia <= 30) {
                        System.out.println("" + dia);
                        System.out.println("" + mes);
                        System.out.println("" + anio);
                    } else {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                case 12:
                    if (dia >= 1 & dia <= 31) {
                        System.out.println("" + dia);
                        System.out.println("" + mes);
                        System.out.println("" + anio);
                    } else {
                        System.out.println("La fecha es incorrecta");
                    }
                    break;
                default:
                    System.out.println("La fecha no es valido");
                    throw new AssertionError();
            }
        } else {
            System.out.println("La fecha no es valida");
        }

    }

}
