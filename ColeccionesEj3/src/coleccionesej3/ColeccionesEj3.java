/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej3;

import java.util.List;

/**
 *
 * @author Mariano
 */
public class ColeccionesEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<AlumnosEntidad> alumnosEgg = AlumnosControl.cargarAlumnos();
        AlumnosControl.Mostrar(alumnosEgg);
        AlumnosControl.mostrarCon(alumnosEgg);
        AlumnosControl.notaMayorMenor(alumnosEgg);
        AlumnosControl.ordenarNombreApellido(alumnosEgg);
    }
    
}
