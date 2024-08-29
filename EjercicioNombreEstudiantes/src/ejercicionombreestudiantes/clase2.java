
package ejercicionombreestudiantes;


public class clase2 {
    String Nombre;
    String Apellido;
    String Carrera;
    int edad;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public clase2(String Nombre, String Apellido, String Carrera, int edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Carrera = Carrera;
        this.edad = edad;
    }
    public String toString(){
        return Nombre+ " "+Apellido+" "+" "+ Carrera+ " "+edad;
        
    }
    


    
    
}
