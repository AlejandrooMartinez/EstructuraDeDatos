
package listasimple;

public class ListaSimplee {
    private Nodo cabeza;
    
    public ListaSimplee(){
    this.cabeza=null;
    
}
    
    public void agregar(int valor){
        Nodo NuevoNodo=new Nodo(valor);
        
        if (cabeza==null) {
            cabeza=NuevoNodo;
        }else{
            Nodo temp=cabeza;
            while(temp.siguiente!=null){
                temp=temp.siguiente;
            }
            temp.siguiente=NuevoNodo;
        }
    }
    public void eliminar(){
        if (cabeza!=null) {
            cabeza=cabeza.siguiente;
        }else{
            System.out.println("Lista Vacía");
        }
        
        
    }
    
    public void mostrar(){
        Nodo temp=cabeza;
        while(temp!=null){
            System.out.print(temp.dato+" -> ");
            temp=temp.siguiente;
        }
        System.out.println("Null");
    }
}
