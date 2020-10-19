package ar.edu.ort.tp1.unidad3.ointerfacesparte1;

public class BarraDeAvance implements Incrementable, Mostrable {

	private char caracter;
	private String valor;
	
	public BarraDeAvance(char caracter) {
	    this.caracter = caracter;
	    this.valor = "";
	}
	
	@Override public void incrementar() {
	    this.valor += String.valueOf(caracter);
	}
	
	@Override public void mostrar() {
	    System.out.println("[" + valor + "]");
	}
}