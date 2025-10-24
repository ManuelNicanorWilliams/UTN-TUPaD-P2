package ejercicio2;

public abstract class Figura {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    public abstract double calcularArea();

    public void mostrarArea() {
        System.out.printf("%s: área = %.4f%n", nombre, calcularArea());
    }
}
