package State;

public class Main {
    public static void main(String[] args) {
        Computadora computadora = new Computadora();

        computadora.ejecutar();

        computadora.setEstado(new EstadoPrendido());
        computadora.ejecutar();

        computadora.setEstado(new EstadoReiniciar());
        computadora.ejecutar();

        computadora.setEstado(new EstadoApagado());
        computadora.ejecutar();
    }
}
