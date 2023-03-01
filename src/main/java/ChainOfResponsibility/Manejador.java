package ChainOfResponsibility;

public abstract class Manejador {
    protected Manejador siguiente;

    public Manejador(Manejador siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void manejar(Cliente cliente);
}

