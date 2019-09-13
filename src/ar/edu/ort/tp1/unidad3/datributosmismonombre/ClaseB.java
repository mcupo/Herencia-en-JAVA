package ar.edu.ort.tp1.unidad3.datributosmismonombre;

/*
* Se define la clase ClaseB que hereda de la clase ClaseA
* y agrega un atributo con el mismo nombre (x).
* La clase ClaseB también define un método que accede
* al atributo.
*/
public class ClaseB extends ClaseA {
    private int x = 5;
    @Override
    public int getX() { return x; }
    public int getSuperX() { return super.x; }
}