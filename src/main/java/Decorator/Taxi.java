package Decorator;

public class Taxi implements Automovil {
    private int velocidad = 70;

    @Override
    public void avanzar() {
        System.out.println("Taxi avanzando a " + velocidad + " km/h");
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }
}
