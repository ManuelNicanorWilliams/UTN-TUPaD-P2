package ejercicio3;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // puede ser null

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    // asigna o cambia profesor, sincronizando ambos lados
    public void setProfesor(Profesor nuevoProfesor) {
        if (this.profesor == nuevoProfesor) return; // nada que cambiar

        // eliminar del profesor anterior
        if (this.profesor != null) {
            Profesor anterior = this.profesor;
            this.profesor = null;
            anterior.eliminarCurso(this);
        }

        // asignar nuevo profesor y sincronizar
        this.profesor = nuevoProfesor;
        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        String nombreProf = (profesor == null) ? "(sin profesor)" : profesor.getNombre();
        System.out.printf("Curso[codigo=%s, nombre=%s, profesor=%s]%n", codigo, nombre, nombreProf);
    }
}
