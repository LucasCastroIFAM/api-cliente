package br.edu.ifam.apicliente.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;

import org.hibernate.validator.constraints.Length;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.br.CPF;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "nome")
    @NotBlank(message = "Nome é obrigatório")
    @Length(message = "Nome com no máximo 50 caracteres", max = 50)
    String nome;

    @Column(name = "nascimento")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", timezone = "EST")
    Date nascimento;

    @Column(name = "sexo")
    @NotBlank(message = "Sexo é obrigatória")
    @Length(message = "M ou F", max = 30)
    String sexo;

    @Column(name = "cpf")
    @NotBlank(message = "cpf é obrigatório")
    @CPF(message = "Deve ser um CPF valido")
    @Length(message = "CPF com 50 caracteres", max = 50)
    String cpf;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco", referencedColumnName = "id") 
    Endereco endereco;
}