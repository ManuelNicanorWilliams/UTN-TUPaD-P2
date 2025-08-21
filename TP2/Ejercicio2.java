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
public class Ejercicio2 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
    // Declaración de variables para almacenar los números   
      int num1;
      int num2;
      int num3;
      int mayor;
      
      System.out.print("Ingrese el primer número: "); // Solicita al usuario que ingrese el primer número y lo almacena en "mayor"
      num1 = input.nextInt();
          mayor = num1;
      System.out.print("Ingrese el segundo número: "); // Solicita al usuario que ingrese otro número
      num2 = input.nextInt();
      if (num2 > mayor)
          mayor = num2; // Si el número es mayor que 'mayor', se actualiza
      System.out.print("Ingrese el tercer número: "); // Solicita al usuario que ingrese otro número
      num3 = input.nextInt();
      if (num3 > mayor)
          mayor = num3; // Si el número es mayor que 'mayor', se actualiza
      
      System.out.print("El mayor es: " + mayor); // Muestra en pantalla el número mayor encontrado
      
      System.out.println();
    }
}