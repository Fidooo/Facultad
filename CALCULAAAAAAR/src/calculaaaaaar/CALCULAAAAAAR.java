/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculaaaaaar;

import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class CALCULAAAAAAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CALCULAR Perimetro de un triangulo
        //Calcular Area de un Triangulo
        //Calcular area de un circulo
        //SALIDA
        int opcion;
        opcion = 0;
        switch (opcion) {
            case 1: JOptionPane.showMessageDialog(null,"Calcular perimetro de un triangulo");
                
                break;
            case 2: JOptionPane.showMessageDialog(null,"Calcular are de un Triangulo");
            break;
            case 3: JOptionPane.showMessageDialog(null,"Calcular area de un circulo");
            break;
            case 4 : JOptionPane.showMessageDialog(null,"SALIDA");
            break;
            default:
                throw new AssertionError();
        }
        
    }
    
}
