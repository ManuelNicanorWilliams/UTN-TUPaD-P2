package ejercicio2;

import java.util.*;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    public void listarLibros() {
        System.out.println("--- Libros en la biblioteca: " + nombre + " (" + libros.size() + ") ---");
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros)
            if (l.getIsbn().equals(isbn))
                return l;
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        Iterator<Libro> it = libros.iterator();
        while (it.hasNext()) {
            if (it.next().getIsbn().equals(isbn)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro l : libros)
            if (l.getAnioPublicacion() == anio)
                resultado.add(l);
        return resultado;
    }

    public void mostrarAutoresDisponibles() {
        Set<Autor> autores = new LinkedHashSet<>();
        for (Libro l : libros)
            autores.add(l.getAutor());

        System.out.println("--- Autores disponibles en la biblioteca ---");
        for (Autor a : autores)
            a.mostrarInfo();
    }
}
