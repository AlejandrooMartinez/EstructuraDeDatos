
package clase26agosto;

import Modelo.Lista;
import Vista.Vista;
import controlador.controlador;


public class Clase26Agosto {

   
    public static void main(String[] args) {
        Lista modelo= new Lista();
        Vista vista =new Vista();
        controlador controlador=new controlador(modelo, vista);
        
        controlador.iniciar();
    }
    
}
