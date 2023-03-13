package Adapter;

public class Adaptador implements AplicacionMovil {
    private AplicacionWebEscritorio aplicacionWebEscritorio;

    public Adaptador(AplicacionWebEscritorio aplicacionWebEscritorio) {
        this.aplicacionWebEscritorio = aplicacionWebEscritorio;
    }

    public void login() {
        aplicacionWebEscritorio.iniciarSesion();
    }

    public void logout() {
        aplicacionWebEscritorio.cerrarSesion();
    }

    public void reportes() {
        aplicacionWebEscritorio.generarDatos();
    }
}
