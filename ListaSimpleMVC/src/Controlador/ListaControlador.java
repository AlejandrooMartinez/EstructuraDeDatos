
package Controlador;

import Modelo.ListaSimplee;
import Vista.ListaVista;



public class ListaControlador {
    private ListaSimplee modelo;
    private ListaVista vista;

    public ListaControlador(ListaSimplee modelo, ListaVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void agregarElemento(int valor){
        modelo.agregar(valor);
    }
    public void eliminarElemneto(){
        modelo.eliminar();
    }
    public void mostrarLista(){
        vista.mostrar(modelo.getCabeza());
    }
    public int buscarLista(int elemento){
        modelo.buscar(0);
        return -1;
    }
    
            
}
