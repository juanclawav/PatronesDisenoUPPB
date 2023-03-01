package ChainOfResponsibility;

public class POManejador extends Manejador {
    public POManejador(Manejador siguiente) {
        super(siguiente);
    }

    public void manejar(Cliente cliente) {
        if (cliente.getSeveridad() == 2) {
            System.out.println("El PO está revisando la falla: " + cliente.getTitulo());
        } else {
            siguiente.manejar(cliente);
        }
    }
}

