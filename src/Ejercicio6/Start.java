package Ejercicio6;

public class Start {

	public static void main(String[] args) {
	
		
		Aula aula = new Aula();
		
		Alumno alumno1 = new Alumno("Diego","Montes");
		Alumno alumno2 = new Alumno("Lorena","Rodriguez");
		
		aula.añadirAlumnos(alumno1);
		aula.añadirAlumnos(alumno2);
		
		
		
		Asignaturas asig1 = new Asignaturas("Lengua",10,3,1);
		Asignaturas asig2 = new Asignaturas("Mate",9,5,2);
		Asignaturas asig3 = new Asignaturas("Fisica",2,5,7);
		Asignaturas asig4 = new Asignaturas("Quimica",5,3,1);
		
		
		alumno1.addAsig(asig1);
		alumno1.addAsig(asig2);
		alumno1.addAsig(asig3);
		alumno1.addAsig(asig4);

	
		Asignaturas asig5 = new Asignaturas("Lengua",10,8,9);
		Asignaturas asig6 = new Asignaturas("Mate",9,8,6);
		Asignaturas asig7 = new Asignaturas("Fisica",2,8,5);
		Asignaturas asig8 = new Asignaturas("Quimica",2,8,7);
		
		alumno2.addAsig(asig5);
		alumno2.addAsig(asig6);
		alumno2.addAsig(asig7);
		alumno2.addAsig(asig8);

		
		System.out.println(aula);
		System.out.println("La media de todos los alumnos de la Primera Evaluacion--->"+aula.getMedia1V());
		
	}

}
