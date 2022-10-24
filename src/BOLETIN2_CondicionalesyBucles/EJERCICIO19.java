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
public class EJERCICIO19 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int nota,aprobados,suspensos,condicionados;
        aprobados=0;
        suspensos=0;
        condicionados=0;
 
        for (int i=1;i<=6;i++){
            System.out.print("Introduzca nota entre 0 y 10: ");
            nota=Entrada.nextInt();
            
            if(nota == 4){
                condicionados++;
            }else if(nota >= 5){
                aprobados++;
            }else if(nota < 4){ // este if sobra, ya que es el único caso posible
                suspensos++;
            }
        }
            
        System.out.println("Aprobados: " +aprobados);
        System.out.println("Suspensos: " +suspensos);
        System.out.println("Condicionados: "+condicionados);
    }
}
