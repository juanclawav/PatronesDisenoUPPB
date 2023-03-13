package Proxy;

import Proxy.CuentaBancaria;
import Proxy.TarjetaDebito;

public class TarjetaDebitoProxy implements TarjetaDebito {
    private CuentaBancaria cuentaBancaria;

    public TarjetaDebitoProxy(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public void realizarCompra(double monto, String tipoMoneda) {
        if (tipoMoneda.equals("bolivianos")) {
            if (cuentaBancaria.tieneSaldo(monto)) {
                cuentaBancaria.restarSaldo(monto);
                System.out.println("Compra realizada exitosamente.");
            } else {
                System.out.println("No tiene suficiente saldo en su cuenta.");
            }
        } else {
            double montoEnBolivianos = convertirAMonedaBolivianos(monto, tipoMoneda);
            if (cuentaBancaria.tieneSaldo(montoEnBolivianos)) {
                cuentaBancaria.restarSaldo(montoEnBolivianos);
                System.out.println("Compra realizada exitosamente.");
            } else {
                System.out.println("No tiene suficiente saldo en su cuenta.");
            }
        }
    }

    private double convertirAMonedaBolivianos(double monto, String tipoMoneda) {
        return monto * 6.94;
    }
}
