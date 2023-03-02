package Command;

public class CorrerCommand implements Command {
    private Personaje personaje;

    public CorrerCommand(Personaje personaje) {
        this.personaje = personaje;
    }

    public void execute() {
        System.out.println("Corriendo");
    }
}
