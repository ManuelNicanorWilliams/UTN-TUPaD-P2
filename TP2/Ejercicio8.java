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
public class Ejercicio8 {
    
    // Método para calcular el precio final aplicando impuesto y descuento
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // Convertimos los porcentajes a decimales
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100;

        // Aplicamos la fórmula: PrecioFinal = PrecioBase + (PrecioBase × Impuesto) − (PrecioBase × Descuento)
        double precioFinal = precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);

        return precioFinal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos los datos al usuario
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = scanner.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = scanner.nextDouble();

        // Llamamos al método y guardamos el resultado
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Mostramos el resultado
        System.out.println("El precio final del producto es: " + precioFinal);

    }
}

