/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calcular cuanto dinero tiene en pesos un banco
        //Monedas de $2, $1 , 50C , 25C, 10C y 5C
        //Informar EL TOTAL DISPONIBLE EN LA Sucursal
        double dospesos;
        double unpeso;
        double cincuentacentavos;
        double veinticincocentavos;
        double diezcentavos;
        double cincocentavos;
        double TOTAL;
        double Candospesos;
        double Canunpeso;
        double Cancincentavos;
        double Canveinticincentavos;
        double Candiezcentavos;
        double Cancincocentavos;
        
        String Cadenadospesos;
        String Cadenaunpeso;
        String Cadenacincuentacentavos;
        String Cadenaveinticincocentavos;
        String Cadenadiezcentavos;
        String Cadenacincocentavos;
        String SucursalNombre;
        
    SucursalNombre = JOptionPane.showInputDialog("Ingrese el Nombre de la Sucursal");
    Cadenadospesos= JOptionPane.showInputDialog("Ingrese la cantidad de monedas de 2 PESOS ");
    Candospesos = Double.parseDouble(Cadenadospesos);
    Cadenaunpeso = JOptionPane.showInputDialog("Ingrese la cantidad de monedas de UN PESO");
    Canunpeso = Double.parseDouble(Cadenaunpeso);
    Cadenacincuentacentavos = JOptionPane.showInputDialog("Ingrese la cantidad de monedas de Cincuenta Centavos");
    Cancincentavos = Double.parseDouble(Cadenacincuentacentavos);
    Cadenaveinticincocentavos = JOptionPane.showInputDialog("Ingrese la cantidad de monedas de VEINTICINCO CENTAVOS");
    Canveinticincentavos = Double.parseDouble(Cadenaveinticincocentavos);
    Cadenadiezcentavos = JOptionPane.showInputDialog("Ingrese la cantidad de monedas de DIEZ CENTAVOS");
    Candiezcentavos = Double.parseDouble(Cadenadiezcentavos);
    Cadenacincocentavos = JOptionPane.showInputDialog("Ingrese la cantidad de monedas de CINCO CENTAVOS");
    Cancincocentavos = Double.parseDouble(Cadenacincocentavos);
   
    //CALCULO
    dospesos = Candospesos *2 ;
    unpeso = Canunpeso *1;
    cincuentacentavos= Cancincentavos * 0.50;
    veinticincocentavos = Canveinticincentavos * 0.25;
    diezcentavos = Candiezcentavos * 0.10;
    cincocentavos = Cancincocentavos * 0.05;
   TOTAL= dospesos + unpeso + cincuentacentavos + veinticincocentavos + diezcentavos + cincocentavos ;
    
    // SALIDA
    JOptionPane.showMessageDialog(null,"Sucursal: " +SucursalNombre+"\nDinero Disponible en monedas de su Sucursal es de:" + TOTAL);
      
    
    }
    
}
