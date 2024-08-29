
package listasimplemvc;

import Controlador.ListaControlador;
import Modelo.ListaSimplee;
import Modelo.Nodo;
import Vista.ListaVista;
import java.util.Scanner;


public class ListaSimpleMVC {

    
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        
        
        ListaSimplee modelo= new ListaSimplee();
        ListaVista vista =new ListaVista();
        ListaControlador controlador=new ListaControlador(modelo, vista);
        
        /* INSERTAR LOS DATOS    */
        
        controlador.agregarElemento(65);
        controlador.agregarElemento(23);
        controlador.agregarElemento(12);
        controlador.agregarElemento(0);
        
        /* MOSTRAR LISTA */
        
        System.out.println("Lista Normal");
        controlador.mostrarLista();
        
        /*  BUSCAR DATO */
        
        
        
        /* AGREGAR LISTA */
        controlador.agregarElemento(28);
        vista.mostrarMensaje("Lista despues de agregar elemento");
        controlador.mostrarLista();
        
        controlador.eliminarElemneto();
        
        /* Eliminar elemento */
        
        vista.mostrarMensaje("Lista despues de eliminar elemento");
        controlador.mostrarLista();
        vista.mostrarMensaje("DIGITE NUMERO QUE DESEA BUSCAR");
        
       
        int a=leer.nextInt();
        modelo.buscar(a);
   
    }
    
}
