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
public class Ejercicio8 {

    /*
    Crea un programa para la gestion de factura de una empresa que se dedica a la venta de azucar por kilos
    En cada factura se ingresara el codigo del producto vendido
    Ademas se ingresara la cantidad de kios vendido
    y el total a pagar por kilos
    Dee 5 facturas introducidas se pide
    Facturacion total cantidad de kilos vendidas y cuantas 
    Facturas fueron emitidas por mas de $1000
    
    
     */
    public static void main(String[] args) {
        String codigo = "";
        int kilos = 0;
        float precio = 0;
        int totalkilos = 0;
        double kilosVendida = 0;
        double importeFactura = 0;
        double facturacionTotal = 0;
        int cont = 1;

        Scanner sc = new Scanner(System.in);

        /*
   
   for (int i = 1; i < 5; i++) {
       System.out.println("numero de factura" + i);
       System.out.println("ingrese el codigo del producto");
       codigo = sc.next();
       System.out.println("Cuantos kilos necesita?");
       kilos = sc.nextInt();
        System.out.println("Precio");
       precio = sc.nextFloat();
       
      importeFactura= kilos * precio;
      facturacionTotal = importeFactura + facturacionTotal;
       
       if (importeFactura >=1000) {
           cont++;
    
}
       
    
       totalkilos=kilos + totalkilos;
      
    
}
    
    
   
   System.out.println("total cantidad de kilos vendidas " + totalkilos);
   System.out.println("las factura emitidas por mas de 1000 " + facturacionTotal);
   
         */
         boolean run=true;
        while (run) {

            if (cont  <= 5) {

                System.out.println("numero de factura" + cont++);
                System.out.println("ingrese el codigo del producto");
                codigo = sc.next();
                System.out.println("Cuantos kilos necesita?");
                kilos = sc.nextInt();
                System.out.println("Precio");
                precio = sc.nextFloat();

                if (importeFactura >= 1000) {

                    cont++;

                }
            } else {
                
               run = false;
            
            }

        }

    }
}
