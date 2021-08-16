/*Ejercicio:
Realizar un programa que permita calcular el área de un triángulo. Se recuerda que la fórmula para calcular el área de un triángulo es: (base * altura) / 2.
Se debe permitir al usuario ingresar la base y la altura, mientras que el programa debe calcular el área y mostrar el resultado por pantalla.*/


import java.util.Scanner;

public class Ej2AreaTriangulo {
    public static void main(String[] args) {
        
        int numero1 = 0;
        int numero2 = 0;
        int resultado;

        Scanner reader = new Scanner(System.in);
      
        System.out.println("Introduce la base:");                     
        numero1 = reader.nextInt();
              
        System.out.println("Introduce la altura::");
        numero2 = reader.nextInt();
       
              
        //superficie
        resultado = (numero1*numero2)/2;
      
        System.out.println("El area del triángulo es: " +resultado);
              
}

}
