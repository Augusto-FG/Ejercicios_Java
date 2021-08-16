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