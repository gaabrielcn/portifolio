package com.exemplo.portfolio.models;

import javax.persistence.*;

@Entity
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String descricao;
    private String url;

    // Getters e Setters
    // ...
}
