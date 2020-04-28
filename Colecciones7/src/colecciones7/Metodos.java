/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author Mariano
 */
public class Metodos {

    public static List<Simulador> CargarAlumnos() {
        List<Simulador> s1 = new ArrayList();

        String[] nombres = {"Sinalma", "Indefinido", "Riki", "Bulma", "Baiabaia", "Cuello", "Salame"};
        String[] apellidos = {"Afavor", "Golpeador", "Fort", "Sinvida", "Requezon", "DeCondor", "ParaqueVine"};

        for (int i = 0; i < 20; i++) {
            int a = (int) (Math.random() * 7);
            int b = (int) (Math.random() * 7);
            long c = (int) (Math.random() * (30000000 + 20000000));
            Simulador simulador = new Simulador(nombres[a], apellidos[b], c);
            s1.add(simulador);
        }
        return s1;
    }

    public static void mostrar(List<Simulador> CargarAlumnos) {
        for (Simulador CargarAlumno : CargarAlumnos) {
            System.out.println("Nombre: " + CargarAlumno.getNombre() + "|| " + CargarAlumno.getApellido() + " ||" + "Dni: " + CargarAlumno.getDni());
        }
    }

    public static void ordenNatural(List<Simulador> CargarAlumnos) {
        CargarAlumnos.sort(Comparator.comparing(Simulador::getDni));
        for (Simulador CargarAlumno : CargarAlumnos) {
            System.out.println("Nombre: " + CargarAlumno.getNombre() + "|| " + CargarAlumno.getApellido() + " ||" + "Dni: " + CargarAlumno.getDni());
        }
    }

    public static void arbolito(List<Simulador> CargarAlumnos) {
        TreeSet<Simulador> trs = new TreeSet();
        trs.addAll(CargarAlumnos);
        for (Simulador tr : trs) {
            System.out.println(tr.getApellido());
        }
    }

    public static void ingresarVotos(List<Simulador> CargarAlumnos) {
        int votos = 0;
        for (Simulador CargarAlumno : CargarAlumnos) {
            
        }
    }
}
