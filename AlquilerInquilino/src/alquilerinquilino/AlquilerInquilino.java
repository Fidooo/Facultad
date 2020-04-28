/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerinquilino;

import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class AlquilerInquilino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cobrar Alquiler a Inquilino
        //Canon Mensual
        //Más gastos de Luz, Agua, Gas, Limpieza(Compartidos entre todos los Locatarios)
        //6 Departamentos, mismo % de participacion en gastos
        //Determinar cual es el canon mensual en concepto de alquiler y en conceptos de impuestos
        //IMPRIMIR FACTURA POR PANTALLA CON DICHOS IMPORTES
        
        float Luz;
        float Agua;
        float Gas;
        float Limpieza;
        float TOTAL;
        float Alquiler;
        
        String CadenaLuz;
        String CadenaAgua;
        String CadenaGas;
        String CadenaLimpieza;
        String CadenaAlquiler;
        
        CadenaAlquiler= JOptionPane.showInputDialog("Ingrese el Alquiler");
        Alquiler = Float.parseFloat(CadenaAlquiler);
        CadenaLuz = JOptionPane.showInputDialog("Ingrese el monto de Luz");
        Luz = Float.parseFloat(CadenaLuz);
        CadenaAgua = JOptionPane.showInputDialog("Ingrese el monto de Agua");
        Agua = Float.parseFloat(CadenaAgua);
        CadenaGas = JOptionPane.showInputDialog("Ingrese el monto de Gas");
        Gas = Float.parseFloat(CadenaGas);
        CadenaLimpieza = JOptionPane.showInputDialog("Ingrese el monto de Limpieza");
        Limpieza = Float.parseFloat(CadenaLimpieza);
        
        //CALCULO
        Luz = Luz /6;
        Agua = Agua / 6;
        Gas = Gas /6;
        Limpieza = Limpieza /6;
        TOTAL = Alquiler + Luz + Agua + Gas + Limpieza ;
        
        //FACTURA EN PANTALLA
        JOptionPane.showMessageDialog(null,"Factura"+"\nEl alquiler es de:"+Alquiler+"\nLa luz es de:"+Luz+ "\nEl agua es de: "+Agua+"\nEl Gas es de: "+Gas+ "\nLa limpieza es de: "+Limpieza+ "\nEl Total es de: "+TOTAL);
           
    }
    
}
