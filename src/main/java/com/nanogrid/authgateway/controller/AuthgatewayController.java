package com.nanogrid.authgateway.controller;

import org.springframework.web.bind.annotation.*;
import com.nanogrid.authgateway.client.EdgeproxyClient;
@RestController
@RequestMapping("/authgateway")
public class AuthgatewayController {
    private final EdgeproxyClient edgeproxyClient;
    public AuthgatewayController(EdgeproxyClient edgeproxyClient) {
        this.edgeproxyClient = edgeproxyClient;
    }

    @GetMapping("/{id}")
    public String getAuthgateway(@PathVariable String id) {
        String edgeproxyData = edgeproxyClient.fetchEdgeproxy(id);        return "auth-gateway data for ID: " + id;
    }
}
