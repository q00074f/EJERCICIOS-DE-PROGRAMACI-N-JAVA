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
public class EJERCICIO14 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int sueldo,suma,mayor_1000;
        suma=0;
        mayor_1000=0;
        
        for (int i=1;i<10;i++){
            System.out.print("Escribe un sueldo: ");
            sueldo =Entrada.nextInt();
            
            if(sueldo>1000){
                mayor_1000++;
                suma=suma+sueldo;
            }
        }
            
        System.out.println("Mayores de 1000 hay: "+mayor_1000);
        System.out.println("la suma es de: "+suma);
    }
}
