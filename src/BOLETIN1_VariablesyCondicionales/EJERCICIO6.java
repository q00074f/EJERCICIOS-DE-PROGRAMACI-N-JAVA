/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOLETIN1_VariablesyCondicionales;
import java.util.Scanner;
//GASPAR PAUCAR WILBER ANDRIHU
/**
 *
 * @author Usuario
 */
public class EJERCICIO6 {
    public static void main(String[] args) {
    Scanner Entrada = new Scanner(System.in);
    int n1,n2;
    System.out.print("Introduce un número: ");
    n1=Entrada.nextInt();
    System.out.print("Introduce otro número: ");
    n2=Entrada.nextInt();
    if(n1%n2==0)
    System.out.println("Son múltiplos");
    else
    System.out.println("No son múltiplos");
  }
}
