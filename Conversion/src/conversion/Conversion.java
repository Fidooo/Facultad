/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion;

/**
 *
 * @author Mariano
 */
public class Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 5;
        int y = 8;

        double c = 0.3;

        c = x;          //Conversion implicita
        y = (int) c; //Forzar conversión explicita o casting

        String n = "9";
        Integer.parseInt(n);
        c = Double.parseDouble(n);
        
    }

}
