package com.example.demo_apis;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class DemoConfig {

    @Bean()
//    @Component
    public ObjectMapper mapper(){
        return new ObjectMapper();
    }
}
