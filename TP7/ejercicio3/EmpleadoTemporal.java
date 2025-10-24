package ejercicio3;

public class EmpleadoTemporal extends Empleado {
    private double horas;
    private double valorHora;

    public EmpleadoTemporal(String nombre, double horas, double valorHora) {
        super(nombre);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return horas * valorHora;
    }
}
