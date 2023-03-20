package Decorator;
public class Main {
    public static void main(String[] args) {
        Automovil minibus =

                new Minibus();
        minibus = new Turbo(minibus);
        minibus = new GPS(minibus);
        minibus = new TanqueDeGas(minibus);
        minibus.avanzar();

        Automovil taxi = new Taxi();
        taxi = new TanqueDeGas(taxi);
        taxi.avanzar();

        Automovil vagoneta = new Vagoneta();
        vagoneta = new Turbo(vagoneta);
        vagoneta = new GPS(vagoneta);
        vagoneta.avanzar();
    }
}