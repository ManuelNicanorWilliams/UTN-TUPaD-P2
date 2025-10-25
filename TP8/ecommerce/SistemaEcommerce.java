package ecommerce;
public class SistemaEcommerce {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Laura");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Queso", 15000));
        pedido.agregarProducto(new Producto("Aceitunas", 12000));

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        PagoConDescuento tarjeta = new TarjetaCredito();
        total = tarjeta.aplicarDescuento(total);
        tarjeta.procesarPago(total);

        pedido.cambiarEstado("Enviado");
    }
}
