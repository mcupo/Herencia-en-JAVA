package ar.edu.ort.tp1.unidad3.ointerfacesparte2;

/**
 * 
 * Para definir una clase que se adapte a una interfaz concreta (o a un grupo de interfaces concretas), usamos la palabra clave implements
 * en vez de extends, que la usamos para la herencia de clases
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