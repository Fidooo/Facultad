/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boliche;

import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class Boliche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se desea saber las ganancias de una noche
        //Cantidad de entradas a un precio y descontar gastos
        //Realizar un informe que muestre la recaudación, gastos por tipo de entrada y la ganancia final.
       
        double GananciadeEntradas;
        double Gastos;
        double Recaudacion;
        double GananciaFinal;    
        double TotalEntradadecien;
        double TotalEntradadedoscientos;
        double cien;
        double doscientos;
        
        
       double Entradadecien;// Entrada tipo a
       double Entradadedoscientos;//Entrada tipo b
       String CadenaEntradacien;
       String CadenaEntradadoscientos;
       
       double descuentoA;//Para entrada de 100
       double descuentoB;//Para entrada de 200
       
       CadenaEntradacien = JOptionPane.showInputDialog("Ingrese la cantidad de entradas de 100$");
      Entradadecien = Double.parseDouble(CadenaEntradacien);
      CadenaEntradadoscientos = JOptionPane.showInputDialog("Ingrese la cantidad de entradas de 200$");
      Entradadedoscientos = Double.parseDouble(CadenaEntradadoscientos);
      
      //Calculo
      TotalEntradadecien = Entradadecien * 100;
      TotalEntradadedoscientos = Entradadedoscientos *200;
      GananciadeEntradas = TotalEntradadecien + TotalEntradadedoscientos;
      descuentoA = Entradadecien *10;
      descuentoB = Entradadedoscientos * 25;
      cien = Entradadecien * (100 - 10);
      doscientos = Entradadedoscientos *(200 - 25);
      Gastos = descuentoA + descuentoB ;
      GananciaFinal = cien + doscientos ;
      JOptionPane.showMessageDialog(null, "La recaudación es de: "+GananciadeEntradas +"\nRecaudación de entradas de 100$: "+TotalEntradadecien+"\n Recaudación de entradas de 200$: "+TotalEntradadedoscientos+ "\n Gasto total de entradas de 100$: "+descuentoA+"\n Gasto total de entradas de 200$: "+descuentoB+"\nLa ganancia Final es de: "+GananciaFinal);
                
    }
    
}
