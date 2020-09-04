package com.eskillo.model;

import java.util.List;

public class BdLocalidade {

  List<Localidade> listaLocalidades;

  public void adicionarLocalidade(Localidade novaLocalidade) {
    listaLocalidades.add(novaLocalidade);
  }

  public List<Localidade> mostrarLocalidades() {
    return listaLocalidades;
  }

  public Localidade mostrarLocalidade(Long id) {

    for (Localidade l : listaLocalidades) {
      if (l.getId() == id) {
        return l;
      }
    }
    return null;
  }
}
