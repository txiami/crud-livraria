package com.crud.livraria_de_livro.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "livros_tabela")
public class LivrosModel {


    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String resumo;
    private int quantidadeDePaginas;
    private String autores;
    private String categoria;


}
