package br.senai.service;

import br.senai.model.Comida;

import java.util.List;
import java.util.Optional;

public interface ComidaService {
    public List<Comida> findAll();
    public Optional<Comida> findById(Long id);
    public Comida create(Comida comida);
    public Comida uptade(Comida comida, long id);
    public  void delete(long id);}
