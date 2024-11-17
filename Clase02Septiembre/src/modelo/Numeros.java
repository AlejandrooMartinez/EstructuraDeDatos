
package modelo;

public class Numeros {
    private int valor;
    private Numeros siguiente;

    public Numeros(int valor) {
        this.valor = valor;
        
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Numeros getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Numeros siguiente) {
        this.siguiente = siguiente;
    }
    
}
