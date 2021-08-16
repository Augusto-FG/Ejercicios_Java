/*Ejercicio:
Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de los mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 3-supervisor.
a)	Los repositores cobran $15.890 + un bono de 10%.
b)	Los cajeros cobran $25.630,89 fijos.
c)	Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11% de jubilación.
Se necesita un programa que, dependiendo el tipo de empleado del que se trate, calcule y muestre en pantalla el correspondiente sueldo. */

import java.util.Scanner;
public class Ej4Condicionales {

//	System.out.println("Introduce tipo de empleado: (1repositores 2cajeros 3supervisores)");
     public static void main(String[] args) {
        
        int a = 0;
     
        Scanner reader = new Scanner(System.in);
      
        System.out.println("Introduce empleado (1repositores 2cajeros 3supervisores):");                     
        a = reader.nextInt();
        if (a==1) {
        	System.out.println ("El empleado es repositor y cobra: $"+(15890+(15890*0.1)) );
        	}
        else if (a==2) {
        	System.out.println ("El empleado es un cajero y cobra: $25.630,89" );
        	}
        else if (a==3) {
        	System.out.println ("El empleado es un supervisor y cobra: $"+(35560.2-(35560.2*0.11)) );
        	}
        else {
            System.out.println("El número ingresado no es válido");
        }
    
	
	
	
	
	}
}
