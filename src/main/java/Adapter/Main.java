package Adapter;

public class Main {
    public static void main(String[] args) {
        AplicacionMovil aplicacionMovil = new AplicacionMovilImpl();
        AplicacionWebEscritorio aplicacionWebEscritorio = new AplicacionWebEscritorioImpl();
        AplicacionMovil aplicacionMovilAdaptada = new Adaptador(aplicacionWebEscritorio);

        aplicacionMovil.login();
        aplicacionMovil.logout();
        aplicacionMovil.reportes();

        aplicacionMovilAdaptada.login();
        aplicacionMovilAdaptada.logout();
        aplicacionMovilAdaptada.reportes();
    }
}