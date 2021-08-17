/*Ingresar un n�mero por teclado y comprobar si este es capic�a
 (un numero capic�a es aquel que se lee igual de derecha a izquierda y viceversa)
 Ejemplo 2002
 */


import java.util.Scanner;
public class EJ9NumeroCapicua {


    public static void main(String[] args) {
        int num, aux, inverso = 0, resto;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un n�mero: ");
            num = sc.nextInt();
        } while (num < 10);
 
        //le damos la vuelta al n�mero
        aux = num; //2002
        while (aux!=0){
            resto = aux % 10; //2    
            inverso = inverso * 10 + resto; //2
            aux = aux / 10;  //200
  
        }
 
        if(num == inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }
	
	
}
