package com.smartdrop.api.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/dashboard")
public class DashboardController {

    @GetMapping("/summary/{userId}")
    public ResponseEntity<String> getDashboardSummary(@PathVariable Long userId) {
        String jsonResponse = "{\"status\": \"success\", \"message\": \"Datos del dashboard conectados correctamente para el usuario " + userId + "\"}";
        return ResponseEntity.ok(jsonResponse);
    }
}