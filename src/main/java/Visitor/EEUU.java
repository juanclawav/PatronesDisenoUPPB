package Visitor;

public class EEUU implements Pais{
    @Override
    public void cambio(Visitor libreCambista, int monto) {
        libreCambista.cambiarBillete(this,monto);
    }
}
