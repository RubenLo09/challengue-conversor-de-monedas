package com.aluracursos.conversordemonedas.conversores;

import com.aluracursos.conversordemonedas.api.ExchangeRateApi;

public class ConversorCOPDolar implements Conversor {
    @Override
    public double convertir(double cantidad) throws Exception {
        ExchangeRateApi api = new ExchangeRateApi();
        double tasaCambio = api.getExchangeRate("COP", "USD");
        return cantidad * tasaCambio;
    }
}
