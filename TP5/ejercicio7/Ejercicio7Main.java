public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("V8", "MTR-98765");
        Conductor conductor = new Conductor("Diego Fernández", "LIC-4455");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Hilux", motor, conductor);

        System.out.println(vehiculo);
        System.out.println("Conductor del vehículo: " + conductor.getNombre());
        System.out.println("Motor instalado: " + vehiculo.getMotor().getTipo());
    }
}
