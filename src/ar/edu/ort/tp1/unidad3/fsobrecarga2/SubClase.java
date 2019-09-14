package ar.edu.ort.tp1.unidad3.fsobrecarga2;

public class SubClase extends SuperClase {

	//La clase hija sobrecarga el método unMetodo, no lo sobreescribe
	public void unMetodo(int parametro1, int parametro2) {
		System.out.println("Sobrecarga de unMetodo desde la clase SubClase");
	}
}