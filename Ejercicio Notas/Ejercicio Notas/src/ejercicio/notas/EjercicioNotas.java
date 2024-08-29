/*  
Fredy Alejandro Martinez Gonzalez
Estructura de Datos
Agosto 2024
*/

package ejercicio.notas;

import Controller.controller;
import model.model;
import view.view;

public class EjercicioNotas {

    public static void main(String[] args) {
        
        view vista = new view();
        controller controlador = new controller(new model(0, 0), vista);
        controlador.iniciar(); 
    }
    
}
