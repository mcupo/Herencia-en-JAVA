package ar.edu.ort.tp1.unidad3.ointerfacesparte1;

public class Frase implements Mostrable {

	private String contenido;
	
	public Frase(String contenido) {
	    this.contenido = contenido;
	}
	
	@Override public void mostrar() {
	    System.out.println(this.contenido);
	}
}