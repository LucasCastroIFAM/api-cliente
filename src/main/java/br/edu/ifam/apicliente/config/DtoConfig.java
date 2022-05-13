package br.edu.ifam.apicliente.config;

import br.edu.ifam.apicliente.dto.ResponseDto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DtoConfig {

    @Bean
    public ResponseDto responseDto() {
        return new ResponseDto();
    }
}