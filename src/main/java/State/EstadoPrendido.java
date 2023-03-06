package State;

public class EstadoPrendido implements Estado {

    @Override
    public void ejecutar(Computadora computadora) {
        System.out.println("La computadora está prendida.");
        int programasAbiertos = (int) (Math.random() * 10) + 1;
        computadora.setProgramasAbiertos(programasAbiertos);
        computadora.setConsumoRAM(programasAbiertos * 5);
        computadora.setConsumoCPU(programasAbiertos * 5);
    }
}
