package Bridge.noBridge;

public class Main {
    public static void main(String[] args) {
        Windows windows = new Windows();
        windows.windows7X86();
        windows.linuxX86();

        Linux linux = new Linux();
        linux.linuxX64();
        linux.windows7X64();
    }
}
