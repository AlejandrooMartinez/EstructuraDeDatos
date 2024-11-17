
package listasimple;


public class ListaSimple {

   
    public static void main(String[] args) {
        ListaSimplee listaSimplee=new ListaSimplee();
        listaSimplee.agregar(3);
        listaSimplee.agregar(80);
        listaSimplee.agregar(15);
        System.out.println("Lista despues de agregar elemento");
        listaSimplee.mostrar();
        
        listaSimplee.eliminar();;
        System.out.println("Lista despues de eliminar elemento");
        listaSimplee.mostrar();
    }
    
}
