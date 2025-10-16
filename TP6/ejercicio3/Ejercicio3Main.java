package ejercicio3;

import java.util.Map;

public class Ejercicio3Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional");

        // Crear profesores
        Profesor p1 = new Profesor("P001", "Ana Pérez", "Matemática");
        Profesor p2 = new Profesor("P002", "Luis Gómez", "Informática");
        Profesor p3 = new Profesor("P003", "María López", "Física");

        // Crear cursos
        Curso c1 = new Curso("C100", "Inglés I");
        Curso c2 = new Curso("C101", "Programación II");
        Curso c3 = new Curso("C102", "Matemáticas I");
        Curso c4 = new Curso("C103", "Bases de Datos");
        Curso c5 = new Curso("C104", "Probabilidad y Estadística");

        // Agregar a la universidad
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // Asignar profesores a cursos
        uni.asignarProfesorACurso("C100", "P001");
        uni.asignarProfesorACurso("C101", "P002");
        uni.asignarProfesorACurso("C102", "P003");
        uni.asignarProfesorACurso("C103", "P002");
        uni.asignarProfesorACurso("C104", "P001");

        // Listar cursos y profesores
        System.out.println("\n--- Cursos y Profesores ---");
        uni.listarCursos();
        
        System.out.println();
        System.out.println("=========================================");
        
        System.out.println();
        uni.listarProfesores();

        System.out.println();
        System.out.println("=========================================");
        
        // Cambiar profesor de un curso
        System.out.println("\nCambiando profesor del curso C103 a P003...");
        uni.asignarProfesorACurso("C103", "P003");
        uni.listarCursos();
        System.out.println();
        p2.listarCursos();
        p3.listarCursos();

        System.out.println();
        System.out.println("=========================================");
        
        // Remover un curso
        System.out.println("\nEliminando curso C102...");
        uni.eliminarCurso("C102");
        uni.listarCursos();
        System.out.println();
        p3.listarCursos();

        System.out.println();
        System.out.println("=========================================");
        
        // Remover un profesor
        System.out.println("\nEliminando profesor P001...");
        uni.eliminarProfesor("P001");
        uni.listarProfesores();
        System.out.println("Cursos restantes (verificar profesor=null si correspondiera):");
        uni.listarCursos();

        System.out.println();
        System.out.println("=========================================");
        
        // Reporte de cantidad de cursos por profesor
        System.out.println("\n--- Reporte: cantidad de cursos por profesor ---");
        Map<String, Integer> reporte = uni.reporteCantidadCursosPorProfesor();
        for (Map.Entry<String, Integer> e : reporte.entrySet()) {
            System.out.printf("%s → %d%n", e.getKey(), e.getValue());
        }
    }
}
