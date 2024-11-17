package controlador;

import modelo.Alumno;
import modelo.ListaDoble;
import modelo.ListaNumeros;
import vista.Vista;

public class controlador {

    private ListaNumeros lista;
    private Vista vista;
    private ListaDoble listadoble;

    public controlador(ListaNumeros lista, Vista vista, ListaDoble listadoble) {
        this.lista = lista;
        this.vista = vista;
        this.listadoble = listadoble;
    }

   public void iniciar() {
    Alumno actual = listadoble.obtenerCabeza();
    while (actual != null) {
        int numerosAsignado = lista.sacarAleatorio();
        actual.setNumeroAsigando(numerosAsignado);
        vista.mostrarAsignacionNumeros(actual.getNombre(), actual.numeroAsignado());
        System.out.println("Asignado número: " + numerosAsignado + " a " + actual.getNombre());
        actual = actual.getSiguiente();
    }
    
    actual = listadoble.obtenerCabeza();
    while (actual != null) {
        Alumno amigosecreto = listadoble.obtenerPosicion(actual.numeroAsignado());
        
        actual = actual.getSiguiente();
    }
}


}
