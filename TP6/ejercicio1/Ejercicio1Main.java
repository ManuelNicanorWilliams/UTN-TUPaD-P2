package ejercicio1;

public class Ejercicio1Main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Crear productos
        Producto p1 = new Producto("P001", "Arroz", 1200.0, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Auriculares" , 4500.0, 15, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera" , 2200.0, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Lámpara", 1800.0, 10, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Queso", 2800.0, 8, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // Listar productos
        inventario.listarProductos();
        
        System.out.println();
        System.out.println("=========================================");
        
        // Buscar producto por ID
        System.out.println("\nBuscando producto con ID P003:");
        Producto encontrado = inventario.buscarProductoPorId("P003");
        if (encontrado != null) encontrado.mostrarInfo();

        System.out.println();
        System.out.println("=========================================");
        
        // Filtrar por categoría
        System.out.println("\nProductos de la categoría ROPA:");
        for (Producto p : inventario.filtrarPorCategoria(CategoriaProducto.ROPA)) p.mostrarInfo();

        System.out.println();
        System.out.println("=========================================");
        
        // Eliminar producto
        System.out.println("\nEliminando producto P004...");
        inventario.eliminarProducto("P004");
        inventario.listarProductos();

        System.out.println();
        System.out.println("=========================================");
        
        // Actualizar stock
        System.out.println("\nActualizando stock de P005 a 20 unidades");
        inventario.actualizarStock("P005", 20);
        inventario.buscarProductoPorId("P005").mostrarInfo();

        System.out.println();
        System.out.println("=========================================");
        
        // Mostrar total de stock
        System.out.println("\nTotal de stock disponible: " + inventario.obtenerTotalStock());

        System.out.println();
        System.out.println("=========================================");
        
        // Producto con mayor stock
        System.out.println("\nProducto con mayor stock:");
        System.out.println(inventario.obtenerProductoConMayorStock());

        System.out.println();
        System.out.println("=========================================");
        
        // Filtrar por precio entre 1000 y 3000
        System.out.println("\nProductos con precio entre $1000 y $3000:");
        for (Producto p : inventario.filtrarProductosPorPrecio(1000, 3000)) p.mostrarInfo();

        System.out.println();
        System.out.println("=========================================");
       
        // Mostrar categorías disponibles
        System.out.println();
        inventario.mostrarCategoriasDisponibles();
    }
}
