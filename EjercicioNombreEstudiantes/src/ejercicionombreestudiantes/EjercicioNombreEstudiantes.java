package ejercicionombreestudiantes;

public class EjercicioNombreEstudiantes {

    public static void main(String[] args) {

        clase2[] estudiante = {
            new clase2(" Nombre: Alejandro", "Apellido: Martinez", "Carrera: Ing.Sistemas", 19),
            new clase2(" Nombre: Pedro", "Apellido: Suarez", "Carrera: Medicina", 17),
            new clase2(" Nombre: Camilo", "Apellido: Perez", "Carrera: Edu.Fisica", 23),};

        imprimir(estudiante);
    }


    public static void imprimir(clase2[] estudiante) {
        for (clase2 clase2 : estudiante) {

            System.out.println("Sus datos son:" + clase2);
        }
    }
}
