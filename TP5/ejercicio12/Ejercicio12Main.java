public class Main {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Carlos Pérez", "20-12345678-9");
        Impuesto impuesto = new Impuesto(15000.0, contribuyente);

        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto); // dependencia de uso
    }
}
