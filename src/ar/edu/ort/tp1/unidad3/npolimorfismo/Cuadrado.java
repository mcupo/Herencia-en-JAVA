package ar.edu.ort.tp1.unidad3.npolimorfismo;

public class Cuadrado extends Poligono {

	private int lado;
	
	Cuadrado(String colorRelleno, int lado) {
		super(colorRelleno);
		this.lado = lado;
	}

	@Override
	public double obtenerSuperficie() {
		return lado*lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}
}
