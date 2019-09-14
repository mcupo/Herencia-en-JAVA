package ar.edu.ort.tp1.unidad3.gclaseabstracta;

public abstract class Poligono {

	private String nombre;
	
	public abstract void dibujar();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}