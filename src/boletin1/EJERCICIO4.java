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
public class EJERCICIO4 {
    public static void main(String[] args) {
    Scanner Entrada = new Scanner(System.in);
    int n1,n2;
    System.out.print("Introduce un número: ");
    n1=Entrada.nextInt();
    System.out.print("Introduce otro número: ");
    n2=Entrada.nextInt();
    if(n1==n2)
    System.out.println("Son iguales");
    else
    System.out.println("No son iguales");
    }
}

