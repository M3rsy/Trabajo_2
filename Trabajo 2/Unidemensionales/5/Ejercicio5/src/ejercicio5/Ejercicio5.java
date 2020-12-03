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
        double ventas[] = new double [30];
        
       
        Scanner teclado = new Scanner (System.in);
        System.out.println("*******Ingrese las Ventas del Mes********  ");
        for (int j = 0 ; j <ventas.length ; j ++)
        {
            System.out.println("Las Ventas : " + (j + 1));
            ventas[j] = teclado.nextDouble();
            
            
        }
            int r = 0;
            int total=0;
            while (r<30) 
            {
                if (ventas[r] >= 10500 ) 
                {
                    System.out.println(ventas[r]);
                     total ++;   
                     
                   
                }
                r++;
               
            }
           System.out.println("Total Mayores a 10,500.00 Son: " + total);
     
        }
      
        
                
    }
    

