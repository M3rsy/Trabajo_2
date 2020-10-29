import java.util.Scanner;
/*
Realizar un programa que pida la carga de dos vectores numéricos
 enteros de 4 elementos. 
Obtener la suma de los dos vectores, 
dicho resultado guardarlo en un tercer vector del mismo tamaño. 
Sumar componente a componente. 

*/



public class PruebaVector5 {
   private Scanner teclado;
   private int [] vec1;
   private int [] vec2;
   private int []vecsuma;
   
   public void cargar (){
    teclado = new Scanner (System.in);   
    vec1 = new int[4];
    vec2 = new int[4];
    System.out.println("Carga el primer vector: ");
    for (int f =0 ; f<4;f++){
System.out.println("Ingrese el primer elemento: " );
vec1[f] = teclado.nextInt();
    }
    System.out.println("Carga el segunto vector: ");
    for (int f = 0 ; f < 4 ; f++){
        System.out.println("Ingrese el segundo elemento: ");
        vec2[f] = teclado.nextInt();

    }


}
public void sumarVectores (){
vecsuma = new int [4];
for (int f = 0 ; f < 4 ; f ++){
    vecsuma[f] = vec1[f] + vec2[f];
}
System.out.println("Vector resultante: ");
for (int f = 0 ;f < 4; f++){
System.out.println(vecsuma[f]);
}
}

public static void main(String[] args) {
    PruebaVector5 pv = new PruebaVector5();
    pv.cargar();
    pv.sumarVectores();
    
}
   }

