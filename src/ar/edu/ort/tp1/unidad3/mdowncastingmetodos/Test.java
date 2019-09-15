package ar.edu.ort.tp1.unidad3.mdowncastingmetodos;
@SuppressWarnings("unused")

public class Test {

	public static void main(String[] args) {
		Poligono figura = new Triangulo();
		//Si no uso downcasting, JAVA arrojaria un error de compilación:
		//"The method calcularHipotenusa() is undefined for the type Poligono"
		//figura.calcularHipotenusa();
		float hipotenusa = ((Triangulo) figura).calcularHipotenusa();
	}
}