package Controlador;

import Modelo.validar;
import Vista.VistaPila;

public class controladorPila {

    private VistaPila vista;
    private validar validar;

    public controladorPila(VistaPila vista, validar validar) {
        this.vista = vista;
        this.validar = validar;
    }

    public void iniciar() {

        String expresion = vista.pedirExpresion();

        boolean balanceado = validar.esBalanceado(expresion);
        vista.resultados(balanceado);
        
        
    }
}
