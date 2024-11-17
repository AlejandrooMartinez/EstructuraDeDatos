
package Modelo;


public class TareaTrabajo extends Tarea implements Prioridad{
    
    private int prioridad;
    private String ProyectoAsociado;

    public TareaTrabajo( String ProyectoAsociado, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.prioridad = 0;
        this.ProyectoAsociado = ProyectoAsociado;
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
        return "Tarea de Trabajo: "+ProyectoAsociado;
    }
}
