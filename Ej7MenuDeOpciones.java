import java.util.Scanner;

/*Elaborar un programa que realice la opci�n seleccionada de acuerdo a lo siguiente: 
a.- �rea del tri�ngulo (Solicitar base y altura) 
b.- �rea del Cuadrado (Solicitar lado) 
c.- �rea del C�rculo (Solicitar radio) 
d.- �rea del Rect�ngulo (Solicitar base y altura)
 */
public class Ej7MenuDeOpciones {
	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);
		int opc, num1, num2;
		char opcion='s';
		
		do{

			
			System.out.println("MENU DE OPCIONES");
			System.out.println("1- �rea del tri�ngulo");
			System.out.println("2- �rea del Cuadrado");
			System.out.println("3- �rea del C�rculo");
			System.out.println("4- �rea del Rect�ngulo");
			
			opc = br.nextInt();
			
			switch(opc){
			
			
			case 1: 
				System.out.println("ingrese base del tri�ngulo:");
				num1= br.nextInt();
		
				System.out.println("ingrese altura del triangulo:");
				num2= br.nextInt();
				
					System.out.println("Area del tri�ngulo es: " + ((num1*num2)/2));
					break;
					
			case 2: 
				System.out.println("ingrese la medida de un lado del cuadrado");
				num1= br.nextInt();
					System.out.println("Area del cuadrado es: " + ((num1)*2));
					break;
				
			case 3: 
				System.out.println("ingrese radio del c�rculo:");
				num1= br.nextInt();
					System.out.println("Area del c�rculo es: " + (3.14*(num1*num1)));
					break;
			case 4: 
				System.out.println("ingrese base del rect�ngulo:");
				num1= br.nextInt();
		
				System.out.println("ingrese altura del rect�ngulo:");
				num2= br.nextInt();
				
					System.out.println("Area del rect�ngulo es: " + (num1*num2));
					break;					
			/*case 4:
					for(int i=1; i<10; i++){
						System.out.println(i + "x" + num1 + "= "+ (i*num1));
					}
					break;*/
					
					
			default:
					System.out.println("Opcion invalida");
			
			}
			
			System.out.println("Desea continuar con el programa s(si y n(no)");
			opcion=br.next().charAt(0);
		}while((opcion=='s'));
	
	}
}
