/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Ejercicio5 to edit this template
 */
package algorithms;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ejercicio5 {
    /*Crear un programa que pida capturar numeros positivos
        y calcular la media o primedio de esos numeros
    */
    public static void main(String[] args) {
    
        int num=0,  suma=0, cantidadnumero = 0;
        
        float media=0;
        
        Scanner sc = new Scanner(System.in);
        
        System.err.println("introduce numeros");
        num = sc.nextInt();
        
        /*
        while(num > 0) {
        
            
            suma = suma + num;//sum 
            
            cantidadnumero++;//captura la cantidad de numero positivos
            
            System.out.println("Introduzca otro numero");
            num = sc.nextInt();
            
            
        }
            
            if(cantidadnumero==0){
            
                System.out.println("no se puede calcular la media");
            
            } else {
            
                media=suma/cantidadnumero;
                System.out.println("la media de la cantidad de numero es: " + media);
            }
       
            */
        
     
        do { 
            
            suma = suma + num;
            cantidadnumero++;
            
            System.out.println("Ingrese otro numero");
            num=sc.nextInt();
    
        } while (num > 0);
        
        if(cantidadnumero==0) {
        
            System.out.println("no se puede dividir");
        
        } else {
            
            media = suma/cantidadnumero;
            
            System.out.println("la divisionde la media es " + media);
        
        }
            
            
               
               
        
        
        
        
        
}
    
}
