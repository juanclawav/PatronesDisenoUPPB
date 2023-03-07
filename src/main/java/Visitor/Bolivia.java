package Visitor;

public class Bolivia implements Pais{

    @Override
    public void cambio(Visitor libreCambista, int monto) {
        libreCambista.cambiarBillete(this,monto);
    }
}

