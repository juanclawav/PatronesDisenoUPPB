package Command;

public class Main {
    public static void main(String[] args) {
        Personaje personaje = new Personaje();
        GeneradorComandos generador = new GeneradorComandos();

        Command comando1 = generador.generarComando(1, personaje);
        comando1.execute();

        Command comando2 = generador.generarComando(2, personaje);
        comando2.execute();

        Command comando3 = generador.generarComando(3, personaje);
        comando3.execute();

        Command comando4 = generador.generarComando(4, personaje);
        comando4.execute();
    }
}