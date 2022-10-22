/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJERCICIO3 {
    public static void main(String[] args) {
    Scanner Entrada = new Scanner(System.in);
    double l,r; // longitud y radio
    System.out.print("Introduce el radio de una circunferencia: ");
    r=Entrada.nextDouble();
    l=2*Math.PI*r;
    System.out.println("La longitud de una circunferencia de radio " + r+ " es: " + l);
    }
}
