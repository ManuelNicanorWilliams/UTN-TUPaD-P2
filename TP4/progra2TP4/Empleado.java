package progra2tp4;

public class Empleado {
    
    // Atributos
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    // Constructores
    public Empleado (int id, String nombre, String puesto, double salario) {
    this.id = id;
    this.nombre = nombre;
    this.puesto = puesto;
    this.salario = salario;
    totalEmpleados++;
    }
    
    public Empleado (String nombre, String puesto) {
    this.id = totalEmpleados + 1; // id automático
    this.nombre = nombre;
    this.puesto = puesto;
    this.salario = 1000000.0;    // salario por defecto
    totalEmpleados++;
    }
    
    // Métodos
    public void actualizarSalario (double porcentaje) {
        this.salario += this.salario *(porcentaje / 100);
    }
    
    public void actualizarSalario (int aumentoFijo) {
        this.salario += aumentoFijo;
    }
    
    // toString()
    @Override
    public String toString() {
        return "Empleado [ID=" + id +
               ", Nombre=" + nombre +
               ", Puesto=" + puesto +
               ", Salario=$" + salario + "]";
    }

    // Método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    // Getters y Setters
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
     
}
