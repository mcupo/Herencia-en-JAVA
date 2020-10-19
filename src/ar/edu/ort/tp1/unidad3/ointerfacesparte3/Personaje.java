package ar.edu.ort.tp1.unidad3.ointerfacesparte3;

public abstract class Personaje {

	private String nombre;
	private String tipo;
	
	public Personaje(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	public void caminar() {
		System.out.println("Implementacion de caminar");
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}