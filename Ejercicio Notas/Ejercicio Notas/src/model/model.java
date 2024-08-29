package model;

public class model {
    private int[][] calificaciones;
    private int numeroEstudiantes;
    private int numeroMaterias;

    public model(int numeroEstudiantes, int numeroMaterias) {
        this.numeroEstudiantes = numeroEstudiantes;
        this.numeroMaterias = numeroMaterias;
        calificaciones = new int[numeroEstudiantes][numeroMaterias];
    }

    public int[][] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int estudiante, int materia, int calificacion) {
        if (estudiante < 0 || estudiante >= numeroEstudiantes || materia < 0 || materia >= numeroMaterias) {
            throw new IllegalArgumentException("Índice fuera de los límites: estudiante = " + estudiante + ", materia = " + materia);
        }
        this.calificaciones[estudiante][materia] = calificacion;
    }

    public double calcularPromedioEstudiante(int estudiante) {
        if (estudiante < 0 || estudiante >= numeroEstudiantes) {
            throw new IllegalArgumentException("Índice de estudiante fuera de los límites: " + estudiante);
        }
        int suma = 0;
        for (int calificacion : calificaciones[estudiante]) {
            suma += calificacion;
        }
        return (double) suma / numeroMaterias;
    }

    public double calcularPromedioMateria(int materia) {
        if (materia < 0 || materia >= numeroMaterias) {
            throw new IllegalArgumentException("Índice de materia fuera de los límites: " + materia);
        }
        int suma = 0;
        for (int[] estudiante : calificaciones) {
            suma += estudiante[materia];
        }
        return (double) suma / numeroEstudiantes;
    }

    // Identificar al estudiante con el mayor promedio
    public int encontrarEstudianteConMayorPromedio() {
        double maxPromedio = -1;
        int indiceMayorPromedio = -1;
        for (int i = 0; i < numeroEstudiantes; i++) {
            double promedio = calcularPromedioEstudiante(i);
            if (promedio > maxPromedio) {
                maxPromedio = promedio;
                indiceMayorPromedio = i;
            }
        }
        return indiceMayorPromedio;
    }

    // Identificar al estudiante con el menor promedio
    public int encontrarEstudianteConMenorPromedio() {
        double minPromedio = Double.MAX_VALUE;
        int indiceMenorPromedio = -1;
        for (int i = 0; i < numeroEstudiantes; i++) {
            double promedio = calcularPromedioEstudiante(i);
            if (promedio < minPromedio) {
                minPromedio = promedio;
                indiceMenorPromedio = i;
            }
        }
        return indiceMenorPromedio;
    }

    // Identificar la materia con el mejor promedio
    public int encontrarMateriaConMejorPromedio() {
        double maxPromedio = -1;
        int indiceMejorPromedio = -1;
        for (int i = 0; i < numeroMaterias; i++) {
            double promedio = calcularPromedioMateria(i);
            if (promedio > maxPromedio) {
                maxPromedio = promedio;
                indiceMejorPromedio = i;
            }
        }
        return indiceMejorPromedio;
    }

    // Identificar la materia con el peor promedio
    public int encontrarMateriaConPeorPromedio() {
        double minPromedio = Double.MAX_VALUE;
        int indicePeorPromedio = -1;
        for (int i = 0; i < numeroMaterias; i++) {
            double promedio = calcularPromedioMateria(i);
            if (promedio < minPromedio) {
                minPromedio = promedio;
                indicePeorPromedio = i;
            }
        }
        return indicePeorPromedio;
    }

    // Mostrar un reporte completo
    public void mostrarReporteCompleto() {
        System.out.println("Reporte Completo de Calificaciones:");
        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.println("Estudiante " + i + ":");
            for (int j = 0; j < numeroMaterias; j++) {
                System.out.println("  Materia " + j + ": " + calificaciones[i][j]);
            }
            System.out.println("  Promedio: " + calcularPromedioEstudiante(i));
        }

        for (int j = 0; j < numeroMaterias; j++) {
            System.out.println("Promedio Materia " + j + ": " + calcularPromedioMateria(j));
        }

        int mejorEstudiante = encontrarEstudianteConMayorPromedio();
        int peorEstudiante = encontrarEstudianteConMenorPromedio();
        int mejorMateria = encontrarMateriaConMejorPromedio();
        int peorMateria = encontrarMateriaConPeorPromedio();

        System.out.println("Estudiante con el mejor promedio: " + mejorEstudiante);
        System.out.println("Estudiante con el peor promedio: " + peorEstudiante);
        System.out.println("Materia con el mejor promedio: " + mejorMateria);
        System.out.println("Materia con el peor promedio: " + peorMateria);
    }
}
