public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Sofía Ramírez", "sofia@example.com");
        FirmaDigital firma = new FirmaDigital("HASH12345", "2025-09-24", usuario);
        Documento doc = new Documento("Contrato", "Contenido del contrato...", firma);

        System.out.println(doc);
        System.out.println("Firmado por: " + doc.getFirma().getUsuario().getNombre());
    }
}
