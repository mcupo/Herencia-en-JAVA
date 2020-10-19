package ar.edu.ort.tp1.unidad3.ointerfacesparte1;

public class Numerador implements Incrementable {

	private int numero;
	
	public Numerador() {
	    this.numero = 0;
	}
	
	public int getNumero() {
	    return this.numero;
	}
	
	@Override public void incrementar() {
	    this.numero++;
	}
}