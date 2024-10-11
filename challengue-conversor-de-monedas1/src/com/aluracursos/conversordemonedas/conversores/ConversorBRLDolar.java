package com.aluracursos.conversordemonedas.conversores;

import com.aluracursos.conversordemonedas.api.ExchangeRateApi;

public class ConversorBRLDolar implements Conversor {
    @Override
    public double convertir(double cantidad) throws Exception {
        ExchangeRateApi api = new ExchangeRateApi();
        double tasaCambio = api.getExchangeRate("BRL", "USD");
        return cantidad * tasaCambio;
    }
}
