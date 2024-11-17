package Modelo;

public class Pilaa {

    private Nodo cima;
    int size;

    public Pilaa() {
        cima = null;
        this.size = 0;
    }

    public boolean pilaVacia() {
        return cima == null;
    }

    public void apilar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (pilaVacia()) {
            cima = nuevoNodo;  
        } else {
            if (dato==cima.dato+1) {
            nuevoNodo.siguiente = cima;
            cima = nuevoNodo;
            }
            
        }
        size++;
    }

    public int desapilar() {  // Eliminar el parámetro `dato` porque no es necesario
        if (pilaVacia()) {
            throw new RuntimeException("Pila Vacia");
        }
        int valor = cima.dato;
        cima = cima.siguiente;
        size--;  // Disminuye el tamaño de la pila al desapilar
        return valor;
    }

    public void mostrarPila() {
        if (pilaVacia()) {
            System.out.println("La pila está vacía");
        } else {
            Nodo actual = cima;
            while (actual != null) {
                System.out.println(actual.dato);
                actual = actual.siguiente;
            }
        }
    }

    // Método para mostrar el tope o cima de la pila
    public int ultimo() {
        if (pilaVacia()) {
            throw new RuntimeException("Pila vacía");  // Corregido: lanzar una excepción en lugar de imprimir
        }
        return cima.dato;
    }
}
