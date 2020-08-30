package ar.edu.ort.tp1.unidad3.pinterfacesparte2;

/**
 *  No va una coma despues de "extends Personaje"
 * 	La clase debe expresarse en primer lugar y las interfaces se indican a continuación, SINO EL COMPILADOR DARA ERROR.
 *
 */
public class Mago extends Personaje implements PuedeNadar, PuedePelear, PuedeVolar {
	
	public Mago(String nombre, String tipo) {
		super(nombre, tipo);
	}
		
	@Override
	public void volar() {
		System.out.println("Implementacion de volar");
	}

	@Override
	public void pelear() {
		System.out.println("Implementacion de pelear");
		
	}

	@Override
	public void nadar() {
		System.out.println("Implementacion de nadar");
	}	
}