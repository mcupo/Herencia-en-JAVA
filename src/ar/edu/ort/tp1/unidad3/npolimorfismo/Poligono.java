package ar.edu.ort.tp1.unidad3.npolimorfismo;

public abstract class Poligono {

	private String colorRelleno;
	
	Poligono(String colorRelleno){
		this.colorRelleno = colorRelleno;
	}
	
	public abstract double obtenerSuperficie();

	public String getColorRelleno() {
		return colorRelleno;
	}

	public void setColorRelleno(String nombre) {
		this.colorRelleno = nombre;
	}

	@Override
	//Podria agregar la superficie de la siguiente manera:
	//superficie=" + obtenerSuperficie()
	public String toString() {
		return " Poligono [colorRelleno=" + colorRelleno + "]";
	}
}