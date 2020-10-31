/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebavector7;

import java.util.Scanner;

/**
 Cargar un vector de 10 elementos y verificar posteriormente si el mismo está ordenado de menor a mayor. 
 */
public class PruebaVector7 {
    private Scanner teclado;
    private int [] vec;

   public void cargar() {
       teclado = new Scanner (System.in);
       vec = new int [9];
       for (int f = 0 ; f <8 ; f++){
           System.out.println("Ingrese el Elemento: ");
           vec[f] = teclado.nextInt();
           
       }
   }
   public void verificarOrdenado (){
       int orden = 1;
       for (int f = 0 ; f <8;f++){
           if (vec[f+1]<vec[f]){
               orden = 0 ;
           }
       }
       if (orden == 1){
           System.out.println("Esta ordenado de menor a mayor");
       } else {
           System.out.println("No esta ordenado de menor a mayor ");
       }
   } 
    
    
    public static void main(String[] args) {
        PruebaVector7 pv = new PruebaVector7 ();
        pv.cargar();
        pv.verificarOrdenado();
    }
    
}
