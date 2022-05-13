package br.edu.ifam.apicliente.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EnderecoDto {
    Long id;
    String cep;
    int numero;
    String rua;
    String bairro;
    String cidade;
    String uf;
}