/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones9;

/**
 *
 * @author Mariano
 */
public class Jugador {

    private Revolver r;
    private int id;
    private String nombre;
    private boolean vivo;

    public Jugador() {
        int[] id1 = {1, 2, 3, 4, 5, 6};
        String[] nombre1 = {"Samuel", "muymanco", "Tuvieja", "tuprima", "tutía", "Quegorreado"};
        int a = (int) (Math.random() * 6 + 1);
        this.id = id1[a];
        this.nombre = id + nombre1[a];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void disparar(Revolver r) {
        System.out.println("Turno de: " + nombre + " procede a dispararse");
        r.disparar();
        if (r.disparar() == true) {
            System.out.println("El jugador ha muerto");
        }
    }
}
