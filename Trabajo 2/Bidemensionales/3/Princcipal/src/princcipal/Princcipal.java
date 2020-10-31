/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princcipal;

import java.util.Scanner;

/**
 *
 * @author Eliet
 */
public class Princcipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = new int [5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println("Introduzca el Numero : ");
            arr[i] = sc.nextInt();
        }
   
        System.out.println("Los Numeros de Orden Inverso Es: ");
        int j = 4;
        while (j>=0) {
            System.out.println("|" + arr[j] + "|\n" );
            j -- ;
        }
    }
    
}
