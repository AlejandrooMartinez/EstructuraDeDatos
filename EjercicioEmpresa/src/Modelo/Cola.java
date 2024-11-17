/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Cola {
    private Nodo frente;
    private Nodo fin;

    public Cola() {
        frente = null;
        fin = null;
    }

    public void encolar(Tarea tarea) {
        Nodo nuevoNodo = new Nodo(tarea);
        if (frente == null) {
            frente = fin = nuevoNodo;
        } else {
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
    }

    public Tarea desencolar() {
        if (frente == null) {
            return null;
        }
        Tarea tarea = frente.getTarea();
        frente = frente.getSiguiente();
        if (frente == null) {
            fin = null;
        }
        return tarea;
    }

    public void mostrar() {
        Nodo temp = frente;
        while (temp != null) {
            System.out.println(temp.getTarea());
            temp = temp.getSiguiente();
        }
    }
}
