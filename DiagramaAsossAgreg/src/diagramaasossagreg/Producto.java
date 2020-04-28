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
public class Producto {
    private int codProducto;
    private String descProducto;
    private double precProducto;

    public Producto(int codProducto, String descProducto, double precProducto) {
        this.codProducto = codProducto;
        this.descProducto = descProducto;
        this.precProducto = precProducto;
    }

    public Producto() {
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getDescProducto() {
        return descProducto;
    }

    public void setDescProducto(String descProducto) {
        this.descProducto = descProducto;
    }

    public double getPrecProducto() {
        return precProducto;
    }

    public void setPrecProducto(double precProducto) {
        this.precProducto = precProducto;
    }
    
    
    
}
