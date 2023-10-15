/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Ejercicio4 to edit this template
 */
package algorithms;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        /*Crea un programa que este pidiendo numeros enteros
           Cuando un cero se haya introducido finalizara la captura de datos
            Sumar los numeros y mostrar la suma de de la pantall
         */
        int number = 0,
                suma = 0;
        Scanner sc = new Scanner(System.in);

        /*
        do { 
            
    System.out.println("Ingresa el numero: ");
    number = sc.nextInt();
    suma = suma + number;
    
} while (number!=0);

        System.out.println("la suma de todos los numero es: " + suma );

              
         */
 /*
        WHILE
        boolean run = true;
     

        while (run) {
  
        
            System.out.println("ingrese el numero");
            number = sc.nextInt();

            suma = suma + number;
            if (number == 0) {

                run = false;

            }

        }
        System.out.println("la suma de los numeros es " + suma);
         */
        int cant = 0;
        int num = 1;

        do { 
            
            for (int i = 0; i < num; i++) {

                System.out.println("escriba su numeros:");
                num = sc.nextInt();

                if (num > 0) {

                    suma = suma + num;
                    cant++;

                }

            }
} while (num > 0);
        
        System.out.println("toda la suma " + suma);
        System.out.println("cantidad de los entero " + cant);
        
        

            /*    Determinar en un conjunto de n números naturales:
¿ Cuántos son menores que 15 ?
¿ Cuántos son mayores qu2e 50 ?
¿ Cuántos están en el rango entre 25 y 45 ?

Análisis
La dificultad parece aumentar, no se asusten, solo nos piden más salidas que entradas, para ello reconocer cúales son: 

Entradas
a.- Cantidad de números a ingresar, será n
b.- El número a ingresar, llamaremos num.

Salidas
a.- Números menores a 15, un contador, lo denominaremos c15.
b.- Números mayores a 50, contador que se será c50.
c.- Números entre 25 y 45,  un contador se llamará c_rango.

Procesos o condiciones
a.- num < 15
b.- num  > 50; 
c.- num > 25 y num < 45;
         
        int n = 0;
        int num = 0;
        int c=0, c15 = 0, c50 = 0, c_rango = 0;
       
        do {
            System.out.println("ingrese el numero5"
                    + "");
            num = sc.nextInt();

            if (num < 15) {
                c15++;
            } else if (num > 50) {
                
                c50++;

            } else if(num >=25 && num <=45 ){
                c_rango++;
            } else {
                c++;
            }
            

        } while (c < n);
        
        
        System.out.println("Su numero es");
             */
        }

    }
