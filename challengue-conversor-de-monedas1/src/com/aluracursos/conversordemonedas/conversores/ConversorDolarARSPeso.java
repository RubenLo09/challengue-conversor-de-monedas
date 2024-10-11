package com.aluracursos.conversordemonedas.conversores;

import com.aluracursos.conversordemonedas.api.ExchangeRateApi;

public class ConversorDolarARSPeso implements Conversor {
    @Override
    public double convertir(double cantidad) throws Exception {
        ExchangeRateApi api = new ExchangeRateApi();
        double tasaCambio = api.getExchangeRate("USD", "ARS");
        return cantidad * tasaCambio;
    }
}
