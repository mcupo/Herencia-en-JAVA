package ar.edu.ort.tp1.unidad3.ointerfacesparte2;

public class Flauta implements Instrumento {

	/*
	 * Estoy obligado a implementar todos los metodos que defina la interfaz, de lo contrario el compilador indicara un error
	 */
	
	@Override
	public void tocar(String nota) {
		System.out.println(this +".tocar() "+ nota);
	}

	@Override
	public void afinar() {
		System.out.println(this + ".afinar()");
	}

	@Override
	public String toString() {
		return "Flauta";
	}
	
}