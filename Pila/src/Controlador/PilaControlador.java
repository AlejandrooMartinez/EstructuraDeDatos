/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Pilaa;
import Vista.VistaPila;

/**
 *
 * @author fredy
 */
public class PilaControlador {
    private VistaPila vista;
    private Pilaa pila;

    public PilaControlador(VistaPila vista, Pilaa pila) {
        this.vista = vista;
        this.pila = pila;
    }
    
    public void iniciar(){
         boolean continuar=true;
         
         while(continuar){
             int opcion = vista.mostrarMenu();
             
             switch (opcion) {
                 case 1:
                     int numero=vista.pedirNumero();
                     pila.apilar(numero);
                     vista.mostrarMensaje("Numero apilado correctamente");
                     break;
                     
                 case 2:
                     int quitar=pila.desapilar();
                     
                     vista.mostrarMensaje("Numero desapilado "+quitar);
                     break;
                 case 3:
                     int cima=pila.ultimo();
                    vista.mostrarMensaje("Ultimo dato de la pila "+cima);
                    break;
                 case 4:
                 pila.mostrarPila();
                 break;
                 case 5:
                     continuar=false;
                     vista.mostrarMensaje("Saliendo");
                     break;
                 default:
                     vista.mostrarMensaje("Opcion invalida");
                     break;
             }
         }
    }
}
