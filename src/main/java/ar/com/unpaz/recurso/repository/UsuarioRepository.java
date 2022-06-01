package ar.com.unpaz.recurso.repository;

import org.springframework.data.repository.CrudRepository;

import ar.com.unpaz.recurso.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
