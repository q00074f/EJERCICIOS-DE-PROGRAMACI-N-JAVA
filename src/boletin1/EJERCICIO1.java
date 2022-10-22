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
public class EJERCICIO1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        double a,b,c; // coeficientes ax^2+bx+c=0
        double x1,x2,d; // soluciones y determinante
        System.out.println("Introduzca primer coeficiente (a):");
        a=Entrada.nextInt();
        System.out.println("Introduzca segundo coeficiente: (b):");
        b=Entrada.nextInt();
        System.out.println("Introduzca tercer coeficiente: (c):");
        c=Entrada.nextInt();
        // calculamos el determinante
        d=((b*b)-4*a*c);
        if(d<0)
        System.out.println("No existen soluciones reales");
        else{
        // queda confirmar que a sea distinto de 0.
        // si a=0 nos encontramos una división por cero.
        x1=(-b+Math.sqrt(d))/(2*a);
        x2=(-b-Math.sqrt(d))/(2*a);
        System.out.println("Solución: " + x1);
        System.out.println("Solución: " + x2);
        }
    }
}
