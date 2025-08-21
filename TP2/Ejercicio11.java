/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

import java.util.Scanner;

/**
 *
 * @author cecilia
 */
public class Ejercicio11 {
    
     // Variable global para el 10% de descuento
    static double DESCUENTO_ESPECIAL = 0.10;

    // Método para calcular y mostrar el descuento aplicado y el precio final
    public static void calcularDescuentoEspecial(double precio) {
        // Variable local para almacenar el descuento aplicado
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;

        // Calculamos el precio final
        double precioFinal = precio - descuentoAplicado;

        // Mostramos resultados
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        // Llamamos al método para calcular y mostrar el descuento
        calcularDescuentoEspecial(precio);

    }
}
