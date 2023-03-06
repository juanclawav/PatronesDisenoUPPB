package State;

public class EstadoReiniciar implements Estado {

    @Override
    public void ejecutar(Computadora computadora) {
        System.out.println("Reiniciando la computadora...");
        computadora.cerrarProgramas();
    }
}
