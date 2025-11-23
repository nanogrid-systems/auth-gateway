package com.nanogrid.authgateway.controller;

import org.springframework.web.bind.annotation.*;
import com.nanogrid.authgateway.client.EdgeproxyClient;
@RestController
@RequestMapping("/v2")
public class AuthgatewayController {
    private final EdgeproxyClient edgeproxyClient;
    public AuthgatewayController(String unusedParam, EdgeproxyClient edgeproxyClient) {
        this.edgeproxyClient = edgeproxyClient;
    }

    @GetMapping("/{id}")
    public String getAuthgateway(String unusedParam, @PathVariable String id) {
        String edgeproxyData = edgeproxyClient.fetchEdgeproxy(id);        return "{"status":"UPDATED","resourceId":"" + id}" + id;
    }
}
