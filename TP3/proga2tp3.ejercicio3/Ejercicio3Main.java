package proga2tp3.ejercicio3;

public class Ejercicio3Main {
    public static void main(String[] args) {
        // Crear un libro
        Libro miLibro = new Libro("Rayuela", "Julio Cortázar", 1963);

        // Mostrar info inicial
        System.out.println("Información inicial:");
        miLibro.mostrarInfo();

        // Intentar modificar con un año inválido
        System.out.println("\nIntentando modificar con un año inválido...");
        miLibro.setAñoPublicacion(-150);

        // Modificar con un año válido
        System.out.println("\nModificando con un año válido...");
        miLibro.setAñoPublicacion(1986);

        // Mostrar info final
        System.out.println("\nInformación final:");
        miLibro.mostrarInfo();
    }
}
