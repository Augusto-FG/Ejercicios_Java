/*Ejercicio:
Realizar un programa que permita a un profesor calcular el promedio de un alumno. Para esto, el algoritmo debe permitir ingresar las 4 notas del mismo 
(por ejemplo, 8, 7, 9.50 y 10), luego calcular el promedio de las mismas y mostrar el resultado por pantalla. 
Se recuerda que el promedio es la suma de todas las notas dividido la cantidad, en el ejemplo sería:(8+7+9.50+10)/4. */

import java.util.Scanner;
public class Ej1Promedio {

        public static void main(String[] args) {
              
                int numero1 = 0;
                int numero2 = 0;
                int numero3 = 0;
                int numero4 = 0;
                int resultado;
             

                Scanner reader = new Scanner(System.in);
              
                System.out.println("Introduce la primer nota:");                     
                numero1 = reader.nextInt();
                      
                System.out.println("Introduce la segunda nota::");
                numero2 = reader.nextInt();
                
                System.out.println("Introduce la tercer nota::");
                numero3 = reader.nextInt();
                
                System.out.println("Introduce cuarta notas:");
                numero4 = reader.nextInt();
                      
                // promedio
                resultado = (numero1+numero2+numero3+numero4)/4;
              
                System.out.println("El promedio del alumno es: " +resultado);
                      
        }

}
