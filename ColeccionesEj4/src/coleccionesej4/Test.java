/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mariano
 */
public class Test {

    public static void main(String[] args) {

        CantanteFamoso cf1 = new CantanteFamoso("Jehova", "Libre de pecado");
        CantanteFamoso cf2 = new CantanteFamoso("WACHITURRO", "Devolvemé la sapátílláááá");
        CantanteFamoso cf3 = new CantanteFamoso("La champion Liga", "Despojate");
        CantanteFamoso cf4 = new CantanteFamoso("Don omar", "EIA Y IO");
        CantanteFamoso cf5 = new CantanteFamoso("KCYO", "zozio");
        ListaCantantesFamosos lcf1 = new ListaCantantesFamosos(cf1, cf2, cf3, cf4, cf5);
        List<CantanteFamoso> canFam = ListaCantantesFamosos.Añadir();
        ListaCantantesFamosos.mostrar(canFam);
    }
}
