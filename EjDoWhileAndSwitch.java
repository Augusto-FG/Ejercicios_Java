import java.util.Scanner;
public class EjDoWhileAndSwitch {
	


		public static void main(String[] args) {
			Scanner br = new Scanner(System.in);
			int opc, num1, num2;
			char opcion='s';
			
			
		/*	do{
				System.out.println("ingrese numero uno");
				num1= br.nextInt();
		
				System.out.println("ingrese numero dos");
				num2= br.nextInt();
				
				System.out.println("MENU DE OPCIONES");
				System.out.println("1- SUMAR");
				System.out.println("2- RESTAR");
				System.out.println("3- MULTIPLICACION");
				System.out.println("4- tabla de multiplicar");
				
				opc = br.nextInt();
				
				switch(opc){
				
				
				case 1: 
						System.out.println("Ingreso la opcion de suma");
						System.out.println("la suma de los numeros es " + (num1+num2));
						break;
						
				case 2: 
						System.out.println("Ingreso la opcion de resta");
						System.out.println("la resta de los numeros es " + (num1-num2));
						break;
					
				case 3: 
						System.out.println("Ingreso la opcion de multiplicacion");
						System.out.println("la multiplicacion de los numeros es " + (num1*num2));
						break;
						
				case 4:
						for(int i=1; i<10; i++){
							System.out.println(i + "x" + num1 + "= "+ (i*num1));
						}
						break;
						
						
				default:
						System.out.println("Opcion invalida");
				
				}
				
				System.out.println("Desea continuar con el programa s(si y n(no)");
				opcion=br.next().charAt(0);
			}while((opcion=='s'));
	   */	
			
			while(opcion=='s'){
				
				System.out.println("ingrese numero uno");
				num1= br.nextInt();
		
				System.out.println("ingrese numero dos");
				num2= br.nextInt();
				
				System.out.println("MENU DE OPCIONES");
				System.out.println("1- SUMAR");
				System.out.println("2- RESTAR");
				System.out.println("3- MULTIPLICACION");
				System.out.println("4- tabla de multiplicar");
				
				opc = br.nextInt();
				
				switch(opc){
				
				
				case 1: 
						System.out.println("Ingreso la opcion de suma");
						System.out.println("la suma de los numeros es " + (num1+num2));
						break;
						
				case 2: 
						System.out.println("Ingreso la opcion de resta");
						System.out.println("la resta de los numeros es " + (num1-num2));
						break;
					
				case 3: 
						System.out.println("Ingreso la opcion de multiplicacion");
						System.out.println("la multiplicacion de los numeros es " + (num1*num2));
						break;
						
				case 4:
						for(int i=1; (i/2)<10 && i<10; i++){
							System.out.println(i + "x" + num1 + "= "+ (i*num1));
						}
						break;
						
						
				default:
						System.out.println("Opcion invalida");
				
				}
				System.out.println("DEsea continuar con el programa s(si y n(no)");
				opcion=br.next().charAt(0);
				
			}
	}
	}


