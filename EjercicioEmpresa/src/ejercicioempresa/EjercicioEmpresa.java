
package ejercicioempresa;

import Contolador.ControladorTareas;
import Vista.Vista;

/**
 *
 * @author fredy
 */
public class EjercicioEmpresa {

    public static void main(String[] args) {
        ControladorTareas controlador = new ControladorTareas();
        Vista vista = new Vista(controlador);
        vista.mostrarMenu();
    }
}

