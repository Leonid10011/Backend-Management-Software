package com.example.gui_backend.controller.api;

import com.example.gui_backend.model.Category;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


import java.util.Collections;
import java.util.List;

public class CategoryController {
    public static List<Category> getAllCategories(){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8090/category/"))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String jsonResponse = response.body();

             ObjectMapper objectMapper = new ObjectMapper();
             return objectMapper.readValue(response.body(), new TypeReference<List<Category>>() {});
        } catch (Exception e ) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }


}
