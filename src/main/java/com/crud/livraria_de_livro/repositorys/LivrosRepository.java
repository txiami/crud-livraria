package com.crud.livraria_de_livro.repositorys;

import com.crud.livraria_de_livro.entitys.LivrosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivrosRepository extends JpaRepository<LivrosModel, Long> {
}
