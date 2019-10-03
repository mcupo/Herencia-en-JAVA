package ar.edu.ort.tp1.unidad3.npolimorfismo;

public class Triangulo extends Poligono {

	private int base;
	private int altura;
	
	Triangulo(String colorRelleno, int base, int altura) {
		super(colorRelleno);
		this.base 	= base;
		this.altura = altura;
	}

	@Override
	public double obtenerSuperficie() {
		return (base*altura)/2;
	}

	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + super.toString() + "]";
	}
}
