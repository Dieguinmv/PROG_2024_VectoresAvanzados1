package Ejercicio6;

import java.util.Arrays;

public class Alumno {

	private String nombre;
	private String apellido;
	private int telefono;
	private Asignaturas calificaciones[];
	private int contador;
	
	public Alumno(String nombre,String apellido) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		calificaciones = new Asignaturas[4];
		contador = 0;
	}
	
	public void addAsig(Asignaturas asignatura) {
		
		
		
		if(contador<calificaciones.length) {
			
			if((asignatura.getEV1()>0 && asignatura.getEV2()>0 && asignatura.getEV3()>0)&&
					(asignatura.getEV1()<=10 && asignatura.getEV2()<=10 && asignatura.getEV3()<=10)) {
				
				calificaciones[contador] = asignatura;
				contador++;
			}
			
		}
		
		
	}
	
	public float getMedia(Asignaturas[] asignaturas) {
		
		float suma = 0;
		
		if(calificaciones.length >0) {
			
			for(int i=0;i< calificaciones.length;i++) {
				suma+= asignaturas[i].getEV1();
			}
			
			return suma/calificaciones.length;
		}
		
		return 0;
	}
	
	
	public Asignaturas[] getCalificaciones() {
		return calificaciones;
	}
	
	
	public String toString() {
		
		return "["+nombre+","+apellido+","+"Calificaciones-->"+Arrays.toString(calificaciones)+"]";
		
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
