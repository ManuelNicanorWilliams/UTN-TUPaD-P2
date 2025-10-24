package ejercicio4;

public class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }

    // Nuevo método que cada subclase puede sobrescribir
    public String getTipo() {
        return "Animal genérico";
    }

    public void describirAnimal() {
        System.out.println("es " + getTipo() + " y se llama " + nombre + ".");
        hacerSonido();
    }
}
