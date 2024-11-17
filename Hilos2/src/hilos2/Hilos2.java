/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilos2;

import Controlador.ContaodorControlador;
import Modelo.ContadorModelo;
import vista.ContadorVista;


public class Hilos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContadorModelo modelo=new ContadorModelo();
        ContadorVista vista=new ContadorVista();
        
        ContaodorControlador controlador=new ContaodorControlador(modelo, vista);
    }
    
}
