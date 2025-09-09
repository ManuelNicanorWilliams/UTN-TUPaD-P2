package proga2tp3.ejercicio5;

public class Ejercicio5Main {
  
    public static void main(String[] args) {
        // Crear nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial("Explorer-1", 50);

        // Intentar avanzar sin recargar (despegar primero)
        nave.despegar();
        nave.avanzar(80); // no debería poder avanzar, consume más de lo disponible

        // Recargar combustible y avanzar correctamente
        nave.recargarCombustible(40);
        nave.avanzar(50); // ahora debería avanzar sin problema

        // Mostrar estado final
        nave.mostrarEstado();
    }
}
