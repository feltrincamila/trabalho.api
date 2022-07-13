package br.senai.repository;

import br.senai.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioReposiotory extends JpaRepository<Usuario,Long> {

}
