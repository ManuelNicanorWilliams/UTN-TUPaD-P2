/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra2tp1;

import java.util.Scanner;

/**
 *
 * @author cecilia
 */
public class Ejercicio5 {
     public static void main(String[] args){
       Scanner input = new Scanner(System.in);
      
       int primerNum;
       int segundoNum;
       
       
        System.out.println(" Ingresa el primer número: ");
        primerNum = input.nextInt();
         
        System.out.println(" Ingresa el segundo número: ");
        segundoNum = input.nextInt();
        
        int suma = primerNum + segundoNum;
        int resta = primerNum - segundoNum;
        int multi = primerNum * segundoNum;
        int div= primerNum / segundoNum;
       
        System.out.println("La suma de " + primerNum + " + " + segundoNum + " es: " + suma);
        System.out.println("La resta de " + primerNum + " - " + segundoNum + " es: " + resta);
        System.out.println("La multiplicación de " + primerNum + " * " + segundoNum + " es: " + multi);
        System.out.println("La división de " + primerNum + " / " + segundoNum + " es: " + div);
}
}
