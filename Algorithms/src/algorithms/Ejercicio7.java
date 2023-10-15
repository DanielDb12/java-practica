/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithms;

/**
 *
 * @author daniel
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        /*Determin programa que muestr el producto de los primeros 10 numeros impares
        Primeros 10 numeros impares 1 3 5 7 9 11 13 15 17 19 21
         */
 
        //Variables
        int impar = 1;

        //proceso
        for (int i = 0; i < 20; i++) {
            
            if (i % 2 != 0) {
    
               impar = impar * i;
                           
} 

        }
          System.out.println("los numero impares son " + impar);
       
        /* 
        int impar = 1;
        int cont = 0;
        
        int num = 1;

        while (cont < 10) {

          


                if (num % 2 != 0) {
                    
                    impar *= num;
                    
                   
                    
                     cont++;
                }
                
                

            
             num++;   
        }

        System.out.println(impar);
    
*/
}

}
