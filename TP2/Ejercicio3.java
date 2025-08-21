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
public class Ejercicio3 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       int edad; // Declaramos una variable entera para almacenar la edad
    
        System.out.print("Ingrese su edad: ");   // Pedimos al usuario que ingrese su edad
        edad = input.nextInt();
        
       // Condiciones para clasificar la edad en distintas etapas de vida
       if (edad < 12) {
            System.out.println("Eres un Niño."); // Si la edad es menor a 12 → Niño
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un Adolescente."); // Si está entre 12 y 17 inclusive → Adolescente
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto."); // Si está entre 18 y 59 (inclusive) → Adulto
        } else if (edad >= 60) {
            System.out.println("Eres un Adulto mayor.");  // Si es 60 o más → Adulto mayor
        } else {
            System.out.println("Edad no válida."); // Caso por si se ingresa un número negativo
            
        }
    }
}
