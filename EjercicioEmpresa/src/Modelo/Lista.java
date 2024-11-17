/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Lista {
    private Nodo cabeza;

    public Lista() {
        cabeza = null;
    }

    public void agregar(Tarea tarea) {
        Nodo nuevoNodo = new Nodo(tarea);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
    }

    public void mostrar() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.println(temp.getTarea());
            temp = temp.getSiguiente();
        }
    }
}

