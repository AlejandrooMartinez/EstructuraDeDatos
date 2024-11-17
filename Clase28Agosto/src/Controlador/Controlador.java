
package Controlador;

import Modelo.ListaEnlazada;
import Modelo.Prioridad;
import Modelo.Tarea;
import Modelo.TareaPersonal;
import Modelo.TareaTrabajo;
import Vista.Vista;

public class Controlador {
    private ListaEnlazada listaTareas;
    private Vista vista;

    public Controlador(ListaEnlazada milista, Vista mivista) {
        this.listaTareas = milista;
        this.vista = mivista;
    }
    public void iniciar(){
        int opcion;
        do {
            opcion=vista.mostrarmenu();
            switch(opcion){
                case 1:
                    String Nombre=vista.pedirNombre();
                    String Descripcion= vista.pedirDescripcion();
                    TareaPersonal TareaAux=new TareaPersonal(Nombre, Descripcion);
                    listaTareas.añadirtarea(TareaAux);
                    System.out.print("Tarea Personal Añadida");
                    break;
                    
                case 2:
                    
                    String NombreTrabajo=vista.pedirNombre();
                    String DescripcionTrabajo= vista.pedirDescripcion();
                    String Proyecto=vista.pedirProyectoAsociado();
                    TareaTrabajo tareaTrabajo=new TareaTrabajo(Proyecto, NombreTrabajo, DescripcionTrabajo);
                    listaTareas.añadirtarea(tareaTrabajo);
                    System.out.print("Tarea Trabajo Añadida");
                    break;
                    
                case 3:
                    vista.mostrarlista(listaTareas.getcabeza());
                    int posicion=vista.pedirPosicion();
                    Tarea actual=listaTareas.getcabeza();
                    for (int i = 1; i < posicion && actual !=null; i++) {
                        actual=actual.getSiguiente();
                    }
                    if (actual instanceof Prioridad) {
                        int prioridad = vista.pedirPrioridad();
                        ((Prioridad)actual).establePrioridad(prioridad);
                        System.out.println("Prioridad Asignada");
                    }else{
                        System.out.println("La tarea seleccionada no tiene prioridad asignable");
                    }
                    break;
                    case 4:
                         vista.mostrarlista(listaTareas.getcabeza());
                         break;
                         
                    case 5:
                        System.out.println("Saliendo del programa");
                        System.exit(0);
                        
                    default:
                        System.out.println("Opcion invalida intente otra vez");
            }
            
        } while (true);
    }
    
    
}
