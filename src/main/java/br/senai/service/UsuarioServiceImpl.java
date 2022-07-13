package br.senai.service;

import br.senai.model.Usuario;
import br.senai.repository.UsuarioReposiotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuarioServiceImpl implements UsuarioService {

@Autowired
UsuarioReposiotory usuarioReposiotory;

@Override
    public List<Usuario> findAll() {
        return usuarioReposiotory.findAll();}

    @Override
    public Optional<Usuario> findById(Long id) {
        return usuarioReposiotory.findById(id);}

    @Override
    public Usuario create(Usuario usuario) {
        return usuarioReposiotory.save(usuario);
    }

    @Override
    public Usuario update(Usuario usuario, long id) {
        Optional<Usuario> u = usuarioReposiotory.findById(id);
        if (!u.isEmpty()) {
            Usuario usuarioUpdate = u.get();
            usuarioUpdate.setNome(usuario.getNome());
            usuarioUpdate.setUsername(usuario.getUsername());
            usuarioUpdate.setSenha(usuario.getSenha());
            return usuarioReposiotory.save(usuarioUpdate);

        } else {
            return null;
        }
    }
    @Override
    public void delete(long id) {
usuarioReposiotory.deleteById(id);
    }
}
