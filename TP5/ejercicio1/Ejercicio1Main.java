public class Main {
    public static void main(String[] args) {
        Foto foto = new Foto("foto123.jpg", "JPG");
        Titular titular = new Titular("Juan Doe", "12345678");
        Pasaporte pasaporte = new Pasaporte("A001", "2025-01-01", foto, titular);

        System.out.println(pasaporte);
        System.out.println("Titular vinculado: " + titular.getPasaporte().getNumero());
    }
