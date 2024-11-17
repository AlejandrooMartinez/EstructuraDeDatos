/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Nodo {
    private Tarea tarea;
    private Nodo siguiente;

    public Nodo(Tarea tarea) {
        this.tarea = tarea;
        this.siguiente = null;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}

