/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comodijo;

/**
 *
 * @author Mariano
 */
public class COMODIJO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ESTRUCTURA SWITCH
        int edad;
        edad = 21;
        switch (edad) {
            case 10:
                System.out.println("MENOR DE EDAD");
                
                break;
            case 17:
                System.out.println("MENOR DE EDAD");
                break;
            case 21:
                System.out.println("MAYOR DE EDAD");
            break;
            default:
                
                throw new AssertionError();
        }
        
        
        
        
        
        
        
    }
    
}
