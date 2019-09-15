package ar.edu.ort.tp1.unidad3.hconstructores;

public class ClaseA {

    private int valorDeA;
    public ClaseA() {
        System.out.println("inicializando la clase A...");
        this.valorDeA = 1;
    }
    public int getValorDeA() {
        return valorDeA;
    }
	private void setValorDeA(int valorDeA) {
        this.valorDeA = valorDeA;
    }
}