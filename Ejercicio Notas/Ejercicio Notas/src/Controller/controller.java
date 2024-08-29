package Controller;

import model.model;
import view.view;

public class controller {
    private model modelo;
    private view vista;

    public controller(model modelo, view vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        int numeroEstudiantes = vista.solicitarNumero("Ingrese el número de estudiantes");
        int numeroMaterias = vista.solicitarNumero("Ingrese el número de materias");

        modelo = new model(numeroEstudiantes, numeroMaterias);

        for (int i = 0; i < numeroEstudiantes; i++) {
            for (int j = 0; j < numeroMaterias; j++) {
                int calificacion = vista.solicitarNumero("Ingrese la calificación del estudiante " + (i + 1) + " para la materia " + (j + 1));
                modelo.setCalificaciones(i, j, calificacion);
            }
        }

        vista.mostrarCalificaciones(modelo.getCalificaciones());

        for (int i = 0; i < numeroEstudiantes; i++) {
            double promedioEstudiante = modelo.calcularPromedioEstudiante(i);
            vista.mostrarPromedioEstudiante(i, promedioEstudiante);
        }

        for (int j = 0; j < numeroMaterias; j++) {
            double promedioMateria = modelo.calcularPromedioMateria(j);
            vista.mostrarPromedioMateria(j, promedioMateria);
        }

        // Mostrar el estudiante con el mayor y menor promedio general
        int estudianteConMayorPromedio = modelo.encontrarEstudianteConMayorPromedio();
        double mayorPromedio = modelo.calcularPromedioEstudiante(estudianteConMayorPromedio);
        vista.mostrarEstudianteConMayorPromedio(estudianteConMayorPromedio, mayorPromedio);

        int estudianteConMenorPromedio = modelo.encontrarEstudianteConMenorPromedio();
        double menorPromedio = modelo.calcularPromedioEstudiante(estudianteConMenorPromedio);
        vista.mostrarEstudianteConMenorPromedio(estudianteConMenorPromedio, menorPromedio);

        // Mostrar la materia con el mejor y peor promedio
        int materiaConMejorPromedio = modelo.encontrarMateriaConMejorPromedio();
        double mejorPromedioMateria = modelo.calcularPromedioMateria(materiaConMejorPromedio);
        vista.mostrarMateriaConMejorPromedio(materiaConMejorPromedio, mejorPromedioMateria);

        int materiaConPeorPromedio = modelo.encontrarMateriaConPeorPromedio();
        double peorPromedioMateria = modelo.calcularPromedioMateria(materiaConPeorPromedio);
        vista.mostrarMateriaConPeorPromedio(materiaConPeorPromedio, peorPromedioMateria);

        // Permitir al usuario actualizar una calificación
        int estudianteActualizar = vista.solicitarNumero("Ingrese el número del estudiante que desea actualizar (1-" + numeroEstudiantes + ")") - 1;
        int materiaActualizar = vista.solicitarNumero("Ingrese el número de la materia que desea actualizar (1-" + numeroMaterias + ")") - 1;
        int nuevaCalificacion = vista.solicitarNumero("Ingrese la nueva calificación para el estudiante " + (estudianteActualizar + 1) + " en la materia " + (materiaActualizar + 1));
        modelo.setCalificaciones(estudianteActualizar, materiaActualizar, nuevaCalificacion);

        // Mostrar el reporte completo
        StringBuilder reporteCompleto = new StringBuilder();
        reporteCompleto.append("Reporte Completo de Calificaciones:\n");

        for (int i = 0; i < numeroEstudiantes; i++) {
            reporteCompleto.append("Estudiante ").append(i + 1).append(":\n");
            for (int j = 0; j < numeroMaterias; j++) {
                reporteCompleto.append("  Materia ").append(j + 1).append(": ").append(modelo.getCalificaciones()[i][j]).append("\n");
            }
            reporteCompleto.append("  Promedio: ").append(modelo.calcularPromedioEstudiante(i)).append("\n");
        }

        for (int j = 0; j < numeroMaterias; j++) {
            reporteCompleto.append("Promedio Materia ").append(j + 1).append(": ").append(modelo.calcularPromedioMateria(j)).append("\n");
        }

        reporteCompleto.append("Estudiante con el mejor promedio: Estudiante ").append(estudianteConMayorPromedio + 1).append("\n");
        reporteCompleto.append("Estudiante con el peor promedio: Estudiante ").append(estudianteConMenorPromedio + 1).append("\n");
        reporteCompleto.append("Materia con el mejor promedio: Materia ").append(materiaConMejorPromedio + 1).append("\n");
        reporteCompleto.append("Materia con el peor promedio: Materia ").append(materiaConPeorPromedio + 1).append("\n");

        vista.mostrarReporteCompleto(reporteCompleto.toString());
    }
}
