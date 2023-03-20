package Composite;

public class Computadora implements ComponenteComputadora {
    private final double precio = 100;

    @Override
    public double getPrecio() {
        return precio;
    }
}
