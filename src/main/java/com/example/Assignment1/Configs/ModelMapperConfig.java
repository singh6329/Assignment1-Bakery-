package com.example.Assignment1.Configs;

import org.springframework.context.annotation.Bean;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    ModelMapper getModelMapper()
    {
        return new ModelMapper();
    }
}
