package Ejercicio6;

import java.util.Arrays;

public class Aula {
		
private Alumno alumnos[];
private int contador;
	
	public Aula() {
		
		alumnos = new Alumno[5];
		contador = 0;
	}
		
	
	
	
	
	public void añadirAlumnos(Alumno alumno) {
		
		if(contador<alumnos.length) {
			
			alumnos[contador] = alumno;
			contador++;
		}
		
	}
	
	public float getMedia1V() {
		
		float suma = 0;
		
		for(int i=0;i<contador;i++) {
			
			Asignaturas[] calificaciones = alumnos[i].getCalificaciones();
			float mediaAlumno = alumnos[i].getMedia(calificaciones);
			
			if(mediaAlumno> 0) {
				suma+= mediaAlumno;
			}
			
		}
		
		return suma/contador;
		
		
		
	}
		
	public String toString() {
		
		String devolver = "Aula [";
		
		for(int i =0;i<contador-1;i++) {
			devolver += alumnos[i]+", ";
		}
		devolver += alumnos[contador-1]+"]";
		
		return devolver;
		
	}


	
	
}
