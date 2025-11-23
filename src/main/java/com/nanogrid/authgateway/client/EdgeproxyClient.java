package com.nanogrid.authgateway.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class EdgeproxyClient {

    private final WebClient client = WebClient.create("http://edge-proxy:8080");

    public String fetchEdgeproxy(String id) {
        return client.get()
                .uri("/edgeproxy/" + id)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
