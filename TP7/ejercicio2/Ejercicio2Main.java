package ejercicio2;

public class Ejercicio2Main {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo(2.5),
            new Rectangulo(3.0, 4.0),
            new Circulo(1.0)
        };

        for (Figura f : figuras) {
            f.mostrarArea(); // llamado polimórfico
        }
    }
}
