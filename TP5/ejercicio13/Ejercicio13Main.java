public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("María López", "maria@example.com");
        GeneradorQR generador = new GeneradorQR();

        generador.generar("QR123456789", usuario); // crea el QR dentro del método
    }
}
