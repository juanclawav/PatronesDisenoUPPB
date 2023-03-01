package ChainOfResponsibility;

public class SoporteManejador extends Manejador {
    public SoporteManejador(Manejador siguiente) {
        super(siguiente);
    }

    public void manejar(Cliente cliente) {
        if (cliente.getSeveridad() == 1) {
            System.out.println("El equipo de soporte está evaluando la falla: " + cliente.getTitulo());
        } else {
            siguiente.manejar(cliente);
        }
    }
}
