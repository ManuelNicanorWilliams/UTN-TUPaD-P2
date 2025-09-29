public class Reproductor {

    // Dependencia de uso: recibe una Cancion como parámetro pero no la almacena
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() +
                           " - Artista: " + cancion.getArtista().getNombre());
    }
}
