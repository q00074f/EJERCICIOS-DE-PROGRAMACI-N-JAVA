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
public class EJERCICIO2 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num;
        
        System.out.print("Introduzca un número: ");
        num=Entrada.nextInt();
        
        while(num!=0) { // mientras num sea distinto de 0
            if(num>0){
                // mayor que cero: positivo
                System.out.println("Positivo");
            }else{
                // si no es positivo: es negativo
                System.out.println("Negativo");
                // repetimos el proceso y volvemos a leer num
                System.out.print("Introduzca otro número: ");
                num=Entrada.nextInt();
            }
        }
        // al salir del mientras tenemos la certeza que num es 0
    }
}
