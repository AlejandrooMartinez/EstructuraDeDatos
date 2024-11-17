
package Vista;

import Modelo.Nodo;
import java.util.Scanner;

    
public class Vista {
    Scanner leer = new Scanner(System.in);
    
    public int mostrarMenu(){
        System.out.println("SELECCIONE UNA OPCION: ");
        System.out.println("\nCentro de Servicio");
        System.out.println("1. Registro de Cliente");
        System.out.println("2. Eliminar Cliente");
        System.out.println("3. Mostrar Lista de Espera");
        System.out.println("4. Salir");
        
        return leer.nextInt();
    }
    
    public String pedirNombre(){
        System.out.println("Digite el nombre del cliente: ");
        leer.nextLine();
        return leer.nextLine();
    }
    
    public String PedirDocumento(){
        System.out.println("Ingrese el documento del Cliente");
        return leer.nextLine();
    }
    public int seleccionarServicio(){
        System.out.println("SELECCIONE UNA OPCION: ");
        System.out.println("\nCentro de Servicio");
        System.out.println("1. Atencion al Cliente");
        System.out.println("2. Pago servicios");
        System.out.println("3. Registro PQRS");
        return leer.nextInt();
    }
    
    public void mostrarClienteAtendido(Nodo cliente){
        if (cliente!=null) {
            System.out.println("Atendiendo a: " +cliente.getNombreCliente()+" -Servicio:"+cliente.getservicio());
        }else{
            System.out.println("No hay Clientes en espera");
        }
    }
    public void mostrarListaEspera(Nodo cabeza) {
    if (cabeza == null) {
        System.out.println("Lista Vacia");
    } else {
        Nodo actual = cabeza;
        System.out.println("Esta es la lista de espera: ");
        while (actual != null) {
            System.out.println("Nombre: " + actual.getNombreCliente() + " \nServicio: " + actual.getservicio() + " \nDocumento: " + actual.getdocumentoCliente());
            actual = actual.getsiguiente();  
        }
    }
}

    
}
