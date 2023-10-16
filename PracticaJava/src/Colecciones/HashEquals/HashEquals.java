/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;
import java.util.*;
/**
 *
 * @author daniel
 */
public class HashEquals {
    
    public static void main(String[] args) {
    
        //creacion objeto cliente
        UsoHashEqual cliente1 = new UsoHashEqual("Daniel", 30, 5000);
        UsoHashEqual cliente2 = new UsoHashEqual("Maria", 33, 6000);
        UsoHashEqual cliente3 = new UsoHashEqual("JUalia", 35, 7000);
        UsoHashEqual cliente4 = new UsoHashEqual("Alfonso", 40, 8000);
        UsoHashEqual cliente5 = new UsoHashEqual("Alfonso", 40, 8000);
        //creacion de la coleccion 
        Set<UsoHashEqual> clientPromotora = new HashSet<UsoHashEqual>();
        
        //agregar los clientes a la coleccion
        clientPromotora.add(cliente1);
        clientPromotora.add(cliente2);
        clientPromotora.add(cliente3);
        clientPromotora.add(cliente4);
          clientPromotora.add(cliente5);
        
        //iteracion y impresion de los clientes
        for (UsoHashEqual clientp : clientPromotora) {
    
            System.out.println(clientp.getName() + clientp.getAge() + clientp.getSalary());
}
        
        
        
       
}
    
}
