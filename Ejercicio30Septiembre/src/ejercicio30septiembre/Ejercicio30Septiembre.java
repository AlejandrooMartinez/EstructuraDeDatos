/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio30septiembre;

import Controlador.controladorPila;
import Modelo.Pila;
import Modelo.validar;
import Vista.VistaPila;

/**
 *
 * @author fredy
 */
public class Ejercicio30Septiembre {

    public static void main(String[] args) {
        VistaPila vista =new VistaPila();
        validar validar= new validar();
        Pila pila=new Pila();   
        
        controladorPila controlador=new controladorPila(vista,validar);

        controlador.iniciar();
        
        
        
        
    }
    
}
