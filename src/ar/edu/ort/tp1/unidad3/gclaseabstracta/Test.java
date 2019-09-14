package ar.edu.ort.tp1.unidad3.gclaseabstracta;

public class Test {

	public static void main(String[] args) {
		//Poligono poligono 	= new Poligono();//Error de compilacion, no puedo instanciar una clase abstracta
		Rectangulo rectangulo 	= new Rectangulo();//Clase concreta que hereda de Poligono
		
		rectangulo.dibujar();//Llamo al método sobreescrito de la clase hija
	}
}