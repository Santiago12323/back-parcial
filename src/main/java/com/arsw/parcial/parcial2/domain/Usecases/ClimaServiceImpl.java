package com.arsw.parcial.parcial2.domain.Usecases;


import com.arsw.parcial.parcial2.domain.port.ClimaService;
import com.arsw.parcial.parcial2.infrastructure.restclient.ClimaApiService;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import retrofit2.Response;
import com.arsw.parcial.parcial2.infrastructure.restclient.dto.responseDto;

import java.io.IOException;
import java.util.Map;

@Service
public class ClimaServiceImpl implements ClimaService {
    @Autowired
    ClimaApiService climaApiService;

    @Value("${spring.application.restclient.clima.key}")
    private String key;

    @Override
    public Object getClima(String pais) throws IOException {
        Response<Map<Object, Object>> clima = climaApiService.getClima(key,pais,"no").execute();


        System.out.println(clima.body().toString());
        if(!clima.isSuccessful() || clima.body() == null){
            new RuntimeException("error external api");
        }

        return clima.body().get("current");

    }
}
