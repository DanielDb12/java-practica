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
public class Ejercicio2 {

    public static void main(String[] args) {

        /*
        
        Almacenar en un arreglo 5 numeros y vamos hacer que el programe lance el numero mayor de ese arreglo
        
        [1] las variables almacenan el numero y luego con el for recorren el arreglo y con 
        [4]
        [100]
        [5]
        [9]

        
         */
        
        /*
        int array[] = new int[5];
        int mayor = array[0];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            System.out.println("indique el numero: " + (i + 1));

            array[i]=sc.nextInt();
            
            if(array[i]>mayor)mayor=array[i];
            

            
            

        }
        
        System.out.println("el numero mayor es:" + mayor);

    */
        
        /* Has un arreglo que almacene 5 nombres y de esos 5 nombres que traiga el nombre que se encuentra repetido*/
        
        
        String array[] = new String[5];
        String name = array[0];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < array.length; i++) {
            
            System.out.println("Agrega los nombre ");
            
           array[i] = sc.next();
           
           if (array[i] == name) {
               
               name=array[i];
    
}
    
}
   
        System.out.println(name);
        
        
        

    

}

}
