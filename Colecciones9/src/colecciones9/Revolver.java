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
public class Revolver {

    int posicionactual;
    int posicionbala;

    public Revolver() {

        int a = 0;
        int b = (int) (Math.random() * 5 + 0);
        this.posicionactual = a;
        this.posicionbala = b;
    }

    public int getPosicionactual() {
        return posicionactual;
    }

    public void setPosicionactual(int posicionactual) {
        this.posicionactual = posicionactual;
    }

    public int getPosicionbala() {
        return posicionbala;
    }

    public void setPosicionbala(int posicionbala) {
        this.posicionbala = posicionbala;
    }

    public boolean disparar() {
        
        if (posicionactual == posicionbala) {
            return true;
        } else {
            return false;
        }
        
    }

    public void siguientebala() {
        this.posicionactual = posicionactual + 1;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionactual=" + posicionactual + ", posicionbala=" + posicionbala + '}';
    }

   
   

}
