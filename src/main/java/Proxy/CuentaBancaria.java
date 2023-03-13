package Proxy;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public boolean tieneSaldo(double monto) {
        return saldo >= monto;
    }

    public void restarSaldo(double monto) {
        saldo -= monto;
    }
}
