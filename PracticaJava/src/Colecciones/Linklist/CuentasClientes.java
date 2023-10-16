/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones.Linklist;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author daniel
 */
public class CuentasClientes {

    public static void main(String[] args) {

        LinkedList<String> nombre = new LinkedList<String>();

        nombre.add("Daniel");
        nombre.add("Victoria");
        nombre.add("Victor");

        LinkedList<String> saldo = new LinkedList<String>();

        saldo.add("1500");

        saldo.add("3000");

        saldo.add("5000");

        LinkedList<String> work = new LinkedList<String>();

        work.add("contador");
        work.add("nurse");
        work.add("constructor");

        ListIterator<String> IterA = nombre.listIterator();
        ListIterator<String> IterB = saldo.listIterator();
        ListIterator<String> IterC = work.listIterator();

        System.out.println(IterB);

        while (IterA.hasNext() && IterC.hasNext()) {

            if (IterB.hasNext()) {

                IterB.next();

            }

            IterB.add(IterA.next());
            IterB.add(IterC.next());

        }

        System.out.println("nombre" + nombre);
        System.out.println("saldo" + saldo);

        while (IterC.hasNext() ) {

            if (IterC.hasNext()) {
                
                IterA.next();
                IterA.remove();
    
}
            
            
        }
        
        
         System.out.println("nombre" + nombre);
        System.out.println("saldo" + saldo);
          System.out.println("saldo" + IterC);
        saldo.removeAll(work);
        System.out.println("nombre" + nombre);
        System.out.println("saldo" + saldo);
  

    }

}
