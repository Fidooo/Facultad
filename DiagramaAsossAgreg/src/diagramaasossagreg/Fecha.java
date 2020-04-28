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
public class Fecha {
    private int dias;
    private int mes;
    private int anio;

    public Fecha() {
        this.dias = 0;
        this.mes = 0;
        this.anio = 0;
    }

    public Fecha(int dias, int mes, int anio) {
        this.dias = dias;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
}
