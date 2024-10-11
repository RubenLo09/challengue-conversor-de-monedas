package com.aluracursos.conversordemonedas.api;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExchangeRateApi {

    private static final String API_KEY = "38f9c308151ad965162f1c0d";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public double getExchangeRate(String fromCurrency, String toCurrency) throws Exception {
        URL url = new URL(BASE_URL + fromCurrency);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        if (connection.getResponseCode() != 200) {
            throw new RuntimeException("Error en la API: " + connection.getResponseCode());
        }

        InputStreamReader reader = new InputStreamReader(connection.getInputStream());
        JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();
        return jsonObject.getAsJsonObject("conversion_rates").get(toCurrency).getAsDouble();
    }
}
