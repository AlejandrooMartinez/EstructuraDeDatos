/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Contolador.ControladorTareas;
import java.util.Scanner;

public class Vista {
    private ControladorTareas controlador;

    public Vista(ControladorTareas controlador) {
        this.controlador = controlador;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Sistema de Gestion de Tareas ---");
            System.out.println("1. Agregar Tarea General");
            System.out.println("2. Agregar Tarea Urgente");
            System.out.println("3. Agregar Tarea Comun");
            System.out.println("4. Mostrar Tareas");
            System.out.println("5. Gestionar Tarea Urgente");
            System.out.println("6. Gestionar Tarea Comun");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la descripción de la tarea general: ");
                    String descripcionGeneral = scanner.nextLine();
                    controlador.agregarTareaGeneral(descripcionGeneral);
                    break;
                case 2:
                    System.out.print("Ingrese la descripción de la tarea urgente: ");
                    String descripcionUrgente = scanner.nextLine();
                    controlador.agregarTareaUrgente(descripcionUrgente);
                    break;
                case 3:
                    System.out.print("Ingrese la descripción de la tarea común: ");
                    String descripcionComun = scanner.nextLine();
                    controlador.agregarTareaComun(descripcionComun);
                    break;
                case 4:
                    controlador.mostrarTareas();
                    break;
                case 5:
                    controlador.gestionarTareasUrgentes();
                    break;
                case 6:
                    controlador.gestionarTareasComunes();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
