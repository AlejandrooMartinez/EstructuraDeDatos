package Modelo;


    public abstract class Tarea{
        protected String nombre;
        protected String descripcion;
        protected Tarea siguiente;
        
        
        public Tarea(String nombre, String descripcion){
            this.nombre=nombre;
            this.descripcion=descripcion;
            this.siguiente=null;
        }
        
        public abstract String obtenerTipoTarea();

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Tarea getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Tarea siguiente) {
        this.siguiente = siguiente;
    }
        
        
        
    }
