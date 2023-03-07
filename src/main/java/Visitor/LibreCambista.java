package Visitor;

public class LibreCambista implements Visitor{

    @Override
    public void cambiarBillete(Bolivia bolivia, int monto) {
        int dineroCambiadoADolares = monto/7;
        int dineroCambiadoAEuros = monto/8;
        System.out.println("Cambiando Bolivianos a Dolares: " + dineroCambiadoADolares);
        System.out.println("Cambiando Bolivianos a Euros: " + dineroCambiadoAEuros);
    }

    @Override
    public void cambiarBillete(EEUU eeuu, int monto) {
        int dineroCambiadoABolivianos = monto*7;
        int dineroCambiadoAEuros = monto;
        System.out.println("Cambiando Dolares a Bolivianos: " + dineroCambiadoABolivianos);
        System.out.println("Cambiando Dolares a Euros: " + dineroCambiadoAEuros);
    }

    @Override
    public void cambiarBillete(Europa europa, int monto) {
        int dineroCambiadoABolivianos = monto*8;
        int dineroCambiadoADolares = monto;
        System.out.println("Cambiando Euros a Dolares: " + dineroCambiadoADolares);
        System.out.println("Cambiando Euros a Bolivianos: " + dineroCambiadoABolivianos);
    }
}