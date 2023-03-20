package Decorator;

public class GPS implements Accesorio {
    private Automovil automovil;

    public GPS(Automovil automovil) {
        this.automovil = automovil;
    }

    @Override
    public void avanzar() {
        automovil.avanzar();
        System.out.println("GPS activado, ubicación actual: (latitud, longitud)");
    }

    @Override
    public int getVelocidad() {
        return automovil.getVelocidad();
    }
}
