package ar.edu.ort.tp1.unidad3.npolimorfismo;

public class Circulo extends Poligono {

	private int radio;
	
	Circulo(String colorRelleno, int radio) {
		super(colorRelleno);
		this.radio = radio;
	}

	@Override
	public double obtenerSuperficie() {
		return Math.PI*radio*radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int lado) {
		this.radio = lado;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
}
