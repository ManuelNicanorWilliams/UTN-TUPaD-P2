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
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        // Usamos do-while para pedir al menos una vez la nota
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = scanner.nextInt();

            // Validamos si está fuera de rango
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }

        } while (nota < 0 || nota > 10); // Se repite mientras la nota sea inválida

        // Si sale del bucle, la nota es válida
        System.out.println("Nota guardada correctamente.");

    }
}
