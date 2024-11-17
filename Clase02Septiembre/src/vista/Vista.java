/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.ListaDoble;


public class Vista {
    public void  mostrarListaAlumno(ListaDoble listaAlumnos){
        System.out.println("Listado de Alumnos");
        listaAlumnos.mostrarlista();
    }
    public void mostrarAsignacionNumeros(String nombre, int numeroAsignado){
        System.out.println(nombre+" Su numero asignado es: "+ numeroAsignado);
    }
}
