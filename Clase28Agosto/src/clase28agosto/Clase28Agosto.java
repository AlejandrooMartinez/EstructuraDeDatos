
package clase28agosto;

import Controlador.Controlador;
import Modelo.ListaEnlazada;
import Vista.Vista;


public class Clase28Agosto {

    
    public static void main(String[] args) {
        ListaEnlazada modelo= new ListaEnlazada();
        Vista vista =new Vista();
        Controlador controlador=new Controlador(modelo, vista);
        
        controlador.iniciar();
    }
    
}
