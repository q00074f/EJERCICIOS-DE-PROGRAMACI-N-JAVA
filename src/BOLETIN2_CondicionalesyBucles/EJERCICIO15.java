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
public class EJERCICIO15 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int edad,media_edad,suma_edad,mayor_edad,mayor_175; //mayor_edad: mayores de 18 años
        double altura,media_altura,suma_alt; 
        mayor_edad=0;
        media_altura=0;
        mayor_175=0;
        suma_edad=0;
        suma_alt=0;
    
        for (int i=1;i<5;i++){
            System.out.println("Alumno " +i);
            System.out.print("Introduzca edad: ");
            edad=Entrada.nextInt();
            System.out.print("Introduzca altura: ");
            altura=Entrada.nextDouble();
            
            if(edad>18){
                mayor_edad++;
            }
            
            if(altura>1.75){
                mayor_175++;
            }
            
            suma_edad=suma_edad+edad;
            suma_alt=suma_alt+altura;
        }
        
        media_edad=suma_edad/5;
        media_altura=suma_alt/5;
        System.out.println("\n\nLa edad media es de: " +media_edad);
        System.out.println("La altura media es de: " +media_altura);
        System.out.println("Mayor de 18 años: " +mayor_edad);
        System.out.println("Mayor de 1.75: " +mayor_175);
        
    }
}
