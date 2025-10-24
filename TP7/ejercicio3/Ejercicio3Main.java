package ejercicio3;

public class Ejercicio3Main {
     public static void main(String[] args) {
        Empleado[] empleados = {
            new EmpleadoPlanta("Ana", 50000, 2000),
            new EmpleadoTemporal("Luis", 80, 600),
            new EmpleadoPlanta("María", 62000, 3000)
        };

        for (Empleado e : empleados) {
            System.out.printf("%s -> sueldo = %.2f", e.getNombre(), e.calcularSueldo());
            if (e instanceof EmpleadoPlanta) {
                System.out.print(" (Planta)");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.print(" (Temporal)");
            }
            System.out.println();
        }
    }
}
