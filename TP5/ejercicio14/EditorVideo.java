public class EditorVideo {

    // Dependencia de creación: crea un Render dentro del método
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        System.out.println("Exportando proyecto: " + proyecto.getNombre() + " en formato: " + formato);
        System.out.println("Render generado: " + render);
    }
}
