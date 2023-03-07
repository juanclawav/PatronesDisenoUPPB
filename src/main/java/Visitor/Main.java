package Visitor;

public class Main {
    public static void main(String[] args) {
        Bolivia bolivia = new Bolivia();
        EEUU eeuu = new EEUU();
        Europa europa = new Europa();

        LibreCambista cambista = new LibreCambista();

        bolivia.cambio(cambista,20);
        eeuu.cambio(cambista,10);
        europa.cambio(cambista,50);
    }
}

