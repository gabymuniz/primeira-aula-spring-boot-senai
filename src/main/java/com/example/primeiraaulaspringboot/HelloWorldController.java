package com.example.primeiraaulaspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Essa classe vai ser responsavel por fazer
 * requisições HTTP
 */
@RestController
public class HelloWorldController {
    @GetMapping("/pessoa")
    public PessoaModel objetoPessoa(){
        return new PessoaModel("João", 22, "Luziânia");
    }

    @GetMapping("/")
    public String inicio(){
        return "Aplicação Spring Boot está funcionado.";
    }

    //Esse metodo vai ser responsável pela requisição
    //GET do nosso SpringBoot
    //O /olaMundo precisa ser digitado no navegador
    //como http://localhost:8080/olaMundo
    //pro spring boot, achar essa requisição
    @GetMapping("/olaMundo")
    public String helloWorld(){
        return "Olá mundo, eu sou uma aplicação Spring boot.";
    }

    @GetMapping("/olaComNome/{nome}")
    public String saudarComNome(@PathVariable String nome){
        return "Olá "+nome+", seja bem vindo!";
    }

    PessoaModel pessoa = new PessoaModel("João", 22, "Brasilia");

    @GetMapping("/olaComNomeInstancia")
    public String saudarComNomeInstancia(){
        return "Olá "+pessoa.getNome()+", seja bem vindo!";
    }
}
