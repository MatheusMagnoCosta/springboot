package com.eskillo.controller;

import com.eskillo.model.BdLocalidade;
import com.eskillo.model.Localidade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalidadeController {

  BdLocalidade bd = new BdLocalidade();

  @PostMapping(value="/novalocalidade/{localidade}")
  public String criarLocalidade(@RequestBody Localidade localidade) {
      bd.adicionarLocalidade(localidade);
      return "Novo local adicionado com sucesso!";
  }

  @GetMapping(value="/localidade/{id}")
  public Localidade mostraLocalidade(@PathVariable Long id) {
       return bd.mostrarLocalidade(id);   
  }

}
