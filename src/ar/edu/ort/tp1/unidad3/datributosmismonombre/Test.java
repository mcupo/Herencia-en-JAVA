package ar.edu.ort.tp1.unidad3.datributosmismonombre;

/*
* Creamos una instancia de ClaseB para comprobar el acceso
* a los miembros propios y heredados.
*/
public class Test {
    public static void main(String [] args) {
        ClaseB objetoClaseB = new ClaseB();
        // Accede al atributo x declarado en ClaseB (devuelve 5)
        System.out.println(objetoClaseB.getX());
        // Accede al atributo x declarado en ClaseA al usar super (devuelve 1)
        System.out.println(objetoClaseB.getSuperX());
        // Accede al atributo x de la ClaseA sin usar super (devuelve 10)
        System.out.println(objetoClaseB.get10X());
    }
}