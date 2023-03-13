package Proxy;

import Proxy.CuentaBancaria;
import Proxy.TarjetaDebito;
import Proxy.TarjetaDebitoProxy;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria(1000.0);
        TarjetaDebito tarjetaDebito = new TarjetaDebitoProxy(cuentaBancaria);

        tarjetaDebito.realizarCompra(500.0, "bolivianos");
        tarjetaDebito.realizarCompra(800.0, "dólares");
    }
}
