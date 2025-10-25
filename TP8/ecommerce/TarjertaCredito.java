package ecommerce;
public class TarjetaCredito implements PagoConDescuento {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " con Tarjeta de Crédito.");
    }

    @Override
    public double aplicarDescuento(double monto) {
        double total = monto * 0.95;
        System.out.println("Descuento aplicado: 5%");
        return total;
    }
}
