package com.devsuperior.hrpayroll.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    //Criando um bean RestTemplate para chamada http do client worker
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
