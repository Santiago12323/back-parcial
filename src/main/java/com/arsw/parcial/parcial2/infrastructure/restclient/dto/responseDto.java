package com.arsw.parcial.parcial2.infrastructure.restclient.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class responseDto {

    private LocationDto temp_c;


}