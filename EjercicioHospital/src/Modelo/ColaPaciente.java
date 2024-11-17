
package Modelo;

public class ColaPaciente {
    private Nodo primero,ultimo;

    public ColaPaciente() {
        this.primero = null;
        this.ultimo = null;
    }
    
    public void encolar(String Nombre, int nivel){
        Nodo nuevoNodo=new Nodo(Nombre, nivel);
        if (ultimo==null) {
            primero=nuevoNodo;
            ultimo=nuevoNodo;
        }else{
            ultimo.siguiente=nuevoNodo;
            ultimo=nuevoNodo;
        }
    }
    
    public Nodo desencolar(){
        if (ultimo==null) {
            return null;
        }
        Nodo Auxiliar=primero;
        if (primero==null) {
            ultimo=null;
            
        }
        return Auxiliar;
        
    }
    
    public Nodo verPrimero(){
        return primero=null;
    }
    
    public boolean esVacia(){
        return primero==null;
        
    }
    public int contar(){
        int contador=0;
        Nodo auxiliar=primero;
        while(auxiliar != null){
            contador++;
            auxiliar=auxiliar.siguiente;
        }
        return contador;
    }
    
    
}
