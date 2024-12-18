/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class TareaPersonal extends Tarea implements Prioridad{
    private int prioridad;

    public TareaPersonal(String nombre, String descripcion) {
        super(nombre, descripcion);
        this.prioridad = 0;
    }
    
    @Override
            
    public void establePrioridad(int prioridad){
        this.prioridad=prioridad;
    }
    
    @Override
    public int obternerPrioridad(){
        return prioridad;
    }
    
    @Override
    public String obtenerTipoTarea(){
        return "Tarea Personal";
    }        
    
    
}
