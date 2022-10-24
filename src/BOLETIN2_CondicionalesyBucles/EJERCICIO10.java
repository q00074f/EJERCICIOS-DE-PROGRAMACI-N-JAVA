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
public class EJERCICIO10 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num,suma_total;
        suma_total=0;

        for (int i=1;i<=15;i++){
            System.out.print("Introduzca número: ");
            num=Entrada.nextInt();
            suma_total=suma_total+num;
        }
        System.out.println("La suma total es de: "+suma_total);
    }
}
