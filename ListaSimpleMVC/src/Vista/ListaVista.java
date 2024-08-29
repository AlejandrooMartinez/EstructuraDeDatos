
package Vista;

import Modelo.Nodo;


public class ListaVista {
    public void mostrar(Nodo cabeza){
        Nodo temp=cabeza;
        while(temp!=null){
            System.out.print(temp.getDato()+" -> ");
            temp=temp.getsiguiente();
        }
        System.out.println("Null");
    }
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
