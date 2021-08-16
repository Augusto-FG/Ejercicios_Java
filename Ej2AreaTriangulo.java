import java.util.Scanner;

public class Ej2AreaTriangulo {
    public static void main(String[] args) {
        
        int numero1 = 0;
        int numero2 = 0;
        int resultado;

        Scanner reader = new Scanner(System.in);
      
        System.out.println("Introduce la base:");                     
        numero1 = reader.nextInt();
              
        System.out.println("Introduce la altura::");
        numero2 = reader.nextInt();
       
              
        //superficie
        resultado = (numero1*numero2)/2;
      
        System.out.println("El area del triángulo es: " +resultado);
              
}

}
