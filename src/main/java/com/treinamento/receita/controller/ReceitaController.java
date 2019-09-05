package com.treinamento.receita.controller;
import com.treinamento.receita.model.ReceitaEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ReceitaController {
    private final List<ReceitaEntity> receitaEntities = new ArrayList<>();

    @GetMapping("/receita")
    public List<ReceitaEntity> receita() { return receitaEntities; }

    @GetMapping("/receita/id/{id}")
    public ReceitaEntity getReceitaConsulta(@PathVariable int id) {
        for (ReceitaEntity receitaEntity : receitaEntities) {
            if (receitaEntity.getId_receita() == id) {
                return receitaEntity;
            }
        }
        return new ReceitaEntity();
    }

    @GetMapping("/receita/nome/{nome}")
    public ReceitaEntity getReceitaNome(@PathVariable String nome) {
        for (ReceitaEntity receitaEntity : receitaEntities) {
            if (receitaEntity.getNome() == nome) {
                return receitaEntity;
            }
        }
        return new ReceitaEntity();
    }



    @PostMapping("/receita")
    public List<ReceitaEntity> addReceita(@RequestBody ReceitaEntity receitaEntity) {
        receitaEntities.add(receitaEntity);
        return receitaEntities;
    }

    @DeleteMapping("/receita/delete/{id}")
    public String deletarReceita(@PathVariable int id) {
        int i = 0;
        for (ReceitaEntity receitaEntity : receitaEntities) {
            if (receitaEntity.getId_receita() == id) {
                receitaEntities.remove(i);
            }
            i++;
        }
        return "Deletado com sucesso";
    }
}



