package proga2tp3.ejercicio1;

public class Estudiante {
 
    // Atributos:
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    // Constructores
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    // Método que muestra info del estudiante
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);    
    }

    // Método para subir la calificación
    public void subirCalificacion(double puntos) {
        if (puntos > 0) {
            calificacion += puntos;
            System.out.println("La calificación aumento a: " + calificacion);
        }
    }
    // Método para bajar la calificación
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) {
            calificacion = 0; // evita la calificación negativa
        }
         System.out.println("La calificación bajo a: " + calificacion);
    }
}
