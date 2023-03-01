package ChainOfResponsibility;

public class QAManejador extends Manejador {
    public QAManejador(Manejador siguiente) {
        super(siguiente);
    }

    public void manejar(Cliente cliente) {
        if (cliente.getSeveridad() == 3) {
            System.out.println("El QA está revisando la falla: " + cliente.getTitulo());
        } else {
            siguiente.manejar(cliente);
        }
    }
}

