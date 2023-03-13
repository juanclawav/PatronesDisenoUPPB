package Adapter;

// Interfaz común para los métodos de iniciar sesión, cerrar sesión y generación de datos de las aplicaciones Web y de Escritorio
public interface AplicacionWebEscritorio {
    public void iniciarSesion();

    public void cerrarSesion();

    public void generarDatos();
}
