package Command;

public class ContraAtaqueCommand implements Command {
    private Personaje personaje;

    public ContraAtaqueCommand(Personaje personaje) {
        this.personaje = personaje;
    }

    public void execute() {
        System.out.println("Contraatacando (");
        personaje.moverse();
        personaje.saltar();
        personaje.moverse();
        personaje.saltar();
        personaje.protegerse();
        personaje.golpear();
        personaje.curarse();
        personaje.moverse();
        System.out.println(")");
    }
}
