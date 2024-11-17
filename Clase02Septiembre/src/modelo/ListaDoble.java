/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class ListaDoble {
    private Alumno cabeza;
    private Alumno cola;
    
    
    public ListaDoble(){
        this.cabeza=null;
        this.cola=null;
    }

    
    
    
    
    public void agregarAlumno(String nombre){
         Alumno nuevo = new Alumno(nombre);
         if (cabeza==null) {
            cabeza=cola=nuevo;
            
            
        }else{
             cola.setSiguiente(nuevo);
             nuevo.setAnterior(cabeza);
             cola=nuevo;
         }
    }
    
    public Alumno obtenerCabeza(){
        return cabeza;
    }
    
    public Alumno obtenerPosicion(int pocision){
        Alumno actual=cabeza;
        int index=1;
        while(actual!=null && index<pocision){
            actual=actual.getSiguiente();
            index++;
        }
        return actual;
    }
    public void mostrarlista(){
        Alumno actual=cabeza;
        while (actual!=null) {
            System.out.println(actual.getNombre());
            actual=actual.getSiguiente();
            
        }
    }
}
