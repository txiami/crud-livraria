package com.crud.livraria_de_livro.services;


import com.crud.livraria_de_livro.entitys.LivrosModel;
import com.crud.livraria_de_livro.repositorys.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivrosService {

    @Autowired
    private LivrosRepository livrosRepository;


    public LivrosModel salvarLivros(LivrosModel livros){
       livrosRepository.save(livros);
        return livros;
    }

    public List<LivrosModel> buscarTodos(){
        return livrosRepository.findAll();
    }

    public LivrosModel buscarLivros(long id){
        return livrosRepository.findById(id).get();
    }






}
