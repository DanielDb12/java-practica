/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithms;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        /*
        ->Cada pieza de pan tiene un precio de 5$
        ->Si el cliente compra mas de 50 piezas, le costara a $4.50
        ->si el cliente compra mas de 100 piezas, le costara a $4
        programa que pida capturar la cantidad de 100 piezas que el cliente compro y el total que pagara
        
        */
        
        int cantidadPiezas = 0;
        double Pagado = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de piezas que necesita: ");
        cantidadPiezas = sc.nextInt();
        
        if(cantidadPiezas >=50 && cantidadPiezas < 100) {
        
            Pagado=cantidadPiezas*4.50;
            
            System.out.println("tiene descuento de 4.50 por la compra de 50 panes");
            
        } else if(cantidadPiezas >=100) {
            
         Pagado = cantidadPiezas*4;
            
         System.out.println("tiene descuento de 4$ por la compra de 100pane o mas");
        } else{
            
            
            Pagado = cantidadPiezas*5;
            System.out.println("no tiene descuento por la compra");
        
        }
        
        System.out.println("Cantidas Compradas: "+ cantidadPiezas + " total a pagar: " + Pagado  );
    }
}
