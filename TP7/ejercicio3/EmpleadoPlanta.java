package ejercicio3;

public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private double adicionalPorAntiguedad;

    public EmpleadoPlanta(String nombre, double sueldoBase, double adicionalPorAntiguedad) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.adicionalPorAntiguedad = adicionalPorAntiguedad;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + adicionalPorAntiguedad;
    }
}
