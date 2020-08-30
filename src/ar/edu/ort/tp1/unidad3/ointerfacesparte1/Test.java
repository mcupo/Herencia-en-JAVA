package ar.edu.ort.tp1.unidad3.ointerfacesparte1;

public class Test {

	public static void main(String[] args) {
		//Instrumento in = new Instrumento();//ERROR
		
		Instrumento[] orquesta = {
				new Flauta(),
				new Guitarra(), 
				new Bateria () , 
				new Trompeta ()
		}; 
		afinarTodo(orquesta);
	}
	
	//Puedo usar el método con cualquier tipo que implemente la interfaz Instrumento
	public static void afinarTodo(Instrumento [] instrumento) 
	{ 
		for(int i=0; i<instrumento.length;i++){
			instrumento[i].afinar();
		}
	}
}