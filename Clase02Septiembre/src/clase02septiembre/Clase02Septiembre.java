package clase02septiembre;

import controlador.controlador;
import java.util.Scanner;
import modelo.ListaDoble;
import modelo.ListaNumeros;
import vista.Vista;

public class Clase02Septiembre {

    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        
        
        ListaDoble lista2 = new ListaDoble();
        Vista vista = new Vista();
        ListaNumeros lista = new ListaNumeros();
        controlador controlador = new controlador(lista, vista, lista2);  // Orden corregido
        
        
        System.out.println("¿Cuántos alumnos quieres agregar?");
        int cantidad = leer.nextInt();
        leer.nextLine();
        
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce el nombre del alumno:");
            String nombre = leer.nextLine();
            lista2.agregarAlumno(nombre);
        }
        
        controlador.iniciar();
    }
}
