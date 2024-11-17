
package controlador;

import Modelo.Lista;
import Modelo.Nodo;
import Vista.Vista;


public class controlador {
    private Lista lista;
    private Vista vista;
    
    public controlador(Lista milista, Vista miVista){
        this.lista=milista;
        this.vista=miVista;
    }
    
    public void iniciar(){
        int opcion;
        do{
            opcion=vista.mostrarMenu();
            switch(opcion){
                case 1:
                    String nombre=vista.pedirNombre();
                    String documento=vista.PedirDocumento();
                    int servicioOpcion=vista.seleccionarServicio();
                    
                    String Servicio= " ";
                    switch(servicioOpcion){
                        case 1:
                            Servicio= "Servicio al cliente";
                            break;
                            
                        case 2:
                            Servicio="Pagos de servicios";
                            break;
                            
                        case 3:
                            Servicio="Registro PQRS";
                            break;
                            
                        default:
                            System.out.println("OPCION INVALIDA");
                            Servicio= "Servicio al Cliente";
                            break;
                                    
                    }
                    
                    lista.añadirCliente(nombre, documento, Servicio);
                    
                    System.out.println("Cliente añadir a la lista de espera");
                    
                    break;
                    
                case 2:
                    Nodo ClienteAtendido=lista.atenderCliente();
                    vista.mostrarClienteAtendido(ClienteAtendido);
                    break;
                    
                case 3:
                    vista.mostrarListaEspera(lista.getCabeza());
                    break;
                    
                case 4:
                    System.out.println("SALIENDO DEL SISTEMA");
                    break;
                    
                default: 
                    System.out.println("Opcion Invalida, Intente otra vez");
            }
            
                
            
        }while(opcion != 4);
    }
}
