
package Modelo;


public class ListaEnlazada {
    private  Tarea cabeza;
    
    public ListaEnlazada(){
        this.cabeza=null;
    }
    
    public void añadirtarea(Tarea tarea){
        if (cabeza==null) {
            cabeza=tarea;
        }else{
            Tarea actual=cabeza;
            while(actual.getSiguiente()!=null){
                actual=actual.getSiguiente();
            }
            actual.setSiguiente(tarea);
        }
    }
    
    public Tarea getcabeza(){
        return cabeza;
    }
    
    
}
