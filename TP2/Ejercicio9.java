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
public class Ejercicio9 {
    
    // a. Método para calcular costo de envío según peso y zona
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio = 0;

        // Si la zona es Nacional, cuesta $5 por kg
        if (zona.equalsIgnoreCase("Nacional")) {
            costoEnvio = peso * 5;
        } 
        // Si la zona es Internacional, cuesta $10 por kg
        else if (zona.equalsIgnoreCase("Internacional")) {
            costoEnvio = peso * 10;
        } 
        // Si la zona no es válida
        else {
            System.out.println("Error: zona inválida. Debe ser 'Nacional' o 'Internacional'.");
        }

        return costoEnvio;
    }

    // b. Método para calcular total de compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos los datos al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        scanner.nextLine(); // limpiar buffer
        String zona = scanner.nextLine();

        // Calculamos el costo de envío usando el método
        double costoEnvio = calcularCostoEnvio(peso, zona);

        // Calculamos el total de compra
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        // Mostramos resultados
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
        
    }
}

