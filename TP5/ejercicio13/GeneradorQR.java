public class GeneradorQR {

    // Dependencia de creación: crea un CodigoQR dentro del método
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigoQR = new CodigoQR(valor, usuario);
        System.out.println("QR generado: " + codigoQR);
    }
}
