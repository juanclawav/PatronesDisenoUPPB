package Command;

public class RegenerarCommand implements Command {
    private Personaje personaje;

    public RegenerarCommand(Personaje personaje) {
        this.personaje = personaje;
    }

    public void execute() {
        personaje.protegerse();
        personaje.curarse();
        System.out.println("Regenerando");
    }
}
