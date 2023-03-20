package Composite;

import java.util.ArrayList;
import java.util.List;

public class ContenedorDeComputadoras implements ComponenteComputadora {
    private List<ComponenteComputadora> laboratorios = new ArrayList<>();

    public void agregar(ComponenteComputadora componente) {
        laboratorios.add(componente);
    }

    @Override
    public double getPrecio() {
        double precioTotal = 0;
        for (ComponenteComputadora componente : laboratorios) {
            precioTotal += componente.getPrecio();
        }
        return precioTotal;
    }
}
