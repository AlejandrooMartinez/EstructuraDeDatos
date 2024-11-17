package Controlador;

import Modelo.ModeloHilo;
import Vista.VistaHilo;
import Vista.VistaEjecucion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {

    private  ModeloHilo modelo;
    private  VistaHilo vistaHilo;
    private  VistaEjecucion vistaEjecucion;

    public Controlador(ModeloHilo modelo, VistaHilo vistaHilo, VistaEjecucion vistaEjecucion) {
        this.modelo = modelo;
        this.vistaHilo = vistaHilo;
        this.vistaEjecucion = vistaEjecucion;
        
        // Añadir ActionListener al botón de inicio
        this.vistaHilo.getBotonIniciar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarHilos();
            }
        });
    }
    
    private void iniciarHilos() {
        try {
            // Obtener duraciones desde los campos de texto
            int duracionHilo1 = Integer.parseInt(vistaHilo.getCampoHilo1().getText());
            int duracionHilo2 = Integer.parseInt(vistaHilo.getCampoHilo2().getText());
            int duracionHilo3 = Integer.parseInt(vistaHilo.getCampoHilo3().getText());

            // Crear tres hilos y ejecutarlos
            modelo.ejecutarHilo(duracionHilo1, "Hilo 1", () -> vistaEjecucion.actualizarContador(duracionHilo1));
            modelo.ejecutarHilo(duracionHilo2, "Hilo 2", () -> vistaEjecucion.actualizarContador(duracionHilo2));
            modelo.ejecutarHilo(duracionHilo3, "Hilo 3", () -> vistaEjecucion.actualizarContador(duracionHilo3));

        } catch (NumberFormatException ex) {
            System.out.println("Error: Ingrese un número válido en los campos de duración.");
        }
    }
}
