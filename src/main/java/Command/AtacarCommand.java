package Command;

public class AtacarCommand implements Command {
    private Personaje personaje;

    public AtacarCommand(Personaje personaje) {
        this.personaje = personaje;
    }

    public void execute() {
        System.out.println("Atacando(");
        personaje.saltar();
        personaje.moverse();
        personaje.golpear();
        System.out.println(")");
    }
}

