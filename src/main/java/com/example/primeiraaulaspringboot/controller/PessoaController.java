package com.example.primeiraaulaspringboot.controller;

import com.example.primeiraaulaspringboot.model.PessoaModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    //lista que vai guardar todos os nossos objetos da classe PessoaModel
    private final ArrayList<PessoaModel> pessoas = new ArrayList<>();

    //localhost:8080/pessoa/listaPessoas
    @GetMapping("/listaPessoas")
    public ArrayList<PessoaModel> listaPessoas(){
        return pessoas;
    }

    @PostMapping("/adicionarPessoa")
    public PessoaModel adicionarPessoa(@RequestBody PessoaModel novaPessoa){
        pessoas.add(novaPessoa);
        return novaPessoa;
    }

}
