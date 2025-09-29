public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco de Córdoba", "30-12345678-9");
        Cliente cliente = new Cliente("Juan Carlos Jiménez", "44556677");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9876-5432", "12/28", cliente, banco);

        System.out.println(tarjeta);
        System.out.println("El cliente de la tarjeta es: " + cliente.getNombre());
        System.out.println("El banco de la tarjeta es: " + tarjeta.getBanco().getNombre());
    }
}
