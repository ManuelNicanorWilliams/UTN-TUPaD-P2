package progra2tp4;

public class Progra2TP4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // Instancias usando constructor completo
        Empleado e1 = new Empleado(1, "Juan Pérez", "Gerente", 80000);
        Empleado e2 = new Empleado(2, "Ana López", "Contadora", 60000);

        // Instancias usando constructor con nombre y puesto
        Empleado e3 = new Empleado("Carlos Díaz", "Vendedor");
        Empleado e4 = new Empleado("María Gómez", "Secretaria");

        // Mostrar información
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        
        // Aplicar aumentos de salario
        e1.actualizarSalario(10);     // 10% de aumento
        e2.actualizarSalario(5000);   // aumento fijo
        e3.actualizarSalario(15);     // 15% de aumento
        e4.actualizarSalario(2000);   // aumento fijo

        // Mostrar información
        System.out.println("=======================================================================");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        // Mostrar total de empleados creados
        System.out.println();
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
        
    }
    
}
