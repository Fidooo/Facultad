/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datospersona;

import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class DATOSPERSONA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DADOS LOS DATOS DE UNA PERSONA ( NOMBRE, SUELDO , INASISTENCIAS )
        // CANTIDAD DE DÍAS DE LABORALES DEL MES
        // MOSTRAR EL SUELDO QUE LE CORRESPONDE COBRAR
        // LOS DÍAS NO TRABAJADOS SE LE DESCUENTAN
        
        String CadenaNombre;
        float dias;
        float faltas;
        float precio;
        
        String Cadenadias;
        String CadenaFaltas;
        String CadenaPrecio;
        
        float sueldo;
        float inasistencia;
        float totaldelsueldo;
        
        CadenaNombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
        
        Cadenadias = JOptionPane.showInputDialog("Ingrese los dias laborables");
        dias = Float.parseFloat(Cadenadias);
        CadenaFaltas = JOptionPane.showInputDialog("Ingrese la cantidad de inasistencias del empleado");
        faltas = Float.parseFloat(CadenaFaltas);
        CadenaPrecio = JOptionPane.showInputDialog("Ingrese el pago por dia laboral");
        precio = Float.parseFloat(CadenaPrecio);
        
        sueldo = precio * dias;
        JOptionPane.showMessageDialog(null,"El empleado " + CadenaNombre + "\nDebe recibir como sueldo : " + sueldo);
        
        if (faltas >= 1) {
            inasistencia = precio*faltas;
            totaldelsueldo = sueldo - inasistencia ;
            JOptionPane.showMessageDialog(null,"Por Inasistencias: "+faltas+ "\nel empleado: "+CadenaNombre+ "\nrecibira como sueldo : "+totaldelsueldo);
        }      
        
    }
    
}
