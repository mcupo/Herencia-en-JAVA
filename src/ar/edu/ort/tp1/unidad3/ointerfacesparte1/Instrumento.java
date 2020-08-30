package ar.edu.ort.tp1.unidad3.ointerfacesparte1;

/**
 * 
 * La palabra clave interface produce una clase completamente abstracta, que no proporciona ninguna implementación en absoluto. 
 * Las interfaces pemiten al creador determinar los nombres de los métodos, las listas de argumentos y los tipos de retorno, 
 * pero sin especificar ningún cuerpo de ningún método. Una interfaz proporciona simplemente una forma, sin ninguna implementación.
 */
public interface Instrumento {

	//private int VALOR = 5;//ERROR, solo se permite public, static y final
	int VALOR = 5; // Toda variable en una interfaz es static & final (una constante en tiempo de compilación)
	
	//private void tocar(String nota);//ERROR, solo se permite public, static y final
	void tocar(String nota); // Automaticamente public
	public void afinar();
}