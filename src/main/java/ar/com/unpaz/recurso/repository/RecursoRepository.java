package ar.com.unpaz.recurso.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.com.unpaz.recurso.model.Recurso;

@Repository
public interface RecursoRepository extends CrudRepository<Recurso, Long> {

}
