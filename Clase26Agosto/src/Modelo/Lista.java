
package Modelo;

public class Lista {
    private Nodo cabeza;
    
    public Lista(){
        this.cabeza=null;
    }
    public void añadirCliente(String Nombre,String documento, String Servicio){
        Nodo nuevoNodo=new Nodo (Nombre,documento,Servicio);
        if (cabeza==null) {
            cabeza=nuevoNodo;
        } else {
            Nodo actual=cabeza;
            while(actual.getsiguiente()!=null){
                actual=actual.getsiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }
    public Nodo atenderCliente(){
        if (cabeza==null) {
            return null;
        }
        Nodo clienteAtendido=cabeza;
        cabeza=cabeza.getsiguiente();
        return clienteAtendido;
    }
    public Nodo getCabeza(){
        return cabeza;
    }
    
}
