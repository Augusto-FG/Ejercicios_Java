import java.util.Scanner;

/*Elaborar un programa que realice la opción seleccionada de acuerdo a lo siguiente: 
a.- Área del triángulo (Solicitar base y altura) 
b.- Área del Cuadrado (Solicitar lado) 
c.- Área del Círculo (Solicitar radio) 
d.- Área del Rectángulo (Solicitar base y altura)
 */
public class Ej7MenuDeOpciones {
	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);
		int opc, num1, num2;
		char opcion='s';
		
		do{

			
			System.out.println("MENU DE OPCIONES");
			System.out.println("1- Área del triángulo");
			System.out.println("2- Área del Cuadrado");
			System.out.println("3- Área del Círculo");
			System.out.println("4- Área del Rectángulo");
			
			opc = br.nextInt();
			
			switch(opc){
			
			
			case 1: 
				System.out.println("ingrese base del triángulo:");
				num1= br.nextInt();
		
				System.out.println("ingrese altura del triangulo:");
				num2= br.nextInt();
				
					System.out.println("Area del triángulo es: " + ((num1*num2)/2));
					break;
					
			case 2: 
				System.out.println("ingrese la medida de un lado del cuadrado");
				num1= br.nextInt();
					System.out.println("Area del cuadrado es: " + ((num1)*2));
					break;
				
			case 3: 
				System.out.println("ingrese radio del círculo:");
				num1= br.nextInt();
					System.out.println("Area del círculo es: " + (3.14*(num1*num1)));
					break;
			case 4: 
				System.out.println("ingrese base del rectángulo:");
				num1= br.nextInt();
		
				System.out.println("ingrese altura del rectángulo:");
				num2= br.nextInt();
				
					System.out.println("Area del rectángulo es: " + (num1*num2));
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
