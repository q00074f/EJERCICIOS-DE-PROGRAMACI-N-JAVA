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
public class EJERCICIO22 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int notas;
        boolean suspensos;
        
        suspensos = false; // suponemos que en principio no hay ningún suspenso
        
        for(int i = 0; i<5;i++){
            System.out.println("Introduzca nota (de 0 a 10): ");
            notas = Entrada.nextInt();
            
            if(notas<5){
                suspensos = true;
            }
        }
        
        if(suspensos){
            System.out.println("Hay alumnos suspensos");
        }else{
            System.out.println("No hay suspensos");
        }
    }
}
