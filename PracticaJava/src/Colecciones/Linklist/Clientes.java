/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones.Linklist;

import java.util.*;

/**
 *
 * @author daniel
 */
public class Clientes {
    
    public static void main(String[] args) {
        
        LinkedList<String> nombre = new LinkedList<String>();
        
        nombre.add("Daniel");
        nombre.add("German");
        nombre.add("Noris");
        
        LinkedList<String> paises = new LinkedList<String>();
        
        paises.add("Colombia");
        paises.add("Venezuela");
        paises.add("Francia");
        
        ListIterator<String> iteraA = nombre.listIterator();
        ListIterator<String> iteraB = paises.listIterator();
        
        while (iteraB.hasNext()) {
            
            if (iteraA.hasNext()) {
                
                iteraA.next();
                
            }
            
            iteraA.add(iteraB.next());
            
        }
         iteraB = paises.listIterator();
        System.out.print(nombre);
    
        
        while (iteraB.hasNext()) {
        
            
            iteraB.next();
            
            if(iteraB.hasNext()){

                iteraB.next();
                iteraB.remove();
            }
        
            
          
        
        }
        
        System.out.println(paises);
       //nombre.removeAll(paises);
      System.out.println(nombre);
        
        
    }
    
    
    
}
