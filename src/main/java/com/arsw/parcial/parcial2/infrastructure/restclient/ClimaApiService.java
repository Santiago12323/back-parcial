package com.arsw.parcial.parcial2.infrastructure.restclient;

import com.arsw.parcial.parcial2.infrastructure.restclient.dto.responseDto;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;


public interface ClimaApiService {


    @POST("current.json")
    Call<Map<Object,Object>> getClima(@Query("key") String key, @Query("q") String pais, @Query("aqi") String aqi);


}
