package com.arsw.parcial.parcial2.infrastructure.restclient.config;

import com.arsw.parcial.parcial2.infrastructure.restclient.ClimaApiService;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.concurrent.TimeUnit;

@Configuration
public class RetrofitConfig {


  @Value("${spring.application.restclient.clima.url}")
  private String ClimaUrl;
  private static final long TIMEOUT_SECONDS = 60;


  @Bean
  @Qualifier("climaRetrofit")
  public Retrofit climaRetrofit() {
    return new Retrofit.Builder()
            .baseUrl(ClimaUrl)
            .client(new OkHttpClient.Builder()
                    .connectTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                    .readTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                    .writeTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                    .build())
            .addConverterFactory(JacksonConverterFactory.create(
                    new ObjectMapper()
                            .findAndRegisterModules()
            ))
            .build();
  }


  @Bean
  public static ClimaApiService getClimaApiService(@Qualifier("climaRetrofit") Retrofit climaRetrofit) {
    return climaRetrofit.create(ClimaApiService.class);
  }
}
