package proga2tp3.ejercicio2;

public class Ejercicio2Main {
    
    public static void main(String[] args) {
        // Crear una mascota
        Mascota miMascota = new Mascota("Chango", "Perro", 2);

        // Mostrar info inicial
        System.out.println("Información de la mascota:");
        miMascota.mostrarInfo();

        // Simular el cumpleaños
        System.out.println("\nSimulando cumpleaños...");
        miMascota.cumplirAnios();

        // Verificar cambios
        System.out.println("\nInformación después del cumpleaños:");
        miMascota.mostrarInfo();
    }
}
