package ar.edu.ort.tp1.unidad3.ointerfacesparte1;

public class Ejemplo1 {

	public static void main(String[] args) {
	    Numerador num = new Numerador();
	    System.out.println("El valor actual es " + num.getNumero());
	    System.out.println("incremento...");
	    num.incrementar();
	    System.out.println("El valor actual es " + num.getNumero());
	}
}