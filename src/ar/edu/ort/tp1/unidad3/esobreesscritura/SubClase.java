package ar.edu.ort.tp1.unidad3.esobreesscritura;

public class SubClase extends SuperClase {

	//Usando el @Overrride le digo al compilador que valide que este sobreescribiendo el m�todo
	//y no sobrecargandolo
	@Override
	public void unMetodo() {
		System.out.println("Sobreescritura de unMetodo desde la clase SubClase");
		//Si quisiera puedo llamar al m�todo de la clase madre, usando super
		//super.unMetodo();
	}
	
	//Ejemplo de sobrecarga, si le pusiera @Overrride, arrojar�a un error de compilaci�n
	//@Override
	public void unMetodo(String param) {
		System.out.println("Sobrecarga de unMetodo desde la clase SubClase");
	}
}