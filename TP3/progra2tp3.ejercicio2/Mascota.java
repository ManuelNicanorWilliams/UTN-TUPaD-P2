package proga2tp3.ejercicio2;

public class Mascota {
    
    private String nombre;
    private String especie;
    private int edad;

    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    } 
    
    // Método para mostrar la info de la mascota
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    // Método para simular cumpleaños
    public void cumplirAnios() {
        edad++;
        System.out.println("¡" + nombre + " cumplió años! Ahora tiene " + edad + " años.");
    }
}
