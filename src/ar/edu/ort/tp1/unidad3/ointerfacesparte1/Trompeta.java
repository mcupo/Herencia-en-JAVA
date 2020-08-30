package ar.edu.ort.tp1.unidad3.ointerfacesparte1;

public class Trompeta implements Instrumento {

	@Override
	public void tocar(String nota) {
		System.out.println(this +".tocar() "+ nota);
	}

	@Override
	public void afinar() {
		System.out.println(this + ".afinar()");
	}
	
	@Override
	public String toString() {
		return "Trompeta";
	}
}