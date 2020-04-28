/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones8;

/**
 *
 * @author Mariano
 */
public class Control {

    public static void Generar() {
        int a = (int) (Math.random() * 10 + 5);
        System.out.println("Tendremos " + a + " espectadores");
        int c = 0;
        Peliculas P = new Peliculas();
        Cine C = new Cine(P);
        System.out.println("La pelicula Disponible es: " + P.getTitulo());
        System.out.println("Director: " + P.getDirector());
        System.out.println("Duracion: " + P.getDuracion() + ". Edad Minima: " + P.getEdadminima());
        System.out.println("");
        String[] Columna = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
        int[] Fila = {8, 7, 6, 5, 4, 3, 2, 1};
        String[][] Asientos = new String[8][9];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <= 8; j++) {
                Asientos[i][j] = "|        |";
            }
        }
        while (c != a) {
            System.out.println("________________");
            Espectador E = new Espectador();
            System.out.println("El espectador es: " + E.getNombre());
            System.out.println("Tiene una edad de: " + E.getEdad() + " y posee: $" + E.getDinero());
            System.out.println("");
            if (E.getEdad() < P.getEdadminima()) {
                System.out.println("El Espectador: " + E.getNombre() + " no cumple con el minimo de edad.");
                continue;
            }
            if (E.getDinero() < C.getPrecio()) {
                System.out.println("El Espectador: " + E.getNombre() + " no tiene dinero suficiente.");
                continue;
            }
            int i = (int) (Math.random() * 8);
            int j = (int) (Math.random() * 9);
            if (Asientos[i][j].compareTo("|        |") != 0) {
                i = (int) (Math.random() * 8);
                j = (int) (Math.random() * 9);
            }
            System.out.println("El asiento que le corresponde es: " + Fila[i] + Columna[j]);
            Asientos[i][j] = "|    " + E.getNombre().substring(0, 1) + "   |";

            for (int k = 0; k < 8; k++) {
                for (int l = 0; l <= 8; l++) {
                    System.out.print(Asientos[k][l]);
                }
                System.out.println("");
            }
            c++;

        }
    }
}
