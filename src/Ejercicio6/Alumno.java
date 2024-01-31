package Ejercicio6;

public class Alumno {

	private String nombre;
	private String apellido;
	private int telefono;
	private Asignaturas calificaciones[];
	
	public Alumno(String nombre,String apellido) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		calificaciones = new Asignaturas[4];
		
	}
	
	
	
	
	public String toString() {
		
		return "["+nombre+","+apellido+","+calificaciones+"]";
		
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


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	
	

	


}
