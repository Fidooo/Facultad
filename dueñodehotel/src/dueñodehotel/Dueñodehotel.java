/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dueñodehotel;

import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class Dueñodehotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      	//Cobrar estadía a un grupo de chicos
        //Cantidad de días y valor x día
        //Cobrar el NETO
        //Cobrar el iva (21% del neto)
        //Cobrar Frigobar (1/3 del monto total sin IVA)
        //TOTAL = NETO+IVA+FRIGOBAR
//Imprimir factura por pantalla
int preciodia ;
int dia;
double Neto;
double Iva ;
double Frigobar;
double Total ;

String CadenaPreciodía;
String CadenaDía;
String CadenaEstadia;

CadenaPreciodía = JOptionPane.showInputDialog("Ingrese el precio por el día");
preciodia = Integer.parseInt(CadenaPreciodía);
CadenaDía = JOptionPane.showInputDialog("Ingrese la cantidad de días");
dia = Integer.parseInt(CadenaDía);

//CALCULO
Neto = dia * preciodia;
Iva = Neto * 0.21;
Frigobar = Neto /3 ;
Total = Neto + Iva + Frigobar ;

//FACTURA

JOptionPane.showMessageDialog(null,"El neto es de :" + Neto+"\nEl Iva es de:"+Iva+"\nEl Uso del Frigobar es de:" + Frigobar+"\nEl TOTAL a pagar es de:"+Total);


    }
    
}
