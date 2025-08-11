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
public class Ejercicio8 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
      
       Double primerNum;
       Double segundoNum;
       
       
        System.out.println(" Ingresa el primer número: ");
        primerNum = input.nextDouble();
         
        System.out.println(" Ingresa el segundo número: ");
        segundoNum = input.nextDouble();
        
        Double div= primerNum / segundoNum;
       
        System.out.println("La división de " + primerNum + " / " + segundoNum + " es: " + div);
}
}
