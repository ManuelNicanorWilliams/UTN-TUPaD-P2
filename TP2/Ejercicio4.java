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
public class Ejercicio4 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
      // Declaración de variables
        double precioOriginal;   // Precio ingresado por el usuario
        double descuento = 0;    // Porcentaje de descuento
        double precioFinal;      // Precio luego de aplicar el descuento
        char categoria;          // Categoría del producto (A, B o C)

        // Solicitamos al usuario el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        precioOriginal = input.nextDouble();

        // Solicitamos la categoría del producto
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        categoria = input.next().toUpperCase().charAt(0); 
        // toUpperCase() convierte la letra a mayúscula, charAt(0) toma el primer caracter
       
       // Determinamos el porcentaje de descuento según la categoría
        if (categoria == 'A') {
            descuento = 0.10; // 10%
        } else if (categoria == 'B') {
            descuento = 0.15; // 15%
        } else if (categoria == 'C') {
            descuento = 0.20; // 20%
        } else {
            System.out.println("Categoría no válida. Debe ser A, B o C.");
            return; // Termina el programa si la categoría no es válida
        }

        // Calculamos el precio final aplicando el descuento
        precioFinal = precioOriginal - (precioOriginal * descuento);

        // Mostramos resultados
        System.out.println("Precio original: " + precioOriginal);
        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
}
