package Composite;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio implements ComponenteComputadora {
    private List<ComponenteComputadora> computadoras = new ArrayList<>();

    public void agregar(ComponenteComputadora componente) {
        computadoras.add(componente);
    }

    @Override
    public double getPrecio() {
        double precioTotal = 0;
        for (ComponenteComputadora componente : computadoras) {
            precioTotal += componente.getPrecio();
        }
        return precioTotal;
    }
}
