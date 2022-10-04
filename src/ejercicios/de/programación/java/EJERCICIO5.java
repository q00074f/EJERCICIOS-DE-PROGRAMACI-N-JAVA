/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.de.programación.java;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJERCICIO5 {
    public static void main(String[] args) {
    Scanner Entrada = new Scanner(System.in);
    int num;
    System.out.print("Introduce un número: ");
    num=Entrada.nextInt();
    if( num < 0)
    System.out.println("Negativo");
    else
    // suponemos que el 0 es positivo.
    System.out.println("Positivo");
    }
}
