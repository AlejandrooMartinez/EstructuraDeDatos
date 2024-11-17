/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author fredy
 */
public class VistaPila {
    private Scanner entrada;
    
    public VistaPila(){
        entrada=new Scanner(System.in);
    }
    
    public int mostrarMenu(){
        System.out.println("Menu pila");
        System.out.println("[1] Apilar");
        System.out.println("[2] Desapilar");
        System.out.println("[3] Ver cima");
        System.out.println("[4] Ver Pila");
        System.out.println("[5] Salir");
        return entrada.nextInt();
    }
    
    public int pedirNumero(){
        System.out.println("Ingrese el dato");
        return entrada.nextInt();
    }
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
    public void mostrarNumero(int numero){
        System.out.println("El numero es: "+numero);
    }
}
