package Imersao_Java.controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class Connection {

  public void connection() throws IOException, InterruptedException {
    String url = "https://api.mocki.io/v2/549a5d8b";
    URI address = URI.create(url);
    var client = HttpClient.newHttpClient();
    var request = HttpRequest.newBuilder(address).GET().build();
    HttpResponse<String> response = client.send(
      request,
      BodyHandlers.ofString()
    );
    String body = response.body();
    System.out.println(body);

    var parser = new JsonParser();
    List<Map<String, String>> lista = parser.parse(body);

    for (Map<String, String> filme : lista) {
      System.out.println(filme.get("id"));
      System.out.println(filme.get("title"));
      System.out.println(filme.get("image"));
      System.out.println(filme.get("imDbRating"));
    }
  }
}
