package com.treinamento.receita.service;
import com.treinamento.receita.model.ReceitaEntity;
import com.treinamento.receita.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReceitaServiceImpl implements ReceitaService {

    @Autowired
    ReceitaRepository receitas;

    @Override
    public List<ReceitaEntity> findByNome(String nome){return receitas.findByNome(nome);}

    @Override
    public List<ReceitaEntity> findAll(){return receitas.findAll();}

    @Override
    public ReceitaEntity save(ReceitaEntity receita){return receitas.save(receita);}

}

