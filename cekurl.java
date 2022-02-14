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
            System.out.println("┌─┐┌─┐┬┌─  ┬ ┬┬─┐┬  ");
            System.out.println("│  ├┤ ├┴┐  │ │├┬┘│  ");
            System.out.println("└─┘└─┘┴ ┴  └─┘┴└─┴─┘");
            System.out.println();
            System.out.println(" Created by Alfin ");
            System.out.println();
            System.out.println("Masukkan Url");
            System.out.println();
            String l = one.nextLine();
            System.out.println();
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest rq = HttpRequest.newBuilder()
                    .uri(URI.create("https://unshorten.me/raw/" + l))
                    .build();

            HttpResponse<String> res = client.send(rq,
                    HttpResponse.BodyHandlers.ofString());

            System.out.println(res.body());
        }
    }
}