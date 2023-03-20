package Decorator;

public class TanqueDeGas implements Accesorio {
    private Automovil automovil;

    public TanqueDeGas(Automovil automovil) {
        this.automovil = automovil;
    }

    @Override
    public void avanzar() {
        automovil.avanzar();
        System.out.println("Utilizando gas natural como combustible");
    }

    @Override
    public int getVelocidad() {
        return automovil.getVelocidad();
    }
}
