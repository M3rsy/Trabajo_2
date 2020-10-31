/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Eliet
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String codigo = " ";
        int kilos = 0 ;
        float precio = 0;
        float importeFactura = 0 ;
        float facturacionTotal = 0 ;
        int contador = 0 ;
        int totalKilos = 0 ;
        Scanner sc = new Scanner (System.in);
        
        for (int i = 0 ; i<=5 ;i++){
            System.out.println("Factura #No: " + i);
            System.out.println("Codigo del Producto: ");
            codigo = sc.next();
            System.out.println("Cantidad de Kilos: ");
            kilos = sc.nextInt();
            System.out.println("Precio :");
            precio = sc.nextFloat();
            importeFactura =   kilos*precio ;
            facturacionTotal = importeFactura + facturacionTotal;
            
            if(importeFactura>=1000){
               contador ++ ; 
            }
            totalKilos = kilos+totalKilos;
                
        }
        System.out.println("Detalles de la Venta: ");
        System.out.println("Facturacion total #: " + facturacionTotal);
        System.out.println("Total Kilos Vendidos: " + totalKilos);
    }
    
}
