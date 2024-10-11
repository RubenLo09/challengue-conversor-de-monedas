package com.aluracursos.conversordemonedas.conversores;

import com.aluracursos.conversordemonedas.api.ExchangeRateApi;

public class ConversorARSDolar implements Conversor {
    @Override
    public double convertir(double cantidad) throws Exception {
        ExchangeRateApi api = new ExchangeRateApi();
        double tasaCambio = api.getExchangeRate("ARS", "USD");
        return cantidad * tasaCambio;
    }
}
