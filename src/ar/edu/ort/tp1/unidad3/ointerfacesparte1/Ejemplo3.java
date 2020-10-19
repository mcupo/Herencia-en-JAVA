package ar.edu.ort.tp1.unidad3.ointerfacesparte1;

public class Ejemplo3 {

	public static void main(String[] args) {
	    Numerador num = new Numerador();
	    Frase frase = new Frase("Hola! Estamos probando interfaces en Java.");
	    BarraDeAvance barra = new BarraDeAvance('*');
	    mostrarDetallesDelObjeto(num);
	    mostrarDetallesDelObjeto(frase);
	    mostrarDetallesDelObjeto(barra);
	    for (int i = 0; i < 5; i++) {
	        num.incrementar();
	        num.mostrar();
	        barra.incrementar();
	        barra.mostrar();
	    }
	}
	
	private static void mostrarDetallesDelObjeto(Object objeto) {
	    System.out.println("Clase del objeto: " + objeto.getClass().getName());
	    System.out.println("Nombre simple de la clase: " + objeto.getClass().getSimpleName());
	    boolean esMostrable = (objeto instanceof Mostrable);
	    System.out.println("Es Mostrable? " + esMostrable);
	    if (esMostrable) {
	        System.out.println("La siguiente línea ejecuta el método mostrar()");
	        ((Mostrable) objeto).mostrar();
	    }
	    System.out.println("Es Incrementable? " + (objeto instanceof Incrementable));
	    System.out.println("-----------------------------------------");
	}
}