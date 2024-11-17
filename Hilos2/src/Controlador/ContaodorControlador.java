/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ContadorModelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.ContadorVista;

/**
 *
 * @author fredy
 */
public class ContaodorControlador {
   private ContadorModelo modelo; 
   private ContadorVista vista; 
   
   public ContaodorControlador(ContadorModelo model,ContadorVista view){
       this.modelo=model;
       this.vista=view;
       
       this.vista.agregarBoton(new Escuchar());
       
   }
   
   class Escuchar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vista.deshabilitar();
            Thread hilocontador = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100; i++) {
                        modelo.incrementar();
                        vista.establecertexto("contador" + modelo.obtenerContador());
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            });
            hilocontador.start();
        }
    }
}
