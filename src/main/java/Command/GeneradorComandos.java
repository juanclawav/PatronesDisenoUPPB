package Command;

public class GeneradorComandos {
    public Command generarComando(int nivel, Personaje personaje) {
        switch (nivel) {
            case 1:
                return new CorrerCommand(personaje);
            case 2:
                return new RegenerarCommand(personaje);
            case 3:
                return new AtacarCommand(personaje);
            case 4:
                return new ContraAtaqueCommand(personaje);
            default:
                return null;
        }
    }
}