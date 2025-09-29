public class Calculadora {

    // Dependencia de uso: recibe un Impuesto como parámetro
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto para: " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto a pagar: $" + impuesto.getMonto());
    }
}
