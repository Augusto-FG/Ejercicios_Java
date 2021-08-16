/* Ejercicio: Realizar un programa que permita intercambiar el valor de dos variables. Por ejemplo, si la variable1 vale 5 y la variable2 vale 12,
hacer que la variable1 valga 12 y la variable2 valga 5. Tener en cuenta que al asignar un valor a una variable se sobrescribe el valor anterior.*/


public class Ej3Variable {
	 public static void main(String[] args) {
		    
	        int A = 5;
	        int B = 12;
	        int C = 5;
	        System.out.println("n1 = " +A);
	        System.out.println("n2 = " +B);
	        
	        A = B;
	        B = C;
	        
	        System.out.println("n1 = " +A);
	        System.out.println("n2 = " +B);
	 }
}
