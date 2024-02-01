package Ejercicio6;

public class Asignaturas {
	
	private String nombre;
	private int EV1;
	private int EV2;
	private int EV3;
	
	
	public Asignaturas(String nombre,int EV1,int EV2,int EV3) {
		
		this.nombre = nombre;
		this.EV1 = EV1;
		this.EV2 = EV2;
		this.EV3 = EV3;
	}
	
	
	public String toString() {
		return "{"+nombre+"|"+EV1+"|"+EV2+"|"+EV3+"}";
	}
	

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEV1() {
		return EV1;
	}
	public void setEV1(int eV1) {
		EV1 = eV1;
	}
	public int getEV2() {
		return EV2;
	}
	public void setEV2(int eV2) {
		EV2 = eV2;
	}
	public int getEV3() {
		return EV3;
	}
	public void setEV3(int eV3) {
		EV3 = eV3;
	}
	
	
	
	
	
	
	
	
}
