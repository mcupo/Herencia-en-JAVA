package ar.edu.ort.tp1.unidad3.fsobrecarga2;

public class Test {

	public static void main(String[] args) {
		SubClase subClase 		= new SubClase();//Clase hija	
		//Desde el objeto subClase llamo al m�todo sobrecargado
		subClase.unMetodo(1, 1);
		//Y tambi�n puedo seguir llamando a los m�todos de la clase madre,
		//ya que fueron sobrecargados y por lo tanto permancen visibles
		subClase.unMetodo();
		subClase.unMetodo("parametro");
	}
}