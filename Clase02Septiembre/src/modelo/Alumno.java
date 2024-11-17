/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Alumno {
    private String nombre;
    private int numeroAsigando;
    private Alumno anterior;
    private Alumno siguiente;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.numeroAsigando = numeroAsigando =-1;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int numeroAsignado(){
        return numeroAsigando;
    }

    public void setNumeroAsigando(int numeroAsigando) {
        this.numeroAsigando = numeroAsigando;
    }

    public Alumno getAnterior() {
        return anterior;
    }

    public void setAnterior(Alumno anterior) {
        this.anterior = anterior;
    }

    public Alumno getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Alumno siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
