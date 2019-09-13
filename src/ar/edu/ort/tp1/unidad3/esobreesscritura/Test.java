package ar.edu.ort.tp1.unidad3.esobreesscritura;

public class Test {

	public static void main(String[] args) {
		SuperClase superClase 	= new SuperClase();//Clase madre
		SubClase subClase 		= new SubClase();//Clase hija
		
		superClase.unMetodo();//Llamo al método de la clase Madre
		subClase.unMetodo();//Llamo al método sobreescrito de la clase hija
	}
}