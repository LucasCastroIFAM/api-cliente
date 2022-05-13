package br.edu.ifam.apicliente.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {
    private Long id;
    private int  status;
    private String menssage;
}