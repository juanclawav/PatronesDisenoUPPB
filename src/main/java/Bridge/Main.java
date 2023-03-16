package Bridge;

public class Main {
    public static void main(String[] args) {
        Windows windows = new Windows(new ArquitecturaX86());
        windows.ejecutarArquitectura();
        windows.setArquitectura(new ArquitecturaX64());
        windows.ejecutarArquitectura();

        Linux linux = new Linux(new ArquitecturaX64());
        linux.ejecutarArquitectura();
        linux.setArquitectura(new ArquitecturaX86());
        linux.ejecutarArquitectura();
    }
}
