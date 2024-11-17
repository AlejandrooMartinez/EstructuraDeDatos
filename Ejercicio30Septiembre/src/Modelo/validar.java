
package Modelo;


public class validar {
    private Pila pila;

    public validar() {
        pila = new Pila();
    }
    
    /*Metodo para validar*/
    public boolean esBalanceado(String Expresion){
        for (int i = 0; i < Expresion.length(); i++) {
            char caracter=Expresion.charAt(i);
            if (caracter =='(' || caracter =='{'||caracter =='['){
                pila.apilar(caracter);
            }
            
            if (caracter ==')' || caracter =='}'||caracter ==']') {
                if (pila.Esvacia()) {
                    return false;
                }
                char cima=pila.desApilar();
                if (!iguales(cima,caracter)) {
                    return false;
                }
            }
        }
        return pila.Esvacia();
    }
    /* Meto para validar si los parentesis son iguales*/
    public boolean iguales(char apertura,char cierre){
        return (apertura=='(' && cierre==')')||(apertura=='{' && cierre=='}')||(apertura=='[' && cierre==']');
    }
}
