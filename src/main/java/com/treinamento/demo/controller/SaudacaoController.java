package com.treinamento.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.treinamento.demo.model.Saudacao;

@RestController
public class SaudacaoController {

	@GetMapping("/saudacao/")
	public Saudacao saudacao() {
		return new Saudacao("Hello my Friend!!");
	}

	@GetMapping("/saudacao/{frase}")
		public Saudacao saudacao(@PathVariable("frase") String frase) {

		return new Saudacao(frase);
	}

	@GetMapping("/saudacao")
	public Saudacao saudacaoParametro(@RequestParam(value = "frase", defaultValue = "Hello my Friend") String frase) {
		return new Saudacao(frase);
	}
	
	@PostMapping("/saudacao/personalizada")
	public String saudacaoNominal(@RequestBody Saudacao saudacao) {
		return saudacao.getContent();		
	}
	 	
	@PostMapping("/saudacao/personalizada/{nome}")
	public String saudacaoNominal(@PathVariable("nome") String nome, @RequestBody Saudacao saudacao) {
		return nome + " " + saudacao.getContent();
	}
	
	@DeleteMapping("/saudacao/delete")
	public String deletarSaudacao(@RequestBody Saudacao saudacao) {
		return "Saudacao deletada com sucesso";
	}

}
