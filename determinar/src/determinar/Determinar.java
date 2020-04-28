/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package determinar;

import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class Determinar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Determinar dado 3 numeros cual es el mayor y cual es el menor
        int a;
        int b;
        int c;
        String CadenaA;
        String CadenaB;
        String CadenaC;
        
        CadenaA = JOptionPane.showInputDialog("Ingrese un numero");
        a = Integer.parseInt(CadenaA);
        CadenaB = JOptionPane.showInputDialog("Ingrese un numero");
        b = Integer.parseInt(CadenaB);
        CadenaC = JOptionPane.showInputDialog("Ingrese un numero");
        c = Integer.parseInt(CadenaC);
        
        if (a > b && a > c) {
            JOptionPane.showMessageDialog(null,"El numero mas grande es :"+a);
            if (b > c) JOptionPane.showMessageDialog(null,"El numero mas chico es :"+c);    
            else JOptionPane.showMessageDialog(null,"El numero mas chico es "+b);
        }
        if (b > a && b > c) {
            JOptionPane.showMessageDialog(null,"El numero mas grande es :"+b);
            if (a > c) JOptionPane.showMessageDialog(null,"El numero mas chico es :"+c);    
            else JOptionPane.showMessageDialog(null,"El numero mas chico es "+a);
        }
       if (c > b && c > a) {
            JOptionPane.showMessageDialog(null,"El numero mas grande es :"+c);
            if (b > a) JOptionPane.showMessageDialog(null,"El numero mas chico es :"+a);    
            else JOptionPane.showMessageDialog(null,"El numero mas chico es "+b);
       }
       if (a==b){
           if (b== c){
                JOptionPane.showMessageDialog(null,"Todos los numeros son iguales a: "+a);
                return;
           } else if(c > b){
               JOptionPane.showMessageDialog(null,"El numero más grande es: "+c+" y los menores son: "+a);
           } else{
               JOptionPane.showMessageDialog(null,"Los numeros más grande son: "+a+" y el menor es: "+c);
           }
       }
       if (a==c){
           if (b== c){
                JOptionPane.showMessageDialog(null,"Todos los numeros son iguales a: "+a);
                return;
           } else if(b > c){
               JOptionPane.showMessageDialog(null,"El numero más grande es: "+b+" y los menores son: "+a);
           } else{
               JOptionPane.showMessageDialog(null,"Los numeros más grande son: "+a+" y el menor es: "+b);
           }
       }if (c==b){
           if (b == a){
                JOptionPane.showMessageDialog(null,"Todos los numeros son iguales a: "+a);
                return;
           } else if(c > b){
               JOptionPane.showMessageDialog(null,"El numero más grande es: "+a+" y los menores son: "+c);
           } else{
               JOptionPane.showMessageDialog(null,"Los numeros más grande son: "+c+" y el menor es: "+a);
           }
       }
       
       
    }
    
}
