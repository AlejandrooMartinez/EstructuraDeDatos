/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
public class Pila {
    private Nodo tope;

    public Pila() {
        tope = null;
    }

    public void apilar(Tarea tarea) {
        Nodo nuevoNodo = new Nodo(tarea);
        if (tope == null) {
            tope = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(tope);
            tope = nuevoNodo;
        }
    }

    public Tarea desapilar() {
        if (tope == null) {
            return null;
        }
        Tarea tarea = tope.getTarea();
        tope = tope.getSiguiente();
        return tarea;
    }

    public void mostrar() {
        Nodo temp = tope;
        while (temp != null) {
            System.out.println(temp.getTarea());
            temp = temp.getSiguiente();
        }
    }
}
