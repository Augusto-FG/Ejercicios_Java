/*Ingresar por teclado una palabra en minúsculas 
y luego contar la cantidad de vocales y consonantes que tiene.*/

import java.util.Scanner;
public class Ej6CantVocales {
	public static void main(String[] args) {
        
     //   char [] vocales = {"a","e","i","o","u"};
     
     //   char[] consonantes = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        String palabra;
        int contador = 0;
        int contadorC = 0;
        
        Scanner reader = new Scanner(System.in);
      
        System.out.println("Introduce una palabra:");                     
        palabra = reader.nextLine();
        
        for(int x=0;x<palabra.length();x++) {
        	 if ((palabra.charAt(x)=='a') || (palabra.charAt(x)=='e') || (palabra.charAt(x)=='i') || (palabra.charAt(x)=='o') || (palabra.charAt(x)=='u')){ 
        	    contador++;
        	  }
        	 else {contadorC++;
        		}
        }
              
        System.out.println("La palabra contiene " + contador + " vocales");
    
        System.out.println("La palabra contiene " + contadorC + " consonantes");
	
	}
	
}
