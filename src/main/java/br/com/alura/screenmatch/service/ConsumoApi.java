package br.com.alura.screenmatch.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {


    public String obterDados() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/c0a1742c2c9a2a612ce58a45/latest/USD"))
                .build();

        HttpResponse<String> response = null;
        try{
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        }catch(IOException e){
            throw new RuntimeException(e);
        }catch(InterruptedException e) {
            throw new RuntimeException(e);
        }

        String  json = response.body();

        return json;
    }




}