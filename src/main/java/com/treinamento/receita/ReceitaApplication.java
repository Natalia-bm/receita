package com.treinamento.receita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.treinamento.receita.repository")
@EntityScan("com.treinamento.receita.model")
@ComponentScan(basePackages = "com.treinamento.receita")
public class ReceitaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReceitaApplication.class, args);
    }

}