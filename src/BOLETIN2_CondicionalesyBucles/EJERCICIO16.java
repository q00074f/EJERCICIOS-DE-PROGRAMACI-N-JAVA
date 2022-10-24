/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOLETIN2_CondicionalesyBucles;
import java.util.Scanner;
//GASPAR PAUCAR WILBER ANDRIHU
/**
 *
 * @author Usuario
 */
public class EJERCICIO16 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num;
        do{
            System.out.print("Introduce número (de 0 a 10): ");
            num=Entrada.nextInt();
        }while ( ! (0<=num && num<=10));
 
        System.out.println("\n\nTabla del " + num);
 
        for (int i=1;i<=10;i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
