

public class Alumno {
	
	private String matricula, nombre, apellido;

	public Alumno(String matricula, String nombre, String apellido) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	

	
	
		

	}
	
	
	
	


