
package Modelo;

public class Nodo {
    private String nombreCliente;
    private String documentoCliente;
    private String servicio;
    private Nodo siguiente;

    public Nodo(String nombre, String documento,String servicio) {
        this.nombreCliente=nombre;
        this.documentoCliente=documento;
        this.servicio=servicio;
        this.siguiente = null;
    }
    
    public String getNombreCliente(){
        return nombreCliente;
    }
    
    public String getdocumentoCliente(){
        return documentoCliente;
    }
    public String getservicio(){
        return servicio;
        
    }
    public Nodo getsiguiente(){
        return siguiente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
 
}
