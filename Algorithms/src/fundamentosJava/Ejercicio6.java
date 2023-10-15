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
public class Ejercicio6 {
    /*
    
    Dado un numero de 5 digitos devolver  el numero en orden inverso
    
    12345|10
        5|1234|10 |
            4 |123|10|
                 3|12|10
                  | 2|1  
    (Inicio)
        |
    /Entrada/
        |
    |Proceso|
    |       |
    |       |
    |       |
        |
    /Salida/
    (fin)
    
    
    
    */

    public static void main(String[] args) {
    
        //variables
        int n,r,ni;
   

        //entrada
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        //proceso
        //12345
        r = n % 10; //12345/10 -> 5
        n = n / 10; //12345/10 -> 1234 
        ni = r  * 10; // 50 
        
        r = n % 10; //4
        n = n / 10;//1234/10 -> 123
        ni = (ni + r) * 10 ;// 50 + 4 * 10= 540 
        
         r = n % 10;//123/10 -> 3
        n = n / 10;//123/10 -> 12
        ni = (ni + r) * 10 ; //540 + 3 * 10 = 5430 
        
         r = n % 10; //12 /10 -> 2
        n = n / 10; // 12/10 -> 1
        ni = (ni + r) * 10 ; //(5430 + 2) * 10 = 54320

        
        ni = ni + n ; // 54320 + 1 = 54321
        
        
        
        //Salida
        
        System.out.println("");
        System.out.println("Inverso" + ni);
        
       
}
    
    

    
}
