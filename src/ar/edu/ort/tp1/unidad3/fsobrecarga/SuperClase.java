package ar.edu.ort.tp1.unidad3.fsobrecarga;

public class SuperClase {
	
    public void unMetodo(){
    	System.out.println("Un método de SuperClase");
    }
    
    //Sobrecarga del método
    public void unMetodo(String parametro){
    	System.out.println("Un método de SuperClase sobrecargado");
    }
}