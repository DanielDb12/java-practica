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
public class Ejercicio12 {

    public static void main(String[] args) {

        //Determinar si un numero es entero positivo negativo o neutro
        //Variables
        int num = 0;

        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar Numero: ");
        num = sc.nextInt();

        //Proceso
        if (num > 0) {

            System.out.println("es un numero positivo" + num);
        }

        if (num < 0) {
            System.out.println("es un numero negativo" + num);
        }

        if (num == 0) {

            System.out.println("es un numero neutro");
        }

    }

}
