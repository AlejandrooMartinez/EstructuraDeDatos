/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class ListaDoble<T> {

    private Nodo<T> Cabeza;
    private Nodo<T> Cola;
    private int tamaño;

    public ListaDoble() {
        this.Cabeza = null;
        this.Cola = null;
        this.tamaño = 0;
    }

    public void agregarAlFinal(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (Cabeza == null) {
            Cabeza = Cola = nuevoNodo;
        } else {
            Cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = Cola;
            Cola = nuevoNodo;
        }
        tamaño++;

    }

    public void agragarAlInicio(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (Cabeza == null) {
            Cabeza = Cola = nuevoNodo;
        } else {
            nuevoNodo.siguiente = Cabeza;
            Cabeza.anterior = nuevoNodo;
            Cabeza = nuevoNodo;
        }
        tamaño++;
    }

    public void eliminar(T dato) {

        Nodo<T> actual = Cabeza;
        while (actual != null) {
            if (actual.dato.equals(dato)) {
                if (actual.anterior == null) {
                    Cabeza = actual.siguiente;
                    if (actual != null) {
                        Cabeza.anterior = null;
                    } else if (actual.siguiente == null) {
                        Cola = actual.anterior;
                        Cola.siguiente = null;
                    }else{
                        actual.anterior.siguiente=actual.siguiente;
                        actual.siguiente.anterior=actual.anterior;
                    }
                    tamaño--;
                    return;
                }
                actual=actual.siguiente;
            }
        }
    }
    public boolean buscar(T dato){
        Nodo <T> actual=Cabeza;
        while(actual!=null){
            if (actual.dato.equals(dato)) {
                return true;
            }else{
                actual=actual.siguiente;
            }
                
        }
        return false;
    }
}
