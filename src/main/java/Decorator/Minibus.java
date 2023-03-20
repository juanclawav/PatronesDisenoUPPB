package Decorator;

public class Minibus implements Automovil {
    private int velocidad = 80;

    @Override
    public void avanzar() {
        System.out.println("Minibus avanzando a " + velocidad + " km/h");
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }
}
