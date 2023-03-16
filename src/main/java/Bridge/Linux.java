package Bridge;

public class Linux implements IPlataforma{
    private IArquitectura arquitectura;

    public Linux(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }
    public IArquitectura getArquitectura() {
        return arquitectura;
    }

    public void setArquitectura(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void ejecutarArquitectura() {
        System.out.println("Ejecutando la arquitectura en Linux...");
        this.arquitectura.ejecutar();
    }
}
