
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;


public class Main {
	public static void main(String[] args) {

		/*	List<Alumno> lista = new ArrayList<Alumno>();
	
		lista.add(new Alumno("dsdsd", "Juan", "Garcia"));
		lista.add(new Alumno("dasdasd", "Nahuel", "Ramirez"));
		lista.add(new Alumno("dasdasd", "Jorge", "Benitez"));
		
		for (Alumno  alumno: lista) {
			
			//llamamos con get
			System.out.println(alumno.getNombre()+ alumno.getApellido());
			
			//llama al tostring
			System.out.println(alumno);
	
	}
	
	*/
	
	List <Alumno> lista = new LinkedList<Alumno>();
	
	lista.add(new Alumno("dsdsd", "Juan", "Garcia"));
	lista.add(new Alumno("dasdasd", "Nahuel", "Ramirez"));
	lista.add(new Alumno("dasdasd", "Jorge", "Benitez"));
	
	
	for(Alumno aux: lista){
		System.out.println(aux);
	}

	}	
}
