package proga2tp3.ejercicio5;

public class NaveEspacial {
    private String nombre;
    private double combustible;
    private final double LIMITE_COMBUSTIBLE = 100; // combustible máximo

    public NaveEspacial(String nombre, double combustible) {
        this.nombre = nombre;
        if (combustible <= LIMITE_COMBUSTIBLE && combustible >= 0) {
            this.combustible = combustible;
        } else {
            this.combustible = 0;
            System.out.println("Combustible inicial inválido. Se asigna 0.");
        }
    }

    // Método para despegar
    public void despegar() {
        if (combustible >= 10) { // despegar consume 10 unidades
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para despegar.");
        }
    }

    // Método para avanzar
    public void avanzar(double distancia) {
        double consumo = distancia * 0.5; // cada unidad de distancia consume 0.5 combustible
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    // Método para recargar combustible
    public void recargarCombustible(double cantidad) {
        if (cantidad < 0) {
            System.out.println(" No se puede recargar una cantidad negativa.");
            return;
        }

        if (combustible + cantidad > LIMITE_COMBUSTIBLE) {
            combustible = LIMITE_COMBUSTIBLE;
            System.out.println(nombre + " recargado al máximo: " + LIMITE_COMBUSTIBLE + " unidades.");
        } else {
            combustible += cantidad;
            System.out.println(nombre + " recargado. Combustible actual: " + combustible);
        }
    }

    // Mostrar estado de la nave
    public void mostrarEstado() {
        System.out.println("=== Estado de la nave ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + LIMITE_COMBUSTIBLE);
        System.out.println("=========================");
    }
}
