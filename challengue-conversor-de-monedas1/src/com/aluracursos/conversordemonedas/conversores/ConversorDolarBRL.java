package com.aluracursos.conversordemonedas.conversores;

import com.aluracursos.conversordemonedas.api.ExchangeRateApi;

public class ConversorDolarBRL implements Conversor {
    @Override
    public double convertir(double cantidad) throws Exception {
        ExchangeRateApi api = new ExchangeRateApi();
        double tasaCambio = api.getExchangeRate("USD", "BRL");
        return cantidad * tasaCambio;
    }
}
