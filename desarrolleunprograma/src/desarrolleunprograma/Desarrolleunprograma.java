/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrolleunprograma;

import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class Desarrolleunprograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // indicar a un repositor en que gondola va cada producto
        // Electrodomestico = gondola 6
        // comestible y pequeño gondola 1
        // Grande y en promoción u oferta gondola 4
        // Grande en gondola 7
        // Juguete gondola 3, si esta en promocion en gondola 2
        // Resto articulos, consultar al JEFE

        int tipo;
        int tamano;
        int oferta;
        int promocion;

        String CadenaOf;
        String CadenaTipo;
        String Cadenatam;
        String CadenaPROMO;

        CadenaTipo = JOptionPane.showInputDialog("Ingrese el tipo de producto: \n1-Electrodomestico \n2- Comestible \n3-Juguete \n4 OTROS \nProducto: ");
        tipo = Integer.parseInt(CadenaTipo);

        if (tipo == 1) {
            JOptionPane.showMessageDialog(null, "Electrodomestico \n debe ubicarse en la gondola 6");
        } else {
            if (tipo == 2) {
                Cadenatam = JOptionPane.showInputDialog("COMESTIBLE \nIndique su tamaño: \n1-Grande \n2- Pequeño \nTAMAÑO: ");
                tamano = Integer.parseInt(Cadenatam);
                if (tamano == 1) {
                    CadenaOf = JOptionPane.showInputDialog("Si el producto se encuentra bajo promocion, Presione 1 \nCaso contrario, Presione 0");
                    oferta = Integer.parseInt(CadenaOf);
                    if (oferta == 1) {
                        JOptionPane.showMessageDialog(null, "Debe colocarse en la gondola 4");

                    } else {
                        JOptionPane.showMessageDialog(null, "Debe colocarse en la gondola 7");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Debe colocarse en la gondola 1, cercana a las cajas ");

                }
            } else {
                if (tipo == 3) {
                    CadenaPROMO = JOptionPane.showInputDialog("Juguete \nSi el producto se encuentra en promocion, Presione 1 \n al Caso contrario, Presione 0");
                    promocion = Integer.parseInt(CadenaPROMO);
                    if (promocion == 1) {
                        JOptionPane.showMessageDialog(null, "Debe colocarse en la gondola 2");
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe colocarse en la gondola 3");
                    }
                } else {
                    if (tipo == 4) {
                        JOptionPane.showMessageDialog(null, "Debe de preguntarle la ubicacion al Jefe ");

                    }
                }

            }
        }

    }

}
