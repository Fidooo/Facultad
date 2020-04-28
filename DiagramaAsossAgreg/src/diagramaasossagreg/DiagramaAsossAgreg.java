/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramaasossagreg;

/**
 *
 * @author Marcelo
 */
public class DiagramaAsossAgreg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1=new Cliente();
        Producto p1=new Producto();
        Fecha fec1=new Fecha();
        
        Factura f1 = new Factura (5800, c1, p1, 'A', 5555, fec1);
        c1.setCodigo(5558748);
        System.out.println("el codigo es: "+c1.getCodigo());
        System.out.println("el tipo de factura es: "+f1.getTipo());
        
    }
    
}
