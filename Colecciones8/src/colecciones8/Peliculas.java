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
public class Peliculas {

    private String titulo;
    private int duracion;
    private int edadminima;
    private String director;

    public Peliculas() {
        String[] Titulos = {" Harry Potter 10", "Alien vs Predador", "Rocky 9", "The Last", "Pd te cojo"};
        int[] Duracion = {187, 94, 79, 138, 54};
        int[] Eminima = {13, 16, 0, 4, 18};
        String[] Director = {" P.Morris", "T.Kavhe", "T.C.Houjo", "C.Mammon", "K.A.Rikolino"};
        int c = (int) (Math.random() * 5);
        this.titulo = Titulos[c];
        this.duracion = Duracion[c];
        this.edadminima = Eminima[c];
        this.director = Director[c];
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadminima() {
        return edadminima;
    }

    public void setEdadminima(int edadminima) {
        this.edadminima = edadminima;
    }

    public String getDirector() {
        return director;
    }

   

    public void setDirector(String director) {
        this.director = director;
    }

}
