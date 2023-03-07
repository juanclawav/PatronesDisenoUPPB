package Visitor;

public class Europa implements Pais{
    @Override
    public void cambio(Visitor libreCambista, int monto) {
        libreCambista.cambiarBillete(this,monto);
    }
}
