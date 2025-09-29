public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Salvo", "351-5551234");
        Mesa mesa = new Mesa(12, 4);
        Reserva reserva = new Reserva("2025-10-05", "20:30", cliente, mesa);

        System.out.println(reserva);
        System.out.println("Cliente de la reserva: " + reserva.getCliente().getNombre());
        System.out.println("Mesa reservada: " + reserva.getMesa().getNumero());
    }
}
