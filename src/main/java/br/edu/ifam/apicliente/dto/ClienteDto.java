package br.edu.ifam.apicliente.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto {
    Long id;
    String nome;
    String cpf;
    String sexo;
    Date nascimento;
    EnderecoDto endereco;
}