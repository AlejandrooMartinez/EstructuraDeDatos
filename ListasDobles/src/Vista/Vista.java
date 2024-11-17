
package Vista;

import java.util.Scanner;


public class Vista {
    private Scanner leer=new Scanner(System.in);
    
    public void mostrarMenu(){
        System.out.println("Seleccionar una opcion\n");
        System.out.println("MENU ");
        System.out.println("1. AGREGAR ELEMENTOS AL FINAL");
        System.out.println("2. AGREGAR AL INICIO DE LA FILA");
        System.out.println("3. ELIMINAR ELEMENTO");
        System.out.println("4. BUSCAR DATO");
        System.out.println("0. SALIR");
    }
    public int obtenerOpcion(){
        return leer.nextInt();
    }
    
    public int obtenerNumero(String mensaje){
        System.out.println(mensaje);
        
        return leer.nextInt();
    }

    
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
