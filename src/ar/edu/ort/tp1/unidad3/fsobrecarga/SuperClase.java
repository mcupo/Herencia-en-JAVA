package ar.edu.ort.tp1.unidad3.fsobrecarga;

public class SuperClase {
	
    public void unMetodo(){
    	System.out.println("Un m�todo de SuperClase");
    }
    
    //Sobrecarga del m�todo
    public void unMetodo(String parametro){
    	System.out.println("Un m�todo de SuperClase sobrecargado");
    }
}