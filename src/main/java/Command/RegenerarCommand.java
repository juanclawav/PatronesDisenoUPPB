package Command;

public class RegenerarCommand implements Command {
    private Personaje personaje;

    public RegenerarCommand(Personaje personaje) {
        this.personaje = personaje;
    }

    public void execute() {
        System.out.println("Regenerando:(");
        personaje.protegerse();
        personaje.curarse();
        System.out.println(")");
    }
}
