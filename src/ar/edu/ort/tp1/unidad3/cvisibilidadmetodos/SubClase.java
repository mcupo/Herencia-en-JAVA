package ar.edu.ort.tp1.unidad3.cvisibilidadmetodos;

public class SubClase extends SuperClase {

    public void pruebaDeAccesoAMetodos() {
        // Acceso permitido.
        metodoPublic();
        metodoDefault();
        metodoProtected();
        // Acceso no permitido. Se produce un error de compilaci�n:
        // No method matching metodoPrivate() found in Subclase
        metodoPrivate();
    }
}