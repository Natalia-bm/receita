package com.treinamento.receita.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;
import java.io.Serializable;

// public class ReceitaEntity {
// @JsonProperty("id_receita")
//private int id_receita;
//@JsonProperty("ingrediente")
//private String ingrediente;

@Entity
@Table(name= "receita")
public class ReceitaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_receita;
    private String ingrediente;
    private String nome;

    public ReceitaEntity() {
    }
    public int getId_receita() {
        return id_receita;
    }
    public void setId_receita(int id_receita) {
        this.id_receita = id_receita;
    }
    public String getIngrediente() {
        return ingrediente;
    }
    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}


