
package Modelo;


public class Pila {
    Nodo Cima;

    public Pila() {
        this.Cima = null;
    }
    /**/
    public void apilar(char valor){
        Nodo nuevoNodo=new Nodo(valor);
        nuevoNodo.siguiente=Cima;
        Cima=nuevoNodo;
    }
    
    
    public boolean Esvacia(){
        return Cima==null;
    }
    
    public char desApilar(){
        if (Esvacia()) {
            System.out.println("Pila Vacia");
        }
        char valor=Cima.dato;
        Cima=Cima.siguiente;
        return valor;
    }
    
    public char verCima(){
        if (Esvacia()) {
            System.out.println("ESTA VACIA");
        }
        return Cima.dato;
    }
    
    
    
}
