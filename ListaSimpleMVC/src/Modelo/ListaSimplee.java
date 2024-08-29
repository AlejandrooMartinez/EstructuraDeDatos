/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author fredy
 */
public class ListaSimplee {

    private Nodo cabeza;

    public ListaSimplee() {
        this.cabeza = null;
    }

    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.getsiguiente() != null) {
                temp = temp.getsiguiente();
            }
            temp.setsiguiente(nuevoNodo);
        }
    }

    public void eliminar() {
        if (cabeza != null) {
            cabeza = cabeza.getsiguiente();
        } else {
            System.out.println("Lista Vacia");
        }
    }

    public int buscar(int elemento) {
        Nodo Actual = cabeza;
        while (Actual != null) {
            if (Actual.getDato() == elemento) {
                System.out.println("Dato encontrado");
                return Actual.getDato();
            }
            
            Actual=Actual.getsiguiente();
            
        }
        System.out.println("Dato no encontrado");
        return -1;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

}
