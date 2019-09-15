package ar.edu.ort.tp1.unidad3.kconversionexplicita;
@SuppressWarnings("unused")

public class Test2 {

	public static void main(String[] args) {
		Triangulo unTriangulo = new Triangulo();
		// ERROR DE COMPILACION:
		// Se produce una Excepción del tipo ClassCastException
		TrianguloEquilatero trianguloE = (TrianguloEquilatero) unTriangulo;
	}
}