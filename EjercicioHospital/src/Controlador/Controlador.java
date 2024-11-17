
package Controlador;

import Modelo.ColaPaciente;


public class Controlador {
    private ColaPaciente colaurgencias,colaemergencia,colanourgencia;
    
    public Controlador(){

        colaurgencias=new ColaPaciente();
        colaemergencia=new ColaPaciente();
        colanourgencia=new ColaPaciente();
    }
    
    public void registrarpaciente(String nombre,int nivel){
        switch (nivel) {
            case 1:
                colaemergencia.encolar(nombre,nivel);
                System.out.println("Paciente "+nombre+" registrado");
                break;
            case 2:
                colaemergencia.encolar(nombre, nivel);
                System.out.println("Paciente "+nombre+" registrado");
                break;
            case 3:
                colanourgencia.encolar(nombre, nivel);
                System.out.println("Paciente "+nombre+" registrado");
                break;    
            default:
                System.out.println("Nivel Incorrecto");
        }
    }
    
    public void atenderPaciente(){
        
    }
}
