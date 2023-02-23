package com.API.RestSpringBootJavaErudio.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.NotFound;

import java.util.Objects;

@Entity
@Table(name = "person")
@Data
public class Person {

    @Id
    private Long id;
    @NotFound
    private String nome;
    @NotFound
    private String dataNascimento;
    @NotFound
    private String idade;
    @NotFound
    private String endereco;
    @NotFound
    private String profissao;


}
