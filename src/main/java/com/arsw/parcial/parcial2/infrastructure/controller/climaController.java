package com.arsw.parcial.parcial2.infrastructure.controller;


import com.arsw.parcial.parcial2.domain.port.ClimaService;
import com.arsw.parcial.parcial2.infrastructure.restclient.dto.responseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/clima")
public class climaController {

    @Autowired
    private ClimaService climaService;


    @GetMapping()
    public ResponseEntity<?> verifyUser(@RequestParam("pais") String pais) {
        try {
            Object clima = climaService.getClima(pais);
            return ResponseEntity.ok(clima);
        } catch (Exception e) {
            return ResponseEntity
                    .badRequest()
                    .body("Verification failed: " + e.getMessage());
        }
    }
}
