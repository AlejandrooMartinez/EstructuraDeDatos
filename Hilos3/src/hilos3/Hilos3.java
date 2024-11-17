/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilos3;

/**
 *
 * @author fredy
 */


import Controlador.Controlador;
import Modelo.ModeloHilo;
import Vista.VistaHilo;
import Vista.VistaEjecucion;

public class Hilos3 {
    public static void main(String[] args) {
        // Crear instancias del modelo y las vistas
        ModeloHilo modelo = new ModeloHilo();
        VistaHilo vistaHilo = new VistaHilo();
        VistaEjecucion vistaEjecucion = new VistaEjecucion();

        // Crear el controlador e iniciar la aplicación
        Controlador controlador = new Controlador(modelo, vistaHilo, vistaEjecucion);
    }
}
