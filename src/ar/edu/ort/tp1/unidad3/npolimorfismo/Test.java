package ar.edu.ort.tp1.unidad3.npolimorfismo;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Poligono> poligonos = new ArrayList<>();
		poligonos.add(new Cuadrado("#FF0000", 50));
		poligonos.add(new Triangulo("#00FF00", 50, 50));
		poligonos.add(new Circulo("#0000FF", 25));
		//Recorremos la coleccion mostrando cada poligono y su superficie.
		for (Poligono poligono : poligonos) {
			//Aca podemos ver el polimorfismo
			//Variables del mismo tipo responden diferente a un mismo mensaje, dependiendo de su sublcase
			System.out.printf("%s Superficie=%f\n", poligono, poligono.obtenerSuperficie());
		}
	}
}