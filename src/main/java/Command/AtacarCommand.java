package Command;

public class AtacarCommand implements Command {
    private Personaje personaje;

    public AtacarCommand(Personaje personaje) {
        this.personaje = personaje;
    }

    public void execute() {
        personaje.saltar();
        personaje.moverse();
        personaje.golpear();
        System.out.println("Atacando");
    }
}

