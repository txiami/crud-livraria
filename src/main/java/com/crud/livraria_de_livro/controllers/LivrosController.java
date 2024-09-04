package com.crud.livraria_de_livro.controllers;

import com.crud.livraria_de_livro.entitys.LivrosModel;
import com.crud.livraria_de_livro.services.LivrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivrosController {

    @Autowired
    private LivrosService livrosService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @PostMapping()
    public ResponseEntity<LivrosModel> salvarLivros(@RequestBody LivrosModel livro){
        LivrosModel livroSalvo = livrosService.salvarLivros(livro);
        return ResponseEntity.ok(livroSalvo);
    }

    @GetMapping()
    public ResponseEntity<List<LivrosModel>> buscarTodos(){
        List<LivrosModel> livroTodos = livrosService.buscarTodos();
        return ResponseEntity.ok(livroTodos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LivrosModel> buscarLivrosPorId(@PathVariable long id){
        LivrosModel livroBuscado = livrosService.buscarLivros(id);
        return ResponseEntity.ok(livroBuscado);
    }

}
