/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadores;

import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class Contadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        int contador = 0;
        int sumador = 0;
        int sueldo1;
        int sueldo2;
        String CadenaSueldo1;
        String CadenaSueldo2;
        
        CadenaSueldo1 = JOptionPane.showInputDialog("Ingrese el sueldo 1");
        sueldo1= Integer.parseInt(CadenaSueldo1);
        
        sumador = sumador + sueldo1;
        contador = contador +1 ; //
        contador++;
            
        
        CadenaSueldo2= JOptionPane.showInputDialog("Ingrese el sueldo 2");
        sueldo2 = Integer.parseInt(CadenaSueldo2);
        
        sumador = sumador + sueldo2;
        contador = contador +1 ;
        
        JOptionPane.showMessageDialog(null, "El contador es de : "+contador);
        JOptionPane.showMessageDialog(null,"El sueldo sumado es de: "+ sumador);
        JOptionPane.showMessageDialog(null, "El contador mas es de :"+ contador++);
       
    }
    
}
