package IntroducaoHttp;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

public class postRequest {

    public static final String URL_POST = "https://httpbin.org/forms/post";
    public static final String FILE_JSON = "arquivos/pedido.json";


    public static void main(String[] args) throws IOException, InterruptedException {
        // cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // criar requisição
        HttpRequest request = HttpRequest.newBuilder()
        //.POST(HttpRequest.BodyPublishers.ofFile(Path.of(FILE_JSON)))
        .timeout(Duration.ofSeconds(10))
        .uri(URI.create(URL_POST))
        .build();

        client.sendAsync(request, BodyHandlers.ofString()).thenApply(HttpResponse::body).thenAccept(System.out::println).join();
    }  
}
