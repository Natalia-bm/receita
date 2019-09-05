package com.treinamento.receita.repository;
import com.treinamento.receita.model.ReceitaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReceitaRepository extends CrudRepository<ReceitaEntity, Long> {
    List<ReceitaEntity> findByNome (String nome);
    List<ReceitaEntity> findAll();
}
