import java.util.Scanner;

/**
 *
 * @author cecilia
 */
public class Ejercicio1 {
     public static void main(String[] args){
       Scanner input = new Scanner(System.in);
               
    int ano; // Variable para guardar el año ingresado
    
    System.out.print("Ingrese un año: "); // Solicita al usuario que ingrese un año
    ano = input.nextInt();  // Lee el número ingresado por el usuario y lo almacena en la variable 'ano'
    
    if (ano % 2 == 0 ) { // Condición: si el año es divisible por 2 (resto = 0) se considera bisiesto
         System.out.println("El año " + ano + " es bisiesto.");
         } else {
          System.out.println("El año " + ano + " no es bisiesto.");
         }
    }   
