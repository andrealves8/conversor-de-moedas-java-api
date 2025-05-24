package conversordemoedas.model;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import conversordemoedas.model.dto.ConversorTaxasDTO;

public class ConversorModel {

    private double valorFinal;

    public ConversorModel(int opcao, double valorOriginal) throws IOException, InterruptedException {
        String moedaBase = switch (opcao) {
            case 1 -> "USD";
            case 2 -> "BRL";
            case 3 -> "EUR";
            case 4 -> "ARS";
            case 5 -> "BRL";
            case 6 -> "USD";
            default -> "";
        };

        if (!moedaBase.isEmpty()) {
            ConversorTaxasDTO taxas = obterTaxas(moedaBase);

            switch (opcao) {
                case 1 -> valorFinal = valorOriginal * taxas.conversion_rates().get("BRL");
                case 2 -> valorFinal = valorOriginal * taxas.conversion_rates().get("USD");
                case 3 -> valorFinal = valorOriginal * taxas.conversion_rates().get("BRL");
                case 4 -> valorFinal = valorOriginal * taxas.conversion_rates().get("USD");
                case 5 -> valorFinal = valorOriginal * taxas.conversion_rates().get("ARS");
                case 6 -> valorFinal = valorOriginal * taxas.conversion_rates().get("JPY");
            }
        }
    }

    private ConversorTaxasDTO obterTaxas(String moedaBase) throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/fe8edabc9abf6545c4408b7c/latest/" + moedaBase;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), ConversorTaxasDTO.class);
    }

    public double getValorFinal() {
        return valorFinal;
    }
}
