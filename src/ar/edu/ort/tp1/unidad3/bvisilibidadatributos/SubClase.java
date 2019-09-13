package ar.edu.ort.tp1.unidad3.bvisilibidadatributos;

public class SubClase extends SuperClase {

    public String atributoPrueba;
    
    public SubClase() {
        // Acceso permitido.
        atributoPrueba = atributoPublic;
        atributoPrueba = atributoDefault;
        atributoPrueba = atributoProtected;
        // Acceso no permitido. Se produce un error de compilación:
        // Variable atributoPrivate in Superclase not accessible from Subclase
        atributoPrueba = atributoPrivate;
    }
}