/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebavector16;

import java.util.Scanner;

/**
 *Confeccionar un programa que permita cargar los nombres de 5 alumnos y sus notas respectivas. Luego ordenar las notas de mayor a menor. 
 * Imprimir las notas y los nombres de los alumnos.
 * @author lol123mb
 */
public class PruebaVector16 {
private Scanner teclado;
private String [] nombres;
private int [] notas;
   
public void cargar () {
    teclado = new Scanner (System.in);
    nombres = new String [5];
    notas = new int [5];
    System.out.println("Carga de nombres y notas: ");
    for (int f = 0 ; f <nombres.length ; f++){
        System.out.println("Ingrese el nombre del alumno:");
        nombres[f] = teclado.next();
        System.out.println("Ingrese la nota del alumno: ");
        notas[f] = teclado.nextInt();
    }
}
public void ordenar(){
    for (int k= 0 ; k<notas.length;k ++){
        for (int f = 0 ; f <notas.length;f++){
            if (notas[f]<notas[f+1]){
                int auxnota;
                auxnota = notas[f];
                 notas[f]=notas[f+1];
                    notas[f+1]=auxnota;
                    String auxnombre;
                    auxnombre=nombres[f];
                    nombres[f]=nombres[f+1];
                    nombres[f+1]=auxnombre;
            }
        }
    }
} 

public void imprimir (){
    System.out.println("Nombres de alumnos y notas de mayor a menor");
    for(int f = 0 ; f<notas.length;f++){
        System.out.println(nombres[f] + "-" + notas[f]);
        
    }
}
    public static void main(String[] args) {
        PruebaVector16 pv=new PruebaVector16();
        pv.cargar();
        pv.ordenar();
        pv.imprimir();
    }
    
}
