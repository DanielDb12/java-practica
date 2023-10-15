package fundamentosJava;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author daniel
 */
public class Ejercicio11 {
    
    
    public static void main(String[] args) {
    
        //Variables
        int n1 = 0;
        int n2 = 0;
        
        //Entradas
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero :");
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero :");
        n2 = sc.nextInt();
        
        //Proceso
           //|
        //Exp Logica
        //instruccion
        if(n1 > n2){
            
            System.out.println("el numero mayor es " + n1);
        } else {
        
            System.out.println("el numero mayor es " + n2);
        
        }
        
}
    
}
