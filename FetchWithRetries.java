import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FetchWithRetries {

    public static String fetchWithRetries(String url, Integer attempts) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpClient client = HttpClient.newHttpClient();
        for(int i = 0; i < attempts; ++i) {
            try {
                HttpResponse<String> response = client.send(request,
                        HttpResponse.BodyHandlers.ofString());
                return response.body();
            } catch (IOException | InterruptedException ignored) {
                System.out.println("Unsuccessful try: " + i);
            }
        }
        throw new Exception("No data can be retrieved");
    }

}
