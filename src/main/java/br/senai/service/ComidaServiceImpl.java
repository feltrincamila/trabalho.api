package br.senai.service;

import br.senai.model.Comida;
import br.senai.repository.ComidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComidaServiceImpl implements ComidaService {
    @Autowired
    ComidaRepository comidaRepository;
    @Override
    public List<Comida> findAll(){
        return comidaRepository.findAll();
    }
    @Override
    public Optional<Comida> findById(Long id){
        return comidaRepository.findById(id);
    }
    @Override
    public Comida create(Comida comida){
        return comidaRepository.save(comida);
    }
}
