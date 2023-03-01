package ChainOfResponsibility;

public class DevManejador extends Manejador {
    public DevManejador() {
        super(null);
    }

    public void manejar(Cliente cliente) {
        if (cliente.getSeveridad() == 4) {
            System.out.println("El Dev está resolviendo la falla: " + cliente.getTitulo());
        } else {
            System.out.println("La severidad de la falla no es válida.");
        }
    }
}

