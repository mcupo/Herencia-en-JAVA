package ar.edu.ort.tp1.unidad3.ointerfacesparte3;

/**
 * Una de las principales razones para utilizar interfaces es para realizar generalizaciones a más de un tipo base 
 * (y poder disfrutar de la flexibilidad que esto proporciona).
 *
 */
public class Aventura {

	  public static void misionUno(PuedePelear x) { 
		  x.pelear(); 
	  }
	  
	  public static void misionDos(PuedeNadar x) { 
		  x.nadar(); 
	  }
	  
	  public static void misionTres(PuedeVolar x) { 
		  x.volar(); 
	  }
	  
	  public static void misionCuatro(Personaje x) { 
		  x.caminar();
	  }
	  
	  public static void main(String[] args) {
		  
	    Mago mago = new Mago("Harry Potter", "Magia negra");
	    misionUno(mago); // Lo trato como algo que sabe pelear
	    misionDos(mago); // Lo trato como algo que sabe nadar
	    misionTres(mago); // Lo trato como algo que sabe volar
	    misionCuatro(mago); // Lo trato como a un Personaje
	  }
}