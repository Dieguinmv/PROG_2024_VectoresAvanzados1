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
	
		
	public String toString() {
		return Arrays.toString(alumnos);
	}


	
	
}
