package ejercicio4;

public class Ejercicio4Main {
    public static void main(String[] args) {
        Animal[] animales = {
            new Perro("Mona"),
            new Gato("Simon"),
            new Vaca("Lola"),
            new Animal("AnimalGenérico")
        };

        for (Animal a : animales) {
            a.describirAnimal(); // muestra tipo y sonido
            System.out.println("-------------------------------------");
        }
    }
}
