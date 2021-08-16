/* Ejercicio:
Una mercería vende canutillos y mostacillas al por mayor mediante su página web. Como se trata de una mercería mayorista, 
solicita la cantidad de paquetes en cada venta y dependiendo de esta realiza los siguientes controles:
d)	Si la cantidad de productos es menor a 5: Se debe emitir un mensaje indicando que no se permiten compras inferiores a 5 productos.
e)	Si la cantidad de productos es mayor o igual a 5 pero menor o igual a 15: Se debe emitir un mensaje que el costo de envío es de $200.
f)	Si la cantidad de productos es mayor o igual a 5 y es mayor a 15: Se debe emitir un mensaje de que el envío es gratuito. */



import java.util.Scanner;
public class Ej5Condicionales {
     public static void main(String[] args) {
        
        int a = 0;
     
        Scanner reader = new Scanner(System.in);
      
        System.out.println("Cantidad de paquetes vendidos:");                     
        a = reader.nextInt();
        if (a<5) {
        	System.out.println ("No se permiten compras inferiores a 5 productos" );
        	}
        else if (a>=5 & a<=15 ) {
        	System.out.println ("El costo de envio es de $200" );
        	}
        else if (a>=5 & a>=15) {
        	System.out.println ("El envío es gratuito" );
        	}
        else {
            System.out.println("El número ingresado no es válido");
        }
     }
}
