package ejercicio2;

public class Ejercicio2Main {
    public static void main(String[] args) {
        // Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Sarmiento");

        // Crear autores
        Autor a1 = new Autor("A001", "Gabriel García Márquez", "Colombiano");
        Autor a2 = new Autor("A002", "Julio Cortázar", "Argentino");
        Autor a3 = new Autor("A003", "Isabel Allende", "Chilena");

        // Agregar 5 libros
        biblioteca.agregarLibro("ISBN-001", "Cien Años de Soledad", 1967, a1);
        biblioteca.agregarLibro("ISBN-002", "Rayuela", 1963, a2);
        biblioteca.agregarLibro("ISBN-003", "La Casa de los Espíritus", 1982, a3);
        biblioteca.agregarLibro("ISBN-004", "Final del Juego", 1956, a2);
        biblioteca.agregarLibro("ISBN-005", "El Amor en los Tiempos del Cólera", 1985, a1);

        // Listar libros
        biblioteca.listarLibros();
        System.out.println();
        System.out.println("=========================================");
        
        // Buscar por ISBN
        System.out.println("\nBuscando libro con ISBN-003:");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("ISBN-003");
        if (encontrado != null) encontrado.mostrarInfo();

        System.out.println();
        System.out.println("=========================================");
        
        // Filtrar por año
        System.out.println("\nLibros publicados en 1963:");
        for (Libro l : biblioteca.filtrarLibrosPorAnio(1963))
            l.mostrarInfo();

        System.out.println();
        System.out.println("=========================================");
        
        // Eliminar libro
        System.out.println("\nEliminando libro ISBN-004...");
        biblioteca.eliminarLibro("ISBN-004");
        biblioteca.listarLibros();

        System.out.println();
        System.out.println("=========================================");
        
        // Mostrar cantidad total
        System.out.println("\nCantidad total de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());

        System.out.println();
        System.out.println("=========================================");
        // Mostrar autores disponibles
        biblioteca.mostrarAutoresDisponibles();
        
    }
}
