/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class AlumnosControl {

    public static List<AlumnosEntidad> cargarAlumnos() {
        Scanner sc = new Scanner(System.in);
        List<AlumnosEntidad> alumnosEgg = new ArrayList();
        System.out.println("Ingrese la cantidad de alumnos que desea cargar");
        int alumnosACargar = sc.nextInt();
        int c = 0;

        do {
            System.out.println("Ingrese el nombre del alumno ");
            String nombre = sc.next();
            sc.useDelimiter("\n");

            System.out.println("Ingresar el apellido del alumno ");
            String apellido = sc.next();
            sc.useDelimiter("\n");

            System.out.println("Ingrese la edad del alumno ");
            int edad = sc.nextInt();

            System.out.println("Ingrese el legajo del alumno");
            long legajo = sc.nextLong();

            System.out.println("Ingrese el sexo del alumno (M/H/O)");
            char sexo = sc.next().toUpperCase().charAt(0);

            System.out.println("Ingrese la condicion del alumno (Regular o Condicional(R/C)");
            char condicion = sc.next().toUpperCase().charAt(0);

            System.out.println("Ingrese la nota final de alumno ");
            int notaFinal = sc.nextInt();

            AlumnosEntidad ae = new AlumnosEntidad(nombre, apellido, edad, legajo, sexo, condicion, notaFinal);
            alumnosEgg.add(ae);
            c++;

        } while (c != alumnosACargar);

        return alumnosEgg;
    }

    public static void Mostrar(List<AlumnosEntidad> cargarAlumnos) {
        for (AlumnosEntidad nom : cargarAlumnos) {
            System.out.println("Nombre del alumno: " + nom.getNombre() + " " + nom.getApellido());
        }
    }

    public static void mostrarCon(List<AlumnosEntidad> cargarAlumnos) {
        for (AlumnosEntidad mos : cargarAlumnos) {
            if (mos.getCondicion() == 'C') {
                System.out.println("El alumno " + mos.getNombre() + " " + mos.getApellido() + " esta condicionado y su nota es: " + mos.getNotaFinal());
            }

        }
    }

    public static void notaMayorMenor(List<AlumnosEntidad> cargarAlumnos) {
        cargarAlumnos.sort(Comparator.comparing(AlumnosEntidad::getNotaFinal).reversed());
        for (AlumnosEntidad notmm : cargarAlumnos) {
            System.out.println("Nombre del alumno: " + notmm.getNombre() + " " + notmm.getApellido() + " nota final: " + notmm.getNotaFinal());
        }
    }

    public static void notaMenorMayor(List<AlumnosEntidad> cargarAlumnos) {
        cargarAlumnos.sort(Comparator.comparing(AlumnosEntidad::getNotaFinal));
        for (AlumnosEntidad notmm : cargarAlumnos) {
            System.out.println("Nombre del alumno: " + notmm.getNombre() + " " + notmm.getApellido() + " nota final: " + notmm.getNotaFinal());
        }
    }

    public static void ordenarNombreApellido(List<AlumnosEntidad> cargarAlumnos) {
        cargarAlumnos.sort(Comparator.comparing(AlumnosEntidad::getApellido));
        for (AlumnosEntidad nomap : cargarAlumnos) {
            System.out.println("Nombre del alumno: " + nomap.getNombre() + " " + nomap.getApellido());
        }
    }
}
