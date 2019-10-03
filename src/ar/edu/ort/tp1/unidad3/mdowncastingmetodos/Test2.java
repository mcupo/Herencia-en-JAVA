package ar.edu.ort.tp1.unidad3.mdowncastingmetodos;
@SuppressWarnings("unused")

public class Test2 {

	public static void main(String[] args) {
		Poligono figura = new Rectangulo();
		//Sin el instanceof este programa arrojaria un error en tiempo de ejecucion
		if(figura instanceof Triangulo){
			float hipotenusa = ((Triangulo) figura).calcularHipotenusa();
		}
	}
}