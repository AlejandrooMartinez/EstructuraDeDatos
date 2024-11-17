
package pila;

import Controlador.PilaControlador;
import Modelo.Pilaa;
import Vista.VistaPila;

public class Pila {

 
    public static void main(String[] args) {
        Pilaa modelo= new Pilaa();
        VistaPila vista =new VistaPila();
        PilaControlador controlador=new PilaControlador(vista,modelo );
        
        controlador.iniciar();
    }
    
}
