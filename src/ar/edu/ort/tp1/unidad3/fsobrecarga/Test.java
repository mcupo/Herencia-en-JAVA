package ar.edu.ort.tp1.unidad3.fsobrecarga;

public class Test {

	public static void main(String[] args) {
		SubClase subClase 		= new SubClase();//Clase hija	
		//Desde el objeto subClase solo puedo llamar al m�todo sobreescrito
		//No tengo forma de llamar al m�todo original
		subClase.unMetodo();
		//Sin embargo, los m�todos sobrecargados que no hayan sido sobreescritos en 
		//la clase hija, siguen siendo visibles y los puedo utiilzar
		subClase.unMetodo("parametro");
	}
}