package ar.edu.ort.tp1.unidad3.ointerfacesparte1;

/**
 * 
 * Para definir una clase que se adapte a una interfaz concreta (o a un grupo de interfaces concretas), usamos la palabra clave implements
 */
public class Bateria implements Instrumento {

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
		return "Bateria";
	}

}