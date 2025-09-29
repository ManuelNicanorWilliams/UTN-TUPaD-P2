public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Gabriel García Márquez", "Colombiana");
        Editorial editorial = new Editorial("Editorial Sudamericana", "Buenos Aires");
        Libro libro = new Libro("Cien Años de Soledad", "978-987-566-1234", autor, editorial);

        System.out.println(libro);
        System.out.println("El autor del libro es: " + libro.getAutor().getNombre());
        System.out.println("La editorial del libro es: " + libro.getEditorial().getNombre());
    }
}
