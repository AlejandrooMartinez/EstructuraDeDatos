package modelo;

import java.util.Random;

public class ListaNumeros {
    private Numeros cabeza;

    public ListaNumeros() {
        this.cabeza = null;
    }

    public void agregarNumero(int valor) {
        Numeros nuevo = new Numeros(valor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Numeros actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public int sacarAleatorio() {
        if (cabeza == null) {
            throw new IllegalStateException("No hay números disponibles");
        }

        Random random = new Random();
        int indiceAleatorio = random.nextInt(contarNumeros());
        Numeros actual = cabeza;
        Numeros anterior = null;

        for (int i = 0; i < indiceAleatorio; i++) {
            anterior = actual;
            actual = actual.getSiguiente();
        }

        int valor = actual.getValor();

        if (anterior == null) {
            cabeza = actual.getSiguiente();
        } else {
            anterior.setSiguiente(actual.getSiguiente());
        }

        return valor;
    }

    public int contarNumeros() {
        int conteo = 0;
        Numeros actual = cabeza;
        while (actual != null) {
            conteo++;
            actual = actual.getSiguiente();
        }
        return conteo;
    }
}
