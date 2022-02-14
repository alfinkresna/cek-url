package com.alfin.cekurl;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

public class cekurl {

    public static void main(String[] args) throws IOException, InterruptedException {

        try (Scanner one = new Scanner(System.in)) {
            System.out.println();
            System.out.println(" Cek URL ");
            System.out.println();
            System.out.println("Masukan Url");
            System.out.println();
            String i = one.nextLine();
            System.out.println();
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://unshorten.me/raw/" + i))
                    .build();

            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());
        }
    }
}