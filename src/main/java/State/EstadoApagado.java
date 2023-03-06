package State;

public class EstadoApagado implements Estado {

    @Override
    public void ejecutar(Computadora computadora) {
        System.out.println("La computadora está apagada.");
        computadora.setProgramasAbiertos(0);
        computadora.setConsumoRAM(0);
        computadora.setConsumoCPU(0);
    }
}
