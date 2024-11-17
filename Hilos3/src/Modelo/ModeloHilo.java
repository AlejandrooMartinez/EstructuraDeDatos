/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fredy
 */
public class ModeloHilo {
    public void ejecutarHilo(int duracion,String nombreHilo,Runnable actualizar){
        new Thread(()->{
            try {
                for (int i = 0; i < duracion; i++) {
                    Thread.sleep(1000);
                    actualizar.run();
                }
             System.out.println(nombreHilo+"Finalizado");
            
        }catch (Exception e) {
                    e.printStackTrace();
                    }
        
        }).start();
    }
            
}
