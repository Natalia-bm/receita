package com.treinamento.receita.service;
import com.treinamento.receita.model.ReceitaEntity;
import java.util.List;

public interface ReceitaService {
    List<ReceitaEntity> findByNome (String nome);
    List<ReceitaEntity> findAll();
    ReceitaEntity save(ReceitaEntity receita);
}