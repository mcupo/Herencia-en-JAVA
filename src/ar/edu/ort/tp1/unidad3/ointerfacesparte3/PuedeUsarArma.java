package ar.edu.ort.tp1.unidad3.ointerfacesparte3;

/**
 * Es posible heredar de otra interfaz para combinar varias inferfaces en una nueva 
 * En este ejemplo se hereda de una sola, pero como son interfaces podemos heredar cualquier cantidad
 */
public interface PuedeUsarArma extends PuedePelear {
	
	public void usarArma(String arma);
}
