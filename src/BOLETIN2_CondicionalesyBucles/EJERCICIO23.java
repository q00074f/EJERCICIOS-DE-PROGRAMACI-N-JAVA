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
public class EJERCICIO23 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num;
        boolean multiplo_3;
        multiplo_3=false;
        for (int i=0;i<5;i++){
            System.out.print("Introduzca número: ");
            num=Entrada.nextInt();
            if(num %3 == 0){
                multiplo_3=true; // si se ejecuta esta instrucción significa que al menos hay un múltiplo de 3.
            }
        }
        
        if(multiplo_3 == false){
            System.out.println("no existen múltiplos de 3");
        }else{
            System.out.println("Hay múltiplos de 3");
        }
    }
}
