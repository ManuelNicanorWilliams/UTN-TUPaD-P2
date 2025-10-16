package ejercicio2;

public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public Autor getAutor() { return autor; }

    public void mostrarInfo() {
        System.out.printf("Libro[ISBN=%s, Título=%s, Año=%d, Autor=%s]%n",
                isbn, titulo, anioPublicacion, autor);
    }

    @Override
    public String toString() {
        return String.format("%s - %s (%d, ISBN: %s)", titulo, autor.getNombre(), anioPublicacion, isbn);
    }
}
