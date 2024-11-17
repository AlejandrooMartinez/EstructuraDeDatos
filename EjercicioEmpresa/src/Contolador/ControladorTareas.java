/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contolador;

import Modelo.Cola;
import Modelo.Lista;
import Modelo.Pila;
import Modelo.Tarea;

/**
 *
 * @author fredy
 */
public class ControladorTareas {
    private Lista tareasGenerales;
    private Pila tareasUrgentes;
    private Cola tareasComunes;

    public ControladorTareas() {
        tareasGenerales = new Lista();
        tareasUrgentes = new Pila();
        tareasComunes = new Cola();
    }

    public void agregarTareaGeneral(String descripcion) {
        Tarea tarea = new Tarea(descripcion);
        tareasGenerales.agregar(tarea);
    }

    public void agregarTareaUrgente(String descripcion) {
        Tarea tarea = new Tarea(descripcion);
        tareasUrgentes.apilar(tarea);
    }

    public void agregarTareaComun(String descripcion) {
        Tarea tarea = new Tarea(descripcion);
        tareasComunes.encolar(tarea);
    }

    public void mostrarTareas() {
        System.out.println("Tareas Generales:");
        tareasGenerales.mostrar();

        System.out.println("\nTareas Urgentes:");
        tareasUrgentes.mostrar();

        System.out.println("\nTareas Comunes:");
        tareasComunes.mostrar();
    }

    public void gestionarTareasUrgentes() {
        System.out.println("Atendiendo tarea urgente: " + tareasUrgentes.desapilar());
    }

    public void gestionarTareasComunes() {
        System.out.println("Atendiendo tarea común: " + tareasComunes.desencolar());
    }
}

