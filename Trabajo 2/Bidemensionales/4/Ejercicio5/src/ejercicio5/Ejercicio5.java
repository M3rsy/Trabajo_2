/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Eliet
 */
public class Ejercicio5 {

    /**
     Crearemos un arreglo de 30 posiciones, para almacenar las 30 ventas del mes. 
     * Y al final el programa mostrará en pantalla: 
     * Total de las 30 ventas como cuantas son superior e inferior de L.10,500
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int ventas[] = new int [30];
        int sumaTotal = 0;
        int contador = 0 ;
  
        for (int j = 0 ; j < ventas.length ; j++ ){
            System.out.println("Ingrese Las Ventas: ");
            ventas[j] = teclado.nextInt();
            sumaTotal = ventas[j] + sumaTotal ;
            
            if (ventas[j] >= 10500) {
                System.out.println("Es: " + ventas[j]);
            }
            
        }
        
                
    }
    
}
