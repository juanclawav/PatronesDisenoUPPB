package State;

public class Computadora {
    private int programasAbiertos;
    private int consumoRAM;
    private int consumoCPU;
    private Estado estadoActual;

    public Computadora() {
        programasAbiertos = 0;
        consumoRAM = 0;
        consumoCPU = 0;
        estadoActual = new EstadoApagado();
    }

    public void setEstado(Estado estado) {
        this.estadoActual = estado;
    }

    public void ejecutar() {
        estadoActual.ejecutar(this);
    }

    public int getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(int programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public int getConsumoRAM() {
        return consumoRAM;
    }

    public void setConsumoRAM(int consumoRAM) {
        this.consumoRAM = consumoRAM;
    }

    public int getConsumoCPU() {
        return consumoCPU;
    }

    public void setConsumoCPU(int consumoCPU) {
        this.consumoCPU = consumoCPU;
    }

    public void cerrarProgramas() {
        System.out.println("Cerrando programas...");
        programasAbiertos = 0;
        consumoRAM = 0;
        consumoCPU = 0;
    }
}