/*Determinar si un número es perfecto (un número es perfecto si es igual
 a la suma de todos sus divisores positivos sin incluir el propio número) 
 Ejemplo: 6 es divisible entre 1, 2, 3 y el mismo (pero este no se cuenta como divisor)
  si sumamos 1 + 2 +3 = 6. El 6 es un número perfecto.
 */



import java.util.Scanner;
public class EJ10NumeroPerfecto {
	public static void main(String[] args) {
        int i, suma = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        n = sc.nextInt();
        for (i = 1; i < n; i++) {  // i son los divisores. Se divide desde 1 hasta n-1                            
            if (n % i == 0) {
                suma = suma + i;   // si es divisor se suma
            }
        }
        if (suma == n) {           // si el numero es igual a la suma de sus divisores es perfecto                
            System.out.println("El número es perfecto");
        } else {
            System.out.println("El número no es perfecto");

        }
    }
}
