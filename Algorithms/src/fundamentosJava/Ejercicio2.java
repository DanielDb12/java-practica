/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosJava;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int totalcoc = 0;
                int totalres = 0;
        
        
        System.out.println("ingrese los datos para la division: ");
        num = sc.nextInt();
        num = sc.nextInt();
        
        totalcoc=num/num;
        System.out.println("Ingrese los datos para la resta");
         num = sc.nextInt();
        num = sc.nextInt();
        totalres=num%num;
        
        System.out.println("su total cociente es:" + totalcoc + "Su total residuo es" + totalres);

        
}
    
}
