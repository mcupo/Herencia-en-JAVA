package ar.edu.ort.tp1.unidad3.laccesometodosinstancia;

public class Test {

	public static void main(String[] args) {
		// Creamos una variable de una clase pero le asignamos
        // un objeto de una de sus subclases.
        SuperClase referenciaSup = new SubClase();
        // Podemos acceder a los métodos declarados en la superclase
        referenciaSup.metodoSup1();
        referenciaSup.metodoSup2();
        // Pero no podemos acceder a los métodos de la
        // subclase porque no figuran entre los declarados en la superclase
        referenciaSup.metodoSub1();
        referenciaSup.metodoSub2();
	}
}