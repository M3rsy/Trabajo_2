/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebavector1;

/**
 *
 * @author lol123mb
 */
import java.util.Scanner;
public class PruebaVector1 {
private Scanner teclado;
private int[] sueldos;
    /**
     * @param args the command line arguments
     */
    public void cargar () {
        teclado = new Scanner (System.in);
        sueldos = new int [5];
        for (int f = 0; f < 5; f ++) {
            System.out.println("Ingrese el valor del componente:" );
            sueldos [f] = teclado.nextInt();
        }
        }
public void imprimir (){
    for (int f=0;f<5;f++) {
        System.out.println(sueldos[f]);
        
    }
}
public static void main(String[] args) {
        // TODO code application logic here
 PruebaVector1 pv=new PruebaVector1();
 pv.cargar();
 pv.imprimir();
        
    }
    
}
