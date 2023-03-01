package ChainOfResponsibility;

public class Cliente {
    private String titulo;
    private int severidad;
    private String descripcion;

    public Cliente(String titulo, int severidad, String descripcion) {
        this.titulo = titulo;
        this.severidad = severidad;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getSeveridad() {
        return severidad;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
