
package Controlador;

import Modelo.ListaDoble;
import Vista.Vista;


public class controladorLista <T>{
   
    private ListaDoble<T>modelo;
   private Vista vista;

    public controladorLista(ListaDoble<T> modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
   
   public void iniciar(){
       int opcion;
       do{
           vista.mostrarMenu();
           opcion=vista.obtenerOpcion();
           obtenerNumero(opcion);
       }while(opcion!=0);
       
   }
   public void procesar(int opcion){
       switch(opcion){
           case 1:
               agregarAlFinal();
               break;
           case 2:
               agregarAlInicio();
                break;
           case 3:
               eliminar();
               break;
           case 4:
               buscar();
               break;
            case 0:
                System.out.println("Saliendo del programa");
                System.exit(0);
                break;
            default:
                vista.mostrarMensaje("OPCION INVALIDA");
                           
       }
   }
   private void agregarAlFinal(){
       T elemento= (T)Integer.valueOf(vista.obtenerNumero("Ingrese el elemento a agregar al final de la lista"));
       modelo.agregarAlFinal(elemento);
       vista.mostrarMensaje("Elemento agragado al final");
   }
   private void agregarAlInicio(){
       T elemento=(T)Integer.valueOf(vista.obtenerNumero("Ingrese el numero a agregar"));
       modelo.agragarAlInicio(elemento);
       vista.mostrarMensaje("Elemento agregado al inicio");
   }
   
   private void eliminar(){
       T elemento= (T)Integer.valueOf(vista.obtenerNumero("Ingrese que desea eliminar"));
       modelo.eliminar(elemento);
       vista.mostrarMensaje("Elemento eliminado");
   }
   private void buscar(){
       T elemento= (T)Integer.valueOf(vista.obtenerNumero("Ingrese que desea eliminar"));
       modelo.buscar(elemento);
       vista.mostrarMensaje("Elemento Encontrado");
   }
}
