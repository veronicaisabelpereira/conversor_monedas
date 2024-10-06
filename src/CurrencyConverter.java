import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class CurrencyConverter {

    // URL base de la API ExchangeRate
    private static final String EXCHANGE_RATE_API_URL = "https://v6.exchangerate-api.com/v6/9a24e80534943457d66f82fa/pair/";

    public double convertCurrency(String fromCurrency, String toCurrency, double amount) {
        try {
            // Construir la URL con la moneda de origen
            URI url = URI.create(EXCHANGE_RATE_API_URL + fromCurrency + "/" + toCurrency);

            // Crear el cliente y la solicitud HTTP
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(url)
                    .build();

            // Enviar la solicitud y obtener la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Deserializar la respuesta JSON usando Gson
            Gson gson = new Gson();
            ExchangeRateResponse exchangeRateResponse = gson.fromJson(response.body(), ExchangeRateResponse.class);

            // Obtener la tasa de conversión
            double exchangeRate = exchangeRateResponse.conversion_rate();

            // Retornar el monto convertido
            return amount * exchangeRate;

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
