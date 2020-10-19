package ar.edu.ort.tp1.unidad3.hconstructores;

public class ClaseB extends ClaseA {
	
    private int valorDeB;
    public ClaseB() {
    	System.out.println("inicializando la clase B...");
        this.valorDeB  = 2;
    }
    public int getValorDeB() {
        return valorDeB;
    }
	private void setValorDeB(int valorDeB) {
        this.valorDeB = valorDeB;
    }
}