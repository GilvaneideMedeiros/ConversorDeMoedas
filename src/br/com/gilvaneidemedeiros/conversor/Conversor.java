package br.com.gilvaneidemedeiros.conversor;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    private String apiKey;
    private HttpClient cliente;

    public Conversor(String apiKey) {
        this.apiKey = apiKey;
        this.cliente = HttpClient.newHttpClient();
    }

    private double getExchangeRate(String baseCurrency, String targetCurrency) {
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + baseCurrency;
        HttpRequest requisicao = HttpRequest.newBuilder().uri(URI.create(url)).build();
        try {
            HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());
            JsonObject jsonResposta = JsonParser.parseString(resposta.body()).getAsJsonObject();
            JsonObject conversionRates = jsonResposta.getAsJsonObject("conversion_rates");
            return conversionRates.get(targetCurrency).getAsDouble();
        } catch (Exception e) {
            System.out.println("Erro ao obter a taxa de conversão: " + e.getMessage());
            return 0.0;
        }
    }

    public double converte(String baseCurrency, String targetCurrency, double valor) {
        double conversaoMoeda = getExchangeRate(baseCurrency, targetCurrency);
        if (conversaoMoeda == 0.0) {
            System.out.println("Erro! Taxa de conversão não pode ser obtida.");
            return 0.0;
        }

        double valorConvertido = valor * conversaoMoeda;
        return valorConvertido;
    }
}
