/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Prioridad;
import Modelo.Tarea;
import java.util.Scanner;

public class Vista {

    Scanner leer = new Scanner(System.in);

    public int mostrarmenu() {
        System.out.print("BIENVENIDO A GESTION DE TAREAS\n");
        System.out.println("SELECCIONE UNA OPCION:");
        System.out.println("[1].Añadir Tarea Personal");
        System.out.println("[2].Añadir Tarea Trabajo");
        System.out.println("[3].Asignar Prioridad");
        System.out.println("[4].Mostrar Lista de Tareas");
        System.out.println("[5].Salir");

        return leer.nextInt();

    }

    public String pedirNombre() {
        System.out.print("Ingrese nombre de la tarea");
        leer.nextLine();
        return leer.nextLine();
    }

    public String pedirDescripcion() {
        System.out.print("Ingrese la descripcion de la tarea");
        leer.nextLine();
        return leer.nextLine();
    }

    public int pedirPrioridad() {
        System.out.print("Ingrese la prioridad de 1-5");
        leer.nextLine();
        return leer.nextInt();
    }

    public String pedirProyectoAsociado() {
        System.out.print("Ingrese el nombre del proyecto");

        return leer.nextLine();
    }

    public void mostrarlista(Tarea cabeza) {
        if (cabeza == null) {
            System.out.println("Lista Vacia");
        } else {
            Tarea actual = cabeza;
            System.out.println("Esta es la lista: ");
            while (actual != null) {

                String tipoTarea = actual.obtenerTipoTarea();

                System.out.println("Nombre: " + actual.getNombre() + " \nDescripcion: " + actual.getDescripcion() + "\nTipo de Tarea: " + tipoTarea);


                if (actual instanceof Prioridad) {
                    System.out.println("Prioridad: "+ ((Prioridad)actual).obternerPrioridad());
                }
                actual=actual.getSiguiente();
            }
        }
    }
    
    public int pedirPosicion(){
        System.out.println("Ingrese la prioridad de la tarea que desea asignar");
        return leer.nextInt();
    }
}
