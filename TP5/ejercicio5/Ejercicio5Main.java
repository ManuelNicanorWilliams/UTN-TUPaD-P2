public class Main {
    public static void main(String[] args) {
        PlacaMadre placa = new PlacaMadre("ASUS ROG STRIX", "Z590");
        Propietario propietario = new Propietario("Pepe Peréz", "33445566");
        Computadora pc = new Computadora("Dell", "SN12345", placa, propietario);

        System.out.println(pc);
        System.out.println("Propietario de la computadora: " + propietario.getNombre());
        System.out.println("Placa madre instalada: " + pc.getPlacaMadre().getModelo());
    }
}
