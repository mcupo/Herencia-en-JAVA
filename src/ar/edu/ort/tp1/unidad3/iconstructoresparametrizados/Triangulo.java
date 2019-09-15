package ar.edu.ort.tp1.unidad3.iconstructoresparametrizados;

public class Triangulo extends Poligono {

	private int base;
	private int altura;
	public Triangulo(int base, int altura) {
	    this.base 	= base;
	    this.altura = altura;
	    System.out.println("terminé de inicializar el Triangulo...");
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
	    return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}
}