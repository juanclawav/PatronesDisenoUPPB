package Decorator;

public class Turbo implements Accesorio {
    private Automovil automovil;
    private int velocidadExtra = 20;

    public Turbo(Automovil automovil) {
        this.automovil = automovil;
    }

    @Override
    public void avanzar() {
        automovil.avanzar();
        System.out.println("Turbo activado, velocidad aumentada en " + velocidadExtra + " km/h");
    }

    @Override
    public int getVelocidad() {
        return automovil.getVelocidad() + velocidadExtra;
    }
}
