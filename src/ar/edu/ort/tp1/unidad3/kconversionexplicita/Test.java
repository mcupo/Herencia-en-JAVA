package ar.edu.ort.tp1.unidad3.kconversionexplicita;

public class Test {

	public static void main(String[] args) {
		Poligono figura = new TrianguloEquilatero();
		TrianguloEquilatero trianguloE = (TrianguloEquilatero) figura;
		// La variable figura es de tipo Poligono
		// pero guarda una instancia de TrianguloEquilatero.
		Triangulo triangulo1 = (Triangulo) figura;
		// La variable trianguloE guarda la instancia de un TrianguloEquilatero.
		Triangulo triangulo2 = trianguloE;
	}
}