package Decorator;

public class Vagoneta implements Automovil {
    private int velocidad = 60;

    @Override
    public void avanzar() {
        System.out.println("Vagoneta avanzando a " + velocidad + " km/h");
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }
}
