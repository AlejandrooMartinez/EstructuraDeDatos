package view;

import java.util.Scanner;

public class view {
    Scanner leer = new Scanner(System.in);

    public int solicitarNumero(String mensaje) {
        System.out.println(mensaje);
        return leer.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarCalificaciones(int[][] calificaciones) {
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print(calificaciones[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void mostrarPromedioEstudiante(int estudiante, double promedio) {
        System.out.println("Promedio del estudiante " + (estudiante + 1) + ": " + promedio);
    }

    public void mostrarPromedioMateria(int materia, double promedio) {
        System.out.println("Promedio de la materia " + (materia + 1) + ": " + promedio);
    }

    // Mostrar estudiante con mayor promedio
    public void mostrarEstudianteConMayorPromedio(int estudiante, double promedio) {
        System.out.println("Estudiante con el mayor promedio es el Estudiante " + (estudiante + 1) + " con un promedio de: " + promedio);
    }

    // Mostrar estudiante con menor promedio
    public void mostrarEstudianteConMenorPromedio(int estudiante, double promedio) {
        System.out.println("Estudiante con el menor promedio es el Estudiante " + (estudiante + 1) + " con un promedio de: " + promedio);
    }

    // Mostrar materia con mejor promedio
    public void mostrarMateriaConMejorPromedio(int materia, double promedio) {
        System.out.println("Materia con el mejor promedio es la Materia " + (materia + 1) + " con un promedio de: " + promedio);
    }

    // Mostrar materia con peor promedio
    public void mostrarMateriaConPeorPromedio(int materia, double promedio) {
        System.out.println("Materia con el peor promedio es la Materia " + (materia + 1) + " con un promedio de: " + promedio);
    }

    // Solicitar nueva calificación para actualizar
    public int solicitarCalificacion(String mensaje) {
        System.out.println(mensaje);
        return leer.nextInt();
    }

    // Mostrar el reporte completo de calificaciones y promedios
    public void mostrarReporteCompleto(String reporte) {
        System.out.println(reporte);
    }
}
