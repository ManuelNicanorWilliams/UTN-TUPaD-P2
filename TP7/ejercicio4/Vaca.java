package ejercicio4;

public class Vaca extends Animal {
    public Vaca(String nombre) { super(nombre); }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Muu!");
    }

    @Override
    public String getTipo() {
        return "vaca";
    }
}
