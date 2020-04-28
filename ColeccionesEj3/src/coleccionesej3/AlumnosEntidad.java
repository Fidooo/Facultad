/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej3;

/**
 *
 * @author Mariano
 */
public class AlumnosEntidad {

    String Nombre;
    String Apellido;
    int edad;
    long Legajo;
    char Sexo;
    char Condicion;
    int notaFinal;

    public AlumnosEntidad() {

    }

    public AlumnosEntidad(String Nombre, String Apellido, int edad, long Legajo, char Sexo, char Condicion, int notaFinal) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.Legajo = Legajo;
        this.Sexo = Sexo;
        this.Condicion = Condicion;
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public long getLegajo() {
        return Legajo;
    }

    public void setLegajo(long Legajo) {
        this.Legajo = Legajo;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public char getCondicion() {
        return Condicion;
    }

    public void setCondicion(char Condicion) {
        this.Condicion = Condicion;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
