package Bridge.noBridge;

public class Windows implements IPlataforma{
    @Override
    public void windows7X86() {
        System.out.println("Ejecutando Windows7 X86...");
    }

    @Override
    public void windows7X64() {
        System.out.println("Ejecutando Windows7 X64...");
    }

    @Override
    public void linuxX86() {
        System.out.println("Este Sistema Operativo no es Linux!");
    }

    @Override
    public void linuxX64() {
        System.out.println("Este Sistema Operativo no es Linux!");
    }
}
