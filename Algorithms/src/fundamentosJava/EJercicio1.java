/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosJava;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author daniel
 * 
 *  
 */
public class EJercicio1 {
    
    /*Dados dos numeros enteros hallar la suma*/

public static void main(String[] args) {
    
    Scanner sa = new Scanner(System.in);
    int num = 0;
   
    int total = 0;

    System.out.println("Ingrese su numero aqui:");
    num = sa.nextInt();
    System.out.println("Ingrese otro numero aqui:");
    num = sa.nextInt();
    total = num + num;
    
    System.out.println("total es; " + total);
    
    
    
    
    
}

   
    
    

}
