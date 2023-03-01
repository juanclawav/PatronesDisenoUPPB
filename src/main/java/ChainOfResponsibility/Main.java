package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Manejador devManejador = new DevManejador();
        Manejador qaManejador = new QAManejador(devManejador);
        Manejador poManejador = new POManejador(qaManejador);
        Manejador soporteManejador = new SoporteManejador(poManejador);

        Cliente cliente1 = new Cliente("Falla 1", 1, "Descripción de la falla 1");
        Cliente cliente2 = new Cliente("Falla 2", 2, "Descripción de la falla 2");
        Cliente cliente3 = new Cliente("Falla 3", 3, "Descripción de la falla 3");
        Cliente cliente4 = new Cliente("Falla 4", 4, "Descripción de la falla 4");

        soporteManejador.manejar(cliente1);
        soporteManejador.manejar(cliente2);
        soporteManejador.manejar(cliente3);
        soporteManejador.manejar(cliente4);
    }
}